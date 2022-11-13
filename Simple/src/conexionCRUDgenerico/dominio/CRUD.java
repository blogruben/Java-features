package conexionCRUDgenerico.dominio;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;

public class CRUD<T> {

	private Connection connection;
	private PreparedStatement statement;
	private String bbdd;
	private String user;
	private String pass;

	public CRUD(String bbdd, String user, String pass) {
		super();
		this.bbdd = bbdd;
		this.user = user;
		this.pass = pass;
	}

	public void getData(String query, T type) throws IllegalArgumentException, IllegalAccessException {

		System.out.println(type.getClass().getName());

		Field[] fields = type.getClass().getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field.getName());
			field.setAccessible(true);
			field.get(type);
		}

	}
	
	
	public <V> boolean existe(V any) {
		if (any == null) {
				return false;}
		else if (any instanceof String) {
			return !any.equals("");
		}else if (any instanceof Integer) {
			return !any.equals(0);
		}
		return true;
	}	

	public void insertarData(String query, String... parametros) {
		System.out.println("Insertando... Dato   (" + query + ")( " + mostrar(parametros) + ")");
		try {
			openDataBaseConnection();
			executeQuery(query, parametros);
		} catch (SQLException e) {
			System.out.println("Error insertando datos");
			e.printStackTrace();
		} finally {
			closeDataBaseConnection();
		}
		System.out.println("Insertado");
	}

	private void openDataBaseConnection() throws SQLException {
		System.out.println("Abriendo... Conexion    (" + bbdd + " Usuario: " + user + ")");
		connection = DriverManager.getConnection(bbdd, user, pass);
		System.out.println("Abierto");
	}

	private void closeDataBaseConnection() {
		System.out.println("Cerrando...  Cnexion");
		try {
			connection.close();
		} catch (SQLException e) {
			System.out.println("Error cerrando conexion");
			e.printStackTrace();
		}
		System.out.println("Cerrado");
	}

	private void closeStatement() throws SQLException {
		System.out.println("Cerrando... PreparedStatement");
		statement.close();
		System.out.println("Cerrado");
	}

	private void openStatement(String query) throws SQLException {
		System.out.println("Abriendo... PreparedStatement");
		statement = connection.prepareStatement(query);
		System.out.println("Abierto");
	}

	private String mostrar(String... parametros) {
		StringBuilder str = new StringBuilder();
		for (String param : parametros) {
			str.append(param);
			str.append(" ");
		}
		return str.toString();
	}

	private void executeQuery(String query, String... parametros) throws SQLException {
		try {
			openStatement(query);
			buildStatement(parametros);
		} finally {
			closeStatement();
		}
	}

	private void buildStatement(String[] parametros) throws SQLException {
		System.out.println("Ejecutando... PreparedStatement");
		for (int i = 0; i < parametros.length; i++) {
			statement.setString(i + 1, parametros[i]);
		}
		statement.executeQuery();
		System.out.println("Ejecutado");
	}

}

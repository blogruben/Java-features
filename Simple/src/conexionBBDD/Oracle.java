package conexionBBDD;

import java.time.Duration;
import java.time.Instant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Oracle {
public static void main(String[] args) {
	Oracle.getPersona("44", "Raul", "Torres");
}
	private static String getPersona(String id, String nombre, String apellido) {

		String conexion = "jdbc:oracle:thin:USUARIO/ESQUEMA@XXX://intranetBBDD.ejemplo.com:PUERTO/NOMBREBBDD,cn=OracleContext,ou=Databases,ou=Oracle,ou=Apps,o=ss";
		String select = "SELECT * FROM DOCUMENTO D WHERE ID=? AND NOMBRE=? AND APELLIDO=?";
		try (Connection oConn = DriverManager.getConnection(conexion);
				PreparedStatement oPreparedStatement = oConn.prepareStatement(select);) {
			//necesitamos la libreria de Oracle para que no de error de compilacion
			//DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			oPreparedStatement.setString(1, id);
			oPreparedStatement.setString(2, nombre);
			oPreparedStatement.setString(3, apellido);
			ResultSet oResultSet = oPreparedStatement.executeQuery();
			if (oResultSet.next())
				return oResultSet.getString("DNI");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "";
	}

}

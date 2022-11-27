//STEP 1. Import required packages
package optimizarDuracion.ConexionPenalizacionAbrirCerrar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;
import java.time.Instant;

public class Mariadb {

	// "jdbc:mariadb://<<Host o IP>>:<<Puerto>>/<<Nombre de BBDD>>";
	static final String CONEXION_MYSQL_ROOT = "jdbc:mariadb://localhost:3306/ejemplosdb?user=root&password=root";

	public static void main(String[] args) {

		// sharing a connection object among multiple threads is �strongly discouraged�.
		//a connection pool allows multiple threads to access the database concurrently 
		//using different connection objects instead of sharing the same one.
		// we need first to establish the connection to the database. This is considered
		// an expensive operation. To improve the performance, usually, we'll use a
		// connection pool.

		Instant start = Instant.now();
		try (Connection conn = DriverManager.getConnection(CONEXION_MYSQL_ROOT)) {
			Instant start2 = Instant.now();
			Statement stmt = conn.createStatement();
			Instant start3 = Instant.now();
			String sql1 = "CREATE TABLE REGISTRATION (id INTEGER not NULL, first VARCHAR(255), "
					+ " last VARCHAR(255), age INTEGER, PRIMARY KEY ( id ))";

			String sql2 = "DROP TABLE registration;";

			stmt.executeUpdate(sql1);
			stmt.executeUpdate(sql2);
			System.out.println("Duracion sin conexion ni statement: " + Duration.between(start3, Instant.now()));
			stmt.close();
			System.out.println("Duracion sin conexion: " + Duration.between(start2, Instant.now()));

		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Duracion con conexion: " + Duration.between(start, Instant.now()));
	}

//	Resultado
//	Duracion sin conexion ni statement: PT0.024S
//	Duracion sin conexion: PT0.025S
//	Duracion abriendo cerrando conexion: PT0.177S

}

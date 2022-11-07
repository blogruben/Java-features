//STEP 1. Import required packages
package conexionBBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MariaDB {

	// "jdbc:mariadb://<<Host o IP>>:<<Puerto>>/<<Nombre de BBDD>>";
	static final String CONEXION_MYSQL_ROOT = "jdbc:mariadb://localhost:3306/ejemplosdb?user=root&password=root";

	public static void main(String[] args) {
		try (Connection conn = DriverManager.getConnection(CONEXION_MYSQL_ROOT);
				Statement stmt = conn.createStatement();	) {
			
			String sql1 = "CREATE TABLE REGISTRATION (id INTEGER not NULL, first VARCHAR(255), "
					+ " last VARCHAR(255), age INTEGER, PRIMARY KEY ( id ))";
			String sql2 = "DROP TABLE registration;";		
			
			stmt.executeUpdate(sql1);
			stmt.executeUpdate(sql2);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
}

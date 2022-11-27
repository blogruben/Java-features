package conexionCRUDgenerico.dominio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class PersonaDB {

	final static String BBDD = "jdbc:mariadb://localhost:3306/ejemplosdb";
	final static String USER = "root";
	final static String PASS = "root";
	private static CRUD<PersonaDTO> CRUD = new CRUD<>(BBDD, USER, PASS);


	public static void deletePerson() {
		// TODO Auto-generated method stub

	}

	public static void updatePerson() {
		// TODO Auto-generated method stub

	}

	public static void readPerson(String dni) {
		String query = "SELECT *FROM persona WHERE dni = '?' LIMIT 1;";
		PersonaDTO persona = new PersonaDTO();
		persona.setDni(dni);
		try {
			CRUD.getData(query, persona);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void createPerson(PersonaDTO person) {
		String query = "INSERT INTO persona (nombre, apellido, dni) VALUES (?,?,?);";
		CRUD.insertarData(query,person.getNombre(), person.getApellido(), person.getDni());
	}

	public static void createPersons(ArrayList<PersonaDTO> peson) {
		// TODO Auto-generated method stub
	}
}

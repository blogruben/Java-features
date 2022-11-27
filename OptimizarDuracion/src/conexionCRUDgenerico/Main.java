package conexionCRUDgenerico;

import java.sql.SQLException;

import conexionCRUDgenerico.dominio.PersonaDB;
import conexionCRUDgenerico.dominio.PersonaDTO;

public class Main {

	public static void main(String[] args) throws SQLException {
			
//			PersonaDB.createPerson(new PersonaDTO("Robin","Hood","05468793K"));
//			PersonaDB.createPerson(new PersonaDTO("Maria","Robles","04093593I"));
			PersonaDB.createPerson(new PersonaDTO("Cristina","Diaz","05493593H"));
//			PersonaDB.readPerson("05468793K");
//			PersonaDB.updatePerson();
//			PersonaDB.deletePerson();
			
	}

}

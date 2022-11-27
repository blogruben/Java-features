package java16.AutoasignarEnInstanceOf;

public class Main {

	public static void main(String[] args) {
		Object object = "Hola";

		//se autoasigna el object a stringObject 
		//en caso de ser instancia de String
		if (object instanceof String stringObject ) {
			System.out.println(stringObject);
		}
	}
}

package hacerCondicionales;

public class MainCortoCircuitoLogico {

	@SuppressWarnings({ "unused", "null" })
	public static void main(String[] args) {
		// '&' ejecuta los dos test izquierda y derecha
		// '&&' solo ejecuta el sugundo test si el primero es
		// This is known as shortcircuiting and may be considered as an
		// optimization.
		// This is especially useful in guarding against nullness

		String x = null;

		// evaluamos la primera parte al ser nulo contocircuitamos la segunda
		if (x != null && !x.equals("")) {
			System.out.println("x contiene algo");
		} else {
			System.out.println("x no contiene nada");
		}

		// aqui evaluamos las dos partes por lo que da error 
		// en la segunda evalucion al invocar a equal
		// de un nulo
		if (x != null & !x.equals("")) {
			System.out.println("x contiene algo");
		} else {
			System.out.println("x no contiene nada");
		}

	}
}
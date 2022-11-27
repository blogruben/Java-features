package java05.condicionales;

public class cortoCircuitoLogico {

	@SuppressWarnings({ "unused", "null" })
	public static void main(String[] args) {
		// '&' ejecuta los dos test izquierda y derecha
		// '&&' solo ejecuta el segundo test si el primero es verdadero
		// Cortocircuito 'shortcircuiting' es para optimizacion
		// Es util para los protegerse contra los nulos nullness
		dobleAmpersand();
		unUnicoAmpersand();

	}

	private static void unUnicoAmpersand() {
		// evaluamos la primera parte al ser nulo contocircuitamos la segunda
		String x = null;
		if (x != null && !x.equals("")) {
			System.out.println("x contiene algo");
		} else {
			System.out.println("x no contiene nada");
		}
	}

	private static void dobleAmpersand() {
		// aqui evaluamos las dos partes por lo que da error
		// en la segunda evalucion al invocar a equal
		// de un nulo
		String x = null;
		if (x != null & !x.equals("")) {
			System.out.println("x contiene algo");
		} else {
			System.out.println("x no contiene nada");
		}
	}

}

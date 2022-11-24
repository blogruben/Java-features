package condicionales;

public class condicionalStringNulo {

	public static void main(String[] args) {
		String algo = null;
		comprobarStringSinError(algo);
		comprobarStringConError(algo);
	}

	private static void comprobarStringConError(String algo) {
		//lanza java.lang.NullPointerException
		if (algo.equals("algo")) {
		System.out.println("Es igual");
		}	else {
			System.out.println("No es igual");
		}
	}

	private static void comprobarStringSinError(String algo) {
		// no lanza error 
		//mas corto que if (algo != null && algo.equals("algo"))
		if ("algo".equals(algo)) {
			System.out.println("Es igual");
		}	else {
			System.out.println("No es igual");
		}
	}

}

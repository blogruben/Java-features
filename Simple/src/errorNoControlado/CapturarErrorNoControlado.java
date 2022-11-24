package errorNoControlado;

public class CapturarErrorNoControlado {

	public static void main(String[] args) {

		try {
			CapturarErrorNoControlado main = new CapturarErrorNoControlado();
			main.tareaConErrores();
		} catch (RuntimeException e) {
			System.out.println("Error no controlado");
		}

	}

	public void tareaConErrores() {// no se envia ningun error, pero el
								   // erroDescontrolado sube igualmente.
		// Error no controlado
	    System.out.println(10/0);  

		try {
			// Error controlado
			int x = Integer.parseInt("1");
			System.out.println(x);
		} catch (NumberFormatException e) {
			System.out.println("ERROR al parse el string a int");
		} 
	}

}

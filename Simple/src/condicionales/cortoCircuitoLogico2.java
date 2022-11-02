package condicionales;

public class cortoCircuitoLogico2 {

	public static void main(String[] args) {

		//no ejecutamos la segunda funcion por la primera devuelve false
		if (getResultadoPrimeroParte() && getResultadoSegundaParte()) {
			System.out.println("ejecutamos final");
		} else {
			System.out.println("ejecutamos final");
		}
		System.out.println("/////////////////////////////////////////");
		
		//ejecutamos las dos funciones independiente del valor
		if (getResultadoPrimeroParte() & getResultadoSegundaParte()) {
			System.out.println("ejecutamos final");
		} else {
			System.out.println("ejecutamos final");
		}
	}

	static boolean getResultadoPrimeroParte() {
		System.out.println("Ejecutamos logica de la primera parte");
		return false;
	}

	static boolean getResultadoSegundaParte() {
		System.out.println("Ejecutamos logica de la segunda parte");
		return true;
	}

}

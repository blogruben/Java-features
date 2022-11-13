package generico.dominio;

public class EjemplosGenericos {
	
	// podemos devolver un generico
	public static <T, V> T devolverGenericos(T imp1, V imp2) {
		System.out.println("1: " + imp1 + " 2: " + imp2);
		return imp1;
	}

	//metodo estatico que recibe una clase generica
	//<T> usamos T por convencion de type
	public static <T> void recibeGenerico(T imprimir) {
		System.out.println(imprimir);
	}
	
	//podemos llamar la clase como queramos aunque por convencion usamos T
	public static <CualquierCosa> void recibeGenerico2(CualquierCosa imprimir) {
		System.out.println(imprimir);
	}
	
	//podemos poner mas de una clase generica
	public static <T, V> void recibeDosGenericos(T imp1,V imp2) {
		System.out.println("1: "+imp1+" 2: "+imp2);
	}
		
}

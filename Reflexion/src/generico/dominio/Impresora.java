package generico.dominio;

public class Impresora <T>{//Por convencion se usa T de tipo Type

	T paraImprimir;
	
	public Impresora(T paraImprimir) {
	this.paraImprimir = paraImprimir;
}

	public void imprimir( ) {
		System.out.println(paraImprimir);
	}
}

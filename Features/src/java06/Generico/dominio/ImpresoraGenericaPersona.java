package java06.Generico.dominio;

import java.io.Serializable;

//Podemos extender persona y implementar una interface como serializable
//<T extends Persona >
//<T extends Serializable > con interfaces o usamos implement sino extends
//<T extends Persona & Serializable> extendemos una clase y implementamos una interface
//<T, V> podemos anador dos generidos a la clase
//<T extends Persona & Serializable, V>
public class ImpresoraGenericaPersona <T extends Persona & Serializable>{

	T paraImprimir;
	
	public ImpresoraGenericaPersona(T paraImprimir) {
	this.paraImprimir = paraImprimir;
}

	public void imprimir( ) {
		System.out.println(paraImprimir);
	}
}

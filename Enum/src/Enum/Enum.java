package Enum;

import Enum.dominio.EnumConParametros;

public class Enum {

	public static void main(String[] args) {
		EnumConParametros a = EnumConParametros.ROJO;
		a.set_description("Otra descripcion");
		a.set_info("informacion extra");
		imprimirEnum(a);
		
		EnumConParametros b = EnumConParametros.ROJO;
		imprimirEnum(b);

		EnumConParametros c = EnumConParametros.VERDE;
		imprimirEnum(c);	
		
	}
	
	
	private static void imprimirEnum(EnumConParametros enumerator) {
		System.out.println(enumerator.get_description());
		System.out.println(enumerator.getDescripcionMayuscula());
		System.out.println(enumerator.get_info());
		System.out.println("");
	}

}

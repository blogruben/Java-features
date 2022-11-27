package java06.Enum;

import java06.Enum.dominio.BasicStringOperation;
import java06.Enum.dominio.StringOperation;

public class EnumConParametros {

	public static void main(String[] args) {
		//Simular Herencia
		EnumConParametros main = new EnumConParametros();
		StringOperation operacion = BasicStringOperation.TO_UPPER;
		String des = operacion.getDescription();
		System.out.println(des);
		
	}


}

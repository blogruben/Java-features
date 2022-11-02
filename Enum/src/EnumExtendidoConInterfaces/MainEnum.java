package EnumExtendidoConInterfaces;

import EnumExtendidoConInterfaces.dominio.BasicStringOperation;
import EnumExtendidoConInterfaces.dominio.StringOperation;

public class MainEnum {

	public static void main(String[] args) {
		//Simular Herencia
		MainEnum main = new MainEnum();
		StringOperation operacion = BasicStringOperation.TO_UPPER;
		String des = main.getOperationDescription(operacion);
		System.out.println(des);
		
	}

	
	public String getOperationDescription(StringOperation stringOperation) {
	    return stringOperation.getDescription();
	}
	
}

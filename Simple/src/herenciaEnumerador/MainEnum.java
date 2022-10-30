package herenciaEnumerador;

public class MainEnum {

	public static void main(String[] args) {
		MainEnum main = new MainEnum();
		StringOperation operacion = BasicStringOperation.TO_UPPER;
		String des = main.getOperationDescription(operacion);
		System.out.println(des);
		
	}

	
	public String getOperationDescription(StringOperation stringOperation) {
	    return stringOperation.getDescription();
	}
	
}

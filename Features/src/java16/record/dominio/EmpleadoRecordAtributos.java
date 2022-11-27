package java16.record.dominio;

public record EmpleadoRecordAtributos(String nombre, int numero) {

	
	public static String DEFAULT_EMPLOY_NAME = "Nombre";	
	private static String DEFAULT_EMPLOY_SURNAME = "Apellido";	
	
	
	//No se permited atributos, los defines en el constructor
    //public String otro = "";
	//private String algo = "algo";
	
}

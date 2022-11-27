package java16.record.dominio;

public record EmpleadoRecordFunciones(String nombre, int numero) {

	//Se permite anadir funciones extra
	
	public String nombreEnMayusculas() {
		return nombre.toUpperCase();
	}

	public static String saludar(){
		return "Hola";
	}
}

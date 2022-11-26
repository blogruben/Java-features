package record.dominio;

public record EmpleadoRecordValidacion(String nombre, int numero) {

	
	//podemos anadir una validacion al constructor
	//que se genera por defecto en el record este constructor
	//con los atributor inplicitos se llama compact constructor
	public EmpleadoRecordValidacion {
		if (numero < 0) {
			throw new IllegalArgumentException("El numero de empleado no puede ser negativo");
		}
	}
}

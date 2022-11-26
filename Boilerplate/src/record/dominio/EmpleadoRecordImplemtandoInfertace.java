package record.dominio;

//no permite extender, ya que extiende de records como los enums extienden de los enums
//pro defect los records son final por lo que tampoco otras clases no pueden extender de esta
//puedes implements interfaces
public record EmpleadoRecordImplemtandoInfertace(String nombre, int numero) implements Empleado {

	@Override
	public void decirMiNombre() {
		System.out.printf("Me llamo: %s",nombre);
	}

}

package record.dominio;

import java.util.Objects;

public class EmpleadoBean {
	private final String nombre;
	private final int numeroEmpleado;
	
	public EmpleadoBean(String nombre, int numero) {
		super();
		this.nombre = nombre;
		this.numeroEmpleado = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public int getNumero() {
		return numeroEmpleado;
	}
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", numero=" + numeroEmpleado + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(nombre, numeroEmpleado);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmpleadoBean other = (EmpleadoBean) obj;
		return Objects.equals(nombre, other.nombre) && numeroEmpleado == other.numeroEmpleado;
	}
	
	
	
	
}

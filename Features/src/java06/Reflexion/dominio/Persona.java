package java06.Reflexion.dominio;

public class Persona {
	
	private final String nombre;
	private int edad;
	
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void saluda() {
		System.out.println("Hola que tal?");
	}
	
	private void esteMetodoEsPrivado() {
		System.out.println("Metodo Privado");
		}

	public static void esteMetodoEsPublicoYEstatico(){
		System.out.println("Este Metodo Es Publico Y Estatico");
	}	
	
	private static void esteMetodoEsPrivadoYEstatico(){
		System.out.println("Este Metodo Es Privado Y Estatico");
	}
	
	
	
}
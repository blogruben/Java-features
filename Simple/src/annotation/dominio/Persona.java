package annotation.dominio;

@VeryImportant
public class Persona {
	
	@ImportantString
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
	
	@RunImmediately(veces=4)
	public void hola() {
		System.out.println("Hola, buenos dias.");
		}
	
	public void adios() {
		System.out.println("Adios, buenas noches.");
		}
}
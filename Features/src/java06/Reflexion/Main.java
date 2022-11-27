package java06.Reflexion;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import java06.Reflexion.dominio.Persona;

public class Main {

	private static Persona persona = new Persona("David", 30);

	public static void main(String[] args)
			throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {

		mostrarAtributos();
		renombreUnCampoPrivadoDaError();
		cambiarElModificadorAPublico();
		verMetodos();
		ejecutarMetodos();
		ejecutarMetodosPrivadoDaError();
		cambiamosElModificadorAPublicoAntesDeRenombrarUnCampo();
		ejecutarMetodoEstatico();
		ejecutarMetodoEstaticoPrivadoCambiandoModificador();
	}

	private static void cambiarElModificadorAPublico() throws IllegalArgumentException, IllegalAccessException {
		Field[] fields = persona.getClass().getDeclaredFields();
		for (Field field : fields) {
			if (field.getName().equals("nombre")) {
				field.setAccessible(true);
				field.set(persona, "Will");
			}
		}
		System.out.println(persona.getNombre());
	}

	private static void renombreUnCampoPrivadoDaError() throws IllegalArgumentException, IllegalAccessException {
		Field[] fields = persona.getClass().getDeclaredFields();
		for (Field field : fields) {
			if (field.getName().equals("nombre")) {
				field.set(persona, "Will");
			}
		}
	}

	private static void mostrarAtributos() {
		Field[] fields = persona.getClass().getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field.getType() + "	" + field.getName());
		}
	}

	private static void verMetodos() {
		Method[] methods = persona.getClass().getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
		}
	}

	private static void ejecutarMetodos()
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method[] methods = persona.getClass().getDeclaredMethods();
		for (Method method : methods) {
			if (method.getName().equals("saluda")) {
				method.invoke(persona);
			}
		}
	}

	private static void ejecutarMetodosPrivadoDaError()
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method[] methods = persona.getClass().getDeclaredMethods();
		for (Method method : methods) {
			if (method.getName().equals("esteMetodoEsPrivado")) {
				method.invoke(persona);
			}
		}
	}

	private static void cambiamosElModificadorAPublicoAntesDeRenombrarUnCampo()
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method[] methods = persona.getClass().getDeclaredMethods();
		for (Method method : methods) {
			if (method.getName().equals("esteMetodoEsPrivado")) {
				method.setAccessible(true);
				method.invoke(persona);
			}
		}
	}

	private static void ejecutarMetodoEstatico()
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method[] methods = persona.getClass().getDeclaredMethods();
		for (Method method : methods) {
			if (method.getName().equals("esteMetodoEsPublicoYEstatico")) {
				// no pasamos instancia porque es un metodo estatico
				method.invoke(null);
			}
		}
	}

	private static void ejecutarMetodoEstaticoPrivadoCambiandoModificador()
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method[] methods = persona.getClass().getDeclaredMethods();
		for (Method method : methods) {
			if (method.getName().equals("esteMetodoEsPublicoYEstatico")) {
				method.setAccessible(true);
				method.invoke(null);
			}
		}
	}

}

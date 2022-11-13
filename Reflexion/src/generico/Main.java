package generico;

import java.util.ArrayList;
import java.util.List;
import generico.dominio.EjemplosGenericos;
import generico.dominio.EjemplosWildCard;
import generico.dominio.ImpresoraGenerica;
import generico.dominio.Jefe;
import generico.dominio.Persona;
import generico.dominio.Trabajador;

public class Main {

	public static void main(String[] args) {

		ejemplosSinGenericos();
		ejemplosConGenericos();
		ejemplosConWildCard();

	}

	private static void ejemplosSinGenericos() {
//		//con generico, tenemos errores chequeado de compilacion
//		// error si intentamos usar otro tipo
//		ImpresoraGenerica<Integer> impre = new ImpresoraGenerica<>(10);
//		ArrayList<String> lista = new ArrayList<>();
//		lista.add("Hola");
//		lista.add(impre);// error compilacion
//		ImpresoraGenerica<Double> impre = new ImpresoraGenerica<>(10);//error compilacion
//
//		// sin genericos, nos obliga a castear,
//		// da error de runtime y no es type-safety
//		ArrayList<Object> lista2 = new ArrayList<>();
//		lista2.add(new Persona("Ramon",30));
//		lista2.add("");
//		Persona persona1 = (Persona) lista2.get(0);//necesita casteo
//		Persona persona2 = (Persona) lista2.get(1);//da runtime error
	}

	
	
	private static void ejemplosConGenericos() {

//		// con generico,
//		// da error de compilacion, es type-safe
//		ArrayList<Persona> listaDePersonas = new ArrayList<>();
//		listaDePersonas.add(new Persona("Ramon",30));
//		listaDePersonas.add("");
//		Persona persona1 = (Persona) listaDePersonas.get(0);//necesita casteo
//		Persona persona2 = (Persona) listaDePersonas.get(1);//da compilacion run
//
//		// generico de un tipo, las subclases de personas
//		ArrayList<Persona> diferentesPersonas = new ArrayList<>();
//		Persona personaTrabajadora = new Trabajador("Ana",30);
//		Persona personaJefa = new Jefe("Cristina",30);
//		diferentesPersonas.add(personaTrabajadora);
//		diferentesPersonas.add(personaJefa);
//		diferentesPersonas.add("");//error de compilacion
//
//		// metodo estatico con genericos
//		EjemplosGenericos.recibeGenerico("Hola");
//		EjemplosGenericos.recibeGenerico2("Hola");
//		EjemplosGenericos.recibeDosGenericos("edad", 25);
//		String texto = EjemplosGenericos.devolverGenericos("texto", 25);
	}


	
	private static void ejemplosConWildCard() {
//		// sin usar wildcard da error
//		// Integer es una subclase de Object pero
//		// porque pasamos List<Integer> que no es una subclase de List<Object>
//		List<Integer> listaEntero = new ArrayList<>();
//		listaEntero.add(3);
//		EjemplosWildCard.imprimirListaSinWildCard(listaEntero);// ERROR
//		EjemplosWildCard.imprimirListaConWildCard(listaEntero);
//
//		EjemplosWildCard.imprimirListaSinWildCard(listaEntero);
//		EjemplosWildCard.imprimirListaConWildCardTipoPersona(listaEntero);// ERROR
//
//		List<Persona> listPersona = new ArrayList<>();
//		listPersona.add(new Persona("Raul", 8));
//		EjemplosWildCard.imprimirListaConWildCardTipoPersona(listPersona);
	}



}

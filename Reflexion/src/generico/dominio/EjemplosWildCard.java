package generico.dominio;

import java.util.List;

public class EjemplosWildCard {
	
	
	// <?> es un wildcard porque no sabemos el tipo que vamos a recibir
	public static void imprimirListaSinWildCard(List<Object> lista) {
		for (Object item : lista) {
			System.out.println(item);
		}
	}

	// <?> es un wildcard porque no sabemos el tipo que vamos a recibir
	public static void imprimirListaConWildCard(List<?> lista) {
		for (Object item : lista) {
			System.out.println(item);
		}
	}

	// <?> es un wildcard porque no sabemos el tipo que vamos a recibir
	public static void imprimirListaConWildCardTipoPersona(List<? extends Persona> lista) {
		for (Object item : lista) {
			System.out.println(item);
		}
	}
}

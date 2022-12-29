package java06.Generico;

import java.util.ArrayList;
import java.util.List;

public class ArrayGenericos {

	public static void main(String[] args) {
		//Creamos un objecto que tiene un array de objetos y cada objecto es un String
		Object[] objs = generarObjectos();
		//Castear
		List<String> listatextos = CastearArrayStrings(objs);
		//Mostrar
		mostrar(listatextos);
	}
	
	public static Object[] generarObjectos() {
		Object objString1 = "aa";
		Object objString2 = "bb";
		Object[] objs = {objString1,objString2};
		return objs;
	}
	
	//Recibimos un array de genericos
	public static <T> List<String> CastearArrayStrings(T[] textos) {
		List<String> listatextos = new ArrayList<String>();
		for (T text : textos) {
			String a = (String) text;
			listatextos.add(a);
		}
		return listatextos;
	}
	
	public static void mostrar(List<String> textosMostrar) {
		for (String texto : textosMostrar) {
			System.out.println(texto);
		}
	}
	
}
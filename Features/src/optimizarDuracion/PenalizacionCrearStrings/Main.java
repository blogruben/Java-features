package optimizarDuracion.PenalizacionCrearStrings;

import java.time.Duration;
import java.time.Instant;

public class Main {

	public static void main(String[] args) {

		int veces = 100000;
		
		Instant start = Instant.now();
		String x = "inicio";
		for (int i = 0; i < veces; i++) {
			x = x + i;
		}
		//System.out.println(x);
		System.out.println("Duracion: " + Duration.between(start, Instant.now()));
		
		Instant start2 = Instant.now();
		StringBuilder str = new StringBuilder();
        str.append("inicio");
		for (int i = 0; i < veces; i++) {
			str.append(i);
		}
		//System.out.println(str);
		System.out.println("Duracion: " + Duration.between(start2, Instant.now()));

	}

}

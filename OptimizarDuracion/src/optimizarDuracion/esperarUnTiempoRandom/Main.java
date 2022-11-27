package optimizarDuracion.esperarUnTiempoRandom;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Instant start = Instant.now();
		sleep(1000, 0);
		System.out.println("Duracion: "+Duration.between(start, Instant.now()));
		
	}
	
	
    private static void sleep(int milisegundosMaximos, int milisegundosMinimos) {
        try {
            int tiempo = new Random().nextInt(milisegundosMaximos - milisegundosMinimos + 1) + milisegundosMinimos;
            Thread.sleep(tiempo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

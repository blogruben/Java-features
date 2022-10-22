package threads;

import java.time.Instant;

public class MainThreadConParametros {

	public static void main(String[] args) {
    
		Instant start = Instant.now();
        Tarea2<Instant> tarea1= new Tarea2<Instant>(start);
        Tarea2<Instant> tarea2= new Tarea2<Instant>(start);
        Thread hilo1= new Thread(tarea1);
        Thread hilo2= new Thread(tarea2);
        hilo1.start();  
        hilo2.start();  
	}

}

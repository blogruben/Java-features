package threads;

import java.time.Duration;
import java.time.Instant;

public class MainSinThreads {

	public static void main(String[] args) {

		Instant start = Instant.now();
        System.out.println("Hilo principal inicio - "+Duration.between(start, Instant.now()));
        Tarea.tareaPesada();
        System.out.println("Hilo principal tarea1- "+Duration.between(start, Instant.now()));
        Tarea.tareaPesada();
        System.out.println("Hilo principal tarea2- "+Duration.between(start, Instant.now()));

//    	Hilo principal inicio - PT0S
//    	Hilo principal tarea1- PT2.531S
//    	Hilo principal tarea2- PT5.061S        
	}
}

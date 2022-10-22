package threads;

import java.time.Instant;

public class MainThreadSimple {

	public static void main(String[] args) {
    
        Tarea3 tarea1= new Tarea3();
        Thread hilo1= new Thread(tarea1);;
        hilo1.start();
	}

}

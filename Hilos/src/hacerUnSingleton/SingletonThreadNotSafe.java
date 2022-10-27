package hacerUnSingleton;

import hacerUnSingleton.dominio.Hilo1;
import hacerUnSingleton.dominio.Hilo2;

public class SingletonThreadNotSafe {

	public static void main(String[] args) {
    
		
		//El hilo1  y hilo2 acceden a un singleton.
		//Como los dos aceden a la misma instancia
		//lo que hace un hilo interfiere en el otro
		
        Hilo1 tarea1= new Hilo1();
        Thread hilo1= new Thread(tarea1);
        hilo1.start();

        Hilo2 tarea2= new Hilo2();
        Thread hilo2= new Thread(tarea2);
        hilo2.start();

        
	}

}

package threads;

import threads.dominio.Tarea3;

public class ThreadSimple {

	public static void main(String[] args) {
    
		
		//los threads no devuelve ni excepciones ni valores y los callables si
		
        Tarea3 tarea1= new Tarea3();
        Thread hilo1= new Thread(tarea1);;
        hilo1.start();
	}

}

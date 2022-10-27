package hacerUnSingleton.dominio;

public class Hilo1 implements Runnable{

	    @Override
	    public void run() {
	        Singleton singleton = Singleton.getInstance("Hilo UNO");
	        System.out.println(singleton.getValue());
	    }
	    
	}



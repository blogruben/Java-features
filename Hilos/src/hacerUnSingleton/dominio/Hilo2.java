package hacerUnSingleton.dominio;

public class Hilo2 implements Runnable{

	    @Override
	    public void run() {	        
	        try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Bloque catch generado automáticamente
				e.printStackTrace();
			}
	        
	        Singleton singleton = Singleton.getInstance("Hilo DOS");
	        
	        
	        System.out.println(singleton.getValue());
	        
	    }
	    
	}
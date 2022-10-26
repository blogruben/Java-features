package threads.dominio;



public class Tarea {
	 
	    public static void tareaPesada() {
	        for(int i=0;i<5;i++) {
	             try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
	        }
	    }
	}



package threads;

import java.time.Duration;
import java.time.Instant;

public class Tarea2<T> implements Runnable{

		  private final T t;

		  public Tarea2(T t) {
		    this.t = t;
		  }

	    @Override
	    public void run() {
	         
	    	Instant start = (Instant) t;
	    	tareaPesada();
	        System.out.println(Thread.currentThread().getName()+"  -  "+Duration.between(start, Instant.now()));
	    }
	 
	    
	    
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



package callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import callable.dominio.Tarea;

public class UnCallable {

    public static void main(String[] args) {

    	//los callables si devuelve ni excepciones y valores, los Threads no devuelve nada
    	
        try {
            ExecutorService servicio= Executors.newFixedThreadPool(1);
            Future<Integer> resultado= servicio.submit(new Tarea());
            servicio.shutdown();
            servicio.awaitTermination(1, TimeUnit.MINUTES);
            
            if(resultado.isDone()) {
            System.out.println(resultado.get());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
    
}

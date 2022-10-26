package callable.dominio;
 
import java.util.concurrent.Callable;
 
public class Tarea implements Callable<Integer> {
 
    @Override
    public Integer call() throws Exception {
         
        int total = 0;
        for(int i=0;i<5;i++) {
             
            total+=i;
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } 
        }
        System.out.println(Thread.currentThread().getName());
        return total;
    }
}
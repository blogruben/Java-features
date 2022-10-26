package callable.dominio;
 
import java.util.concurrent.Callable;
 
public class Sumar implements Callable<Integer> {
    
    private int a;
    private int b;
 
    public Sumar(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public Integer call() throws Exception {
        return a + b;
    }
}
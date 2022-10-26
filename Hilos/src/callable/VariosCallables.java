package callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

import callable.dominio.Sumar;

public class VariosCallables {

	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        // Create thread pool using Executor Framework
        ExecutorService executor = Executors.newFixedThreadPool(10);
        List<Future<Integer>> list = new ArrayList<Future<Integer>>();
        for (int i = 0; i < 10; i++) {
            Sumar c = new Sumar(i, i + 1);
            list.add(executor.submit(c));
        }
        for (Future<Integer> f : list) {
            System.out.println(f.get(3, TimeUnit.SECONDS));
        }
        executor.shutdown();
	}
}

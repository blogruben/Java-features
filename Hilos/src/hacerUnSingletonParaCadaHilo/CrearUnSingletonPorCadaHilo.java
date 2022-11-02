package hacerUnSingletonParaCadaHilo;

import hacerUnSingletonParaCadaHilo.dominio.HiloSeguro;

public class CrearUnSingletonPorCadaHilo {
    public static void main(String[] args) {
    	
        Thread t1 = new HiloSeguro();
        t1.start();
        
        Thread t2 = new HiloSeguro();
        t2.start();
        
        Thread t3 = new HiloSeguro();
        t3.start();
    }
}
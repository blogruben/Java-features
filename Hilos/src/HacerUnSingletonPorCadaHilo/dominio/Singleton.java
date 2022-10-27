package hacerUnSingletonPorCadaHilo.dominio;

public class Singleton {

    private Singleton() {
        // Private constructor
    }

    private static ThreadLocal<Singleton> _threadLocal = ThreadLocal.withInitial(() -> new Singleton());

    /**
     * Returns the thread local singleton instance
     */
    public static Singleton getInstance() {
        return _threadLocal.get();
    }
}
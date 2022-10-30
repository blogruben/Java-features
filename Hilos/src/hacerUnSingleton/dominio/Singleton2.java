package hacerUnSingleton.dominio;

public class Singleton2 {
	
	//singleton con sincronization para asegurar que solo
	//una instancias es creada cuando hay varios hilos

    private static Singleton2 INSTANCE = null;

    private Singleton2() {}

    public static Singleton2 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton2();
                }
            }
        }
        return INSTANCE;
    }

}
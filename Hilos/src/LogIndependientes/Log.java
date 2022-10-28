package LogIndependientes;


public class Log {
	
	private String _clave;
	private static ThreadLocal<Log> _threadLocal = ThreadLocal.withInitial(() -> new Log());
	
	private Log() {
		// Constructor privado
	}
	
	private void setClaveInterna(String clave) {
		_clave = clave;
	}
	private String getClaveInterna() {
		return _clave;
	}
	
	
	//Accedemos a los valores de la instancia interna
	public static void setClave(String clave) {
		Log log = _threadLocal.get();
		log.setClaveInterna(clave);
	}

	public static String getClave() {
		Log log = _threadLocal.get();
		return log.getClaveInterna();
	}
	
	
	
	//pintamos con la informacion de la instancia interna del log (safe-thread)
	public static void info(String text) {
		Log log = _threadLocal.get();
		System.out.println("Info ["+log.getClaveInterna()+"]: "+text);
	}

	public static void error(String text) {
		Log log = _threadLocal.get();
		System.out.println("Error ["+log.getClaveInterna()+"]: "+text);
	}

	public static void debug(String text) {
		Log log = _threadLocal.get();
		System.out.println("Debug ["+log.getClaveInterna()+"]: "+text);
	}


}




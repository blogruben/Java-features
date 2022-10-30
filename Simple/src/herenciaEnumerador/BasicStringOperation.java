package herenciaEnumerador;

public enum BasicStringOperation implements StringOperation{
    TRIM("Removing leading and trailing spaces.") {
        @Override
        public String apply(String input) { 
            return input.trim(); 
        }
    },
    TO_UPPER("Changing all characters into upper case.") {
        @Override
        public String apply(String input) {
            return input.toUpperCase();
        }
    },
    REVERSE(new String("frctgrfc")) {
        @Override
        public String apply(String input) {
            return new StringBuilder(input).reverse().toString();
        }
    };

	
	
    private String _description;

	private BasicStringOperation(String descripcion) {
		_description = descripcion;
	}

	public String getDescription() {
		return _description;
	}
    
}
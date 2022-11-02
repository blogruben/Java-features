package EnumExtendidoConInterfaces.dominio;


public enum ExtendedStringOperation implements StringOperation {
    MD5_ENCODE("Encoding the given string using the MD5 algorithm.") {
        @Override
        public String apply(String input) {
            return new String();
        }
    },
    BASE64_ENCODE("Encoding the given string using the BASE64 algorithm.") {
        @Override
        public String apply(String input) {
            return new String();
        }
    };

    private String description;

	private ExtendedStringOperation(String name) {
	}

	public String getDescription() {
		return description;
	}

	
}
package Enum.dominio;

public enum EnumConParametros implements Mayusculas  {
    VERDE("En Verde se pasa.") {
		@Override
		public String getDescripcionMayuscula() {
			return get_description().toUpperCase();
		}
    },
    ROJO("En Rojo se para.") {
		@Override
        public String getDescripcionMayuscula() {
            return get_description().toUpperCase();
        }
    };

    private String _description;
    private String _info; 

	private EnumConParametros(String descripcion) {
		_description = descripcion;
	}

	public String get_description() {
		return _description;
	}

	public void set_description(String _description) {
		this._description = _description;
	}

	public String get_info() {
		return _info;
	}

	public void set_info(String _info) {
		this._info = _info;
	}
	
	
	
}
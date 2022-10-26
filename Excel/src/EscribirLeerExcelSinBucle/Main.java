package EscribirLeerExcelSinBucle;

public class Main {

	public static void main(String[] args) {
		
		//librería poi
		Excel excel = new Excel("tmp/ExcelDeEjemplo.xlsx");
		excel.escribirExcel();
		excel.leerExcel();
	}

}

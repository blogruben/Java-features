package EscribirLeerExcelConBucle;

import EscribirLeerExcelSinBucle.Excel;

public class Main {

	public static void main(String[] args) {
		Excel excel = new Excel("tmp/ExcelDeEjemplo.xlsx");
		excel.escribirExcel();
		excel.leerExcel();
	}

}

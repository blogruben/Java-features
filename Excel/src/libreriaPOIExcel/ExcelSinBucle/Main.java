package libreriaPOIExcel.ExcelSinBucle;

public class Main {

	public static void main(String[] args) {
		
		Excel excel = new Excel("tmp/ExcelDeEjemplo.xlsx");
		excel.escribirExcel();
		excel.leerExcel();

	}

}

package libreriaPOIExcel.ExcelSinBucle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	private String archivoExcelURL = "tmp/ExcelDeEjemplo.xlsx";

	public Excel(String fichero) {
		this.archivoExcelURL = fichero;
	}

	public void leerExcel() {

		try (FileInputStream archivoExcel = new FileInputStream(new File(archivoExcelURL));
				XSSFWorkbook libro = new XSSFWorkbook(archivoExcel)) {

			// alternativa libro.getSheet("nomnreHoja");
			Sheet hoja = libro.getSheetAt(0);

			Row linea0 = hoja.getRow(0);
			// leemos la celda 0 1 si no hay datos lanza la excepcion nullpoint
			Cell celda01 = linea0.getCell(1);
			System.out.println("La Celda (String) x:0 y:1 es :" + celda01.getStringCellValue());
			Cell celda02 = linea0.getCell(1);
			System.out.println("La Celda (String) x:0 y:2 es :" + celda02.getStringCellValue());

			Row linea1 = hoja.getRow(1);
			Cell celda11 = linea1.getCell(1);
			System.out.println("La Celda (boolean) x:1 y:1 es :" + celda11.getBooleanCellValue());
			Cell celda12 = linea1.getCell(2);
			System.out.println("La Celda (numerica) x:1 y:2 es :" + celda12.getNumericCellValue());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void escribirExcel() {

		try (FileOutputStream archivoExcel = new FileOutputStream(archivoExcelURL);
				XSSFWorkbook libro = new XSSFWorkbook()) {

			XSSFSheet hoja = libro.createSheet("Ejemplo simple");
			Row linea0 = hoja.createRow(0);

			Cell celda01 = linea0.createCell(1);
			celda01.setCellValue((String) "te parece bien?");
			Cell celda02 = linea0.createCell(2);
			celda02.setCellValue((String) "Dime un numero");

			Row linea1 = hoja.createRow(1);
			Cell celda11 = linea1.createCell(1);
			celda11.setCellValue((Boolean) true);
			Cell celda12 = linea1.createCell(2);
			celda12.setCellValue((Integer) 456);

			// guardamos
			libro.write(archivoExcel);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Terminado");
	}

}

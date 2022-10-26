package EscribirLeerExcelConBucle;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;



public class Excel {
    private String archivoExcelUrl;

    
    public Excel(String archivoExcelUrl) {
		super();
		this.archivoExcelUrl = archivoExcelUrl;
	}

	//Para los archivos xlsx tenemos que usar XSSF
	//Para los archivos xls  tenemos que usar HSSF

	public void leerExcel() {
        try (FileInputStream archivoExcel = new FileInputStream(new File(archivoExcelUrl));
             XSSFWorkbook libro = new XSSFWorkbook(archivoExcel)) {

            //libro.getSheet("Ejemplo de escritura");
            Sheet hoja = libro.getSheetAt(0);
            Iterator<Row> iterarLinea = hoja.iterator();
            while (iterarLinea.hasNext()) {
                Row linea = iterarLinea.next();
                Iterator<Cell> iterarCelda = linea.iterator();
                String spacio = " //// ";
                while (iterarCelda.hasNext()) {
                    Cell celda = iterarCelda.next();

                    switch (celda.getCellType()) {
                    case BOOLEAN :
                    	System.out.print("boolean:"+celda.getBooleanCellValue() + spacio);
                                  break;
                    case NUMERIC:
                    	System.out.print("numeric:"+celda.getNumericCellValue() + spacio);
                                  break;
                    case STRING:
                    	System.out.print("string:"+celda.getStringCellValue() + spacio);
                                  break;
					default:
						System.err.print("La celda no es de tipo boolean numerica ni string");
						break;
                 }
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
    

    public void escribirExcel(String fichero) {

        try (XSSFWorkbook libro = new XSSFWorkbook();
            FileOutputStream archivoExcel = new FileOutputStream(archivoExcelUrl)) {
        	
    	//Si intentamos conectarnos a un archivo xlsx con HSSF no funciona.
        //XSSFSheet hoja = libro.getSheetAt(0);
        XSSFSheet hoja = libro.createSheet("Ejemplo de escritura");

        Object[][] conjuntoDeDatos = {
                {"Código de causa", "Esta asignada?", "comentarios", "Numero de incidencias"},
                {"xxxxxx1", true, "algo 1", 34},
                {"xxxxxx1 de causa", true, "algo 2", 3},
                {"xxxxxx1 de causa", false, "algo 3", 33},
                {"xxxxxx1 de causa", true, "algo 4", 21},
                {"xxxxxx1 de causa", true, "algo 5", 9},
                {"xxxxxx1 de causa", false, "algo 5", 15}
        };

        int NumeroDeLinea = 0;

        for (Object[] datatype : conjuntoDeDatos) {
            Row linea = hoja.createRow(NumeroDeLinea++);
            int NumeroDeLaColumna = 0;

            for (Object field : datatype) {
                Cell celda = linea.createCell(NumeroDeLaColumna++);
                if (field instanceof String) {
                    celda.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    celda.setCellValue((Integer) field);
                } else if (field instanceof Boolean) {
                    celda.setCellValue((Boolean) field);
                }
            }
        }
            libro.write(archivoExcel);
            libro.close();
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Terminado");
    }
    
}

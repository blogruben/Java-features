package libreriaPOIExcel.ExcelConBucle;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class Excel {
    
    
    public void leerExcel(String fichero) {

        try {

        	//"tmp/ExcelDeEjemplo.xlsx"
            FileInputStream archivoExcel = new FileInputStream(new File(fichero));
            //cargamos la informacion en la clase XSSFWorkbook
            // teniendo en el clase de la libreria Poi de excel
            //ya podemos trabajar con el
            //recordar que XSSFWorkbook es para xlsx y
            //HSSFWorkbook es para xls. Si no usamos la correcta no funciona.
            XSSFWorkbook libro = new XSSFWorkbook(archivoExcel);

            //abrimos la hoja uno, tambien podemos abrir la hoja op pestaña
            //por su nombre, para abrir la pestaña "Ejemplo de escritura" sería:
            //libro.getSheet("Ejemplo de escritura");
            Sheet hoja = libro.getSheetAt(0);
            //iteramos sobre la lineas del excel
            Iterator<Row> iterarLinea = hoja.iterator();
            while (iterarLinea.hasNext()) {

            	//iteramos sobre la linea, para ver cada celda
                Row linea = iterarLinea.next();
                Iterator<Cell> iterarCelda = linea.iterator();
                //esto es para pintar la informacion
                //es buena practica que cuando usamos lo mismo
                //en varios sitios, lo pongamos en una variable
                //para modificarlo mas rapido en caso de cambio
                //y evitar errores
                String spacio = " //// ";

                //iteramos sobre la celda
                while (iterarCelda.hasNext()) {

                	//recogemos el valor dela celda
                    Cell celda = iterarCelda.next();

                    //dependiendo del tipo lo extraemos.
                    //en importante de que tipo es para trabajar con ella
                    //si un numero entero lo intentara guardar en un String daria error
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
}

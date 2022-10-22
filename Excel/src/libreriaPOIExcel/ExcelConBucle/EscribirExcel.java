package libreriaPOIExcel.ExcelConBucle;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscribirExcel {

    private static final String ARCHIVO_EXCEL = "tmp/ExcelDeEjemplo.xlsx";

    public static void main(String[] args) {

    	//Para los archivos xlsx tenemos que usar XSSF
    	//Para los archivos xls  tenemos que usar HSSF
    	//Si intentamos conectarnos a un archivo xlsx con HSSF no va a funcionar.

    	//creamos una instancia del libro
    	//que seria como una clase en java que contendria todos
    	//los datos del excel
        XSSFWorkbook libro = new XSSFWorkbook();

        //creamos una hoja (o pestaña dentro del excel) que la vamos a llamar Ejemplo de escritura.
        //Pero si la hoja del excel ya existiera tendriamos que hacer esto:
        //XSSFSheet hoja = libro.getSheetAt("Ejemplo de escritura");
        //entonces abririamos la hoja (pestaña) que se llama asi
        //tambien podemos abrir por el indice, es decir la Hoja uno, la dos ...
        //XSSFSheet hoja = libro.getSheetAt(0);
        //La cero seria la hoja numero uno.
        XSSFSheet hoja = libro.createSheet("Ejemplo de escritura");

        //para grabar el ejemplo vamos a crear un array de arrays
        //es un array que contiene array, los array es como una lista con una longitud fija
        //un array de arrays es como una matrix, por ejemplo Object[2][4] nos devolveria el dato de
        //la fila 3 y columna 5 (recordar que el array comienza a contar por cero)
        //usamos un array para iterarar sobre el pero tambien podemos hacer lo mismo con una lista
        Object[][] conjuntoDeDatos = {
                {"Código de causa", "Esta asignada?", "comentarios", "Numero de incidencias"},
                {"xxxxxx1", true, "algo 1", 34},
                {"xxxxxx1 de causa", true, "algo 2", 3},
                {"xxxxxx1 de causa", false, "algo 3", 33},
                {"xxxxxx1 de causa", true, "algo 4", 21},
                {"xxxxxx1 de causa", true, "algo 5", 9},
                {"xxxxxx1 de causa", false, "algo 5", 15}
        };

//Iniciamos el numero de linea para ir iterando
        int NumeroDeLinea = 0;

        //Comenzamos a grabar los datos en el excel
        //Hacemos un buble de tipo for para ir
        //iterando sobre el primer array.
        //es decir las lineas de conjunto de datos
        //que estan sobre parentesis.
        //por ejemplo en la primera iteracion cunado NumeroDeLinea
        //es igual a cero se lee la linea {"Código de causa", "Esta asignada?",
        //"comentarios", "Numero de incidencias"}, y en la segunda iteracion la
        //variable NumeroDeLinea seria 1 y la linea que lee es
        //{"xxxxxx1", "si", "algo 1", 34}. Y asi sucesivamente
        for (Object[] datatype : conjuntoDeDatos) {
            Row linea = hoja.createRow(NumeroDeLinea++);
            int NumeroDeLaColumna = 0;
            //este bucle este dentro del otro bucle
            //es para leer cada valor dentro de una linea
            //la linea entre {} representa un array.
            //elemplo en la linea primena {"Código de causa",
            //"Esta asignada?", "comentarios", "Numero de incidencias"}
            //en la primera iteracion leemos "Código de causa" y en
            //la segunda "Esta asignada?" y asi sucesivamente
            for (Object field : datatype) {
            	//creo un objeto de tipo celda donde con las coordenadas
            	//de donde se van a guardar los datos que se van leyendo
            	//por ejemplo en la primera iteracion del bucle externo
            	// estaremos en la linea cero y sobre esa linea iteramos
            	//sobre las columnas
                Cell celda = linea.createCell(NumeroDeLaColumna++);
                //esta condiciional sirve para saber de que tipo es el dato
                //lo tenemos que cartear, esto significa poenr String entre parentesis
                //o Integer entre parentesis delante del dato para forzarlo a ese tipo
                //este de porque estamos leyendo Objectos de la matrix conjuntoDeDatos
                //y tenemos que convertirlos a los tipos que acepte la funcion setCellValue()
                //como Integer, String o booleano.
                //como curiosidad
                //Integer no es lo mismo que int
                //int es una variable primitiva
                //Integer es el objeto que representa esa variable
                if (field instanceof String) {
                    celda.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    celda.setCellValue((Integer) field);
                } else if (field instanceof Boolean) {
                    celda.setCellValue((Boolean) field);
                }
            }
        }

        try {
            //esta es la parte por la que pienso que no os termina de funcionar
            //porque esta ahora hemos trabajado en un objeto excel dentro de Java
        	//que seria XSSFWorkbook libro, sobre esto hemos hecho las modificaciones
        	//pero ahorta las tenemos que volcar al archivos externo de tipo excel
        	//para que los cambios se hagan efectivos, seria como el commit en una query


        	//Creamos un FileOutputStream que se conecta con el archivo.
        	//notar que hemos trabajado todo el rato sobre la libreria sin
        	//conectarnos en ningun momento al archivo.
            FileOutputStream archivoExcel = new FileOutputStream(ARCHIVO_EXCEL);

            //cogemos el objeto XSSFWorkbook para grabarlo
            libro.write(archivoExcel);
            //cerrarmos, si no cerramos la conexion se queda abierta
            //y es facil que pete la proxima vez que nos vayamos a conectar
            libro.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Terminado");
    }
}

import java.util.*;

public class App {

    //indicamos que es null ya que vamos a llenar la matriz posteriormente
    static int[][] matriz1 = null;
    
    //Creamos un metodo para leer todos los datos
    static Scanner leerDatos = new Scanner(System.in); 

    public static void main(String[] args) throws Exception {
       
        matriz1 = matrizTam(matriz1);

        //filas y columnas de la matriz

        System.out.println("Numero de filas: " + matriz1.length);
        System.out.println("Numero de columnas: " + matriz1[0].length);

        System.out.println();
        ingresarValores(matriz1);

        imprimirMatriz(matriz1);

    } 

    //tamanio de la matriz
    
    public static int[][] matrizTam (int[][] x){
        System.out.println("Ingrese la longitud de las filas y columnas");
        String longitudIngresada = leerDatos.next();
        //next para detectar el valor

        //Divide el String de un dato de un Array en un vector en cadenas para separarlos

        String[] datos = longitudIngresada.split("&");

        int filas = Integer.parseInt(datos[0]);
        int columnas = Integer.parseInt(datos[0]);

        //definimos una variable para guardar juntas las filas y columnas
        x = new int[filas][columnas];

        return x;

    }

    public static void ingresarValores(int [][] x){

        System.out.println("Ingrese valores de la matriz");

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = Integer.parseInt(leerDatos.next());
            }
        }

    }

    public static void imprimirMatriz(int[][] x){

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j]);
            }
            System.out.println("  ");
        }

    }

}

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Declaracion de arraylist

        ArrayList<String> cadenas;

        //Crear una instancia

        /*
         * La instanciación es el proceso de leer o especificar información
         * como los valores y el tipo de almacenamiento de un campo de datos.
         */
        
        cadenas = new ArrayList<String>();

        //Agregar elementos

        cadenas.add("Hola"); //este es el 0
        cadenas.add("Mundo"); //este es el 1
        cadenas.add("Xd"); //este es el 2

        //Impresion con for

        for (int i = 0; i < cadenas.size(); i++) {
            System.out.println(cadenas.get(i));
        }

        //remover un elemento

        cadenas.remove(2);
        //El parentesis indica lo que vamos a quitar`

        for (int i = 0; i < cadenas.size(); i++) {
            System.out.println(cadenas.get(i));
        }

    }
}
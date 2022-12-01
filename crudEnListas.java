import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Tablas de multiplicar con arrays

        List<Integer> numeros = new ArrayList<Integer>();

        System.out.println("Ingrese numero de taba de multiplicar");
        Scanner tabla = new Scanner(System.in);
        int recorrido = tabla.nextInt();

        System.out.println("Ingrese hasta donde hacer tablas");
        Scanner limite = new Scanner(System.in);
        int tope = limite.nextInt();

        for (int i = 0; i < tope; i++) {
            int resultado = i * recorrido;
            System.out.println(i + " x " + recorrido + " = " + resultado);
            numeros.add(resultado);
        }

        int longitud = numeros.size();
        System.out.println(longitud);

        //Consultamos tabla de multiplicar

        System.out.println("Ingrese yabla a consultar");
        Scanner readConsulta = new Scanner(System.in);
        int consulta = readConsulta.nextInt();

        System.out.println("El valor es:");
        System.out.println(numeros.set(consulta, null));

    }
}

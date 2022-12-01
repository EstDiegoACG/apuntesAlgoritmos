package batallanaval;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class BatallaNaval {

    public static void main(String[] args) {
        
        //Definimos los nombres para los jugadores
        
        System.out.println("Digite su nombre jugador 1");
        Scanner player1 = new Scanner (System.in);
        String namePlayer1 = player1.nextLine();
        
        System.out.println("Digite su nombre jugador 2");
        Scanner player2 = new Scanner (System.in);
        String namePlayer2 = player2.nextLine();
        
        //System.out.println(namePlayer1);
        //System.out.println(namePlayer2);
        
        //Create the match camp
        
        System.out.println("Ingresen el tablero de N*N");
        Scanner tablero = new Scanner (System.in);
        int tableroCompleto = tablero.nextInt();
        
        int tablerin[][] = new int[tableroCompleto][tableroCompleto];
        
        for (int i = 0; i < tableroCompleto; i++) {
            for (int j = 0; j < tableroCompleto; j++) {
                System.out.print(" x ");
            }
            System.out.println("");
        }
        
        //igualamos una lista al tamanio del arreglo
        
        int igualacion = tableroCompleto*tableroCompleto;
        
        List<Integer> fakeTablero = new ArrayList<Integer>();
        
        for (int i = 0; i < igualacion; i++) {
            fakeTablero.add(i);
        }
        
        int tamanio = fakeTablero.size();
        System.out.println(tamanio);
       
        //Hacemos los barcos para cada jugador
        
        System.out.println(namePlayer1 + "Digite el numero de barcos que deseas");
        System.out.println(namePlayer1 + "Solo del 1-5");
        Scanner navPlayer1 = new Scanner (System.in);
        int noBarquitos = navPlayer1.nextInt();
        
        for (int i = 0; i < noBarquitos; i++) {
            System.out.println("Barco de longitud" + i);
            System.out.println("Ingrese casilla para colocarlo");
            Scanner posisionBarco = new Scanner(System.in);
            int barcoColocado = posisionBarco.nextInt();
            
            System.out.println("Vertical u Horizontal?");
            System.out.println("V = vertical");
            System.out.println("H = horizontal");
            Scanner posiDif = new Scanner(System.in);
            String leerPosision = posiDif.nextLine();
            
            if (leerPosision == "v" || leerPosision == "V") {
                for (int j = 0; j < i; j++) {
                    //fakeTablero.set();
                }
            }
            
        }
            
    }
    
}

package Matrices;

import java.util.Scanner;
import Metodos.Metodos;

/**
 *
 * @author AlumMati
 */

/*
Partiendo de una matriz de 10x10 :
a) Visualiza los elementos de la diagonal secundaria.
b) Busca el mayor elemento e indica en qué columna se encuentra.
c) Intercambia los elementos de la fila 8 por los de la fila 3
*/

public class Practice_Two {

    public Practice_Two() {

        Scanner tec = new Scanner (System.in);
        
        int matriz[][] = new int[10][10];

        System.out.println("Matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 99) + 1;
                System.out.printf("%02d", matriz[i][j]); System.out.print(" ");
            } System.out.println("");
        } System.out.println("");
        
        System.out.println("Matriz Secundaria: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][matriz.length - i - 1] + " "); 
        }   System.out.println("");
        
        System.out.println("Matriz Secundaria Invertida: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[matriz.length - i - 1][i] + " "); 
        }   System.out.println("");
        
        int max = 0, f = 0, c = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > max){
                    max = matriz[i][j];
                    f = i; c = j;
                    
                }
            }
        } System.out.println("Elemento Mayor: " + max + "\n Fila: " + f + "\n Columna: " + c); System.out.println("");
        
        System.out.println("Intercambio Fila 8 X 3: ");
        
        for (int i = 0; i < matriz.length; i++) {
                int aux = matriz[8][i];
                matriz[8][i] = matriz[3][i];
                matriz[3][i] = aux;
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {               
                System.out.printf("%02d", matriz[i][j]); System.out.print(" ");
            } System.out.println("");
        } System.out.println("");
    }

    public static void main(String[] args) {
        new Practice_Two();
    }
}

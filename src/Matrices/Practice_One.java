package Matrices;

import java.util.Scanner;
import Metodos.Metodos;

/**
 *
 * @author AlumMati
 */

/*
Codifica un programa Java que lea una matriz de 10 x 10 y :
a) Visualice los elementos de la diagonal principal.
b) Visualice la suma de sus filas.
c) Ponga a 0 los elementos de la columna 7.
 */
public class Practice_One {

    public Practice_One() {
        Scanner tec = new Scanner(System.in);
        int matriz[][] = new int[10][10];

        System.out.println("Matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 89) + 10;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }   System.out.println("");

        System.out.println("Matriz Diagonal: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " "); 
        }   System.out.println("");
        
        System.out.println("Matriz Diagonal Invertida: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[matriz.length - i - 1][matriz.length - i - 1] + " "); 
        }   System.out.println("");

        System.out.println("Matriz Secundaria: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][matriz.length - i - 1] + " "); 
        }   System.out.println("");
        
        System.out.println("Matriz Secundaria Invertida: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[matriz.length - i - 1][i] + " "); 
        }   System.out.println("");
        
        
        
    }

    public static void main(String[] args) {
        new Practice_One();
    }
}

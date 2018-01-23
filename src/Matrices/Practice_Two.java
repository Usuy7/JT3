package Matrices;

import java.util.Scanner;
import Metodos.Metodos;

/**
 *
 * @author AlumMati
 */
public class Practice_Two {

    public Practice_Two() {

        Scanner tec = new Scanner (System.in);
        
        int matriz[][] = new int[10][10];

        System.out.println("Matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 89) + 10;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
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
        new Practice_Two();
    }
}

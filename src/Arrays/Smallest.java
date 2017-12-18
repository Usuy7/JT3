package Arrays;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */

/*
Programa que lea un array de n elementos y busque el menor y su posición.
*/

public class Smallest {
    
    public Smallest(){
        
        Scanner tec = new Scanner (System.in);
        
        int numbers[] = new int [9];
        int min = 9999, pos = 0;
        
        System.out.println("Ingresa números: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = tec.nextInt();
            if (numbers[i] < min){
                min = numbers[i]; pos = i;
            }
        } System.out.println("Menor: " + min + " Posición: " + pos);
    }
    
    public static void main(String[] args) {
        new Smallest();
    }
}

package Arrays;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */

/*
Algoritmo que lea un array de n elementos e intercambie el elemento mayor con el último.
*/

public class Exchange_Max_Last {
    
    public Exchange_Max_Last(){
        Scanner tec = new Scanner (System.in);
        int numbers[] = new int [5];
        int max, pos = 0;
        
        System.out.println("Ingresa números: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = tec.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        } max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                pos = i;
            }
        }
        numbers[pos] = numbers[numbers.length-1];
        numbers[numbers.length-1] = max;
        System.out.println("");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }
    }
    
    public static void main(String[] args) {
        new Exchange_Max_Last();
    }
}

package Arrays;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */

/*
Algoritmo que lea un array de n elementos y cambie el mayor elemento 
a la posición del menor y el menor a la posición del mayor.
 */
public class Exchange_Max_Min {

    public Exchange_Max_Min() {
        Scanner tec = new Scanner(System.in);
        int numbers[] = new int[10];
        int max, min, posMax = 0, posMin = 0;

        System.out.println("Ingresa números: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = tec.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        } min = numbers[0]; max = numbers[0]; 
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) min = numbers[i]; posMin = i;
            if (numbers[i] > max) max = numbers[i]; posMax = i;
        } numbers[posMax] = min; numbers[posMin] = max;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }
    }

    public static void main(String[] args) {
        new Exchange_Max_Min();
    }

}

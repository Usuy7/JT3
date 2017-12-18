package Arrays;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */

/*
Programa que lea un array de n elementos y visualice la suma de 
los elementos que ocupan la posición par. ( 0, 2, 4 … )
*/

public class Pars_Sum {

    public Pars_Sum() {

        Scanner tec = new Scanner(System.in);

        int numbers[] = new int[9];
        int sum = 0;

        System.out.println("Ingresa números: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = tec.nextInt();
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }
        System.out.println("La suma de los elementos en posición par es: " + sum);
    }

    public static void main(String[] args) {
        new Pars_Sum();
    }
}

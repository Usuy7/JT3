package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author AlumMati
 */

/*
Introducir una secuencia de números, cuyos valores están comprendidos entre 1 y 10. Queremos saber al final
que números del 1 al 10 no han sido introducidos.
 */
public class Numbers_Not_Entered {

    public Numbers_Not_Entered() {
        Scanner tec = new Scanner(System.in);
        int num;
        boolean array[] = new boolean[10];
        Arrays.fill(array, Boolean.FALSE);

        System.out.println("Introduce tus valores: ");
        for (int i = 0; i < 10; i++) {

            num = tec.nextInt();
            array[num - 1] = true;

            while (num < 1 || num > 10) {
                System.out.println("FAIL, prueba otra vez");
                num = tec.nextInt();
            }
        }

        System.out.println("Los números no introducidos son: ");

        for (int i = 0; i < 10; i++) {
            if (array[i] == false) {
                System.out.print(i + 1 + " ");
            }
        }
    }

    public static void main(String[] args) {
        new Numbers_Not_Entered();
    }
}

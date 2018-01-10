package Arrays;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */

/*
Método que reciba un array y un número y calcula el nº de veces que aparece.
 */
public final class Counter {

    public Counter() {
        Scanner tec = new Scanner(System.in);
        int numbers[] = new int[10];
        int num, cont;

        System.out.println("Introduce tus números: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = tec.nextInt();
        }
        System.out.println("¿Qué número deseas contar?: ");
        num = tec.nextInt();
        cont = Contador(numbers, num);
        System.out.println("Nº: " + cont);
    }

    public int Contador(int numbers[], int num) {

        int cont = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == num) {
                cont++;
            }
        }

        return cont;
    }

    public static void main(String[] args) {
        new Counter();
    }
}

package Arrays;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */

/*
Carga un vector de 15 elementos T(I) y a partir de él crea otro N(J) de 10 elementos de la siguiente forma:
N(1) = T(1)
N(2) = T(1) + T(2)
N(10) = T(1) + T(2) + T(3)+ ….T(10)
 */
public class Array_In_Array {

    public Array_In_Array() {
        Scanner tec = new Scanner(System.in);
        int T[] = new int[10];
        int N[] = new int[T.length];

        for (int i = 0; i < T.length; i++) {
            T[i] = i + 1;
            System.out.print(T[i] + " ");
        } System.out.println();
        for (int i = 0; i < T.length; i++) {
            if (i == 0) {
                N[i] = T[i];
            } else {
                N[i] = T[i] + N[i - 1];
            } System.out.print(N[i] + " ");
        }
    }

    public static void main(String[] args) {
        new Array_In_Array();
    }
}

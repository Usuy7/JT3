package Metodos;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author AlumMati
 */
public class Metodos {

    static Scanner tec = new Scanner(System.in);

    public static int MayorCero(int num) {

        while (num <= 0) {
            System.out.print("Error, introduce un número mayor que cero: ");
            num = tec.nextInt();
        }
        return num;
    }

    public static long MayorCero(long num) {

        while (num <= 0) {
            System.out.print("Error, introduce un número mayor que cero: ");
            num = tec.nextLong();
        }
        return num;
    }

    public static float MayorCero(float num) {

        while (num <= 0) {
            System.out.print("Error, introduce un número mayor que cero: ");
            num = tec.nextFloat();
        }
        return num;
    }

    public static double MayorCero(double num) {

        while (num <= 0) {
            System.out.print("Error, introduce un número mayor que cero: ");
            num = tec.nextDouble();
        }
        return num;
    }

    public static boolean esPrimo(int num) {

        int contador = 2;
        boolean primo = true;

        while ((primo) && (num != contador)) {
            if (num % contador == 0) {
                primo = false;
            }
            contador++;
        }
        return primo;
    }

    public static boolean esPerfecto(int num) {

        int suma = 0;
        boolean perfecto = false;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                suma += i;
            }
        }
        if (num == suma) {
            perfecto = true;
        } else {
            perfecto = false;
        }
        return perfecto;
    }

    public static int SumaDivisores(int num) {

        int suma = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                suma += i;
            }
        }
        return suma;
    }

    public static int CuantasCifras(int num) {

        int contador = 0;

        while (num != 0) {
            num = num / 10;
            contador++;
        }
        System.out.println("El número tiene: " + contador + " cifras");

        return contador;
    }

    public static String DescomponerFP(int num) {

        int c = 2;
        String numbers = "";

        System.out.print(num + " = 1");

        if (num == 1) {
            System.out.print("1");
        } else {
            while (num != 1) {
                for (int i = 0; i <= num; i++) {
                    if (num % c == 0) {
                        numbers = numbers + " * " + Integer.toString(c);
                        num = num / c;
                    } else {
                        c++;
                    }
                }
            }
        }
        return numbers;
    }

    public static boolean esAlfaNumerica(String cadena) {

        cadena = cadena.toLowerCase();
        boolean result = false;

        for (int i = 0; i < cadena.length(); ++i) {

            char caracter = cadena.charAt(i);

            if (!Character.isLetterOrDigit(caracter)) {
                result = false;
            } else {
                result = true;
            }
        }
        return result;
    }

    public static String test_esLetra(String cadena) throws IOException {

        boolean val = false;

        do {

            while (cadena.equals("")) {
                System.out.print("Ingresa algún dato: ");
                cadena = tec.nextLine();
            }

            for (int i = 0; i < cadena.length(); i++) {

                val = true;

                if (!Character.isLetter(cadena.charAt(i))) {
                    val = false;
                }
            }
            if (!val) {
                System.out.print("Error, ingresa una cadena alfabetica: ");
                cadena = tec.nextLine();
            }
        } while (!val);

        return cadena;
    }

    public static String test_esNumber(String cadena) throws IOException {

        boolean val = false;

        cadena = cadena.toLowerCase();

        do {

            while (cadena.equals("")) {
                System.out.print("Ingresa algún dato: ");
                cadena = tec.nextLine();
            }

            for (int i = 0; i < cadena.length(); i++) {

                val = true;

                if (!Character.isDigit(cadena.charAt(i))) {
                    val = false;
                }
            }
            if (!val) {
                System.out.print("Error, ingresa un número entero: ");
                cadena = tec.nextLine();
            }
        } while (!val);

        return cadena;
    }

    public static int CountWord(String sentence, String word) {

        int counter = 0;

        return counter;
    }

    public static int CountWords(String sentence) {
        int cont = 0;
        boolean palabra = false;
        int finDeLinea = sentence.length() - 1;

        for (int i = 0; i < sentence.length(); i++) {
            // Si el char es una letra y no es el final de la frase, word = true.
            if (Character.isLetter(sentence.charAt(i)) && i != finDeLinea) {
                palabra = true;
                
                // Si el char no es una letra y aún hay más letras, el contador continua.
            } else if (!Character.isLetter(sentence.charAt(i)) && palabra) {
                cont++;
                palabra = false;
                // si es la última palabra de la cadena; si no termina con una no letra ,
            } else if (Character.isLetter(sentence.charAt(i)) && i == finDeLinea) {
                cont++;
            }
        }
        return cont;
    }
}

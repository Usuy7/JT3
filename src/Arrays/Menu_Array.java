package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author AlumMati
 */

/*
Codifica un programa Java que lea un array de 10 elementos v[ ] .
• Crea un array nuevo con los 5 primeros elementos del array v[].
• Visualiza el array v ordenado.
• Busca un valor en el array ordenado, utilizando la búsqueda binaria.
 */

public class Menu_Array {
    
    public Menu_Array (){
        Scanner tec = new Scanner (System.in);
        int numbers[] = new int [10];
        int numbers2[] = new int [5];
        
        System.out.println("Introduce tus números: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = tec.nextInt();
        } // fillArray(numbers);       
        System.out.println("Array Original: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }
        System.out.println("Array Secundario: ");
        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = numbers[i];
            System.out.println(numbers2[i] + " ");
        }
        System.out.println("Array Ordenado: ");
        Order(numbers);
        // Arrays.sort(numbers);
        
        System.out.println("¿Qué número buscas?: ");
        
    }
    
    public void Order (int numbers[]){
        
    }
    
    public static void print_N_Array (int array[]){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    public static void print_S_Array (String array[]){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    public static void fillArray (int array[]){
        for(int i = 0; i < array.length; i++){
            array[i] = randomNumbers();
        }
    }
     private static int randomNumbers (){
        return ((int)Math.floor(Math.random()*1000));
    }
    public static void main(String[] args) {
        new Menu_Array();
    }
}

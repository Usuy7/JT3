package Arrays;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */

/*
Algoritmo que lea las temperaturas del mes n y calcule y visualice:
- Temperatura media
- La temperatura más baja
- Cuantos días han tenido temperaturas superiores a la media
*/

public class Temperature {
    
    public Temperature(){
        
        Scanner tec = new Scanner (System.in);
        
        float temp[] = new float[10];
        float average, sum = 0, min;
        int day = 0;
        
        System.out.println("Ingresa temperaturas: ");
        for (int i = 0; i < temp.length; i++) {
            temp[i] = tec.nextFloat();
        } min = temp[0];
        for (int i = 0; i < temp.length; i++) {
            sum += temp[i];
            if (temp[i] < min) min = temp[i];    
        } average = sum / (float) temp.length;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > average){
                day++;
            }
        }
        System.out.println("*****Temperaturas*****");
        System.out.println("Media: " + average);
        System.out.println("Miníma: "+ min);
        System.out.println("Superior a la media: " + day);
    }
    
    public static void main(String[] args) {
        new Temperature();
    }
}

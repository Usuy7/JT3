package Arrays;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */

/*
Programa que lea un array con las notas de Programación de n alumnos, y calcule :
- Nota media de la asignatura.
- Porcentaje de aprobados
- Cuantas notas inferiores a 2.
- Si ha habido algún 10.
*/

public class Student_Notes {
    
    public Student_Notes(){
        Scanner tec = new  Scanner (System.in);
        float notes [] = new float [10];
        float average, approved, sumA = 0, sumP = 0, under = 0;
        boolean excellent = false;
        
        System.out.println("Ingresa las notas: ");
        for (int i = 0; i < notes.length; i++) {
            notes[i] = tec.nextInt();
            while(notes[i] < 0 || notes[i] > 10){
                System.out.println("Beetwen 0-10 ");
                notes[i] = tec.nextInt();
            }
        }
        for (int i = 0; i < notes.length; i++) {
            sumA += notes[i];  
            if (notes[i] < 2) under++;
            else if (notes[i] >= 5) sumP++;
            else if (notes[i] == 10) excellent = true;
        }
        average = sumA / (float) notes.length;
        approved = sumP * 100 / (float) notes.length;
        System.out.println("*****Notes*****");
        System.out.println("Average: " + average);
        System.out.println("Approved %: " + approved);
        System.out.println("Under '2': " + under);
        System.out.println("Any 10?: " + excellent);
    }
    
    public static void main(String[] args) {
        new Student_Notes();
    }
}

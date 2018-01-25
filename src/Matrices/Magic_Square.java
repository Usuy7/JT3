package Matrices;

import java.util.Scanner;

/**
 *
 * @author Javier
 */

/*
Codifica un programa que pida los datos de una matriz de dimensiones n X n, y compruebe
si la matriz forma un cuadrado mágico (es decir si todas las filas suman el mismo número y
todas las columnas también, y además ese número coincide con el de las filas). Debéis
crear los métodos que consideréis oportunos.
 */
public class Magic_Square {

    public Magic_Square() {

        Scanner tec = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        int suma = 0;
        boolean correcto;
        System.out.println("***Magic Square***");
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * (9 - 1) + 1);
                System.out.print("   " + matriz[i][j] + "");
            } System.out.println(" ");
        } System.out.println("");
        
        suma = matriz[0][0] + matriz[0][1] + matriz[0][2];
        if (suma != matriz[1][0] + matriz[1][1] + matriz[1][2]){
            correcto = false;
        } else if (suma != matriz[2][0] + matriz[2][1] + matriz[2][2]) {
            correcto = false;
        }  else if (suma != matriz[0][0] + matriz[1][0] + matriz[2][0]) {
            correcto = false;
        } else if (suma != matriz[0][1] + matriz[1][1] + matriz[2][1]) {
            correcto = false;
        } else if (suma != matriz[0][2] + matriz[1][2] + matriz[2][2]) {
            correcto = false;
        } else if (suma != matriz[0][0] + matriz[1][1] + matriz[2][2]) {
            correcto = false;
        } else if (suma != matriz[0][2] + matriz[1][1] + matriz[2][0]) {
            correcto = false;
        } else {
            correcto = true;
        }
        
        if (correcto == false){
            System.out.println("No es un cuadrado mágico");
        } else {
            System.out.println("Es un cuadrado mágico");
        }
    }
    
    /*
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("La suma de la fila (" + (i + 1) + ")" +vectorToString(matriz[i],0) +" es "+sumatoriaVector(matriz[i],0,0) );
        }
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("La suma de la columna (" + (i + 1) + ")");
        }
    
    public static String vectorToString(int vector[], int i){
        if(i>=vector.length){
            return "|";
        }else{
            if(vector[i]<10){
                return "|  "+vector[i]+" "+vectorToString(vector,i+1);
            }else{
                return "| "+vector[i]+" "+vectorToString(vector,i+1);
            }
        }
    }

    public static int sumatoriaVector(int vector[],int indice, int suma){
        if(indice>=vector.length){
            return suma;
        }
        suma=suma+vector[indice];
        return sumatoriaVector(vector,indice+1,suma);
    }    
    */
    
    public static void main(String[] args) {
        new Magic_Square();
    }
}

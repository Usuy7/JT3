/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrices;

import java.io.BufferedReader;
import Metodos.Metodos;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Javier
 */

/*
Crea un array con los nombres de 20 alumnos, para finalizar antes de introducir los 20
nombres, pulsamos “F” o “f”.Pepe
 */
public class Students {

    public Students() throws IOException {

        BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));
        String array[] = new String[3];
        String name = "", test_name = "";
        char bad = 'f';
        boolean bomb = false;

        for (int i = 0; i < array.length; i++) {

            if (bomb == false) {
                System.out.print("Introduce un nombre: ");
                name = tec.readLine();
                test_name = name;
                test_name = test_name.toLowerCase();

                for (int j = 0; j < test_name.length(); j++) {
                    
                    if (bad == test_name.charAt(i)) {
                        bomb = true; break;
                    } else {
                        array[i] = name;
                    }
                }
            }
        }

        Metodos.print_S_Array(array);

    }

    public static void main(String[] args) throws IOException {
        new Students();
    }
}

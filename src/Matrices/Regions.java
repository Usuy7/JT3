package Matrices;

import java.util.Scanner;
import Metodos.Metodos;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Javier
 */

/*
Codifica un programa que lea el número de habitantes y extensión de 15 comarcas de la
Comunidad Valenciana y calcule:
a) Densidad de población de las 15 comarcas .Hb / Km2
b) Número de la comarca de menor extensión
c) ¿Hay alguna comarca con menos de 10.000 habitantes?
d) Cuantas comarcas tienen una densidad de población superior a la media aritmética.
 */
public class Regions {

    public Regions() {

        Scanner tec = new Scanner(System.in);

        // Nombres de las Comarcas
        String names[] = {"Alto Maestrazgo", "Alto Palancia", "Alto Vinalopó ", "Bajo Maestrazgo", "Bajo Vinalopó", "Campo Alicante", "Campo Morvedre",
            "Campo Turia", "Huerta Norte", "Marina Alta", "Plana Utiel", "La Safor", "Valle Albaida", "Valle Ayora", "Vinalopó Medio"};

        // Habitantes Aleatorios
        double population[] = new double[15];
        boolean lower = false;
        for (int i = 0; i < population.length; i++) {
            population[i] = (int) (Math.random() * (50000 - 5000) + 5000);
            if (population[i] < 10000) {
                lower = true;
            }
        }

        // Extensiones Aleatorios
        double extension[] = new double[15];
        double small = extension[0];

        for (int i = 0; i < extension.length; i++) {
            extension[i] = (Math.random() * (2000 - 150) + 150);
            System.out.println(extension[i]);
            if (extension[i] < small) {
                small = extension[i];
            }
        }   System.out.println(small);
        System.out.println("");

        // Densidad Población
        double density[] = new double[15];
        for (int i = 0; i < density.length; i++) {
            density[i] = ((double) population[i]) / extension[i];
        }

        // Unión Arrays
        String regions[][] = new String[15][4];

        for (int i = 0; i < regions.length; i++) {
            for (int j = 0; j < regions[i].length; j++) {
                regions[i][0] = names[i];
                regions[i][1] = String.valueOf(population[i]);
                regions[i][2] = String.valueOf(extension[i]);
                regions[i][3] = String.valueOf(density[i]);
            }
        }

        for (String[] reg : regions) {
            for (String region : reg) {
                System.out.print(region + "\t\t");
            }
            System.out.println("");
        }
        System.out.println("");

        System.out.print("Menor extensión es: ");

        System.out.println("");
        if (lower == true) {
            System.out.println("Hay alguna con censo inferior a 10.000 habitantes");
        } else {
            System.out.println("Todas superan los 10.000 habitantes");
        }
    }

    public static void main(String[] args) {
        new Regions();
    }
}

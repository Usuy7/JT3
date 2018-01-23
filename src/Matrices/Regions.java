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

        String regions[][] = new String[15][3];
        double extension[] = new double[15];
        int population[] = new int[15];
        double density, average;
        int smallest;
        boolean undermean;
        
        // Nombres de las Comarcas
        String names[] = {"Alto Maestrazgo", "Alto Palancia", "Alto Vinalopó ", "Bajo Maestrazgo", "Bajo Vinalopó", "Campo de Alicante", "Campo de Morvedre",
            "Campo de Turia", "Huerta Norte", "Marina Alta", "Plana de Utiel", "Safor", "Valle de Albaida", "Valle de Ayora", "Vinalopó Medio"};     

        for (String name : names) {
            System.out.println(name);
        } System.out.println("");
        
        // Habitantes Aleatorios
        for (int habitant : population) {
            population[habitant] = (int)(Math.random() * (50000 - 5000) + 5000);
            System.out.println(population[habitant]);
        } System.out.println("");
        
        // Extensiones Aleatorios
        for (int i = 0; i < extension.length; i++) {
            extension[i] = (Math.random() * (2000 - 150) + 150);
            BigDecimal bd = new BigDecimal(extension[i]);
            bd = bd.setScale(3, RoundingMode.HALF_UP);
            System.out.println(bd.doubleValue());
        }
        
        for (int i = 0; i < regions.length; i++){
            for (int j = 0; j < regions[i].length; j++) {
                regions[i][0] += names;
                regions[i][1] += population;
                regions[i][2] += extension;
            }
        }

        for (int i = 0; i < regions.length; i++) {
            for (int j = 0; j < regions[i].length; j++) {
                System.out.println(regions[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        new Regions();
    }
}

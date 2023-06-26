package poo_practica;

import java.util.Arrays;
import java.util.Random;

public class Arreglos {

    public static void main(String[] args) {
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];

        Random random = new Random();
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = random.nextDouble() * 100;
        }

        System.out.println("Arreglo A sin ordenar:");
        mostrarArreglo(arregloA);

        Arrays.sort(arregloA);

        System.out.println("Arreglo A ordenado:");
        mostrarArreglo(arregloA);

        System.arraycopy(arregloA, 0, arregloB, 0, 10);

        Arrays.fill(arregloB, 10, arregloB.length, 0.5);

        System.out.println("Arreglo B combinado:");
        mostrarArreglo(arregloB);
    }

    public static void mostrarArreglo(double[] arreglo) {
        for (double elemento : arreglo) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}

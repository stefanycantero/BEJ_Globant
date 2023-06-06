/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author Stefany
 */
public class JavaFn17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números que desee");
        int N = sc.nextInt();
        int vector[] = new int[N];
        int[] contadores = new int[6];

        for (int i = 0; i < N; i++) {
            vector[i] = (int) (Math.random() * 20) + 1;
        }

        for (int i : vector) {
            int digitos = (int) Math.log10(i) + 1;
            if (digitos >= 1 && digitos <= 5) {
                contadores[digitos]++;
            }
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("Cantidad de números con " + i + " dígito(s): " + contadores[i]);
        }
    }
}

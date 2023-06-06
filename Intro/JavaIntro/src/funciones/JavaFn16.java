/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author Stefany
 */
public class JavaFn16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números que desee");
        int N = sc.nextInt();
        int vector[] = new int[N];
        int cont = 0;
        int M;

        for (int i = 0; i < N; i++) {
            vector[i] = (int) (Math.random());
        }

        System.out.println("Ingrese el número que desea buscar");
        M = sc.nextInt();

        for (int i = 0; i < N; i++) {
            if (vector[i] == M) {
                cont++;
                System.out.println("El número se encuentra en la posición " + i);
            }
        }
        if (cont > 1) {
            System.out.println("El número se repite " + cont + " veces.");
        } else {
            System.out.println("El número no se encuentra en el vector.");
        }
    }
}

/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package Matrices;

import java.util.Scanner;

/**
 *
 * @author Stefany
 */
public class JavaFn19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        
        System.out.println("Ingrese la dimensión de la matriz");
        int N = sc.nextInt();
        
        int matriz[][] = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = (int) (Math.random() * 20) + 1;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        boolean esAntisimetrica = verificarAntisimetria(matriz);

        if (esAntisimetrica) {
            System.out.println("La matriz es antisimétrica.");
        } else {
            System.out.println("La matriz no es antisimétrica.");
        }
    }

    public static boolean verificarAntisimetria(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] != -matriz[j][i]) {
                    return false;
                }
            }
        }

        return true;
    }
}

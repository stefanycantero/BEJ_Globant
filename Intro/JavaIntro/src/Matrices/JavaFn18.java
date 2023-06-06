/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
 */
package Matrices;

/**
 *
 * @author Stefany
 */
public class JavaFn18 {

    public static void main(String[] args) {

        int N = 4;
        int matrixA[][] = new int[N][N];
        int matrixB[][] = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrixA[i][j] = (int) (Math.random() * 20) + 1;
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Traspuesta");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrixB[i][j] = matrixA[j][i];
                System.out.print(matrixB[i][j] + " ");
            }
            System.out.println();

        }
    }
}

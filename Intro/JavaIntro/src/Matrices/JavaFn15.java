/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package Matrices;
/**
 *
 * @author Stefany
 */
public class JavaFn15 {
    public static void main(String[] args) {
        int[] vector = new int[100];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = vector.length - i;
        }

        System.out.println("Vector en orden descendente:");
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
}

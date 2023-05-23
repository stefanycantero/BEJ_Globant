/*Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número.*/
package javaintro;
import java.util.Scanner;

/**
 *
 * @author Stefany
 */
public class JavaIntroEj05 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero: ");
        int num = sc.nextInt();
        
        int numDouble = num * 2;
        int numTriple = num * 3;
        double numSquaredRoot = Math.sqrt(num);
        
        System.out.println("El doble del número ingresado es "+numDouble+". El triple es "+numTriple+". Y finalmente, su raíz cuadrada es "+numSquaredRoot);
    }

}

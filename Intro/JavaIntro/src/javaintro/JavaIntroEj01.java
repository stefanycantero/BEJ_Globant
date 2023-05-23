/*Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma*/

package javaintro;
import java.util.Scanner;
/**
 *
 * @author Stefany
 */
public class JavaIntroEj01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese dos números enteros: ");
        
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int suma = n1 + n2;
        
        System.out.println("La suma es: "+suma);
    }
    
}

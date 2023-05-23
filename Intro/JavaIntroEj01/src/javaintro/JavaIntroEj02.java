/*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.*/
package javaintro;
import java.util.Scanner;
/**
 *
 * @author Stefany
 */
public class JavaIntroEj02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        
        String name = sc.next();
        
        System.out.println("El nomnbre ingresado es: "+name);
    }
    
}
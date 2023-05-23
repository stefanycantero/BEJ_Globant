/*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java. */
package javaintro;
import java.util.Scanner;
/**
 *
 * @author Stefany
 */
public class JavaIntroEj03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese una frase: ");
        
        String phrase = sc.nextLine();
        
        System.out.println(phrase.toUpperCase());
        System.out.println(phrase.toLowerCase());
        
    }
    
}
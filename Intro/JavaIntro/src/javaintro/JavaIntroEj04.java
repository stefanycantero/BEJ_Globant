/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
package javaintro;
import java.util.Scanner;

/**
 *
 * @author Stefany
 */
public class JavaIntroEj04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese una cantidad en grados centígrados: ");
        
        int celsius = sc.nextInt();
        int fahrenheit = 32 + (9 * celsius /5);
        
        System.out.println(celsius+"°C en °F son: "+fahrenheit);
    }
    
}
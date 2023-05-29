/**Crear un programa que dado un numero determine si es par o impar.*/

package condicionales;
import java.util.Scanner;

/**
 *
 * @author Stefany
 */
public class JavaCondEj06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero: ");
        int num = sc.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("El número es par");
        }else{
            System.out.println("El número es impar");
        }
    }
}

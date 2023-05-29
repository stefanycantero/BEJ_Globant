/*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.*/
package condicionales;
import java.util.Scanner;
/**
 *
 * @author Stefany
 */
public class JavaCondEj07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese una frase: ");
        String phrase = sc.nextLine();
        
        if (phrase.equals("eureka")) {
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
}

/*Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring y equals() de Java.*/
package condicionales;
import java.util.Scanner;
/**
 *
 * @author Stefany
 */
public class JavaCondEj09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese una frase: ");
        
        String phrase = sc.nextLine();
        phrase = phrase.toLowerCase();
        
        
        if (phrase.substring(0,1).equals("a")) {
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
}

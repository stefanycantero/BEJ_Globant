/*Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.*/
package condicionales;
import java.util.Scanner;
/**
 *
 * @author Stefany
 */
public class JavaCondEj08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese una frase: ");
        String phrase = sc.nextLine();
        
        if (phrase.length() == 8) {
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
}
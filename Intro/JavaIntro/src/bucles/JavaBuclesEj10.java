/*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.*/
package bucles;
import java.util.Scanner;
/**
 *
 * @author Stefany
 */
public class JavaBuclesEj10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un valor límite positivo");
        
        int limite = sc.nextInt();
        int suma = 0;
        
        do{
            System.out.println("Ingrese un número: ");
            suma = sc.nextInt() + suma;
        }while(suma < limite);
    }
}

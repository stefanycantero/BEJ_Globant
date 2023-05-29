/*Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.*/
package bucles;

import java.util.Scanner;

/**
 *
 * @author Stefany
 */
public class JavaBucles11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese dos números: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int menu;
        String seleccion = "n";

        do{
            System.out.println("MENU");
            System.out.println("""
                               1. Sumar 
                               2. Restar 
                               3. Multiplicar
                               4. Dividir 
                               5. Salir
                               Elija opcion""");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    int suma = num1 + num2;
                    System.out.println("La suma es "+suma);
                    break;
                case 2:
                    int resta = num1 - num2;
                    System.out.println("La resta es "+resta);
                    break;
                case 3:
                    int multiplicacion = num1 * num2;
                    System.out.println("La multiplicación es "+multiplicacion);
                    break;
                case 4:
                    int division = num1 / num2;
                    System.out.println("La división es "+division);
                    break;
                case 5:
                    System.out.print("¿Está seguro que desea salir del programa (S/N)? ");                    
                    seleccion = sc.next();  
                    seleccion = seleccion.toLowerCase();
                    break;
                default:                    
                    System.out.println("Por favor ingrese una opción del 1 al 5.");                   
                    break;
            }
        }while(!seleccion.equals("s"));
    }
}

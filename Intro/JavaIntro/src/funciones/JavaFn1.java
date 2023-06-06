/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author Stefany
 */
public class JavaFn1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de euros a convertir:");
        double e = sc.nextDouble();
        System.out.println("Divisas disponibles: libras, dolares, yenes. Si ingresa otro valor le devolverá 0.");
        System.out.println("Ingrese la nueva divisa:");
        String d = sc.next();

        double c = Divisas(e, d);
        System.out.println("El cambio es: " + c);
    }

    public static double Divisas(double euros, String divisa) {
        double cambio = 0;

        switch (divisa) {
            case "libras":
                cambio = euros * 0.86;
                break;
            case "dolares":
                cambio = euros * 1.28611;
                break;
            case "yenes":
                cambio = euros * 129.852;
                break;
            default:
                return 0;
        }

        return cambio;
    }

}

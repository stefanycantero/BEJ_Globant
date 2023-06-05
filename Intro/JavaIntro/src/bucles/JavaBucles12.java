/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author Stefany
 */
public class JavaBucles12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String msg;
        String end = "&&&&&";
        int maxChar = 5;
        int attemps = 0;
        int wrongAttemps = -1;

        do {
            msg = sc.nextLine();

            if (msg.length() == maxChar && msg.substring(0, 1).equals("X") && msg.substring(4, 5).equals("O")) {
                attemps++;

            } else {
                wrongAttemps++;
            }
        } while (!msg.equals(end));
        System.out.println("La cantidad de lecturas correctas es: "+attemps+"\nLa cantidad de lecturas incorrectas es: "+wrongAttemps);
    }

}

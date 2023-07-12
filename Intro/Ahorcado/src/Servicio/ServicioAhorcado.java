package Servicio;

import Entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author Stefany
 */
public class ServicioAhorcado {

    Scanner sc = new Scanner(System.in);
    Ahorcado ahorcado = new Ahorcado();

    public Ahorcado crearJuego() {

        int jugadasMaximas, letrasEncontradas;

        System.out.println("Ingrese una palabra: ");
        char[] palabra = sc.nextLine().toCharArray();
        ahorcado.setPalabraBuscada(palabra);

        System.out.println("Ingresar la cantidad de jugadas máximas: ");
        jugadasMaximas = sc.nextInt();
        ahorcado.setJugadasMaximas(jugadasMaximas);
        ahorcado.setIntentos(jugadasMaximas);

        letrasEncontradas = 0;
        ahorcado.setCantidadLetrasEncontradas(letrasEncontradas);

        return ahorcado;
    }

    public int longitud() {
        return ahorcado.getPalabraBuscada().length;
    }

    public void buscar(char letra) {

        boolean encontrada = false;
        char[] palabra = ahorcado.getPalabraBuscada();
        for (char i : palabra) {
            if (i == letra) {
                encontrada = true;
            }
        }

        if (encontrada) {
            System.out.println("Mensaje: la letra pertenece a la palabra");
        } else {
            System.out.println("Mensaje: la letra NO pertenece a la palabra");
            intentos();
        }
    }

    public void encontradas(char letra) {
        int letrasEncontradas = 0;
        int letrasFaltantes;
        boolean encontrada = false;

        char[] palabra = ahorcado.getPalabraBuscada();
        for (char i : palabra) {
            if (i == letra) {
                encontrada = true;
            }
        }

        if (encontrada) {
            letrasEncontradas++;
        }

        letrasFaltantes = longitud() - letrasEncontradas;
        System.out.println("Número de letras (encontradas,faltantes): (" + letrasEncontradas + "," + letrasFaltantes + ")");

    }

    public int intentos() {
        int actuales = ahorcado.getIntentos();
        ahorcado.setIntentos(actuales-1);
        return ahorcado.getIntentos();
    }
    
    public void juego() {
        crearJuego();

        while (intentos() != 0) {
            System.out.println("Ingrese una letra:");
            char letra = sc.next().charAt(0);
            longitud();
            buscar(letra);
            encontradas(letra);
            System.out.println("Número de oportunidades restantes: " + ahorcado.getIntentos());
        }
    }

}

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

        ahorcado.setPalabraBuscada(ingresarPalabra());
        System.out.println("Ingresar la cantidad de jugadas máximas: ");

        jugadasMaximas = sc.nextInt();
        ahorcado.setJugadasMaximas(jugadasMaximas);

        letrasEncontradas = 0;
        ahorcado.setCantidadLetrasEncontradas(letrasEncontradas);

        return ahorcado;
    }

    public String[] ingresarPalabra() {
        String palabra;

        System.out.println("Ingrese una palabra:");
        palabra = sc.nextLine();

        String[] palabraBuscar = new String[palabra.length()];

        for (int i = 0; i < palabraBuscar.length; i++) {
            palabraBuscar[i] = palabra.substring(i, i);
        }

        return palabraBuscar;
    }

    public void longitud() {
        System.out.println("Longitud de la palabra: " + ahorcado.getPalabraBuscada().length);
    }

    public boolean buscar(String letra) {

        boolean esParte = false;

        for (String palabraBuscada : ahorcado.getPalabraBuscada()) {
            if (palabraBuscada.equals(letra)) {
                esParte = true;
            }
        }

        return esParte;

    }

    public void encontradas(String letra) {

        int cantidadLetrasEncontradas = 0;
        int cantidadLetrasRestantes = ahorcado.getPalabraBuscada().length - cantidadLetrasEncontradas;
        int jugadasMaximas = 0;

        for (String palabraBuscada : ahorcado.getPalabraBuscada()) {
            if (palabraBuscada.equals(letra)) {
                cantidadLetrasEncontradas++;
            }
        }

        System.out.printf("Número de letras (encontradas,faltantes): (%d,%d)", cantidadLetrasEncontradas, cantidadLetrasRestantes);

        if (!buscar(letra)) {
            jugadasMaximas = ahorcado.getJugadasMaximas() - 1;
            ahorcado.setJugadasMaximas(jugadasMaximas);
        }

    }

    public void intentos() {
        System.out.printf("Número de oportunidades restantes: %d", ahorcado.getJugadasMaximas());
    }

    public void juego() {
        String letra;

        crearJuego();

        longitud();
        
        System.out.println("Ingrese una letra: ");
        letra = sc.next();
        buscar(letra);

        if (buscar(letra)) {
            System.out.println("Mensaje: la letra pertenece a la palabra");
        } else {
            System.out.println("Mensaje: La letra no pertenece a la palabra");
        }
        
        encontradas(letra);
        
        intentos();

    }

}

package Entidad;

/**
 *
 * @author Stefany
 */
public class Ahorcado {
    private char[] palabraBuscada;
    private int cantidadLetrasEncontradas;
    private int jugadasMaximas;
    private int intentos;

    public Ahorcado() {
    }

    public Ahorcado(char[] palabraBuscada, int cantidadLetrasEncontradas, int jugadasMaximas, int intentos) {
        this.palabraBuscada = palabraBuscada;
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
        this.jugadasMaximas = jugadasMaximas;
        this.intentos = intentos;
    }

    public char[] getPalabraBuscada() {
        return palabraBuscada;
    }

    public void setPalabraBuscada(char[] palabraBuscada) {
        this.palabraBuscada = palabraBuscada;
    }

    public int getCantidadLetrasEncontradas() {
        return cantidadLetrasEncontradas;
    }

    public void setCantidadLetrasEncontradas(int cantidadLetrasEncontradas) {
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

}

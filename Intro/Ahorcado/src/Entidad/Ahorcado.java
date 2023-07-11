package Entidad;

/**
 *
 * @author Stefany
 */
public class Ahorcado {
    private String[] palabraBuscada;
    private int cantidadLetrasEncontradas;
    private int jugadasMaximas;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabraBuscada, int cantidadLetrasEncontradas, int jugadasMaximas) {
        this.palabraBuscada = palabraBuscada;
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
        this.jugadasMaximas = jugadasMaximas;
    }

    public String[] getPalabraBuscada() {
        return palabraBuscada;
    }

    public void setPalabraBuscada(String[] palabraBuscada) {
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
    
    
}

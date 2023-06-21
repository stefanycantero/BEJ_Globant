package Entidad;

public class Vehiculo {

    private String marca;
    private String modelo;
    private String tipo; // automovil, motocicleta, bicicleta
    private int anno;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, String tipo, int anno) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.anno = anno;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

}

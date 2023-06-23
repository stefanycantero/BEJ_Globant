package Servicio;

import Entidad.Matematica;

public class MatematicaServicio {

    Matematica numeros = new Matematica();

    public Matematica crear() {
        numeros.setNumero1(Math.random());
        numeros.setNumero2(Math.random());

        return numeros;
    }

    public void mostrar() {
        System.out.println("N1: " + numeros.getNumero1());
        System.out.println("N2: " + numeros.getNumero2());
    }

    public double devolverMayor() {

        double mayor;

        if (numeros.getNumero1() > numeros.getNumero2()) {
            mayor = numeros.getNumero1();
        } else {
            mayor = numeros.getNumero2();
        }

        return mayor;
    }

    public double devolverMenor() {

        double menor;

        if (numeros.getNumero1() < numeros.getNumero2()) {
            menor = numeros.getNumero1();
        } else {
            menor = numeros.getNumero2();
        }

        return menor;
    }

    public double calcularPotencia(double a, double b) {
        double potencia;

        potencia = Math.pow(Math.round(a), Math.round(b));

        return potencia;
    }

    public double calcularRaiz(double a) {
        double raiz;

        double abs = Math.abs(a);
        raiz = Math.sqrt(abs);

        return raiz;
    }

}

package poo_practica;

import java.util.Scanner;

public class Circunferencia {

    private double radio;

    public Circunferencia() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el radio de la circunferencia:");
        this.radio = sc.nextDouble();
    }

    public double area() {
        return Math.PI * Math.pow(this.radio, 2);
    }

    public double perimetro() {
        return 2 * Math.PI * this.radio;
    }

    public static void main(String[] args) {
        Circunferencia c1 = new Circunferencia();

        c1.crearCircunferencia();
        System.out.println("El area es: " + c1.area());
        System.out.println("El perimetro es: " + c1.perimetro());
    }
}

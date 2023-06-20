package poo_practica;

import java.util.Scanner;

public class Rectangulo {

    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void crearRectangulo() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la base del rectangulo: ");
        this.base = sc.nextDouble();
        System.out.println("Ingrese la altura del rectangulo: ");
        this.altura = sc.nextDouble();
    }

    public double calcularSuperficie() {
        return this.base * this.altura;
    }

    public double calcularPerimetro() {
        return (this.base + this.altura) * 2;
    }

    public void dibujarRectangulo() {
        for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.base; j++) {
                System.out.print("*");
            }
        System.out.println();
        }
    }

    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo();

        r1.crearRectangulo();
        r1.calcularPerimetro();
        r1.calcularSuperficie();
        r1.dibujarRectangulo();
    }
}

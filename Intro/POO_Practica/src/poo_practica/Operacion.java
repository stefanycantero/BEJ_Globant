package poo_practica;

import java.util.Scanner;

public class Operacion {

    private int numero1;
    private int numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        this.numero1 = sc.nextInt();
        System.out.println("Ingrese un numero entero");
        this.numero2 = sc.nextInt();
    }

    public int sumar() {
        return this.numero1 + this.numero2;
    }

    public int restar() {
        return this.numero1 - this.numero2;
    }

    public int multiplicar() {
        if (this.numero1 == 0 || this.numero2 == 0) {
            System.out.println("ERROR: No se puede realizar una multiplicacion por cero");
            return 0;
        } else {
            return this.numero1 * this.numero2;
        }
    }

    public int dividir() {
        if (this.numero2 == 0) {
            System.out.println("ERROR: No se puede realizar una division por cero");
            return 0;
        } else {
            return this.numero1 / this.numero2;
        }
    }

    public static void main(String[] args) {
        Operacion op1 = new Operacion();

        op1.crearOperacion();

        System.out.println("La suma es: " + op1.sumar());
        System.out.println("La resta es: " + op1.restar());
        System.out.println("La multiplicacion es: " + op1.multiplicar());
        System.out.println("La division es: " + op1.dividir());
    }

}

package poo_practica;

import java.util.Date;
import java.util.Scanner;

public class Fechas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el año:");
        int anio = sc.nextInt();
        System.out.println("Ingrese el mes:");
        int mes = sc.nextInt();
        System.out.println("Ingrese el dia:");
        int dia = sc.nextInt();

        Date fecha = new Date(anio - 1900, mes - 1, dia);
        Date fechaActual = new Date();

        int diferencia = fechaActual.getYear() - fecha.getYear();
        System.out.println("La diferencia es: "+diferencia);
    }
}

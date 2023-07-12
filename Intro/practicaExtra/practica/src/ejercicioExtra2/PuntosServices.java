package ejercicioExtra2;

import java.util.Scanner;

public class PuntosServices {

    Scanner leer = new Scanner(System.in);

    public Puntos crearPuntos(){
        Puntos p1 = new Puntos();

        System.out.println("Ingrese las coordenas de ambos puntos");
        p1.setX1(leer.nextInt());
        p1.setY1(leer.nextInt());
        p1.setX2(leer.nextInt());
        p1.setY2(leer.nextInt());

       return p1;
    }

    public double calcularDistancia(Puntos punto){

        double total;

        total = Math.sqrt(Math.pow((punto.getX2()- punto.getX1()), 2) + Math.pow((punto.getY2()- punto.getY1()),2));



        return total;
    };

}

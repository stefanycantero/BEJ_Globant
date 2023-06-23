package Main;

import Servicio.MatematicaServicio;

public class Main {

    public static void main(String[] args) {
        MatematicaServicio n1 = new MatematicaServicio();
        
        n1.crear();
        n1.mostrar();
        System.out.println("El mayor es: "+n1.devolverMayor());
        
        System.out.println("La potencia es: "+n1.calcularPotencia(n1.devolverMayor(), n1.devolverMenor()));
        System.out.println("La raiz cuadrada del menor es: "+n1.calcularRaiz(n1.devolverMenor()));
    }
    
}

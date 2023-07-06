package Main;

import Servicio.ServicioCurso;

public class POO_Ej13 {

    public static void main(String[] args) {
        ServicioCurso c1 = new ServicioCurso();
        
        c1.crearCurso();
        System.out.println("Ganancia Semanal: "+c1.calcularGananciaSemanal());
    }
    
}

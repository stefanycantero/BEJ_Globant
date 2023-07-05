package Main;

import Servicio.ServicioPersona;

/**
 *
 * @author Stefany
 */
public class POO_Ej12 {

    public static void main(String[] args) {
        ServicioPersona p1 = new ServicioPersona();
        
        p1.crearPersona();
        p1.calcularEdad();
        System.out.println(p1.menorQue(18));
        p1.mostrarPersona();
    }
    
}

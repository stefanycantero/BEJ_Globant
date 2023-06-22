package Main;

import Servicio.VehiculoService;

public class VehiculoMain {

    public static void main(String[] args) {

        VehiculoService v1 = new VehiculoService();
        VehiculoService v2 = new VehiculoService();
        VehiculoService v3 = new VehiculoService();

        VehiculoService[] vehiculos = new VehiculoService[3];
        vehiculos[0] = v1;
        vehiculos[1] = v2;
        vehiculos[2] = v3;

        for (int i = 0; i < vehiculos.length; i++) {
            System.out.println("Informacion vehiculo #" + (i + 1));
            vehiculos[i].crear();
        }

        int recorrido_v1 = v1.moverse(300);
        int recorrido_v2 = v2.moverse(300);
        int recorrido_v3 = v3.moverse(300);

        int frenado_v1 = v1.frenar(recorrido_v1);
        int frenado_v2 = v2.frenar(recorrido_v2);
        int frenado_v3 = v3.frenar(recorrido_v3);

        int distancia_max = Math.max(Math.max(frenado_v1, frenado_v2), frenado_v3);

        if (distancia_max == frenado_v1) {
            System.out.println("El vehiculo que mas veces avanzo fue el 1 con una distancia de: " + distancia_max);
        } else if (distancia_max == frenado_v2) {
            System.out.println("El vehiculo que mas veces avanzo fue el 2 con una distancia de: " + distancia_max);
        } else if (distancia_max == frenado_v3) {
            System.out.println("El vehiculo que mas veces avanzo fue el 3 con una distancia de: " + distancia_max);
        } else {
            System.out.println("Todos los vehiculos recorrieron la misma distancia");
        }

    }

}

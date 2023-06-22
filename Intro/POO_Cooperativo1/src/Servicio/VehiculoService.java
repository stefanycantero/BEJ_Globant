package Servicio;

import Entidad.Vehiculo;
import java.util.Scanner;

public class VehiculoService {

    Scanner sc = new Scanner(System.in);

    Vehiculo vehiculo = new Vehiculo();

    public Vehiculo crear() {
        System.out.println("Ingrese la marca del vehiculo:");
        vehiculo.setMarca(sc.next());
        System.out.println("Ingrese el tipo del vehiculo:");
        vehiculo.setTipo(sc.next());
        System.out.println("Ingrese el modelo del vehiculo:");
        vehiculo.setModelo(sc.next());
        System.out.println("Ingrese el año del vehiculo:");
        vehiculo.setAnno(sc.nextInt());
        
        return vehiculo;
    }

    public int moverse(int tiempo) { // tiempo en segundos
        int recorrido;

        switch (vehiculo.getTipo()) {
            case "automovil":
                recorrido = 3 * tiempo;
                break;
            case "motocicleta":
                recorrido = 2 * tiempo;
                break;
            case "bicicleta":
                recorrido = tiempo;
                break;
            default:
                System.out.println("Tipo de vehículo no admitido.");
                return 0;
        }

        return recorrido;
    }

    public int frenar(int recorrido) {
        int posicion;

        switch (vehiculo.getTipo()) {
            case "automovil":
                posicion = 2 + recorrido;
                break;
            case "motocicleta":
                posicion = 2 + recorrido;
                break;
            case "bicicleta":
                posicion = recorrido;
                break;
            default:
                System.out.println("Tipo de vehículo no admitido.");
                return 0;
        }

        return posicion;
    }

}

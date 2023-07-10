package Servicio;

import Entidad.Movil;
import java.util.Scanner;

public class ServicioMovil {

    Scanner sc = new Scanner(System.in);

    public Movil cargarCelular() {
        
        System.out.println("Ingrese la marca del celular:");
        String marca = sc.nextLine();

        System.out.println("Ingrese el precio del celular:");
        double precio = sc.nextDouble();
        sc.nextLine(); // Consumir la nueva línea después de nextDouble()

        System.out.println("Ingrese el modelo del celular:");
        String modelo = sc.nextLine();

        System.out.println("Ingrese la memoria RAM del celular:");
        int memoriaRam = sc.nextInt();

        System.out.println("Ingrese el almacenamiento del celular:");
        int almacenamiento = sc.nextInt();
        sc.nextLine(); // Consumir la nueva línea después de nextInt()

        Movil celular = new Movil(marca, precio, modelo, memoriaRam, almacenamiento, ingresarCodigo());

        return celular;
    }

    public int[] ingresarCodigo() {
        int[] codigo = new int[7];
        
        System.out.println("Ingrese el codigo del celular:");
        String codigoStr = sc.nextLine();
        
        for (int i = 0; i < codigo.length; i++) {
            codigo[i] = Character.getNumericValue(codigoStr.charAt(i));
        }
        return codigo;
    }

}

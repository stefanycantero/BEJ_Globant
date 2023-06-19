package poo;

import Entidad.Persona;

public class POO {

    public static void main(String[] args) {

        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Salomon", "Colombiano");

        persona1.setNombre("Alison");
        persona1.setNacionalidad("Estadounidense");
        persona1.setId(1033);
        persona1.setEdad(32);

        persona2.setEdad(30);
        persona2.setId(1909);

    }

}

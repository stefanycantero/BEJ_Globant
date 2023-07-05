package Servicio;

import Entidad.Persona;
import java.text.ParseException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Stefany
 */
public class ServicioPersona {

    Persona persona = new Persona();

    Scanner sc = new Scanner(System.in);

    public Persona crearPersona() {

        System.out.println("Ingrese el nombre:");
        persona.setNombre(sc.nextLine());
        System.out.println("Ingrese la fecha de nacimiento en formato dd/mm/aaaa:");
        String nacimiento = sc.nextLine();

        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaNacimiento = null;
        try {
            fechaNacimiento = formatoFecha.parse(nacimiento);
        } catch (ParseException ex) {
            Logger.getLogger(ServicioPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        persona.setFechaNacimiento(fechaNacimiento);

        return persona;
    }

    public int calcularEdad() {
        Date fechaActual = new Date();
        int anioActual = fechaActual.getYear() + 1900;
        int anioNacimiento = persona.getFechaNacimiento().getYear() + 1900;
        int edadPersona = anioActual - anioNacimiento;
        return edadPersona;
    }


    public boolean menorQue(int edad) {
        int edadActual = calcularEdad();
        return edadActual < edad;
    }


    public void mostrarPersona() {
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + calcularEdad());
    }

}

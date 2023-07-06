package Servicio;

import Entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author Stefany
 */
public class ServicioCurso {

    Curso curso = new Curso();
    Scanner sc = new Scanner(System.in);

    public String[] cargarAlumnos() {
        String[] alumnos = new String[5];
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Ingrese el nombre del estudiante: ");
            alumnos[i] = sc.nextLine();
        }
        return alumnos;
    }

    public Curso crearCurso() {

        System.out.println("Ingrese el nombre del curso:");
        curso.setNombreCurso(sc.nextLine());
        
        System.out.println("Ingrese la cantidad de horas por dia:");
        curso.setCantidadHorasPorDia(sc.nextInt());
        
        System.out.println("Ingrese la cantidad de dias por semana:");
        curso.setCantidadDiasPorSemana(sc.nextInt());
        
        System.out.println("Ingrese el turno: M/T");
        curso.setTurno(sc.nextLine());
        
        System.out.println("Ingrese el precio por hora:");
        curso.setPrecioPorHora(sc.nextDouble());
        
        curso.setAlumnos(cargarAlumnos());

        return curso;
    }

    public double calcularGananciaSemanal() {

        double gananciaSemanal = curso.getCantidadHorasPorDia() * curso.getPrecioPorHora() * curso.getCantidadDiasPorSemana() * curso.getAlumnos().length;

        return gananciaSemanal;
    }
}

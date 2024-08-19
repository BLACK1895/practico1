/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnosapp;

import Servicios.ServicioAlumno;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class AlumnosApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioAlumno servicio = new ServicioAlumno();
        servicio.crearAlumnos();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del alumno para calcular su nota final: ");
        String nombreAlumno = scanner.nextLine();

        double notaFinal = servicio.notaFinal(nombreAlumno);
        if (notaFinal == -1) {
            System.out.println("El alumno no está en la lista.");
        } else {
            System.out.println("La nota final de " + nombreAlumno + " es: " + notaFinal);
        }
  }
}
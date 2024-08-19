/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class ServicioAlumno {
    private final List<Alumno> listaAlumnos;

    public ServicioAlumno() {
        listaAlumnos = new ArrayList<>();
    }

    public void crearAlumnos() {
        Scanner scanner = new Scanner(System.in);
        String respuesta = "s";

        while (respuesta.equals("s")) {
            System.out.print("Ingrese el nombre del alumno: ");
            String nombre = scanner.nextLine();

            List<Integer> notas = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                System.out.print("Ingrese la nota " + (i + 1) + ": ");
                int nota = scanner.nextInt();
                scanner.nextLine();
                notas.add(nota);
            }

            Alumno alumno = new Alumno(nombre, notas);
            listaAlumnos.add(alumno);

            System.out.print("¿Desea ingresar otro alumno? (s/n): ");
            respuesta = scanner.nextLine();
        }
    }

    public double notaFinal(String nombreAlumno) {
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getNombre().equals(nombreAlumno)) {
                List<Integer> notas = alumno.getNotas();
                double promedio = 0.0;

                for (int nota : notas) {
                    promedio += nota;
                }

                promedio /= notas.size();
                return promedio;
            }
        }

        return -1;
    }
}

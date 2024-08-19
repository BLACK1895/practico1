/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.List;

/**
 *
 * @author Miguel
 */
public class Alumno {
    private final String nombre;
    private final List<Integer> notas;
    
    public Alumno(String nombre, List<Integer> notas) {
        this.notas = notas;
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public List<Integer> getNotas(){
        return notas;
    }
}
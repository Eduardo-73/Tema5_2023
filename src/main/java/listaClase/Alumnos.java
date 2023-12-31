/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaClase;

import java.util.Random;

/**
 *
 * @author edu
 */
public class Alumnos {

    //Atributos
    final private int id;
    private String nombre;
    private String curso;
    private int asistencia;
    private static int contador = 0;

    // Constructor
    public Alumnos(String nombre, String curso) {
        this.id = contador++;
        this.nombre = nombre;
        this.curso = curso;
        this.asistencia = 0;
    }

    //Métodos
    public void incrementarAsistencia() {
        this.asistencia++;
    }

    // Get y Set
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(int asistencia) {
        this.asistencia = asistencia;
    }

    //ToString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("  id = ").append(id);
        sb.append(", nombre = ").append(nombre);
        sb.append(", curso = ").append(curso);
        sb.append(", asistencia = ").append(asistencia);
        sb.append("\n");
        return sb.toString();
    }

    // Hashcode y Equals
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumnos other = (Alumnos) obj;
        return this.id == other.id;
    }

}

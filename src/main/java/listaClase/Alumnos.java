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
    private String apellido1;
    private String apellido2;
    private String curso;
    private int asistencia;

    // Constructor
    public Alumnos(String nombre, String apellido1,
            String apellido2, String curso) {
        this.id = new Random().nextInt(1_111_111, 9_999_999);
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.curso = curso;
        this.asistencia = 0;
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

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
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
        sb.append("Alumnos{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellido1=").append(apellido1);
        sb.append(", apellido2=").append(apellido2);
        sb.append(", curso=").append(curso);
        sb.append(", asistencia=").append(asistencia);
        sb.append('}');
        return sb.toString();
    }

    // Hashcode y Equals
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.id;
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

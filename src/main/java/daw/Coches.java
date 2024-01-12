/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.Objects;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author edu
 */
public class Coches {

    public static Random rd = new Random();

    private String bastidor;
    private String matricula;
    private String modelo;
    private String fabricante;

    // Constructor
    public Coches(int matricula, String modelo, String fabricante) {
        this.bastidor = RandomStringUtils.randomAlphanumeric(17);
        this.matricula = "" + rd.nextInt(1_111, 9_999) + " "
                + (char) rd.nextInt(65, 91)
                + (char) rd.nextInt(65, 91)
                + (char) rd.nextInt(65, 91);
        this.modelo = modelo;
        this.fabricante = fabricante;
    }

    public Coches() {
    }

    public Coches(Coches c) {
        this.bastidor = c.bastidor;
        this.matricula = c.matricula;
        this.modelo = c.modelo;
        this.fabricante = c.fabricante;
    }

    // Get y Set
    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bastidor = ").append(bastidor);
        sb.append(", Matricula = ").append(matricula);
        sb.append(", Modelo = ").append(modelo);
        sb.append(", Fabricante = ").append(fabricante);
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.bastidor);
        hash = 29 * hash + Objects.hashCode(this.matricula);
        hash = 29 * hash + Objects.hashCode(this.modelo);
        hash = 29 * hash + Objects.hashCode(this.fabricante);
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
        final Coches other = (Coches) obj;
        if (this.matricula != other.matricula) {
            return false;
        }
        if (!Objects.equals(this.bastidor, other.bastidor)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        return Objects.equals(this.fabricante, other.fabricante);
    }

}

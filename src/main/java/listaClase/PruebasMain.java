/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaClase;

import java.util.ArrayList;

/**
 *
 * @author edu
 */
public class PruebasMain {

    public static void main(String[] args) {

        Alumnos a1 = new Alumnos("Eduardo", "Correa",
                "Aranda", "1ºDAW");
        Alumnos a2 = new Alumnos("Aiman", "Harrar",
                "Daoud", "1ºDAW");
        Alumnos a3 = new Alumnos("Tomás Ariel", "González",
                "Atienza", "1ºDAW");
        Alumnos a4 = new Alumnos("Victor", "Mena",
                "Flores", "1ºDAW");
        Alumnos a5 = new Alumnos("Antonio", "Ramírez",
                "Navas", "1ºDAW");

        ArrayList<Alumnos> alumnos = new ArrayList<>();

        alumnos.add(a1);
        alumnos.add(a2);
        alumnos.add(a3);
        alumnos.add(a4);
        alumnos.add(a5);

        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
        System.out.println(a3.hashCode());
        System.out.println(a4.hashCode());
        System.out.println(a5.hashCode());

        System.out.println(a1.equals(a5));
        System.out.println(a2.equals(a3));
        System.out.println(a3.equals(a1));

    }
}

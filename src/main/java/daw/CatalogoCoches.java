/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author edu
 */
public class CatalogoCoches {

    public static void main(String[] args) {

        Coches c1 = new Coches(0, "Cayenne", "Porsche");
        Coches c2 = new Coches(0, "Berlinetta", "Ferrari");
        Coches c3 = new Coches(0, "Urus", "Lamborghini");
        Coches c4 = new Coches(0, "a6 1500", "Masserati");

        ArrayList<Coches> listaCoches = new ArrayList<>();

        listaCoches.add(c1);
        listaCoches.add(c2);
        listaCoches.add(c3);
        listaCoches.add(c4);

        System.out.println(listaCoches);

        // Copiar uno de los coches 
        Coches c5 = new Coches(c3);
        // Y lo añado en la lista en la posición 2
        listaCoches.add(2, c5);

        System.out.println(listaCoches);

        System.out.println("---------Ordenar lista-----------");
        listaCoches.forEach(System.out::println);
        System.out.println("---------Ordenar lista Comparator-----------");
        Comparator<Coches> porBastidor = (b1, b2)
                -> b1.getBastidor().compareToIgnoreCase(b2.getBastidor());
        Collections.sort(listaCoches, porBastidor);
        listaCoches.forEach(System.out::println);
        System.out.println("---------Ordenar lista Collections-----------");
        Collections.sort(listaCoches, (m1, m2)
                -> m1.getModelo().compareToIgnoreCase(m2.getModelo()));
        listaCoches.forEach(System.out::println);
        System.out.println("---------Ordenar lista binarySearch-----------");
        Coches c6 = new Coches();
        c6.setModelo("Citroen");
        int posicion = Collections.binarySearch(listaCoches, c6,
                (f1, f2) -> f1.getModelo().compareToIgnoreCase(f2.getModelo()));
        System.out.println("C6 esta en la posición: " + posicion);
        
    }
}

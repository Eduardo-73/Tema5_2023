/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author edu
 */
public class EstructuraDatos {

    public static void main(String[] args) {

        // Lista tiene tamaño cero y no tiene elementos.
        ArrayList<Integer> lista = new ArrayList<>();
        // Tamaño
        System.out.println("Tamaño " + lista.size());
        // Mostrar con toString
        System.out.println(lista);
        // Añadir al final un elemento
        lista.add(12);
        lista.add(14);
        lista.add(16);
        lista.add(18);
        // Mostrar con toString
        System.out.println(lista);

        System.out.println("Elemento de la posición 2: " + lista.get(2));
        try {
            System.out.println("Elemento de la posición 10: " + lista.get(10));
        } catch (IndexOutOfBoundsException iobe) {
            System.out.println("Has superado el tamaño de la lista");
        }

        // Añade un elemento en una posición indicada 
        lista.add(2, 20);
        System.out.println(lista);
        //Cambia un elemento de la lista
        lista.set(3, 7);
        System.out.println(lista);

        if (lista.isEmpty()) {
            System.out.println("La lista está vacía ");
        } else {
            System.out.println("La lista tiene elementos ");
        }

        System.out.println("la lista contiene el elemento 18? "
                + lista.contains(18));
        System.out.println("Posición en la que esta el elemento 7 -> "
                + lista.indexOf(7));
        // Para borrar el numero 20 tengo que decirle que es un objeto
        // Si pongo remove(20) borra 20 posiciones
        // Borrado por objeto
        lista.remove(Integer.valueOf(20));
        System.out.println(lista);

        // Borrado por posición (int)
        lista.remove(0);
        System.out.println(lista);

        System.out.println("---------------");
        // Formas de recorer la lista
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i) + " ");
        }

        // Foreach
        for (Integer aux : lista) {
            System.out.print("\nNúmero " + aux);
        }
        System.out.println();
        // Recorido con un iterador
        Iterator<Integer> it = lista.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("-----------------");
        // Expresión lambda y api Stream
        lista.forEach(e -> System.out.println("El elemento es: " + e));
        // Hace lo mismo que la de arriba
        lista.forEach(System.out::println);
    }
}

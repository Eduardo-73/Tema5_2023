/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dados;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author edu
 */
public class LanzarDados {

    /*
    Clase LanzarDado, con un atributo lista de enteros.
    EL constructor de del objeto rellena una lista simulando 1000 lanzamientos del dado
    constructor parametrizado con el número de tiradas a generar
    toString que devuelva de cada elemento de la lista su posición y su valor
    método para saber el número de veces que ha salido una cara
    método para borrar todas las caras indicadas como parámetro
     */
    public static Random rd = new Random();
    private int numDado;
    private ArrayList<Integer> lista = new ArrayList<>();
    final int NUM_TIRADAS = 1000;

    // Constructores 
    public LanzarDados() {
        for (int i = 0; i < NUM_TIRADAS; i++) {
            lista.add(numDado = rd.nextInt(1, 6 + 1));
        }
    }

    public LanzarDados(int n) {
        for (int i = 0; i < n; i++) {
            lista.add(numDado = rd.nextInt(1, 6 + 1));
        }
    }

    // Métodos
    public int buscarTodasCaras(int num) {
        int contador = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == num) {
                contador++;
            }
        }
        return contador;
    }

    public void borrarLista(int num) {
        // No puedo recorrer listas 
        Iterator<Integer> it = lista.iterator();
        while (it.hasNext()) {
            if (it.next() == num) {
                it.remove();
            }
        }
    }

    // Get y Set
    public int getNumDado() {
        return numDado;
    }

    public void setNumDado(int numDado) {
        this.numDado = numDado;
    }

    public ArrayList<Integer> getValor() {
        return lista;
    }

    public void setValor(ArrayList<Integer> lista) {
        this.lista = lista;
    }

    //ToString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String texto = "";
        for (int i = 0; i < lista.size(); i++) {
            texto += "Posición Dado = " + (i + 1) + " Valor Numérico = "
                    + lista.get(i) + "\n";
        }
        sb.append(texto);
        return sb.toString();
    }

}

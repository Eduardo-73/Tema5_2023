/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Carta;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author eduar
 */
public class Baraja {

    // Atributos
    private ArrayList<Naipe> arrayNaipe;
    final int TAMANIO = 40;

    // Construcctor
    public Baraja() {
        arrayNaipe = new ArrayList<>();
        for (Palo palo : Palo.values()) {
            for (int i = 0; i < TAMANIO; i++) {
                Naipe nuevoNaipe = new Naipe(i + 1, palo);
                this.arrayNaipe.add(nuevoNaipe);
            }
        }
    }

    //Métodos
    public void barajar(int movimiento) {
        int numRd1, numRd2;
        // Creo un bucle con los movimientos  solicitados
        for (int i = 0; i < movimiento; i++) {
            // Creo dos randoms asignandole el tamanio del array
            numRd1 = new Random().nextInt(TAMANIO);
            numRd2 = new Random().nextInt(TAMANIO);
            // Por si se repiten
            do {
                numRd1 = new Random().nextInt(TAMANIO);
            } while (numRd1 == numRd2);
            // Lo muestro para saber cuales son los números
            System.out.println("Nº1 " + numRd1 + " Nº2 " + numRd2);
            // En un Naipe aux le meto la posicion del numRd1 del array de cartas que ya tenía
            Naipe aux = arrayNaipe.get(numRd1);
            // Ahora cambio la posicion de numRd1 a numRd2
            arrayNaipe.set(numRd1, arrayNaipe.get(numRd2));
            // Finalmente le paso a la posicion numRd2 el naipe aux que cree antes que se encontraba en la posición numRd1
            arrayNaipe.set(numRd2, aux);
        }

    }

    public ArrayList<Naipe> sacar(int numCartas) {
        ArrayList<Naipe> cartaSacar = new ArrayList<>();

        if (numCartas < 1 || numCartas > 40) {
            System.out.println("Número de cartas no válido");
            return cartaSacar;
        }

        Random rd = new Random();

        for (int i = 0; i < numCartas; i++) {
            int numRd = rd.nextInt(arrayNaipe.size());
            cartaSacar.add(arrayNaipe.remove(numRd));
        }

        return cartaSacar;
    }

// Getters y Setters
    public ArrayList<Naipe> getArrayNaipe() {
        return arrayNaipe;
    }

    // ToString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrayNaipe.size(); i++) {
            sb.append((i + 1) + "º Naipe de la baraja " + "= ").append(arrayNaipe.get(i) + "\n");
        }
        return sb.toString();
    }
}

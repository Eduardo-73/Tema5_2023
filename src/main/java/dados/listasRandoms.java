/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dados;

import java.util.ArrayList;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author eduar
 */
public class listasRandoms {

    /**
     * En un programa nuevo, crea dos listas de tamaño aleatorio de letras entre
     * la 'a' y la 'z'. Estas listas deben tener entre 10 y 20 elementos. Una
     * vez creadas las listas, imprime por pantalla sus elementos usando un
     * foreach. Crea una tercera lista con los elementos de la primera que no
     * están en la segunda. Imprime el resultado usando API Stream y lambdas.
     */
    public static void main(String[] args) {
        Random rd = new Random();
        String letrasAleatorias;
        ArrayList<String> lista1 = new ArrayList<>();
        ArrayList<String> lista2 = new ArrayList<>();
        int numRD = rd.nextInt(10, 20 + 1);
        for (int i = 0; i < numRD; i++) {
            lista1.add(letrasAleatorias
                    = RandomStringUtils.randomAlphabetic(1).toLowerCase());
            lista2.add(letrasAleatorias
                    = RandomStringUtils.randomAlphabetic(1).toLowerCase());
        }

        for (String mostrar : lista1) {
            System.out.print(mostrar + "");
        }
        System.out.println(" ");
        for (String mostrar : lista2) {
            System.out.print(mostrar + "");
        }

        ArrayList<String> lista3 = new ArrayList<>();
        String palabrasNoRepetidas;
        for (int i = 0; i < lista1.size(); i++) {
            boolean repetida = false;
            for (int j = 0; j < lista2.size(); j++) {
                if (lista1.get(i).equals(lista2.get(j))) {
                    repetida = true;
                    break;
                }
            }
            if (!repetida) {
                palabrasNoRepetidas = lista1.get(i);
                lista3.add(palabrasNoRepetidas);
            }
        }
        System.out.println(" ");
        lista3.forEach(System.out::print);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author eduar
 */
public class Ejer_1 {

    public static Random sc = new Random();

    public static void main(String[] args) {
        char[][] matriz = matrizChar(5);
        System.out.println("");
        System.out.println(buscarPosicion(matriz, '+'));
    }

    private static char[][] matrizChar(int num) {
        char[] elementosAleatorios = {'a', 'Y', '+', '$', '€', 'M',
            '·', 'L', 'º', 'J', '*'};
        int aleatorio;
        char elementos;
        char[][] matrizChar = new char[num][num];
        for (int i = 0; i < matrizChar.length; i++) {
            for (int j = 0; j < matrizChar[i].length; j++) {
                aleatorio = sc.nextInt(elementosAleatorios.length);
                elementos = elementosAleatorios[aleatorio];
                matrizChar[i][j] = elementos;
            }
        }

        for (int i = 0; i < matrizChar.length; i++) {
            System.out.println();
            for (int j = 0; j < matrizChar[i].length; j++) {
                System.out.print(matrizChar[i][j]);
            }
        }
        return matrizChar;
    }

    private static ArrayList<Celda> buscarPosicion(char[][] matrix, char elemento) {
        ArrayList<Celda> listaCelda = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (elemento == matrix[i][j]) {
                    listaCelda.add(new Celda(i, j));
                }
            }
        }
        return listaCelda;
    }
}

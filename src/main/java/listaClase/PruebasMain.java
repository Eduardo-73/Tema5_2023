/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaClase;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author edu
 */
public class PruebasMain {

    public static void main(String[] args) {

        String menu = """
                      ************************************
                      1.- Mostrar Alumnos.
                      2.- Elegir Alumnos, Manual.
                      3.- Elegir Alumnos, Aleatoriamente.
                      4.- Salir.
                      ************************************
                      """;
        int opcionMenu = 0;
        ArrayList<Alumnos> listaAlumnos = MetodosDeClase.meterAlumnos();
        do {
            do {
                try {
                    opcionMenu = Integer.parseInt(JOptionPane.showInputDialog(
                            menu));
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null,
                            "Debes de introducir una de las opciones"
                            + " prueba con (1, 2, 3, 4)");
                }
            } while (opcionMenu < 1 || opcionMenu > 4);
            switch (opcionMenu) {
                case 1 -> {
                    MetodosDeClase.mostrarAlumnos(listaAlumnos);
                }
                case 2 -> {
                    JOptionPane.showMessageDialog(null,
                            MetodosDeClase.sacarAlumnoManual(listaAlumnos));
                }
                case 3 -> {
                    JOptionPane.showMessageDialog(null,
                            MetodosDeClase.sacarAlumnoAleatorio(listaAlumnos));
                }
            }
        } while (opcionMenu != 4);
    }
}

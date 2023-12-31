/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaClase;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author eduar
 */
public class MetodosDeClase {

    public static Random rd = new Random();

    public static ArrayList<Alumnos> meterAlumnos() {

        Alumnos a1 = new Alumnos("José Antonio Acebedo Aragón", "1ºDAW");
        Alumnos a2 = new Alumnos("Khaoula Acemi", "1ºDAW");
        Alumnos a3 = new Alumnos("Rocío Alcalá Aranda", "1ºDAW");
        Alumnos a4 = new Alumnos("Clara Isabel Álvarez Aragón", "1ºDAW");
        Alumnos a5 = new Alumnos("Nuria Del Río Olmedo", "1ºDAW");
        Alumnos a6 = new Alumnos("Rafael Díaz Delgado", "1ºDAW");
        Alumnos a7 = new Alumnos("Victoria Fernández González", "1ºDAW");
        Alumnos a8 = new Alumnos("Tomás Ariel González Atienza", "1ºDAW");
        Alumnos a9 = new Alumnos("Aiman Harrar Daoud", "1ºDAW");
        Alumnos a10 = new Alumnos("Alejandro Luque Maillo", "1ºDAW");
        Alumnos a11 = new Alumnos("Eduardo Correa Aranda", "1ºDAW");
        Alumnos a12 = new Alumnos("Víctor Mena Flores", "1ºDAW");
        Alumnos a13 = new Alumnos("Francisco Pablo Millán Ortiz", "1ºDAW");
        Alumnos a14 = new Alumnos("Laura Constanza Molina", "1ºDAW");
        Alumnos a15 = new Alumnos("Óscar Morales Vallejo", "1ºDAW");
        Alumnos a16 = new Alumnos("Pablo Navarro García", "1ºDAW");
        Alumnos a17 = new Alumnos("Samuel Navarro García", "1ºDAW");
        Alumnos a18 = new Alumnos("Daniel José Navarro Moyano", "1ºDAW");
        Alumnos a19 = new Alumnos("Daniel Navas Borjas", "1ºDAW");
        Alumnos a20 = new Alumnos("Sebastián Oquendo García", "1ºDAW");
        Alumnos a21 = new Alumnos("Noelia Pérez González", "1ºDAW");
        Alumnos a22 = new Alumnos("Khalid Rachafi el Hausi", "1ºDAW");
        Alumnos a23 = new Alumnos("Antonio Ramírez Navas", "1ºDAW");
        Alumnos a24 = new Alumnos("Adam Christopher Ridings", "1ºDAW");
        Alumnos a25 = new Alumnos("Jesús Romo Miranda", "1ºDAW");
        Alumnos a26 = new Alumnos("Ismael Shehata Pérez", "1ºDAW");
        Alumnos a27 = new Alumnos("Yumara Vallejo Vallejo", "1ºDAW");
        Alumnos a28 = new Alumnos("Adrián Viana García", "1ºDAW");
        Alumnos a29 = new Alumnos("Miguel Ángel Victoria Martín", "1ºDAW");
        Alumnos a30 = new Alumnos("Guillermo Virués de Segovia Córcoles", "1ºDAW");
        ArrayList<Alumnos> alumnos = new ArrayList<>();
        alumnos.add(a1);
        alumnos.add(a2);
        alumnos.add(a3);
        alumnos.add(a4);
        alumnos.add(a5);
        alumnos.add(a6);
        alumnos.add(a7);
        alumnos.add(a8);
        alumnos.add(a9);
        alumnos.add(a10);
        alumnos.add(a11);
        alumnos.add(a12);
        alumnos.add(a13);
        alumnos.add(a14);
        alumnos.add(a15);
        alumnos.add(a16);
        alumnos.add(a17);
        alumnos.add(a18);
        alumnos.add(a19);
        alumnos.add(a20);
        alumnos.add(a21);
        alumnos.add(a22);
        alumnos.add(a23);
        alumnos.add(a24);
        alumnos.add(a25);
        alumnos.add(a26);
        alumnos.add(a27);
        alumnos.add(a28);
        alumnos.add(a29);
        alumnos.add(a30);
        return alumnos;
    }

    public static String sacarAlumnoManual(ArrayList<Alumnos> lista) {
        int selecAlumno = 0;
        boolean repetir;
        do {
            try {
                selecAlumno = Integer.parseInt(JOptionPane.showInputDialog(
                        "Selecciona un alumno de clase por su id. (El id lo puedes "
                        + "obtener mostrando la lista de alumnos. )"));
                repetir = (selecAlumno <= 0 || selecAlumno >= 30);
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null,
                        "Debes de elegir un número del 0 al 30. ");
                repetir = true;
            }
        } while (repetir);
        Alumnos alumSeleccionado = lista.get(selecAlumno);
        if (alumSeleccionado.getAsistencia() != 1) {
            alumSeleccionado.incrementarAsistencia();
            return alumSeleccionado.getNombre();
        }
        return "Este alumno ya tiene una asistencia. ";
    }

    public static String sacarAlumnoAleatorio(ArrayList<Alumnos> lista) {
        if (lista.isEmpty()) {
            System.out.println("La lista de alumnos está vacía.");
            return " ";
        }
        int numRd = rd.nextInt(lista.size());
        Alumnos alumSeleccionado = lista.get(numRd);
        if (alumSeleccionado.getAsistencia() != 1) {
            alumSeleccionado.incrementarAsistencia();
            return alumSeleccionado.getNombre();
        }
        return "Este alumno ya tiene una asistencia. ";
    }

    public static void mostrarAlumnos(ArrayList<Alumnos> lista) {
        String texto = "";
        for (int i = 0; i < lista.size(); i++) {
            texto += lista.get(i);
        }
        JOptionPane.showMessageDialog(null, texto);
    }
}

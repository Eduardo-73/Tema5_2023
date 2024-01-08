/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dados;

/**
 *
 * @author edu
 */
public class MainDado {

    public static void main(String[] args) {

//        LanzarDados ld1 = new LanzarDados();
//        System.out.println(ld1);
//        System.out.println("------------");
        LanzarDados ld2 = new LanzarDados(10);
        System.out.println(ld2);
        System.out.println("------------");
        System.out.println(ld2.buscarTodasCaras(3));
        System.out.println("------------");
        ld2.borrarLista(3);
        System.out.println(ld2);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temario;

/**
 *
 * @author edu
 */
public class MainCliente {

    public static void main(String[] args) {

        Cliente c1 = new Cliente("Pepe", 30, "Estepona",
                "pepe@pepe.com");
        Cliente c2 = new Cliente("Pepe", 30, "Estepona",
                "a@pepe.com");
        Cliente c3 = new Cliente("Pepe", 30, "Estepona",
                "pepe@pepe.com");
        // c1== c2 No puedo hacer eso. Porque estoy comparando direcciones de memoria

        System.out.println("c1 == c2? " + c1.equals(c2));
        System.out.println("c2 == c3? " + c2.equals(c3));
        System.out.println("c1 == c3? " + c1.equals(c3));
        System.out.println("c1 == null? " + c1.equals(null));
        System.out.println("c1 == null? " + c1.equals(c1));

        Cliente c4 = c1;
        System.out.println("HashCode c1 " + c1.hashCode());
        System.out.println("HashCode c2 " + c2.hashCode());
        System.out.println("HashCode c3 " + c3.hashCode());
        System.out.println("HashCode c4 " + c4.hashCode());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Herencia;

/**
 *
 * @author dam1
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InstrumentoPercusion il = new InstrumentoPercusion("Triangulo", 0);
        Tambor t1 = new Tambor("Tambor1", 3, "cuero");

        System.out.println(il.toString());
        System.out.println(t1.toString());
    }

}

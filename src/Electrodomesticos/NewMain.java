/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Electrodomesticos;

/**
 *
 * @author dam1
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Electrodomestico E[] = new Electrodomestico[4];
        E[0] = new Electrodomestico(200, "verde", 'C', 100);
        System.out.println("--------------------");
        E[1] = new Television(100, "rojo", 'B', 80, 54, true);
        System.out.println("--------------------");
        E[2] = new Electrodomestico(50, "Chima", 'A', 30);
        System.out.println("--------------------");
        E[3] = new Lavadora(250, "gris", 'K', 60, 35);
        System.out.println("--------------------");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("INICIO FOR");
        System.out.println("--------------------");
        for (int i = 0; i < E.length; i++) {
            System.out.println("Precio original " + E[i].getPrecio());
            System.out.println("");
            System.out.println("");
            System.out.println("--------");
        }

        for (int i = 0; i < E.length; i++) {
            if (!(E[i] instanceof Lavadora) && !(E[i] instanceof Television)) {
                E[i].m1();
            }
            //if (!(E[i] instanceof Lavadora || E[i] instanceof Television) ) {
            //    E[i].m1();
            //}
            if (E[i] instanceof Lavadora) {
                Lavadora lvAux = (Lavadora) E[i];
                lvAux.m2();
            }
            if (E[i] instanceof Television) {
                Television tvAux = (Television) E[i];
                tvAux.m3();
            }
//            if (E[i].getClass() == Lavadora.class) {
//                Lavadora lvAux = (Lavadora) E[i];
//            }
//            if (E[i].getClass() == Television.class) {
//                Television tvAux = (Television) E[i];
//                tvAux.m3();
//            }
        }
    }

}

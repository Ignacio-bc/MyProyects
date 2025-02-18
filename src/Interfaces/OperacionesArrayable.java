/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author dam1
 */
public interface OperacionesArrayable {

    public default void m1() {//Hereda como metodo publico de un padre
        System.out.println("Hola");
    }

    public static void imprArray(OperacionesArrayable entrada[]) {
        for (int i = 0; i < entrada.length; i++) {
            if (entrada[i] != null) {
                System.out.println(entrada[i].myToString());
            } else {
                System.out.println("NULL");
            }
        }
    }

    public abstract String myToString();

    public static OperacionesArrayable[] ordenar(OperacionesArrayable[] entrada) {
        try {
            //Metodo de Ordenacion de Burbuja
            OperacionesArrayable copia[] = copiarArray(entrada);

            int vueltas = 0;
            boolean cambio = false;

            while (cambio == false) {
                cambio = true;
                for (int i = 0; i < copia.length - 1 - vueltas; i++) {
                    if (copia[i].myCompareTo(copia[i + 1]) < 0) { //De mayor a menor
                        OperacionesArrayable aux = copia[i].myClone();
                        copia[i] = copia[i + 1].myClone();
                        copia[i + 1] = aux;
                        cambio = false;
                    }
                }
                vueltas++;
            }
            return copia;
        } catch (MyException ex) {
            ex.printStackTrace();
            return entrada;
            //Devolvemos el original
        }
    }

    public abstract int myCompareTo(OperacionesArrayable entrada)throws MyException;

    public static OperacionesArrayable[] copiarArray(OperacionesArrayable[] entrada) {
        OperacionesArrayable copia[] = new OperacionesArrayable[entrada.length];

        for (int i = 0; i < entrada.length; i++) {
            if (entrada[i] != null) {
                copia[i] = entrada[i].myClone();
            }
        }

        return copia;
    }

    public abstract OperacionesArrayable myClone();
}

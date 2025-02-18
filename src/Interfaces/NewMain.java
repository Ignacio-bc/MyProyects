/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Interfaces;

/**
 *
 * @author dam1
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Persona arr [] = {new Persona ("Marta", 25, (float) 165.34), new 

        //OperacionesArrayable.imprArray(arr1);
        //OperacionesArrayable aux [] = OperacionesArrayable.copiarArray(arr1);
        //Perssona arr2 [] = new Persona [arr1.length];
        Persona arr1[] = {new Persona("Marta", 18, (float) 165.34), new Persona("Raul", 18, (float) 185.19), new Persona("Ivan", 33, 174)};

//     OperacionesArrayable.imprArray(arr1);
//       System.out.println("=======================");
//        OperacionesArrayable.imprArray(OperacionesArrayable.ordenar(arr1));
        OperacionesArrayable arr[] = new OperacionesArrayable[4];
        arr[3] = arr1[0];
        arr[2] = arr1[1];
        arr[1] = new N(66);
        arr[0] = new N(88);
        OperacionesArrayable.imprArray(arr);
        System.out.println("=======================");
        OperacionesArrayable.imprArray(OperacionesArrayable.ordenar(arr));
    }
}

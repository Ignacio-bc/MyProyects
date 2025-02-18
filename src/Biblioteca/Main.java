/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Biblioteca;

import java.util.Scanner;

/**
 *
 * @author ignac
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Persona P1 = new Persona();
 //       Persona P2 = new Persona();
//        Persona P3 = new Persona("12345", "Jorge", "Pinzon", 10,"colombia");
//        System.out.println(P3.toString());
//        System.out.println("--");
//        System.out.println(P2.toString());
//        System.out.println("xxxx");
//        P1.equals(P3);
//        P1.equals(P2);
//        System.out.println("----");
//        Libro L1 = new Libro();
//        Libro L2 = new Libro();
//        System.out.println("xxxx");
//        Libro L3 = new Libro(10001,"Travesuras de Jorge",P1,100);
//        Libro L4 = new Libro(10001,"Travesuras de Jorge",P1,100);
//        System.out.println("Prueba 1");
//        L1.equals(L2);
//        System.out.println("Prueba 2");
//        L1.equals(L3);
//        System.out.println("Prueba 3");
//        L3.equals(L4);
//        System.out.println("----");
//       Biblioteca B1 = new Biblioteca();1
//       B1.prueba();
//        System.out.println("------");
//        

Libro a= Libro.crearLibroTeclado();

        System.out.println(a.toString());



        int opcion;
Scanner sc = new Scanner(System.in);
Biblioteca biblioteca = new Biblioteca();
Libro libro;// Preguntar a ivan
long isbn; //Porq?
do{
System.out.println("1. Insertar un libro");
System.out.println("2. Eliminar un libro");
System.out.println("3. Buscar un libro");
System.out.println("4. Mostrar todos los libros");
System.out.println("0. Salir de la aplicación");
System.out.print("Elige opción: ");
opcion = sc.nextInt();
sc.nextLine(); //limpiamos el buffer
switch(opcion){
case 1:
// *crear un libro introduciendo toda su información POR TECLADO, es decir, isbn, titulo,
    //dni, nombre, apellidos, edad, nacionalidad y número de páginas
   
//* Insertar los datos anteriormente tecleados en el libro de modo que habrá que decir SI EL LIBRO SE HA INSERTADO CORRECTAMENTE o no en cuyo caso lo normal es que este la biblioteca LLENA y no se haya podido meter mas libros.
break;
case 2:
//* Dado un ISBN (que Habra que leer por teclado), eliminar dicho libro de la biblioteca. Puede suceder de que ese libro no esté con lo cual habría que decir que dicho libro NO SE PUEDE BORRAR PORQUE NO ESTA EN LA BIBLIOTECA., System.out.println("Dame el isbn");
break;
case 3:
//* Dado un ISBN (que habrá que leer por teclado), buscar dicho libro de la biblioteca. Puede suceder de que ese libro no esté con lo cual habría que decir que dicho libro NO ESTA EN LA BIBLIOTECA.
break;
case 4:
//* Mostrar todos los libros de la biblioteca
break;
case 0:
System.out.println("Gracias por usar mi biblioteca");
break;
default:
System.out.println("Opción incorrecta");
}
}while(opcion != 0);
    }
    
}

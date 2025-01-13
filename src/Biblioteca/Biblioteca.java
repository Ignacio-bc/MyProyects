/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;

import java.util.Scanner;

/**
 *
 * @author ignac
 */
public class Biblioteca {

    //Un atributo privado N que nos índique el número total de libros (poner por ejemplo 10).
    private int N=10;
//Un atributo libro de tipo Libro (que debe ser un array para guardar los 10 libros)
    public Libro[] libros = new Libro[N];
//Un atributo privado numLibros para guardar el número de libros.
    private int numLibros;
    

    public Biblioteca() {
//* Este método obligatoriamente debe ir generando todos los libros guardándolos en el array.
//Dicho de otro modo, debemos de tener guardada la información de los libros en un array de 10 elementos.
        for (int i = 0; i < libros.length; i++) {
            Libro e = new Libro();
            libros[i] = e;
        }
    }

    public Biblioteca(Libro[] libros, int cont) {
       // Scanner sc = new Scanner(System.in);
//* Dado un libro de tipo Libro [] introducir los libros y un número de libros que viene dado por el parámetro CONT.
    
    }

    public Libro[] getLibros() {
    return this.libros;
    }

    public void setLibros(Libro[] libros) {
    this.libros = libros;
    }

    public int getCont() {
    //* RETORNA EL NUMERO DE LIBROS;
    }

    public void setCont(int cont) {
//* Introduce el número de libros que viene dado por el parámetro CONT
    }

    public static int getN() {
//* RETORNAR EL número N que libros que tenemos (en este caso 10);
    }

    public boolean equals(Biblioteca biblioteca) {
//* Devuelve TRUE si los libros de la biblioteca no son los mismos y FALSE en caso contrario. Tener en cuenta que tenemos GUARDADO LOS LIBROS en un array de libros.
    }

    public String toString() {
//* Devuelve un STRING donde se va guardando todos los mensajes que tiene cada posición del array libros.
        ST = ST + LIBROS[I].toString()
        siendo ST una variable de tipo String
    }

    public boolean buscar(long isbn) {
        /*Devuelve true si el libro está en la biblioteca
Devuelve false si el libro no está en la biblioteca. Tener en cuenta los libros están en un array */
    }

    private int buscarPos(long isbn) {
//* Dado un ISBN de un libro, devuelve la posición donde está dentro del array y si no está devuelve un -1.
    }

    public boolean insertar(Libro libro) {
        /*Si tengo espacio en la biblioteca y no hay otro libro
con ese mismo código isbn SE INSERTA el libro que viene dado por el parámetro libro. Se aconseja usar el método anterior BUSCARPOS */
    }

    public boolean eliminar(long isbn) {
        /*Si existe un libro con ese isbn en la biblioteca lo borro
en caso contrario no hago nada. Se aconseja usar el método BUSCARPOS*/
    }
    
    public void prueba(){
        for (int i = 0; i < libros.length; i++) {
            System.out.println(libros[i]);
        }
    }
}

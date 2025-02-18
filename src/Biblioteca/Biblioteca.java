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

    private int N = 10;
    public Libro[] libros = new Libro[N];

    //Constructores:
    public Biblioteca() {
//* Este método obligatoriamente debe ir generando todos los libros guardándolos en el array.
        for (int i = 0; i < libros.length; i++) {
            Libro e = new Libro();
            libros[i] = e;
        }
    }

    public Biblioteca(Libro[] libros) {
        this.libros = libros;
    }

    public Libro[] getLibros() {
        return this.libros;
    }

    public void setLibros(Libro[] libros) {
        this.libros = libros;
    }
    
    public boolean equals(Biblioteca biblioteca) {
//* Devuelve TRUE si los libros de la biblioteca no son los mismos y FALSE en caso contrario. Tener en cuenta que tenemos GUARDADO LOS LIBROS en un array de libros.
        for (int i = 0; i < this.libros.length; i++) {
            if (!(this.libros[i].equals(biblioteca.libros[i]))) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
//* Devuelve un STRING donde se va guardando todos los mensajes que tiene cada posición del array libros.
//        ST = ST + LIBROS[I].toString()
//        siendo ST una variable de tipo String 
        String a = "";
        a = a + "TAMAÑO DE LA BIBLIOTECA" + N + " LIBROS:\n+"
                + "";
        for (int i = 0; i < this.libros.length; i++) {
            a = a + this.libros[i].toString() + "\n+";

        }
        return a;
    }

    public boolean buscar(long isbn) {
        /*Devuelve true si el libro está en la biblioteca
Devuelve false si el libro no está en la biblioteca. Tener en cuenta los libros están en un array */
        for (int i = 0; i < this.libros.length; i++) {
            if (isbn == this.libros[i].getIsbn()) {
                return true;
            }
        }
        return false;
    }

    private int buscarPos(long isbn) {
//* Dado un ISBN de un libro, devuelve la posición donde está dentro del array y si no está devuelve un -1.
        int n = -1;
        for (int i = 0; i < this.libros.length; i++) {
            if (isbn == this.libros[i].getIsbn()) {
                n = i;
                return n;
            }
        }
        return n;

    }

    public boolean insertar(Libro libro) {
        /*Si tengo espacio en la biblioteca y no hay otro libro
con ese mismo código isbn SE INSERTA el libro que viene dado por el parámetro libro. Se aconseja usar el método anterior BUSCARPOS */
        if (!(buscar(libro.getIsbn())));
        {
            for (int i = 0; i < this.libros.length; i++) {
                if (null == this.libros[i]) {
                    this.libros[i] = libro;
                    return true;
                }
            }
        }
        return false;

    }

    public boolean eliminar(long isbn) {
        /*Si existe un libro con ese isbn en la biblioteca lo borro
en caso contrario no hago nada. Se aconseja usar el método BUSCARPOS*/
        int a = this.buscarPos(isbn);
        if (a >= 0) {//PREGUNTAR A IVAN
            this.libros[a] = null;
            System.out.println("Se elimino");
            return true;
        }

        System.out.println("No se elimino");
        return false;
    }
}

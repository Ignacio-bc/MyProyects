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
public class Libro {

    private long isbn;
    private String titulo;
    private Persona autor;
    private int paginas;

    public Libro() {
        this.isbn = 1;
        this.titulo = "No tiene";
        this.autor = new Persona();
        this.paginas = -1;
    }

    public Libro(long isbn, String titulo, Persona autor, int paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public static Libro crearLibroTeclado() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el ISBN (numero)");
        long isbn = sc.nextLong();
        sc.nextLine();
        System.out.println("Introduce el titulo");
        String titulo = sc.nextLine();
        System.out.println("Introduce el autor");
        Persona autor = Persona.crearPersonaTeclado();
        System.out.println("Introduce el numero de paginas");
        int paginas = sc.nextInt();
        return new Libro(isbn, titulo, autor, paginas);
    }//PEDIR STRINGS Y CASTEARLOS
    
    

    public long getIsbn() {
        return this.isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Persona getAutor() {
        return this.autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return this.paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public boolean equals(Libro l) {

        if (l == null) {
            return false;
        }

        if (this == l) {
            return true;
        }

        if (this.getAutor() != l.getAutor() || this.getIsbn() != l.getIsbn() || this.getTitulo() != l.getTitulo() || this.getPaginas() != l.getPaginas()) {
            return false;
        }
        return true;

    }

    public String toString() {
        String sol = "";
        sol = sol + "ISBN " + this.isbn + " TITULO " + this.titulo + " AUTOR " + this.autor + "Numero de Paginas " + this.paginas;
        return sol;
    }

}

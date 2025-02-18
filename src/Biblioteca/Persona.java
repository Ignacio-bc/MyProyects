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
public class Persona {

    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    private String nacionalidad;

    public Persona() {
        this.dni = "A000000";
        this.nombre = "Desconocido";
        this.apellidos = "N/A";
        this.edad = -1;
        this.nacionalidad = "nose";
    }

    public Persona(String dni, String nombre, String apellidos, int edad, String nacionalidad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    public Persona(boolean b) {
//* Introducir los datos de la persona (dni, nombre, apellidos, edad y nacionalidad)
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el dni");
        this.dni = sc.nextLine();
        System.out.println("Introduce el nombre");
        this.nombre = sc.nextLine();
        System.out.println("Introduce Los Apellidos");
        this.apellidos = sc.nextLine();
        System.out.println("Introduce la edad");
        this.edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce la Nacionalidad");
        this.nacionalidad = sc.nextLine();
    }

    public static Persona crearPersonaTeclado() {
        //* Introducir los datos de la persona (dni, nombre, apellidos, edad y nacionalidad)
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el dni");
        String dni = sc.nextLine();
        System.out.println("Introduce el nombre");
        String nombre = sc.nextLine();
        System.out.println("Introduce Los Apellidos");
        String apellidos = sc.nextLine();
        System.out.println("Introduce la edad");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce la Nacionalidad");
        String nacionalidad = sc.nextLine();

        return new Persona(dni, nombre, apellidos, edad, nacionalidad);
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return this.nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public boolean equals(Persona p) {

        if (p == null) {
            return false;
        }

        if (this == p) {
            return true;
        }

        if (this.getDni() != p.getDni() || this.getNombre() != p.getNombre() || this.getApellidos() != p.getApellidos() || this.getEdad() != p.getEdad() || this.getNacionalidad() != p.getNacionalidad()) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        //* Devuelve un STRING con un mensaje de la forma (por ejemplo):
        String sol = "";
        sol = "DNI " + this.dni + " NOMBRE " + this.nombre + " APELLIDOS " + this.apellidos + " EDAD " + this.edad + " NACIONALIDAD " + this.nacionalidad;
        return sol;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

import java.util.Scanner;

/**
 *
 * @author ignac
 */
public class Persona {

    //Atributos
    private String nombre;
    private String DNI;
    private Cuenta[] cuentas = new Cuenta[3];

    public Persona() {
        this.nombre = "no lo conozco";
        this.DNI = "no se";
    }

    public Persona(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public Cuenta[] getCuentas() {//Adicion mia
        return cuentas;
    }

    public void listarCuentas() { //Corregido
        //int cont = 1;
        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i] != null) {
                System.out.println((i + 1) + ". " + cuentas[i].getN_cuenta());
                //cont++;
            } else {
                System.out.println((i + 1) + ". Espacio Vacio");
            }
        }
    }

    public Cuenta seleccionarCuenta() { //Comprobar
        //VA AL MAIN
//        boolean flag = false;
//        for (int i = 0; i < cuentas.length; i++) {
//            if (cuentas[i] != null) {
//                flag = true;
//            }
//        }
//        if (!flag) {
//            System.out.println("No hay cuentas para seleccionar, cree una cuenta");
//        } else {
//        }
        Scanner sc = new Scanner(System.in);
        this.listarCuentas();
        System.out.println("Seleccione la cuenta deseada:");
        //Hacer control de entradas.
        int a = sc.nextInt();
        sc.nextLine();
        return cuentas[a - 1];

    }

    public void asignarCuenta(Cuenta c) { //Bien
        boolean flag = false;
        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i] == null) {
                System.out.println("Hay espacio!");
                cuentas[i] = c;
                System.out.println("Se ha asignado corectamente");
                flag = true;
                break;
            }
        }
        if (flag == false) {
            System.out.println("No hay espacio para agregar una cuenta");
        }
    }

    public void quitarCuenta(Cuenta c) {//bien  
        boolean flag = false;
        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i].equals(c)) {
                System.out.println("Se ha borrado la cuenta" + c.toString());
                cuentas[i] = null;
                flag = true;
                break;
            }
        }
        if (flag == false) {
            System.out.println("NO se pudo borrar la cuenta ingresada");
        }
    }

    @Override
    public boolean equals(Object obj) {//Nuevo
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        final Persona P = (Persona) obj;

        if (!this.DNI.equals(P.DNI)) {
            return false;
        }

//        if (this.saldo !=C.saldo){
//            return false;
//        }
        return true;
    }

    @Override
    public String toString() {//Bien
        String sol = "Titular de la cuenta: " + this.nombre + "\n DNI: " + DNI + ", cuentas: " + "\n";

        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i] != null) {
                sol = sol + (i + 1) + ". " + cuentas[i].toString() + "\n";
            } else {
                System.out.println((i + 1) + ". " + "Espacio Vacio" + "\n");
            }
        }

        return sol;
    }

}

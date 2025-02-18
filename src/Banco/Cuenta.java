/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author ignac
 */
public class Cuenta {

    //Atributos 
    private int saldo;
    private Persona titular;
    private int n_cuenta;
    private static int contador = 100;

    public Cuenta() {
        this.saldo = -1;
        this.titular = new Persona();
        this.n_cuenta = -100;
    }

    public Cuenta(int saldo, Persona titular) {
        this.saldo = saldo;
        this.titular = titular;
        this.n_cuenta = contador;
        contador++;
    }

    public int getSaldo() {
        return saldo;
    }

    public int getN_cuenta() {
        return n_cuenta;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }
    

    //Metodos
    @Override
    public boolean equals(Object obj) {//Bien
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        final Cuenta C = (Cuenta) obj;

        if (this.n_cuenta != C.n_cuenta) {
            return false;
        }

//        if (this.saldo !=C.saldo){
//            return false;
//        }
        return true;
    }

    public void ingresarSaldo(int ingreso) {//Bien?
        this.saldo = this.saldo + ingreso;
        System.out.println("Nuevo saldo: " + this.saldo);
    }

    public void retirarDinero(int retiro) {//Bien
        if (this.saldo < retiro) {
            System.out.println("Saldo insuficiente");
            // return;
        } else {
            this.saldo = this.saldo - retiro;
            System.out.println("Dinero Retirado:" + retiro + "\n" + "total restante en la cuenta: " + this.saldo);
        }
    }

    public void verSaldo() {//bien
        System.out.println("Saldo disponible:" + this.saldo);
    }

    @Override
    public String toString() { //corregido 
        return "Numero de cuenta: " + this.n_cuenta + ", Saldo en Cuenta: " + this.saldo + ", Titular Cuenta:" + this.titular.getNombre();

    }
}

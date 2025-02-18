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
public class Banco {

    private String nombre;
    private Persona[] clientes = new Persona[2];

    public Banco(String nombre, Persona a, Persona b) {
        this.nombre = nombre;
        this.clientes[0] = a;
        this.clientes[1] = b;
    }

    public Banco() {
        this.nombre = "El banco";
        Persona a = new Persona("Jose", "209");
        this.clientes[0] = a;
        Persona b = new Persona("Martin", "132");
        this.clientes[1] = b;
    }

    public Cuenta crearCuenta(Persona p) {//bien?
        System.out.println("Para crear la Cuenta");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el Saldo inicial:");
        int saldo = sc.nextInt();
        sc.nextLine();
        // System.out.println("Seleccione el titular de la cuenta");
        Persona cliente = p;
        //Preguntar a Ivan como me deshago del seleccionar cliente linea 96.
        return new Cuenta(saldo, cliente);
    }

//    public Persona crearCliente() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingrese el nombre del cliente:");
//        String nombre = sc.nextLine();
//        System.out.println("Ingrese el DNI del cliente");
//        String DNI = sc.nextLine();
//        return new Persona(nombre, DNI);
//    }
    public void cambioTitular() {//automatizado, comprobar errores
        System.out.println("Seleccione la cuenta del cliente que quiere cambiar la cuenta");
        boolean flag = false;
        Persona a = this.SeleccionarCliente();
        Cuenta aux = a.seleccionarCuenta();

        System.out.println("Elige el nuevo titular");
        Persona b = this.SeleccionarCliente();
        for (int i = 0; i < b.getCuentas().length; i++) {
            if (b.getCuentas()[i] == null) {
                flag = true;
                break;
            }
        }
        if (flag) {
            b.asignarCuenta(aux);

            for (int i = 0; i < b.getCuentas().length; i++) {
                if (b.getCuentas()[i].equals(aux)) {
                    aux.setTitular(b);
                    break;
                }
            }
            b.listarCuentas();
            a.quitarCuenta(aux);
            System.out.println("Se ha cambiado el titular correctamente");
        } else {
            System.out.println("La persona " + b.getNombre() + " No tiene espacio para otra cuenta, no se ha podido relaizar el cambio de titular");
        }
//        if (a.equals(clientes[0])) {
//            flag = true;
//        } else {
//            flag = false;
//        }
//        if (flag) {
//            clientes[1].asignarCuenta(aux);
//            clientes[1].listarCuentas();
//        } else {
//            clientes[0].asignarCuenta(aux);
//            clientes[0].listarCuentas();
//        }

    }

    public void transferencia(Persona cliente) {// bien? registrar transferencias
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecciona el cliente que desea enviar el dinero");
        Cuenta envia = cliente.seleccionarCuenta();
        System.out.println("Selecciona el cliente de destino");
        Persona cliente2 = this.SeleccionarCliente();
        System.out.println("Selecciona la cuenta de destino");
        Cuenta recibe = cliente2.seleccionarCuenta();
        System.out.println("Selecciona el importe a enviar");
        int dinero = sc.nextInt();
        sc.nextLine();
        if (envia.getSaldo() >= dinero) {
            envia.retirarDinero(dinero);
            recibe.ingresarSaldo(dinero);
            System.out.println("Operacion con exito");
        } else {
            System.out.println("Operacion fallida, saldo insuficiente");
        }
    }

    public void altaCliente() {//bien????
        System.out.println("Seleccionar cliente que dara de alta en el banco");
        Persona pAux = this.SeleccionarCliente();
        Cuenta cAux = crearCuenta(pAux);
        pAux.asignarCuenta(cAux);
        //Preguntar a Ivan como me deshago de un selecliente. 
    }

    public void bajaCliente() {//automatizado, mejorar
        int auxC = -1;
        int auxP = -1;
        System.out.println("Selecciona el cliente y cuya cuenta dara de baja");
        Cuenta a = this.SeleccionarCliente().seleccionarCuenta();

        for (int i = 0; i < clientes.length; i++) {
            for (int j = 0; j < clientes[i].getCuentas().length; j++) {
                if (clientes[i].getCuentas() != null) {
                    if (clientes[i].getCuentas()[j].equals(a)) {
                        clientes[i].quitarCuenta(a);
                        System.out.println("Cuenta Borrada");
                        return;
                    }
                }
            }
        }

//        System.out.println("Vuelve a seleccionar el mismo cliente");
//        this.SeleccionarCliente().quitarCuenta(a);
//        System.out.println("Se ha quitado la cuenta correctamente");
    }

    public Persona SeleccionarCliente() { //Se deberia hacaer con Private
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < this.clientes.length; i++) {
            System.out.println((i + 1) + ". " + clientes[i].getNombre());
        }
        System.out.println("selecciona el cliente para asignarle la cuenta: ");
        int a = sc.nextInt();
        sc.nextLine();
//        System.out.println("Cliente seleccionado:" + clientes[a - 1].toString());
        return clientes[a - 1];
    }

    //Metodo para testing
    public void verBanco() {
        for (int i = 0; i < clientes.length; i++) {
            System.out.println(clientes[i].toString());
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Banco;

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
        // TODO code application logic here
        Persona P1 = new Persona();
        Persona P2 = new Persona();
        Cuenta C1 = new Cuenta(100,P1 );
        Cuenta C2 = new Cuenta(200,P2 );
        System.out.println(C1.getN_cuenta());
        System.out.println(C2.getN_cuenta());

        Banco Banco = new Banco();
        Scanner sc = new Scanner(System.in);
        menuPrincipal(Banco);

    }

    public static void menuPrincipal(Banco Banco) {
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("1. Menu banco");
            System.out.println("2. Menu Cliente");
            System.out.println("3. Salir");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Menu Banco");
                    menuBanco(Banco);
                    break;
                case 2:
                    System.out.println("Menu Cliente");
                    menuCliente(Banco.SeleccionarCliente());
                    break;
                case 3:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (option != 3);
    }

    public static void menuCliente(Persona Cliente) {
        Scanner sc = new Scanner(System.in);
        int option;

        do {
            System.out.println("1. Sacar dinero");
            System.out.println("2. Meter dinero");
            System.out.println("3. Listar info del cliente");
            System.out.println("4. Realizar Transferencia");
            System.out.println("5. Registar Movimiento");
            System.out.println("6. Volver al Menu");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Sacar dinero:");
                    System.out.println("Cuanto dinero deseas retirar?");
                    int retirar = sc.nextInt();
                    sc.nextLine();
                    Cliente.seleccionarCuenta().retirarDinero(retirar);
                    break;
                case 2:
                    System.out.println("Meter dinero");
                    System.out.println("Cuantro desea ingresar?");
                    int ingreso = sc.nextInt();
                    Cliente.seleccionarCuenta().ingresarSaldo(ingreso);
                    break;
                case 3:
                    System.out.println("Listar info del cliente");
                    break;
                case 4:
                    System.out.println("Realizar transferencia");
                    break;
                case 5:
                    System.out.println("Registrar movimientos");
                    break;
                case 6:
                    System.out.println("Volviendo al menu");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (option != 6);
    }

    public static void menuBanco(Banco Banco) {
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("1. Dar de alta cliente");
            System.out.println("2. Dar de baja cliente");
            System.out.println("3. Listar Cliente");
            System.out.println("4. Cambio de titular");
            System.out.println("5. Abrir una cuenta nueva");
            System.out.println("6. Volver al menu Principal ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Dar de alta cliente:");

                    break;
                case 2:
                    System.out.println("Dar de baja cliente:");
                    break;
                case 3:
                    System.out.println("Listar cliente:");
                    break;
                case 4:
                    System.out.println("Cambio de titular:");
                    break;
                case 5:
                    System.out.println("Abrir una cuenta nueva:");
                    //Cuenta a = Banco.crearCuenta();
                    // System.out.println("Seleccionar El mismo cliente para confirmar");
                    Banco.altaCliente();
                    System.out.println("----");
                    System.out.println("El estado del banco es:");
                    Banco.verBanco();
                    break;
                case 6:
                    System.out.println("Volviendo al menu principal");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (option != 6);
    }
}

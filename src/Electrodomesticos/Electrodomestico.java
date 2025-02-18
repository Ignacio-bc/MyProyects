/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Electrodomesticos;

/**
 *
 * @author dam1
 */
public class Electrodomestico {

    private double precio;
    private String color;
    private char consumo_energetico;
    private double peso;
    private final String COLOR_BASE = "Blanco";
    private final char CONSUMO_BASE = 'F';
    private final int PRECIO_BASE = 100;
    private final double PESO_BASE = 5;
    private char[] consumos = {'A', 'B', 'C', 'D', 'E', 'F'};
    private String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};
    private int[] precios = {100, 80, 60, 50, 30, 10};

    public Electrodomestico() {
        this.precio = PRECIO_BASE;
        this.color = COLOR_BASE;
        this.consumo_energetico = CONSUMO_BASE;
        this.peso = PESO_BASE;
    }

    public Electrodomestico(int precio, double peso) {
        this.precio = precio;
        this.color = COLOR_BASE;
        this.consumo_energetico = CONSUMO_BASE;
        this.peso = peso;
    }

    public Electrodomestico(int precio, String color, char consumo_energetico, double peso) {
        this.precio = precio;
        this.color = comprobarColor(color);
        this.consumo_energetico = comprobarConsumoEnergetico(consumo_energetico);
        this.peso = peso;

        if (!(this instanceof Lavadora) && !(this instanceof Television)) {
            this.precioFinal();
        }
    }

    public double getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public char getConsumo_energetico() {
        return consumo_energetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    private char comprobarConsumoEnergetico(char letra) {
        //  char[] validos = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (int i = 0; i < consumos.length; i++) {
            if (letra == consumos[i]) {
                return letra;
            }
        }
        return CONSUMO_BASE;
    }

    private String comprobarColor(String color) {
        //  String[] validos = {"blanco", "negro", "rojo", "azul", "gris"};
        String color1 = color.toLowerCase();
        for (int i = 0; i < colores.length; i++) {
            if (color1.equals(colores[i])) {
                return colores[i];
            }
        }
        return COLOR_BASE;
    }

    public void precioFinal() {
        double adicional = 0;
        System.out.println("Por consumo eneregitco se agrega:");
        switch (this.consumo_energetico) {
            case 'A':
                adicional = 100;
                System.out.println("A = 100");
                break;

            case 'B':
                adicional = 80;
                System.out.println("B = 80");
                break;

            case 'C':
                adicional = 60;
                System.out.println("C = 60");
                break;

            case 'D':
                adicional = 50;
                System.out.println("D = 50");
                break;

            case 'E':
                adicional = 30;
                System.out.println("E = 30");
                break;

            case 'F':
                adicional = 10;
                System.out.println("F = 10");
                break;
        }
        System.out.println("-Fin de Energia-");
        System.out.println("Por Peso se agrega:");
        if (this.peso > 0 && this.peso < 20) {
            System.out.println("De 0 a 19 = 10");
            adicional = adicional + 10;
        }
        if (this.peso >= 20 && this.peso <= 49) {
            System.out.println("De 20 a 49 = 50");
            adicional = adicional + 50;
        }
        if (this.peso >= 50 && this.peso <= 79) {
            adicional = adicional + 80;
            System.out.println("De 50 a 79 = 80");
        }
        if (this.peso >= 80) {
            adicional = adicional + 100;
            System.out.println("Mas de 80 = 100");
        }
        System.out.println("-Fin de Peso-");

        this.precio = this.precio + adicional;

    }

    public void m1() {
        System.out.println("Soy un Electrodomestico");

    }

}

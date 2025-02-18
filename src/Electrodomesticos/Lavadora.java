/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Electrodomesticos;

/**
 *
 * @author dam1
 */
public class Lavadora extends Electrodomestico {

    private int carga;
    private int CARGA_BASE = 5;

    Lavadora() {
        super();
        carga = CARGA_BASE;
    }

    Lavadora(int precio, int peso) {
        super(precio, peso);
        carga = CARGA_BASE;
    }

    Lavadora(int precio, String color, char consumo_energetico, double peso, int carga) {
        super(precio, color, consumo_energetico, peso);
        this.carga = carga;
        precioFinal();
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public void precioFinal() {
        System.out.println("Lavadora:");
        super.precioFinal();
        
        double adicional = 0;
        System.out.println("Tiene carga mayor a 30?");
        if (carga > 30) {
            adicional = 50;
            System.out.println("Carga mayor a 30 = $50");
            //this.setPrecio(this.getPrecio() + 50);
        }
        this.setPrecio(this.getPrecio() + adicional);
    }

    public void m2() {
        System.out.println("Soy una Lavadora");
    }

}

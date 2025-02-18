/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Electrodomesticos;

/**
 *
 * @author dam1
 */
public class Television extends Electrodomestico {

    int resolucion;
    boolean sintonizarTDT;
    final int BASE_RESOLUCION = 20;
    final boolean BASE_SINTONIZAR = false;

    public Television() {
        super();
        this.resolucion = BASE_RESOLUCION;
        this.sintonizarTDT = BASE_SINTONIZAR;

    }

    public Television(int precio, double peso) {
        super(precio, peso);
        this.resolucion = BASE_RESOLUCION;
        this.sintonizarTDT = BASE_SINTONIZAR;
    }

    public Television(int precio, String color, char consumo_energetico, double peso, int resolucion, boolean sintonizador) {
        super(precio, color, consumo_energetico, peso);
        this.resolucion = resolucion;
        this.sintonizarTDT = sintonizador;
        this.precioFinal();
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizarTDT() {
        return sintonizarTDT;
    }

    @Override
    public void precioFinal() {
        System.out.println("Television:");
        super.precioFinal();

        double plus = 0;
        double treinta = 0.70;
        if (this.resolucion > 40) {
            plus = this.getPrecio() * treinta;
            System.out.println("Su resolucion es mayor a 40 = " + plus);
        }
        if (this.sintonizarTDT = true) {
            System.out.println("Tiene TDT= 50");
            plus = plus + 50;
        }
        this.setPrecio(this.getPrecio() + plus);
    }

    public void m3() {
        System.out.println("Soy un Televisor");
    }

}

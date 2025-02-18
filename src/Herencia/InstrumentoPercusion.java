/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author dam1
 */
public class InstrumentoPercusion {

    private String familia;
    private String nombre;
    private int anios;

    public InstrumentoPercusion(String nombre, int anios) {
        this.familia = "Percusion";
        this.nombre = nombre;
        this.anios = anios;
    }
    
    public void m1(){
        System.out.println(this.nombre);
    }

    public void tocar() {

    }

    @Override
    public String toString() {
        return "InstrumentoPercusion{" + "familia=" + familia + ", nombre=" + nombre + ", anios=" + anios + '}';
    }

}

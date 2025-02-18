/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author dam1
 */
public class Tambor extends InstrumentoPercusion {

    private String tipo_membrana;

    public Tambor(String nombre, int anios, String tipo_membrana) {
        super(nombre, anios);
        this.tipo_membrana = tipo_membrana;
    }


    
    public String getTipo_membrana() {
        return tipo_membrana;
    }

    public void setTipo_membrana(String tipo_membrana) {
        this.tipo_membrana = tipo_membrana;
    }

    @Override
    public String toString() {
        String aux = super.toString();
        return "Tambor{" + "tipo_membrana=" + tipo_membrana + '}';
    }

}

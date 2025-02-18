/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Serie;

/**
 *
 * @author dam1
 */
public class Videojuego implements Entregable {

    private String titulo;
    private int horas_estimadas;
    private boolean entregado;
    private String genero;
    private String compania;
    private final int HORAS_ESTIMADAS_DEF = 10;
    private final boolean ENTREGADO_DEF = false;

    public Videojuego() {
    }

    public Videojuego(String titulo, int horas_estimadas, boolean entregado, String genero, String compania) {
        this.titulo = titulo;
        this.horas_estimadas = horas_estimadas;
        this.entregado = entregado;
        this.genero = genero;
        this.compania = compania;
    }

    public Videojuego(String titulo, int horas_estimadas) {
        this.titulo = titulo;
        this.horas_estimadas = horas_estimadas;
    }

    public Videojuego(String titulo, int horas_estimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horas_estimadas = horas_estimadas;
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHoras_estimadas() {
        return horas_estimadas;
    }

    public void setHoras_estimadas(int horas_estimadas) {
        this.horas_estimadas = horas_estimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return entregado;
    }

    @Override
    public int compareTo(Object a){
        if (null == a) {
            throw new NullPointerException("La entrada es nula, no se puede comprar");
        }
        if (this == a) {
            return 0;
        }
        if (!(a instanceof Videojuego)) {
            throw new ClassCastException("La entrada no es un videojuego");
        
        }
        return 0;
    }

}

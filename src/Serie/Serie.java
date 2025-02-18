  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Serie;

/**
 *
 * @author dam1
 */
public class Serie implements Entregable {

    private String titulo;
    private int n_temporadas;
    private boolean entregado;
    private String genero;
    private String creador;
    private final int N_TEMPORADAS_DEF = 3;
    private final boolean ENTREGADO_DEF = false;

    public Serie() {
    }

    public Serie(String titulo, int n_temporadas, boolean entregado, String genero, String creador) {
        this.titulo = titulo;
        this.n_temporadas = n_temporadas;
        this.entregado = entregado;
        this.genero = genero;
        this.creador = creador;
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.entregado = ENTREGADO_DEF;
        this.n_temporadas = N_TEMPORADAS_DEF;
    }

    public Serie(String titulo, int n_temporadas, String genero, String creador) {
        this.titulo = titulo;
        this.n_temporadas = n_temporadas;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getN_temporadas() {
        return n_temporadas;
    }

    public void setN_temporadas(int n_temporadas) {
        this.n_temporadas = n_temporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void entregar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void devolver() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isEntregado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int compareTo(Object a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

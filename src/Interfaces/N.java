/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author dam1
 */
public class N implements OperacionesArrayable {

    int n;

    public N(int n) {
        this.n = n;
    }

    @Override
    public String myToString() {
        return "N{" + "n=" + n + '}';
    }

    @Override
    public String toString() {
        return "N{" + "n=" + n + '}';
    }

    @Override
    public int myCompareTo(OperacionesArrayable entrada)throws MyException {
        if (entrada == null) {
            throw new NullPointerException("Error al comparar N: La entrada es Nula");
        }

        if (!(entrada instanceof N)) {
            throw new MyException("Error al comprar N: La entrada no es una N.");
        }

        N aux = (N) entrada;

        if (this == entrada) {
            return 0;
        }

        if (this.n < aux.n) {
            return -1;
        }

        if (this.n > aux.n) {
            return 1;
        }

        return 0;
    }

    @Override
    public OperacionesArrayable myClone() {
        return new N(this);
    }

    public N(N e) {
        this.n = e.n;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author dam1
 */
public class Persona implements OperacionesArrayable {

    private String nombre;
    private int edad;
    private float altura;

    public Persona(String nombre, int edad, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public Persona(Persona p) {
        this.nombre = p.nombre;
        this.edad = p.edad;
        this.altura = p.altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + '}';
    }

    @Override
    public String myToString() {
        m1();
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + '}';
    }

    @Override
    public OperacionesArrayable myClone() {
        Persona clon = new Persona(this);
        return clon;
    }

    @Override
    public int myCompareTo(OperacionesArrayable entrada) throws MyException {
        if (entrada == null) {
            throw new NullPointerException("Error al comparar Personas: La entrada es nula.");
        }
        if (this == entrada) {
            return 0;
        }

        if (!(entrada instanceof Persona)) {
            throw new MyException("Error al comprar Persona: La entrada no es una Persona.");
        }

        Persona aux = (Persona) entrada;

        if (this.edad < aux.edad) {
            return -1;
        }
        if (this.edad > aux.edad) {
            return 1;
        }
        if (this.edad == aux.edad) {
            if (this.altura < aux.altura) {
                return -1;
            }
            if (this.altura > aux.altura) {
                return 1;
            }
        }
        return 0;
    }
}

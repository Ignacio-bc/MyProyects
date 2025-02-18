/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Excepciones;

/**
 *
 * @author dam1
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = null;
        System.out.println(myLength(s));
    }
    public static int myLength(String s){
        int cont = 0;
        try{
            while(1==1){
                s.charAt(cont);
                cont++;
            }
        }
        catch(IndexOutOfBoundsException ex){
            return cont;
        }
        catch(NullPointerException ex){
            return -1;
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_miguelangelflores;

/**
 *
 * @author Miguel Flores
 */
public class Hamadriades extends Hadas {

    private double arbol;

    public Hamadriades(double arbol, String nombre, int altura, int edad, double salud, double poder) {
        super(nombre, altura, edad, salud, poder);
        this.arbol = arbol;
    }

    public Hamadriades() {
    }

    public double getArbol() {
        return arbol;
    }

    public void setArbol(double arbol) {
        this.arbol = arbol;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}

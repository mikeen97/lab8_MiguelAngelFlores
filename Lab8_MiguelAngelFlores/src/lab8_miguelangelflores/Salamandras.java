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
public class Salamandras extends Hadas {

    private int alas;

    public Salamandras() {
    }

    public Salamandras(int alas, String nombre, int altura, int edad, double salud, double poder) {
        super(nombre, altura, edad, salud, poder);
        this.alas = alas;
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}

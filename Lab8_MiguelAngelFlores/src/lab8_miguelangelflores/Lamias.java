/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_miguelangelflores;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel Flores
 */
public class Lamias extends Hadas {

    private int aletas;
    private int branquias;

    public Lamias() {
    }

    public Lamias(int aletas, int branquias, String nombre, int altura, int edad, double salud, double poder) {
        super(nombre, altura, edad, salud, poder);
        this.aletas = aletas;
        this.branquias = branquias;
    }

    public double getAletas() {
        return aletas;
    }

    public void setAletas(int aletas) {
        if (aletas <= 5) {
            this.aletas = aletas;
        } else {
            JOptionPane.showMessageDialog(null, "Aletas tienen que ser menor que 5");
        }

    }

    public double getBranquias() {
        return branquias;
    }

    public void setBranquias(int branquias) {
        if (branquias <= 8) {
            this.branquias = branquias;
        } else {
            JOptionPane.showMessageDialog(null, "Branquias tienen que ser menor que 8");
        }

    }

    @Override
    public String toString() {
        return super.toString();
    }

}

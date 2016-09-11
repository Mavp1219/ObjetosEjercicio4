/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Password {

    private int longitud;
    private String contraseña;

    public Password(int longitud, String contraseña) {
        this.contraseña = contraseña;
        this.longitud = longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getLongitud() {
        return longitud;
    }

    public String getContraseña() {
        return contraseña;
    }

    public boolean EsFuerte() {
        boolean acces = true;
        if (this.longitud < 6) {
            acces = false;
        }
        return acces;
    }

}

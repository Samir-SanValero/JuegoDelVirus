/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import interfaces.Actions;

/**
 *
 * @author A7-PC00
 */
public class Jugador implements Actions{
    String nombre;
    static int contJugadores;

    public String getNombre() {
        return nombre;
    }

    public static int getContJugadores() {
        return contJugadores;
    }

    @Override
    public void Jugar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

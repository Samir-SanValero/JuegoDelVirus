/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author A7-PC00
 */
public class Partida {
    String nombre;
    ArrayList<Jugador> jugadores = new ArrayList<Jugador>();

    public Partida(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }
    
    public void addJugador(Jugador jugador) {
        this.jugadores.add(jugador);
    }
    
    public void reparto(int organo1, int organo2, int virus1, int virus2) {
        // Arraylist que servira para verificar que a un jugador ya se le repartio algun virus/organo
        ArrayList<Integer> jugadoresYaAgg = new ArrayList<Integer>();
        
        // Agregamos a una lista los virus/organos para luego elegir uno al azar
        List virusOrganos = Arrays.asList(organo1, organo2, virus1, virus2);
        
        // Otro ArrayList para controlar que virus ya han sido agregados
        ArrayList<Integer> virusOrganosYaAgg = new ArrayList<Integer>();
        
        for (int i = 0; i < jugadores.size(); i++) {
            
            int jugadorAleatorio = (int)Math.random() * jugadores.size(); // Obteniendo jugador al azar
            jugadoresYaAgg.add(jugadorAleatorio);
            
            int virusOrganoAleatorio = (int) Math.random() * virusOrganos.size(); // Obteniendo organo/virus al azar
            virusOrganosYaAgg.add(virusOrganoAleatorio);
            
            
            
            for (Integer jdrs : jugadoresYaAgg ) {
                
                for (Integer vos : virusOrganosYaAgg) {
                    
                    if (jdrs != jugadorAleatorio && vos != virusOrganoAleatorio) {
                        jugadores.get(jugadorAleatorio).addOrgano(virusOrganoAleatorio);
                    }
                }
                
            }
            
        }
    }

    
}

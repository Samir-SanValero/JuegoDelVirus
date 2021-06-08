/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author A7-PC00
 */
public class Cuerpo{
    HashMap<String, Integer> misOrganos = new HashMap<String, Integer>();
    HashMap<String, Integer> misVirus = new HashMap<String, Integer>();
    String nombre;
    int contJugador = 0;
    static int cont = 0;

    public Cuerpo(String nombre) {
        this.nombre = nombre;
        cont++;
        this.contJugador = cont;
    }
    
    public Cuerpo() {  }

    public String getNombre() {
        return nombre;
    }
    
    public int getContJugador() {
        return contJugador;
    }
    
    public void addOrgano(int value) {
        misOrganos.put(verificarOrgano(value), value);
    }
    
    public void addVirus(int value) {
        misVirus.put(verificarVirus(value), value);
    }
    
    public ArrayList<String> imprimirOrganos() {
        ArrayList<String> Organos = new ArrayList<String>();
        
        for (String name: misOrganos.keySet()) {
            String nameOrgano = name.toString();
            Organos.add(nameOrgano);
        };
        
        return Organos;
    }
    
    public ArrayList<String> imprimirVirus() {
        ArrayList<String> Virus = new ArrayList<String>();
        
        for (String name: misVirus.keySet()) {
            String nameOrgano = name.toString();
            Virus.add(nameOrgano);
        };
        
        return Virus;
    }

    public HashMap<String, Integer> getMisOrganos() {
        return misOrganos;
    }

    public HashMap<String, Integer> getMisVirus() {
        return misVirus;
    }

    public void setMisOrganos(HashMap<String, Integer> misOrganos) {
        this.misOrganos = misOrganos;
    }

    public void setMisVirus(HashMap<String, Integer> misVirus) {
        this.misVirus = misVirus;
    }
    
    private String verificarOrgano(int value) {
        String organo = null;
        
        if (value == 10) {
            organo = "Corazon";
            return organo;
        }
        
        if (value == 15) {
            organo = "Hueso";
            return organo;
        }
        
        if (value == 20) {
            organo = "Estomago";
            return organo;
        }
        
        if (value == 25) {
            organo = "Cerebro";
            return organo;
        }
        
        return organo;
    }
    
    private String verificarVirus(int value) {
        String virus = null;
        
        if (value == 10) {
            virus = "MIOCARDITIS";
            return virus;
        }
        
        if (value == 15) {
            virus = "ARTITRIS";
            return virus;
        }
        
        if (value == 20) {
            virus = "GASTRAOENTIRITIS";
            return virus;
        }
        
        if (value == 25) {
            virus = "ENCAFALITIS";
            return virus;
        }
        
        return virus;
    }
    
    
}

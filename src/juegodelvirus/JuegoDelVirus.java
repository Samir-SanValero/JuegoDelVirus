
package juegodelvirus;

import entities.Cuerpo;
import entities.Jugador;
import entities.Partida;
import static interfaces.Organos.CORAZON;
import static interfaces.Organos.CEREBRO;
import static interfaces.Organos.ESTOMAGO;
import static interfaces.Organos.HUESO;
import static interfaces.Virus.MIOCARDITIS;
import static interfaces.Virus.ARTITRIS;
import static interfaces.Virus.GASTRAOENTIRITIS;
import static interfaces.Virus.ENCAFALITIS;
import java.util.ArrayList;


public class JuegoDelVirus {

    
    public static void main(String[] args) {
        // Creando jugadores
        Jugador juan = new Jugador("Juan");
        Jugador pepe = new Jugador("Pepe");
        
        // Creando un array de cuerpos
        ArrayList<Cuerpo> cuerpo = new ArrayList<Cuerpo>();
        
        // Añadiendo jugadores al array de cuerpos
        cuerpo.add(juan);
        cuerpo.add(pepe);
        
        // Añadiendo Organos a jugador "Juan"
        juan.addOrgano(CORAZON);
        juan.addOrgano(CEREBRO);
        juan.addOrgano(ESTOMAGO);
        
        // Añadiendo Organos a jugador "Pepe"
        pepe.addOrgano(HUESO);
        pepe.addOrgano(CEREBRO);
        pepe.addOrgano(ESTOMAGO);
        
        // Añadiendo Virus a jugador "Juan"
        juan.addVirus(ENCAFALITIS);
        juan.addVirus(GASTRAOENTIRITIS);
        juan.addVirus(ARTITRIS);
        
        // Añadiendo Virus a jugador "Pepe"
        pepe.addVirus(MIOCARDITIS);
        pepe.addVirus(GASTRAOENTIRITIS);
        pepe.addVirus(ENCAFALITIS);
        
        //Imprimiendo jugadores
        int numJugadores = 0;
        for (Cuerpo crp : cuerpo) {
            System.out.println( 
                "El jugador con nombre: " + crp.getNombre() +
                ", sus organos son: " + crp.imprimirOrganos() + 
                " y sus virus son: " +crp.imprimirVirus()
            );
            
            numJugadores = crp.getContJugador();
            
        }
        
        System.out.println("El numero de jugadores es de: " + numJugadores);
        
        // Creando una partida
        Partida partida = new Partida("Primera partida");
        partida.addJugador(juan);
        partida.addJugador(pepe);
        partida.addJugador(juan);
        partida.addJugador(pepe);
        
        partida.reparto(CORAZON, CEREBRO, GASTRAOENTIRITIS, ARTITRIS);
        
        for (Jugador jdr : partida.getJugadores()) {
            System.out.println("Organos: " + jdr.imprimirOrganos() + " Virus: " + jdr.imprimirVirus());
        }
        
    }
    
}

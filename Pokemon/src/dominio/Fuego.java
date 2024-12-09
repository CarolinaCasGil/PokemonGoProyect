/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;

/**
 *
 * @author Alumno Mañana
 */
public class Fuego extends Pokemon {
    private int ptsataquefuego;
    
    //Constructor

    public Fuego() {
    }

    public Fuego(int ptsataquefuego) {
        this.ptsataquefuego = 35;
    }

    public Fuego(int ptsataquefuego, int idPokemon) {
        super(idPokemon);
        this.ptsataquefuego = 35;
    }

    public Fuego(int ptsataquefuego, String nombre, int puntosAtaque, int puntosDefensa, int nivel) {
        super(nombre, puntosAtaque, puntosDefensa, nivel);
        this.ptsataquefuego = 35;
    }

    

    public Fuego(int idPokemon,int ptsataquefuego,String nombre, int vida, int puntosAtaque, int puntosDefensa, int nivel) {
        super(idPokemon, nombre, vida, puntosAtaque, puntosDefensa, nivel);
        this.ptsataquefuego = 35;;
    }
    
    
    
    //Guetter Setter

    public int getPtsataquefuego() {
        return ptsataquefuego;
    }

    public void setPtsataquefuego(int ptsataquefuego) {
        this.ptsataquefuego = ptsataquefuego;
    }
    
    
    //To String

    @Override
    public String toString() {
        return "Fuego{" + "idPokemon=" + idPokemon + ", nombre=" + nombre + ", vida=" + vida + ", puntosAtaque=" + puntosAtaque + ", puntosDefensa=" + puntosDefensa + ", nivel=" + nivel + ", ptsataquefuego=" + ptsataquefuego + "}\n";
    }
    
    


    
}

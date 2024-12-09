/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author Alumno Mañana
 */
public class Planta extends Pokemon {
    private int ptsataqueplanta;
    
    //Contructores

    public Planta() {
    }

    public Planta(int ptsataqueplanta) {
        this.ptsataqueplanta = 22;
    }

    public Planta(int ptsataqueplanta, int idPokemon) {
        super(idPokemon);
        this.ptsataqueplanta = 22;
    }

    public Planta(int ptsataqueplanta, String nombre, int puntosAtaque, int puntosDefensa, int nivel) {
        super(nombre, puntosAtaque, puntosDefensa, nivel);
        this.ptsataqueplanta = 22;
    }

   

    public Planta( int idPokemon, int ptsataqueplanta,String nombre, int vida, int puntosAtaque, int puntosDefensa, int nivel) {
        super(idPokemon, nombre, vida, puntosAtaque, puntosDefensa, nivel);
        this.ptsataqueplanta = 22;
    }

    

    
   
    //Guetter Setter

    public int getPtsataqueplanta() {
        return ptsataqueplanta;
    }

    public void setPtsataqueplanta(int ptsataqueplanta) {
        this.ptsataqueplanta = ptsataqueplanta;
    }
    
    //To String

    @Override
    public String toString() {
        return "Planta{" + "idPokemon=" + idPokemon + ", nombre=" + nombre + ", vida=" + vida + ", puntosAtaque=" + puntosAtaque + ", puntosDefensa=" + puntosDefensa + ", nivel=" + nivel + ", ptsataqueplanta=" + ptsataqueplanta + "}\n" ;
    }

}

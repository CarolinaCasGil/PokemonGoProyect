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
public class Agua extends Pokemon {
    private int ptsataqueagua;
    
    //Contructor

    public Agua() {
    }

    public Agua(int ptsataqueagua) {
        this.ptsataqueagua = 30;
    }

    public Agua(int ptsataqueagua, int idPokemon) {
        super(idPokemon);
        this.ptsataqueagua = 30;
    }

    public Agua(int ptsataqueagua, String nombre, int puntosAtaque, int puntosDefensa, int nivel) {
        super(nombre, puntosAtaque, puntosDefensa, nivel);
        this.ptsataqueagua = 30;
    }

  

    public Agua( int idPokemon, int ptsataqueagua,String nombre, int vida, int puntosAtaque, int puntosDefensa, int nivel) {
        super(idPokemon, nombre, vida, puntosAtaque, puntosDefensa, nivel);
        this.ptsataqueagua = 30;
    }

    

    
    
    //Guetter Setter
    public int getPtsataqueagua() {
        return ptsataqueagua;
    }

    public void setPtsataqueagua(int ptsataqueagua) {
        this.ptsataqueagua = ptsataqueagua;
    }
    
    //To String

    @Override
    public String toString() {
        return "Agua{" + "idPokemon=" + idPokemon + ", nombre=" + nombre + ", vida=" + vida + ", puntosAtaque=" + puntosAtaque + ", puntosDefensa=" + puntosDefensa + ", nivel=" + nivel + ", ptsataqueagua=" + ptsataqueagua + "}\n";
    }


}

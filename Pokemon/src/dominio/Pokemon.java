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
public class Pokemon implements Cloneable{
    protected int idPokemon;
    protected String nombre;
    protected int vida;
    protected int puntosAtaque;
    protected int puntosDefensa;
    protected int nivel;
    private ArrayList<Ataque> ataques = new ArrayList<Ataque>();
    private Ataque[] ataque = new Ataque[2]; 
    
    
    
    //Construnctores
    
    public Pokemon() {
    }

    public Pokemon(int idPokemon) {
        this.idPokemon = idPokemon;
    }

    public Pokemon(String nombre, int puntosAtaque, int puntosDefensa, int nivel) {
        this.nombre = nombre;
        this.puntosAtaque = puntosAtaque;
        this.puntosDefensa = puntosDefensa;
        this.nivel = nivel;
    }

   

    public Pokemon(int idPokemon, String nombre, int vida, int puntosAtaque, int puntosDefensa, int nivel) {
        this.idPokemon = idPokemon;
        this.nombre = nombre;
        this.vida = vida;
        this.puntosAtaque = puntosAtaque;
        this.puntosDefensa = puntosDefensa;
        this.nivel = nivel;
    }
    
    
    
    //Guetter Setter

    public int getIdPokemon() {
        return idPokemon;
    }

    public void setIdPokemon(int idPokemon) {
        this.idPokemon = idPokemon;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosAtaque() {
        return puntosAtaque;
    }

    public void setPuntosAtaque(int puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }

    public int getPuntosDefensa() {
        return puntosDefensa;
    }

    public void setPuntosDefensa(int puntosDefensa) {
        this.puntosDefensa = puntosDefensa;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Ataque[] getAtaque() {
        return ataque;
    }

    public void setAtaque(Ataque[] ataque) {
        this.ataque = ataque;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    
    //To String

    @Override
    public String toString() {
        return "Pokemon{" + "idPokemon=" + idPokemon + ", nombre=" + nombre + ", vida=" + vida + ", puntosAtaque=" + puntosAtaque + ", puntosDefensa=" + puntosDefensa + ", nivel=" + nivel + ", ataques=" + ataques + ", ataque=" + ataque + '}';
    }

    // Nos permite clonar objetos
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    
    //Metodo
    public void rellenar_ataques(ArrayList<Ataque> ataques, int num1, int num2){
        
       this.ataque[0] = ataques.get(num1);
       this.ataque[1] = ataques.get(num2);
      
    }
    
}

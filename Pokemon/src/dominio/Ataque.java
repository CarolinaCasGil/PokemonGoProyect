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
public class Ataque {
    private int id;
    private String nombre;
    private int danio;
 
    //Contructores

    public Ataque() {
    }

    public Ataque(int id) {
        this.id = id;
    }

    public Ataque(int id, String nombre, int danio) {
        this.id = id;
        this.nombre = nombre;
        this.danio = danio;
    }

    
    
    //Setter Guetter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDanio() {
        return danio;
    }

    public void setDanio(int danio) {
        this.danio = danio;
    }
    
    //to String

    @Override
    public String toString() {
        return "Ataque{" + "id=" + id + ", nombre=" + nombre + ", danio=" + danio + '}';
    }
    
    
}

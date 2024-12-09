/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import dominio.*;
import java.util.ArrayList;

/**
 *
 * @author Alumno Mañana
 */
public class PokemonGo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {

        Entrenador e1 = new Entrenador("Roman", "Baillo", 45, 0);
        Entrenador e2 = new Entrenador("Juan", "Perez", 34, 0);
        Entrenador e3 = new Entrenador("Susan", "Gomez", 12, 0);

        ArrayList<Entrenador> entrenadores = new ArrayList<Entrenador>();
        entrenadores.add(e1);
        entrenadores.add(e2);
        entrenadores.add(e3);

        Ataque a0 = new Ataque(0, "Flamenquito", 15);
        Ataque a1 = new Ataque(1, "Cigala", 15);
        Ataque a2 = new Ataque(2, "Motomami", 29);
        Ataque a3 = new Ataque(3, "Unias", 30);
        Ataque a4 = new Ataque(4, "Muslona", 12);
        Ataque a5 = new Ataque(5, "Donut", 22);
        Ataque a6 = new Ataque(6, "Fiebre", 30);
        Ataque a7 = new Ataque(7, "2000", 25);
        Ataque a8 = new Ataque(8, "LanzaMobiles", 25);
        Ataque a9 = new Ataque(9, "Titi", 12);
        Ataque a10 = new Ataque(10, "Lerololelole", 20);
        Ataque a11 = new Ataque(11, "WakaWaka", 22);
        Ataque a12 = new Ataque(12, "PaGaMe", 13);
        Ataque a13 = new Ataque(13, "Andreita", 20);
        Ataque a14 = new Ataque(14, "Patada voladora", 25);
        Ataque a15 = new Ataque(15, "Yatecomo", 21);
        Ataque a16 = new Ataque(16, "Cuando tu vas", 20);
        Ataque a17 = new Ataque(17, "Cobra", 15);
        
        
        ArrayList<Ataque> ataques = new ArrayList<Ataque>();
        ataques.add(a0);
        ataques.add(a1);
        ataques.add(a2);
        ataques.add(a3);
        ataques.add(a4);
        ataques.add(a5);
        ataques.add(a6);
        ataques.add(a7);
        ataques.add(a8);
        ataques.add(a9);
        ataques.add(a10);
        ataques.add(a11);
        ataques.add(a12);
        ataques.add(a13);
        ataques.add(a14);
        ataques.add(a15);
        ataques.add(a16);
        ataques.add(a17);
        
        
        Fuego camaron = new Fuego(0, 0, "Camaron de la Isla", 124, 39, 24, 8);
        Planta rosalia = new Planta(1, 0, "Rosalia", 150, 22, 12, 1);
        Agua pili = new Agua(2, 0, "Pili", 90, 45, 20, 5);
        Fuego badgyal = new Fuego(3, 65, "Bad Gyal", 149, 65, 32, 5);
        Agua badbu = new Agua(4, 0, "Bad Bunny", 138, 35, 25, 2);
        Planta saky = new Planta(5, 0, "Sakyra", 122, 44, 22, 3);
        Fuego belen =new Fuego(6, 0, "Belen Esteban", 115, 29, 34, 4);
        Agua bisbal = new Agua(7, 0, "Bisbal",127, 34, 12, 3);
        Planta chenoa = new Planta(8, 0, "Chenoa", 119, 39, 24, 5);

        ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
        pokemons.add(camaron);
        pokemons.add(rosalia);
        pokemons.add(pili);
        pokemons.add(badgyal);
        pokemons.add(badbu);
        pokemons.add(saky);
        pokemons.add(belen);
        pokemons.add(bisbal);
        pokemons.add(chenoa);
        
        
        camaron.rellenar_ataques(ataques , 0 , 1);
        rosalia.rellenar_ataques(ataques , 2 , 3);
        pili.rellenar_ataques(ataques , 4 , 5);
        badgyal.rellenar_ataques(ataques , 6 , 7);
        badbu.rellenar_ataques(ataques , 8 , 9);
        saky.rellenar_ataques(ataques , 10 , 11);
        belen.rellenar_ataques(ataques , 12 , 13);
        bisbal.rellenar_ataques(ataques , 14 , 15);
        chenoa.rellenar_ataques(ataques , 16 , 17);
        
        
        
        
        
        e1.lista_pk(pokemons);
        e1.elegir_pokemon();
        e1.inicio_juego();

    }

}

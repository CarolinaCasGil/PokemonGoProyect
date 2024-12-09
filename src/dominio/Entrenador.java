/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Alumno Mañana
 */
public class Entrenador {

    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private float dinero;
    private ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>(); //Lista de pokemons totales
    private ArrayList<Pokemon> equipo = new ArrayList<Pokemon>();   //Equipo del entrenador
    private ArrayList<Ataque> ataques = new ArrayList<Ataque>();
    Scanner lectura = new Scanner(System.in);

    int numPokemon = 0;
    
    //Constructores
    public Entrenador() {
        this.id++;
    }

    public Entrenador(int id) {
        this.id = id;
    }

    public Entrenador(String nombre, String apellido, int edad, float dinero) {
        this();             //Constructor vacio que añade el id y lo autoincrementa
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dinero = dinero;
    }

    public Entrenador(int id, String nombre, String apellido, int edad, float dinero) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dinero = dinero;
    }

    //Guetter y Setter
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getDinero() {
        return dinero;
    }

    public void setDinero(float dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(ArrayList<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public ArrayList<Pokemon> getEquipo() {
        return equipo;
    }

    public void setEquipo(ArrayList<Pokemon> equipo) {
        this.equipo = equipo;
    }

    //To String
    @Override
    public String toString() {
        return "Entrenador{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", dinero=" + dinero + '}';
    }

    //Metodos
    public void lista_pk(ArrayList<Pokemon> pokemon) {
        this.pokemons = pokemon;
    }

    //######################ELEGIR POKEMON#############################
    public void elegir_pokemon() {

        System.out.println("Antes de empezar debes escoger un pokemon para comenzar a tener un equipo ");
        System.out.println("1-CAMARON DE LA ISLA | 2-CHENOA | 3-PILI");
        int op = lectura.nextInt();
        switch (op) {
            case 1:
                System.out.println("PERFECTO CAMARON DE LA ISLA ES TUYO!!");
                Pokemon pkEntr = pokemons.get(0);
                pkEntr.setIdPokemon(numPokemon);
                equipo.add(pkEntr);
                break;
            case 2:
                System.out.println("PERFECTO CHENOA ES TUYO!!");
                pkEntr = pokemons.get(8);
                pkEntr.setIdPokemon(numPokemon);
                equipo.add(pkEntr);
                break;
            case 3:
                System.out.println("PERFECTO PILI ES TUYO!!");
                pkEntr = pokemons.get(2);
                pkEntr.setIdPokemon(numPokemon);
                equipo.add(pkEntr);
                break;
            case 4:
                System.out.println("\n\n------------------HAS ENCONTRADO UN EASTEREGG------------------");
                System.out.println("PERFECTO ROSALIA ES TUYO!!");
                pkEntr = pokemons.get(1);
                pkEntr.setIdPokemon(numPokemon);
                equipo.add(pkEntr);
                break;
        }
        numPokemon++;
        System.out.println("\n\n###########################################################################################################\n\n");
        
    }


    //###############INICIO DEL JUEGO##################
    public void inicio_juego() throws InterruptedException, CloneNotSupportedException {
        int num;
        try {
            do {
                System.out.println("CAMIANDO");
                Thread.sleep(5000);
                inicio_captura();
                System.out.println("¿Quieres seguir explorando? (1-SI 2-NO)");
                num = lectura.nextInt();
            } while (num == 1);

        } catch (InterruptedException e) {
            e.printStackTrace();    //esto salen los errores
        }

    }

    private void inicio_captura() throws CloneNotSupportedException, InterruptedException {
        int num = (int) (Math.random() * 9);
        pokemons.get(num);
        System.out.println("TE HAS ENCONTRADO CON " + pokemons.get(num).getNombre() + " !!!");
        System.out.println("Esta es su informacion: " + pokemons.get(num));

        System.out.println("Que quieres hacer: 1-Combatir o 2-Salir corriendo");
        int op = lectura.nextInt();
        switch (op) {
            case 1:
                combate(num);
                break;
            case 2:
                System.out.println("Has huido!!");
                break;
        }

    }

    public void combate(int num) throws CloneNotSupportedException, InterruptedException {
        Random rd = new Random();

        System.out.println("Quieres combatir  1-luchar o 2-capturarlo");
        int op = lectura.nextInt();
        int eqnum;


        if (op == 1) {
            System.out.println("\n\n###########################################################################################################\n\n");
            System.out.println("ESTE ES TU EQUIPO!!!");
            for (int i = 0; i < equipo.size(); i++) {
                System.out.println(i + "- " + equipo.get(i).getNombre());
            }
            System.out.println("¿Cual de todos quieres usar?");
            eqnum = lectura.nextInt();
            luchar(eqnum, num);

        } else {
            //##################CAPTURAR####################
            int cont = 0;
            System.out.println("PERFECTO, TIRA LA POKEBOLA!!!!!");
            System.out.println("Solo tienes 3 intentos");
            for (int i = 0; i < 3; i++) {
                boolean b = rd.nextBoolean();
                //System.out.println(b);
                if (b == false) {
                    System.out.println(i + " - NO LO HAS CAPTURADO");
                    cont++;
                } else {
                    capturar(num);
                    break;
                }
            }
            if (cont == 3) {
                //#############################SI NO LO CAPTURA PUEDE COMBATIR CONTRA EL############################
                System.out.println("¿Quieres luchar contra el? \n1-SI | 2-NO ");
                int luchanum = lectura.nextInt();
                if (luchanum == 1) {
                    System.out.println("\n\n###########################################################################################################\n\n");
                    for (int i = 0; i < equipo.size(); i++) {
                        System.out.println(i + "- " + equipo.get(i).getNombre());
                    }
                    System.out.println("¿Cual de todos quieres usar?");
                    eqnum = lectura.nextInt();
                    luchar(eqnum, num);

                }
            }
        }

    }

    //###################LUCHA DE LOS POKEMONS######################
    public void luchar(int eqnum, int num) throws CloneNotSupportedException, InterruptedException {

        int vida1, vida2, def1, def2, danio1, danio2;
        boolean muerteCaptura = false;

        vida1 = equipo.get(eqnum).vida;
        vida2 = pokemons.get(num).vida;
        def1 = equipo.get(eqnum).puntosDefensa;
        def2 = pokemons.get(num).puntosDefensa;

        System.out.println("\n\n###########################################################################################################\n\n");
        System.out.println("\t\tCOMTRINCANTES\t\t" + equipo.get(eqnum).nombre + " VS " + pokemons.get(num).nombre + "\n");
        System.out.println("\t\tVIDA\t\t\t\t" + equipo.get(eqnum).vida + " VS " + pokemons.get(num).vida + "\n");

        while (muerteCaptura == false) {
            System.out.println(equipo.get(eqnum).nombre + "  ATAQUES" + "\n 0- " + equipo.get(eqnum).getAtaque()[0].getNombre() + " |  1-" + equipo.get(eqnum).getAtaque()[1].getNombre() + "\n");
            System.out.println("¿Que ataque quieres usar?");
            int atacnum = lectura.nextInt();
            danio1 = equipo.get(eqnum).getAtaque()[atacnum].getDanio();

            int atacnum2 = (int) (Math.random() * 2);
            danio2 = pokemons.get(num).getAtaque()[atacnum2].getDanio();

            vida1 = vida1 - Math.abs(def1 - danio2);
            vida2 = vida2 - Math.abs(def2 - danio1);

            if (vida2 <= 10 && vida2 >= 1) {
                System.out.println("\t\t\tTU CONTRINCANTE TIENE POCA VIDA");
                System.out.println("¿Quieres capturarlo? 1-SI 2-NO");
                int capnum = lectura.nextInt();

                if (capnum == 1) {
                    capturar(num);
                    muerteCaptura = true;
                }else{
                    System.out.println("\t\tCOMTRINCANTES\t\t" + equipo.get(eqnum).nombre + " VS " + pokemons.get(num).nombre + "\n");
                    System.out.println("\t\tVIDA\t\t\t\t" + vida1 + " VS " + vida2 + "\n");
                }
            } else if (vida1 <= 10 && vida1 >= 1) {
                System.out.println("\t\t\t CUIDADO TE QUEDA POCA VIDA");
                System.out.println("¿Quieres huir? 1-SI 2-NO");
                int huirnum = lectura.nextInt();

                if (huirnum == 1) {
                    muerteCaptura = true;
                    System.out.println("\n\n--------------------------------------");
                    System.out.println("HAS HUIDO!!!!");
                } else {
                    System.out.println("\t\tCOMTRINCANTES\t\t" + equipo.get(eqnum).nombre + " VS " + pokemons.get(num).nombre + "\n");
                    System.out.println("\t\tVIDA\t\t\t\t" + vida1 + " VS " + vida2 + "\n");
                }
                

            } else if (vida1 > 0 && vida2 > 0) {
                System.out.println("\t\tCOMTRINCANTES\t\t" + equipo.get(eqnum).nombre + " VS " + pokemons.get(num).nombre + "\n");
                System.out.println("\t\tVIDA\t\t\t\t" + vida1 + " VS " + vida2 + "\n");
            } else if (vida1 <= 0) {
                System.out.println("\n\n--------------------------------------");
                System.out.println("NOOOO SE TE HA MUERTO " + equipo.get(eqnum).nombre);
                System.out.println("@@@@@ SE TE PENALIZA @@@@@");
                System.out.println("DEBES ESPERAR UN TIEMPO PARA SEGUIR JUGANDO, TU POKEMO SE TIENE QUE CURAR");
                Thread.sleep(15000);
                System.out.println("\n\n\n######################################################################################");
                System.out.println("\t\tYA PUEDES SEGUIR JUGANDO, TU POKEMON SE HA CURADO");
                muerteCaptura = true;
            } else if (vida2 <= 0) {
                System.out.println("\n\n--------------------------------------");
                System.out.println("BIEN HAS MATADO A " + pokemons.get(num).nombre);
                System.out.println("@@@@ TU VIDA SE HA REGENERADO @@@@");
                muerteCaptura = true;
            } else if (vida1 <= 0 && vida2 == 0) {
                System.out.println("\n\n--------------------------------------");
                System.out.println("VAYA SE HAN MUERTO LOS DOS!!!!");
                 System.out.println("DEBES ESPERAR UN TIEMPO PARA SEGUIR JUGANDO, TU POKEMO SE TIENE QUE CURAR");
                Thread.sleep(15000);
                System.out.println("\n\n\n######################################################################################");
                System.out.println("\t\tYA PUEDES SEGUIR JUGANDO, TU POKEMON SE HA CURADO");
                muerteCaptura = true;
            }

        }

    }

    //#######CAPTURA########
    public void capturar(int num) throws CloneNotSupportedException {

        System.out.println("ENHORABUENA HAS LO HAS CAPTURADO");
        System.out.println(pokemons.get(num).getNombre() + " YA ES TUYO");    
        Pokemon pkEntr = (Pokemon) pokemons.get(num).clone();
        pkEntr.setIdPokemon(numPokemon);        
        equipo.add(numPokemon, pkEntr);
        numPokemon++;        
        System.out.println("Este es tu equipo de pokemons\n" + equipo.toString());
    }

   

}

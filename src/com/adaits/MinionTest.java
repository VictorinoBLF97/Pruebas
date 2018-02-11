package com.adaits;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MinionTest {

    static Minion[] minions;
    static int posMinionActual = 0;
    private Minion minionProbar = null;

    @BeforeAll
    static void crearPersonas(){
        minions = new Minion[10];
        minions[0] = new Minion("Dave",30);
        minions[1] = new Minion("Carl",15);
        minions[2] = new Minion("Stuart",Integer.MAX_VALUE);
        minions[3] = new Minion("Jerry",Integer.MIN_VALUE);
        minions[4] = new Minion("Jorge",17);
        minions[5] = new Minion("Tim",18);
        minions[6] = new Minion("Mark",19);
        minions[7] = new Minion("Phil",Integer.MIN_VALUE -1);
        minions[8] = new Minion("Kevin",Integer.MAX_VALUE+1);
    }

    @BeforeEach
    void prepararMinionProbar(){
        minionProbar = minions[posMinionActual];
        System.out.println(minionProbar);
    }

    @AfterEach
    void aumentarPosicion(){
        posMinionActual +=1;
        System.out.println("POSICION ACTUAL: "+ posMinionActual);
    }

    @AfterAll
    static void terminar(){
        System.out.println("TODAS LAS PRUEBAS HAN TERMINADO");
    }



    @Test
    void probarEsMayorEdad(){
        assertTrue(minionProbar.esUnVillano());
    }

    @Test
    void probarEsMayorEdad2(){
        assertFalse(minionProbar.esUnVillano());
    }

    @Test
    void probarEsMayorEdad3(){
        assertTrue(minionProbar.esUnVillano());
    }

    @Test
    void probarEsMayorEdad4(){
        assertFalse(minionProbar.esUnVillano());
    }

    @Test
    void probarEsMayorEdad5(){
        assertFalse(minionProbar.esUnVillano());
    }
    @Test
    void probarEsMayorEdad6(){
        assertTrue(minionProbar.esUnVillano());
    }
    @Test
    void probarEsMayorEdad7(){
        assertTrue(minionProbar.esUnVillano());
    }
    @Test
    void probarEsMayorEdad8(){
        assertFalse(minionProbar.esUnVillano());
    }
    @Test
    void probarEsMayorEdad9(){
        assertTrue(minionProbar.esUnVillano());
    }






}
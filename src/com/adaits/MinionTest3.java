package com.adaits;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class MinionTest3 {

    static Minion[] minions;

    @BeforeAll
    static void crearMinions(){
        minions = new Minion[10];
        minions[0] = new Minion(3,true);
        minions[1] = new Minion(1, false);
        minions[2] = new Minion(2,true);
        minions[3] = new Minion(2,false);
        minions[4] = new Minion(4,true);
        minions[5] = new Minion(1,true);
        minions[6] = new Minion(0,false);
        minions[7] = new Minion(3,false);
        minions[8]=  new Minion(4,false);
    }

    @Test
    void pruebaMinionTest3(){
        ArrayList<Minion>minions=new ArrayList<>();
        Minion m1=new Minion(2,false);
        minions.add(m1);
        Jefe j= new Jefe("Pepe",m1);

        j.ojoGafas();
        ArrayList<Minion>minionsPrueba= j.ojoGafas();
        assertArrayEquals(minions,minionsPrueba);
        //TERMINAR
        int i;
        for (i=0:i<minions.size(),i++
             ) {
            Minion minionRE= minions.indexOf(i);
            Minion minionF= minionsPrueba.indexOf(i);
            assertEquals(minionRE,minionF);
            assertEquals();

        }


    }

    @Test
    void minionsCorrectos(){
    }

    @Test
    void minionsIncorrectos(){}

}

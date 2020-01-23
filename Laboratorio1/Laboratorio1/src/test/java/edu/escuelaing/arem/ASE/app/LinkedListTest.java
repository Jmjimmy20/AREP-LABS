package edu.escuelaing.arem.ASE.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.apache.poi.ss.formula.functions.T;
import org.junit.Test;

public class LinkedListTest{

    @Test
    public void CrearLinkedList(){
        LinkedList<T> l = new LinkedList<T>();
        assertTrue(l.size == 0);
    }

    @Test
    public void CrearYargregarNodo(){
        int Vtest =10;
        LinkedList<Integer> l = new LinkedList<Integer>();
        l.add(Vtest);
        assertTrue(l.get(0) == Vtest);
    }

    /*@Test
    public void CrearYargregarNodoIndex(){ // no deberia pasar, si falla la prueba es correcta
        int Vtest =10;
        LinkedList<Integer> l = new LinkedList<Integer>();
        l.add(10, Vtest);
    }*/

    @Test
    public void clearLinkedList(){
        int Vtest1 =10;
        int Vtest2 =11;
        int Vtest3 =12;
        LinkedList<Integer> l = new LinkedList<Integer>();
        l.add(Vtest1);
        l.add(Vtest2);
        l.add(Vtest3);
        l.clear();
        assertTrue(l.size ==0);
    }

    @Test
    public void AddIndexLinkedList(){
        int Vtest1 =10;
        int Vtest2 =11;
        int Vtest3 =12;
        int Vtest4 =13;
        LinkedList<Integer> l = new LinkedList<Integer>();
        l.add(Vtest1);
        l.add(Vtest2);
        l.add(Vtest3);
        l.add(2, Vtest4);
        assertTrue(l.get(2) == Vtest4);
    }

}
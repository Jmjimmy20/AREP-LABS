package edu.escuelaing.arem.ASE.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.apache.poi.ss.formula.functions.T;
import org.junit.Test;

public class LinkedListTest{

    /**
     * Esta prueba se encarga de crear una nueva LinkedList y revisa si se crea de tamaño 0
     */
    @Test
    public void CrearLinkedList(){
        LinkedList<T> l = new LinkedList<T>();
        assertTrue(l.size == 0);
    }


    /**
     * Esta prueba se encarga de Crear un nuevo nodo  y le envia el dato para su creación
     */
    @Test
    public void CrearYargregarNodo(){
        int Vtest =10;
        LinkedList<Integer> l = new LinkedList<Integer>();
        l.add(Vtest);
        assertTrue(l.get(0) == Vtest);
    }

    /*
    @Test
    public void CrearYargregarNodoIndex(){ // no deberia pasar, si falla la prueba es correcta
        int Vtest =10;
        LinkedList<Integer> l = new LinkedList<Integer>();
        l.add(10, Vtest);
        assertFalse(l.wasCreated == false);
    }
    */

    
    /**
     * Esta prueba verifica que despues de usar el metodo clear , el tamaño del LinkedLsit sea 0
     */
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


    /**
     * Esta prueba agrega un nodo en un LinkedList  por medio de index
     */
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
        System.out.println(l.get(2));
        assertTrue(l.get(2) == Vtest4);
    }




}
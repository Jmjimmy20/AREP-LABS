package edu.escuelaing.arem.ASE.app;

public class Head<T> {

    public Nodo<T> firstNodo;
    public Nodo<T> lastNodo;

    Head(Nodo<T> first, Nodo<T> last) {
        firstNodo = first;
        lastNodo = last;
    }

    public Nodo<T> getLast() {
        return lastNodo;
    }

    public Nodo<T> getFirst() {
        return firstNodo;
    }

    public void setFirst(Nodo<T> nodo){
        firstNodo = nodo;
    }

    public void setLast(Nodo<T> nodo){
        lastNodo = nodo;
    }

    public void ClearHead(){
        firstNodo = null;
        lastNodo = null;
        System.gc();
        System.runFinalization();
    }

}
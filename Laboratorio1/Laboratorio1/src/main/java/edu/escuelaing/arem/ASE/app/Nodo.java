package edu.escuelaing.arem.ASE.app;

public class Nodo<T> {

    public T data;
    public Nodo<T> next;

    Nodo(T data, Nodo<T> next) {
        this.data = data;
        this.next = next;
    }

    public void setNextNode(Nodo<T> n) {
        next = n;
    }

    public Nodo<T> getNextNode(){
        return next;
    }

    public void setData(T d){
        data =d;
    }

    public T getData(){
        return data;
    }
}

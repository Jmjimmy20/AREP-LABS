package edu.escuelaing.arem.ASE.app;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedList<T> implements List<T> {

    Head<T> head;
    int size;

    LinkedList() {
        this.head = new Head<T>(null, null);
        size = 0;
    }

    /***
     * add new "data" to LinkedList
     * 
     * @param data node to add
     * @return true if node was created
     */
    public boolean add(final T data) {
        final Nodo<T> nodo = new Nodo<T>(data, null);
        if (size == 0) {
            head.setFirst(nodo);
            head.setLast(nodo);
        } else if (size > 0) {
            final Nodo<T> last = head.getLast();
            last.setNextNode(nodo);
            head.setLast(nodo);
        }
        size++;
        return true;
    }

    /***
     * add new "data" to LinkedList using an index
     * 
     * @param index to know the position to add
     * @param data node to add
     */
    public void add(final int index, final T data) { 
        try{
            if (index >= size)throw new IndexOutOfBoundsException("El index ingresado es mayor al tamaño de la lista");
            final Nodo<T> nodo = new Nodo<T>(data, null);
            if(index == 0){
                nodo.setNextNode(head.getFirst());
                head.setFirst(nodo);
                size ++;
            }else{
                int c =1;
                Nodo<T> lastNodo = head.getFirst();
                Nodo<T> actNodo = lastNodo.getNextNode();
                while(c != index){
                    lastNodo = actNodo;
                    actNodo =actNodo.getNextNode();
                    c++;
                }
                lastNodo.setNextNode(nodo);
                nodo.setNextNode(actNodo);
                size ++;
            }
    

        }catch(IndexOutOfBoundsException e){
            throw e;
        }
        
    }

    
    public boolean addAll(final Collection<? extends T> c) {
        for(T b:c){
            Nodo<T> agrega = new Nodo<T>(b, null);
            if(size == 0){
                head.setFirst(agrega);
                head.setLast(agrega);
            }else{
                head.getLast().setNextNode(agrega);
                head.setLast(agrega);
            }
            size ++;
        }
        return true;
    }

    public boolean addAll(final int index, final Collection<? extends T> c) {
        // TODO Auto-generated method stub
        return false;
    }

    public void clear() {
        head.ClearHead();
        size =0;
    }

    /**
     * Get the data of node using an index
     * @param index to get the node
     */
    public T get(final int index) {
        T dato = null;
        try{
            if(index>size) throw new IndexOutOfBoundsException("El index es mayor al tamaño de la estructura");
            Nodo<T> NodoBuscar = head.getFirst();
            int c =0;
            while(c != index){
                NodoBuscar = NodoBuscar.getNextNode();
                c++;
            }
            dato = NodoBuscar.getData();

        }catch(IndexOutOfBoundsException e){
            throw e;
        }
        return dato;
    }

    public int indexOf(final Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

    public boolean isEmpty() {
        boolean isEmpty;
        if(size ==0) isEmpty =true;
        else isEmpty = false;
        return isEmpty;
    }

    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        return null;
    }

    public int lastIndexOf(final Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

    public ListIterator<T> listIterator() {
        // TODO Auto-generated method stub
        return null;
    }

    public ListIterator<T> listIterator(final int index) {
        // TODO Auto-generated method stub
        return null;
    }

    public boolean remove(final Object o) {
        // TODO Auto-generated method stub
        return false;
    }

    public T remove(final int index) {
        // TODO Auto-generated method stub
        return null;
    }

    public boolean removeAll(final Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean retainAll(final Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    public T set(final int index, final T element) {
        // TODO Auto-generated method stub
        return null;
    }

    public int size() {
        return size;
    }

    public List<T> subList(final int fromIndex, final int toIndex) {
        // TODO Auto-generated method stub
        return null;
    }

    public Object[] toArray() {
        // TODO Auto-generated method stub
        return null;
    }

    public <T> T[] toArray(final T[] a) {
        // TODO Auto-generated method stub
        return null;
    }

    public boolean contains(Object o) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean containsAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

}

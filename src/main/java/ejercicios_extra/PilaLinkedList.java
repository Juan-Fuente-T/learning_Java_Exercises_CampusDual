package main.java.ejercicios_extra;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class PilaLinkedList implements IPila {

    LinkedList<Object> pila;

    public PilaLinkedList() {
        pila = new LinkedList();
    }

    @Override
    public void apilar(Object objeto) {
        pila.add(objeto);
    }

    @Override

    public Object desapilar() {
        if (!pila.isEmpty()) {
            return pila.remove(pila.size() - 1);
        } else {
            System.out.println("La pila está vacía");
            return null;
        }
    }

    public Object cima() {
        if (!pila.isEmpty()) {
            return pila.get(pila.size() - 1);
        } else {
            System.out.println("La pila está vacía");
            return null;
        }
    }

}

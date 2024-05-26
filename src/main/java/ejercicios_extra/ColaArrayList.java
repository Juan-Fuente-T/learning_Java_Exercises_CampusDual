package main.java.ejercicios_extra;

import java.util.ArrayList;

public class ColaArrayList implements ICola{
    ArrayList<Object> cola;
    public  ColaArrayList() {
        cola = new ArrayList<>();
    }

    @Override
    public void encolar(Object objeto) {
        cola.add(objeto);
    }

    @Override
    public Object desencolar() {
        if (!cola.isEmpty()) {
            return cola.removeFirst();
        } else {
            System.out.println("La cola está vacía");
            return null;
        }
    }

    @Override
    public Object frente() {
        if (!cola.isEmpty()) {
            return cola.getFirst();
        } else {
            System.out.println("La cola está vacía");
            return null;
        }
    }
}
/*
encolar: Recibirá un objeto y lo encolará a la cola.
desencolar: Devolverá el elemento del frente de la cola y lo retirará de la misma.
frente: Devolverá el elemento del frente de la cola pero no lo retirará de la misma.
* Apartado 1: Realizar una implementación de ICola mediante ArrayList. Para ello:
• Deberá crearse una clase ColaArrayList con un campo cola de tipo ArrayList.
• En el constructor por defecto de ArrayList deberá inicializarse la cola vacía (hacer un new de la
pila).
• Deberán implementarse los métodos definidos en la interfaz.
* */
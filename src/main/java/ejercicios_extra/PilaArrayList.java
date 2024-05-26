package main.java.ejercicios_extra;

import java.util.ArrayList;

public class PilaArrayList  implements IPila {
    ArrayList<Object> pila;
    public  PilaArrayList() {
        pila = new ArrayList();
    }

    @Override
    public void apilar(Object objeto) {
        pila.add(objeto);
    }

    @Override
    public Object desapilar() {
        if (!pila.isEmpty()) {
            return pila.removeLast();
        }
        System.out.println("La pila está vacía");
        return null; // Pila vacía
    }
    public Object cima(){
        //return pila.getLast();
        if (!pila.isEmpty()) {
            return pila.getLast();
        }
        System.out.println("La pila está vacía");
        return null;
    }
}



/*
Crear una interfaz para realizar pilas (IPila). Esta interfaz tendrá que definir los métodos

para:

apilar: Recibirá un objeto y lo apilará en la pila.

desapilar: Devolverá el elemento de la cima de la pila y lo retirará de la misma.

cima: Devolverá el elemento de la cima de la pila pero no lo retirará de la misma.

Apartado 1: Realizar una implementación de IPila mediante ArrayList. Para ello:

• Deberá crearse una clase PilaArrayList con un campo pila de tipo ArrayList.

• En el constructor por defecto de ArrayList deberá inicializarse la pila vacía (hacer un new de la

pila).

• Deberán implementarse los métodos definidos en la interfaz.
*
* --------------------------------------------------------------------------------------

Apartado 2: Crear un método main en una clase separada (Ejercicio2) en el que se realizarán pruebas

sobre el funcionamiento de la pila (probar a apilar y desapilar distintos elementos y ver que funciona

correctamente). Para ello crear un objeto que implementa la lista de esta forma:

IPila impPila= new PilaArrayList();
Apartado 3: Realizar una implementación de IPila mediante LinkedList de forma similar a lo hecho con

ArrayList, creando una clase PilaLinkedList y con un campo pila de tipo LinkedList.

Apartado 4: Modificar la implementación usada en las pruebas del apartado 2 para comprobar que,

aunque cambie la implementación usada sigue funcionando correctamente.

IPila impPila= new PilaLinkedList();
[11:18] Alberto Pérez Cotos
Crear una interfaz para realizar coas (ICola). Esta interfaz tendrá que definir los métodos

para:

encolar: Recibirá un objeto y lo encolará a la cola.

desencolar: Devolverá el elemento del frente de la cola y lo retirará de la misma.

frente: Devolverá el elemento del frente de la cola pero no lo retirará de la misma.

Apartado 1: Realizar una implementación de ICola mediante ArrayList. Para ello:

• Deberá crearse una clase ColaArrayList con un campo cola de tipo ArrayList.

• En el constructor por defecto de ArrayList deberá inicializarse la cola vacía (hacer un new de la

pila).

• Deberán implementarse los métodos definidos en la interfaz.

Apartado 2: Crear un método main en una clase separada (Ejercicio2) en el que se realizarán pruebas

sobre el funcionamiento de la cola. Para ello crear un objeto que implementa la lista de esta forma:

ICola impCola= new ColaArrayList();

Apartado 3: Realizar una implementación de ICola mediante LinkedList de forma similar a lo hecho

con ArrayList, creando una clase ColaLinkedList y con un campo cola de tipo LinkedList.
* */
package main.java.ejercicios_extra;

public interface ICola {
    public void encolar(Object objeto);
    public Object desencolar();
    public Object frente();
}
/*
* Crear una interfaz para realizar colas (ICola). Esta interfaz tendrá que definir los métodos
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

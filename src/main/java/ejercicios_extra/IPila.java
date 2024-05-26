package main.java.ejercicios_extra;

public interface IPila {
        public void apilar(Object objeto);
        public Object desapilar();
        public Object cima();
}
/*
* [11:16] Alberto Pérez Cotos
Crear una interfaz para realizar pilas (IPila). Esta interfaz tendrá que definir los métodos

para:

apilar: Recibirá un objeto y lo apilará en la pila.

desapilar: Devolverá el elemento de la cima de la pila y lo retirará de la misma.

cima: Devolverá el elemento de la cima de la pila pero no lo retirará de la misma.  ####(ESTO PARECE PARA UN STACK)####

Apartado 1: Realizar una implementación de IPila mediante ArrayList. Para ello:

• Deberá crearse una clase this con un campo pila de tipo ArrayList.

• En el constructor por defecto de ArrayList deberá inicializarse la pila vacía (hacer un new de la

pila). ####(PARECE QUE SE QUIERA APLICAR LO DE UN STACK A UNA LISTA)####

• Deberán implementarse los métodos definidos en la interfaz.
*/
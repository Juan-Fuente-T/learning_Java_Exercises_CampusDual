package main.java.ejercicios_extra;

//import main.java.PilaArrayList;

import main.java.Cat;

public class Ejercicio2_Pila {
    public static void main(String[] args) {
        IPila impPila = new PilaArrayList();
        IPila impPilaLKL = new PilaLinkedList();

        impPila.apilar(new Cat("Mari Carmen", "siames", "gata", 21, 1, "beige"));
        impPila.apilar(new Cat("Kevin", "persa", "gato", 12, 2, "marrón"));
        impPila.apilar(new Cat("Florencio", "siames", "gato", 44, 1, "marrón"));

        impPilaLKL.apilar(new Cat("Mari Carmen", "siames", "gata", 21, 1, "beige"));
        impPilaLKL.apilar(new Cat("Kevin", "persa", "gato", 12, 2, "marrón"));
        impPilaLKL.apilar(new Cat("Florencio", "siames", "gato", 44, 1, "marrón"));

        // Hacer casting explícito a Cat
        Cat elementoCima = (Cat) impPila.cima();
        elementoCima.catDetails(elementoCima);

        Cat elementoDesapilado = (Cat) impPila.desapilar();
        System.out.println("Elemento desapilado: " + elementoDesapilado.name);

        elementoCima = (Cat) impPila.cima();
        elementoCima.catDetails(elementoCima);

        elementoDesapilado = (Cat) impPila.desapilar();
        System.out.println("Elemento desapilado: " + elementoDesapilado.name);

        elementoCima = (Cat) impPila.cima();
        elementoCima.catDetails(elementoCima);

        elementoDesapilado = (Cat) impPila.desapilar();
        System.out.println("Elemento desapilado: " + elementoDesapilado.name);

        impPila.desapilar();
        impPila.cima();

        System.out.println("\n" + "-----------------Implementacion LinkedList--------------" + "\n");

        Cat elementoCimaLKL = (Cat) impPilaLKL.cima();
        elementoCimaLKL.catDetails(elementoCimaLKL);

        Cat elementoDesapiladoLKL = (Cat) impPilaLKL.desapilar();
        System.out.println("Elemento desapilado: " + elementoDesapiladoLKL.name);

        elementoCimaLKL = (Cat) impPilaLKL.cima();
        elementoCimaLKL.catDetails(elementoCimaLKL);

        elementoDesapiladoLKL = (Cat) impPilaLKL.desapilar();
        System.out.println("Elemento desapilado: " + elementoDesapiladoLKL.name);

        elementoCimaLKL = (Cat) impPilaLKL.cima();
        elementoCimaLKL.catDetails(elementoCimaLKL);

        elementoDesapiladoLKL = (Cat) impPilaLKL.desapilar();
        System.out.println("Elemento desapilado: " + elementoDesapiladoLKL.name);

        impPilaLKL.cima();
        impPilaLKL.desapilar();
    }
}
/*
* Apartado 2: Crear un método main en una clase separada (Ejercicio2) en el que se realizarán pruebas

sobre el funcionamiento de la pila (probar a apilar y desapilar distintos elementos y ver que funciona

correctamente). Para ello crear un objeto que implementa la lista de esta forma:

IPila impPila= new PilaLinkedList();
*
Apartado 3: Realizar una implementación de IPila mediante LinkedList de forma similar a lo hecho con

ArrayList, creando una clase PilaLinkedList y con un campo pila de tipo LinkedList.

Apartado 4: Modificar la implementación usada en las pruebas del apartado 2 para comprobar que,

aunque cambie la implementación usada sigue funcionando correctamente.


* */
package main.java.ejercicios_extra;

import main.java.Cat;

public class Ejercicio2_Cola {
    public static void main(String[] args) {
        ICola impCola = new ColaArrayList();

        impCola.encolar(new Cat("Mari Carmen", "siames", "gata", 21, 1, "beige"));
        impCola.encolar(new Cat("Kevin", "persa", "gato", 12, 2, "marrón"));
        impCola.encolar(new Cat("Florencio", "siames", "gato", 44, 1, "marrón"));

        Cat elementoFrente = (Cat) impCola.frente();
        System.out.println("El frente de la cola es " + elementoFrente.name);
        elementoFrente.catDetails(elementoFrente);
        impCola.desencolar();
        System.out.println("Elemento desencolado: " + elementoFrente.name);
        System.out.println("\n");


        elementoFrente = (Cat) impCola.frente();
        System.out.println("El frente de la cola es " + elementoFrente.name);
        elementoFrente.catDetails(elementoFrente);
        impCola.desencolar();
        System.out.println("Elemento desencolado: " + elementoFrente.name);
        System.out.println("\n");


        elementoFrente = (Cat) impCola.frente();
        System.out.println("El frente de la cola es " + elementoFrente.name);
        elementoFrente.catDetails(elementoFrente);
        impCola.desencolar();
        System.out.println("Elemento desapilado: " + elementoFrente.name);
        System.out.println("\n");

        impCola.frente();
        impCola.desencolar();
    }
}
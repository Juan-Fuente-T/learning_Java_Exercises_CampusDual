package main.java.ejercicios_extra;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Conteo_Caracteres_2 {

    public static void main(String[] args) {
        // Pedir texto al usuario
        String texto = pedirTexto();

        // Obtener el mapa de apariciones
        Map<Character, Integer> apariciones = obtenerApariciones(texto);

        // Imprimir los resultados
        imprimirResultados(apariciones);
    }

    // Método para pedir el texto al usuario
    private static String pedirTexto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una frase:");
        return scanner.nextLine();
    }

    // Método para obtener el mapa de apariciones de cada carácter
    private static Map<Character, Integer> obtenerApariciones(String texto) {
        Map<Character, Integer> apariciones = new HashMap<>();
        for (char caracter : texto.toCharArray()) {
            apariciones.put(caracter, apariciones.getOrDefault(caracter, 0) + 1);
        }
        return apariciones;
    }

    // Método para imprimir los resultados
    private static void imprimirResultados(Map<Character, Integer> apariciones) {
        for (Map.Entry<Character, Integer> entrada : apariciones.entrySet()) {
            System.out.println("El carácter '" + entrada.getKey() + "' aparece " + entrada.getValue() + " veces.");
        }
    }
}
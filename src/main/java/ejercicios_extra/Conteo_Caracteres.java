package main.java.ejercicios_extra;

import java.util.*;


public class Conteo_Caracteres {

    public static void main(String[] args) {
        String textScan = textScan();
        int[][] arrayText = obtainArray(textScan);
        printCharacters(arrayText);
    }

    public static String textScan() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce una frase \n");
        return scan.nextLine();
    }

    public static int[][] obtainArray(String scan) {
//        List<Character> caracterList = new ArrayList<>();
//        Set<Character> caracterSet = new HashSet<>();
        Map<Character, Integer> conteoCaracteres = new HashMap<>();
        for (int i = 0; i < scan.length(); i++) {
//            caracterList.add(scan.charAt(i));
//            caracterSet.add(scan.charAt(i));
            char caracter = scan.charAt(i);
            conteoCaracteres.put(caracter, conteoCaracteres.getOrDefault(caracter, 0) + 1);
        }
        int[][] caracterArray = new int[conteoCaracteres.size()][2];
        System.out.println(conteoCaracteres);
        int index = 0;
        for (Map.Entry<Character, Integer> e : conteoCaracteres.entrySet()) {
            caracterArray[index][0] = e.getKey(); // Almacenar el carácter
            caracterArray[index][1] = e.getValue(); // Almacenar el conteo
            index++;
        }
        return caracterArray;
    }

    public static void printCharacters(int[][] caracterArray) {
        System.out.println(Arrays.deepToString(caracterArray));

        for (int[] array : caracterArray) {
            char ch = (char) array[0];
            int num = array[1];
            System.out.println("El caracter " + ch + " se repite " + num + " veces.");
        }
    }
}

/*
*
Implementar un programa que, obteniendo una frase del usuario, guarde en un

array multidimensional el conteo de apariciones de cada carácter. Al final deberá imprimir un

resultado con cada caracter seguido del número de apariciones en la frase.

Realizarlo con al menos tres métodos (pedir texto, obtener el array de apariciones e

imprimir).
* */
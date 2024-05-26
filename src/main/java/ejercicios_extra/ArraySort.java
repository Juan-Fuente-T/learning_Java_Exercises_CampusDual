package main.java.ejercicios_extra;

import java.util.Arrays;

public class ArraySort {
    static int[] arrayDesordenado= {121,24,1,258,0,-3,8};

    public static void arraySort(int[] arrayDesordenado) {
        for (int i = 0; i < arrayDesordenado.length; i++) {
            for (int j = i + 1; j < arrayDesordenado.length; j++) {
                if (arrayDesordenado[i] > arrayDesordenado[j]) {
                    int temporalNum = arrayDesordenado[i];
                    arrayDesordenado[i] = arrayDesordenado[j];
                    arrayDesordenado[j] = temporalNum;
                }
            }
        }
    }


//public static void arraySort(int[] arrayDesordenado) { //ENCONTRADO INTERNET
//    boolean intercambio;
//    for (int i = 0; i < arrayDesordenado.length - 1; i++) {
//        intercambio = false;
//        for (int j = 0; j < arrayDesordenado.length - i - 1; j++) {
//            if (arrayDesordenado[j] > arrayDesordenado[j + 1]) {
//                int temporalNum = arrayDesordenado[j];
//                arrayDesordenado[j] = arrayDesordenado[j + 1];
//                arrayDesordenado[j + 1] = temporalNum;
//                intercambio = true;
//            }
//        }
//        if (!intercambio) {
//            break;
//        }
//    }
//}

    public static void arraySortPrint(){
        System.out.println(Arrays.toString(arrayDesordenado));
    }

    public static void main(String[] args) {
        arraySort(arrayDesordenado);
        arraySortPrint();
    }
}
/*
Dado el siguiente array, realizar la ordenación e impresión del array resultado.
int[] arrayDesordenado= {121,24,1,258,0,-3,8}
Realizarlo con dos métodos. Uno para ordenar el array y otro para la impresión.
Deberá realizarse ‘a mano‘ y no mediante ningún método de ordenación como sort.
* */

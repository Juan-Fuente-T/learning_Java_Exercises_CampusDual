package main.java.ejercicios;
/*Conseguir representar por pantalla lo siguiente:
    ABCDEFGHIJKLMNOPQRSTUVWXYZ
    BCDEFGHIJKLMNOPQRSTUVWXYZ
    CDEFGHIJKLMNOPQRSTUVWXYZ
    DEFGHIJKLMNOPQRSTUVWXYZ
    EFGHIJKLMNOPQRSTUVWXYZ
    FGHIJKLMNOPQRSTUVWXYZ
    GHIJKLMNOPQRSTUVWXYZ
    HIJKLMNOPQRSTUVWXYZ
    IJKLMNOPQRSTUVWXYZ
    JKLMNOPQRSTUVWXYZ
    KLMNOPQRSTUVWXYZ
    LMNOPQRSTUVWXYZ
    MNOPQRSTUVWXYZ
    NOPQRSTUVWXYZ
    OPQRSTUVWXYZ
    PQRSTUVWXYZ
    QRSTUVWXYZ
    RSTUVWXYZ
    STUVWXYZ
    TUVWXYZ
    UVWXYZ
    VWXYZ
    WXYZ
    XYZ
    YZ
    Z
*/
import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        imprimirLetras();
    }
    public static void imprimirLetras() {
    char[] alfabeto = new char[26];
    int num = 0;
    alfabeto[0] = 'A';
    for (int i = 1; i < 26; i++) {
        alfabeto[i] = (char) ('A' + i);
    }

    for (int i = 0; i < alfabeto.length; i++ ) {
        char[] result = new char[alfabeto.length - i];
        System.out.println(Arrays.copyOfRange(alfabeto, i, alfabeto.length));
    }
//    Este lo que hace es imprimir eliminando cada vez la ultima letra
//    for (int i = 0; i < alfabeto.length; i++ ){
//        char [] newAlfabeto = Arrays.copyOf(alfabeto, alfabeto.length - i);
//        System.out.println(newAlfabeto);
//    }
    }
}

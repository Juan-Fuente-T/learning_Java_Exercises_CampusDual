package main.java.ejercicios;
///*Mostrar por pantalla los 30 primeros números pares usando primero un while  luego un for*/
public class Ejercicio1 {
    public static void main(String[] args) {
        int baseNum = 1;
        while (baseNum <= 30) {
            System.out.print(baseNum * 2 + " ");
            baseNum++;
        }

        System.out.print("\n");

        for (int i = 1; i <= 30; i++) {
            System.out.print((i * 2) + " ");
        }
    }
}
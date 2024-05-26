package main.java.ejercicios;
/*Calcular el cuadrado de los 20 primeros numeros naturales y mostrarlos por pantalla, usando while y luego for*/

public class Ejercicio2 {
    public static void main(String[] args) {

    int baseNum = 0;
    while(baseNum < 20){
        System.out.print(baseNum * baseNum + " ");
        baseNum++;
    }
        System.out.print(" \n");

    for (int i = 0; i < 20; i++){
        System.out.print(i * i + " ");
    }
    }
}

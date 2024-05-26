package main.java.ejercicios;

public class Ejercicios3 {
    /*Construye un método que, recibiendo por parámetro una letra del abecedario muestre por pantalla cuántas letras
     * le faltan hasta llegar a la Z (sin contar la Ñ)*/
    public static void main(String[] args) {
        contadorLetras('A');
        contadorLetras('T');
        contadorLetras('Z');
    }
    public static void contadorLetras(char letra) {
        char[] alfabeto = new char[26];
        int num = 0;
        alfabeto[0] = 'A';
        for (int i = 1; i < 26; i++) {
            alfabeto[i] = (char) ('A' + i);
        }
        if (letra == 'Z') {
            System.out.println("Ya es la letra Z");
        }else{
            num = 'Z' - letra;
            System.out.println("El número de letras que faltan hasta llegar a la Z es " + num);
            //numero de pasos que habria que dar para convertir una determinada letra en Z
            //por ejemplo, entre Y y Z no hay ninguna letra pero si hay un paso
        }
    }
}

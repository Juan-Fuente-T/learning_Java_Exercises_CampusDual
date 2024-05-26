package main.java.ejercicios_extra;

import java.util.Arrays;

public class Cambio_Euros_2 {
    static double[] formatosMoneda = {200, 100, 50, 20, 10, 5, 1, 0.5, 0.2, 0.1, 0.005, 0.002, 0.001};
    static double valorDeCambio = 250;

    static int formatosMonedaLen = formatosMoneda.length;
    double[][] cambioGuardado;

    public void calcularCambio(double moneda) {
//        double cambio = moneda;
////        int indice = 0;
////
////        for (double n : formatosMoneda) {
////            if (n < valorDeCambio) {
////                break;
////            }
////            indice++;
////        }
//        while (cambio > 0) {
//            int indice = 0;
//            double valorCambio = 1;
//            for (double n : formatosMoneda) {
//                if (n < moneda) {
//                    valorCambio = n;
//                    double kk = Math.floor(moneda / valorCambio);
//                    cambioGuardado[indice][0] = valorCambio;
//                    cambioGuardado[indice][1] = kk;
//                    cambio = moneda % valorCambio;
//                    break;
//                }
//                indice++;
//            }
//            System.out.println(Arrays.deepToString(cambioGuardado));
//
//        }
//    }
        double cambio = moneda;
        int indice = 0;
        while (cambio != 0) {

            if (cambio >= 200) {
                System.out.println("Monedas de 2 euros: " + moneda / 200);
//                devolver %= 200;
                double valorCambio = Math.floor(moneda/200);
                cambioGuardado[indice][0] += valorCambio;
                cambioGuardado[indice][1] = 200;
                indice++;
                cambio -= 200;
                System.out.println(cambio);
            }
            if (cambio >= 100) {
                System.out.println("Monedas de 1 euro: " + moneda / 100);
                double valorCambio = Math.floor(moneda/100);
                cambioGuardado[indice][0] += valorCambio;
                cambioGuardado[indice][1] = 100;
                indice++;
                cambio -= 100;
                System.out.println(cambio);
            }
            if (cambio >= 50) {
                System.out.println("Monedas de 1 euro: " + moneda / 50);
                double valorCambio = Math.floor(moneda/50);
                cambioGuardado[indice][0] += valorCambio;
                cambioGuardado[indice][1] = 50;
                indice++;
                cambio -= 50;
                System.out.println(cambio);
            }
            if (cambio >= 20) {
                System.out.println("Monedas de 1 euro: " + moneda / 20);
                double valorCambio = Math.floor(moneda / 20);
                cambioGuardado[indice][0] += valorCambio;
                cambioGuardado[indice][1] = 20;
                indice++;
                cambio -= 20;
                System.out.println(cambio);
            }
                if (cambio >= 10) {
                    System.out.println("Monedas de 1 euro: " + moneda / 10);
                    double valorCambio = Math.floor(moneda / 10);
                    cambioGuardado[indice][0] = valorCambio;
                    cambioGuardado[indice][1] = 10;
                    indice++;
                    cambio -= 10;
                    System.out.println(cambio);
                }
            if (cambio >= 5) {
                System.out.println("Monedas de 1 euro: " + moneda / 5);
                double valorCambio = Math.floor(moneda/5);
                cambioGuardado[indice][0] += valorCambio;
                cambioGuardado[indice][1] = 5;
                indice++;
                cambio -= 5;
                System.out.println(cambio);
            }
            cambio = 0;
        }
    }
    public static void main(String[] args) {
        Cambio_Euros_2 cambio = new Cambio_Euros_2();
        cambio.calcularCambio(250);
    }
}
package main.java.ejercicios_extra;

import java.util.ArrayList;
import java.util.List;

public class Cambio_Euros {
    static double[] formatosMoneda = {200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};
    static int formatosMonedaLength = formatosMoneda.length;
    static double[][] cambioGuardado = new double[formatosMonedaLength][2];
    static List<double[][]> cambioList = new ArrayList<>();

    public void calcularCambioRecurrente(double valorCambio) {
        int numero = 0;
        for (int i = 0; i < formatosMonedaLength; i++) {
            calcularCambio(valorCambio, numero);
            numero++;
            System.out.println("\n----------------------*******************************-----------------------");
        }
        //System.out.println(Arrays.deepToString(cambioGuardado));
    }

    public void calcularCambio(double valor, int numero) {
        System.out.println("\nCambio introducido: " + valor + "\n");
        for (int i = numero; i < formatosMonedaLength; i++) {
                cambioGuardado[i][0] = formatosMoneda[i];
                cambioGuardado[i][1] = Math.floor(valor / formatosMoneda[i]);
                cambioList.add(cambioGuardado);
                if(cambioGuardado[i][1] > 0){
                    if(formatosMoneda[i] < 5){
                        System.out.println("Se necesita(n): " + cambioGuardado[i][1]
                                + " monedas(s) de " + formatosMoneda[i]);
                    }else{
                        System.out.println("Se necesita(n): " + cambioGuardado[i][1]
                                + " billete(s) de " + formatosMoneda[i]);
                    }
                }
                valor -= formatosMoneda[i] * cambioGuardado[i][1];
        }
        for (int k = 0; k < cambioGuardado[0].length; k++) {
            if(cambioGuardado[k][1] > 0){
            }
        }
    }

    public static void main(String[] args) {
        Cambio_Euros cambio = new Cambio_Euros();
        //Para obtener todos los modos posibles de obtener cambio
        cambio.calcularCambioRecurrente(298.88);
        //Para obtener el mejor modo posible de devolver cambio
        cambio.calcularCambio(377.45, 0);
    }
}
/* REQUISITOS
*
Realizar un programa que, pidiendo una cantidad de dinero en Euros, muestre

por pantalla la cantidad de billetes y monedas necesarios para llegar a esa cantidad.

Para ello deberá tenerse un array unidimensional con los diferentes valores de monedas y

billetes y otro array bidimensional con los billetes necesarios y la cantidad de cada billete.

Por ejemplo: si te pido 250€ podrías:
Darme 5 billetes de 50€
Darme 2 billetes de 100€ y uno de 50€
Darme un billete de 200 y dos de 20 y uno de 10
Darme un billete de 200 y otro de 50
y no digamos monedas...
*
*  */


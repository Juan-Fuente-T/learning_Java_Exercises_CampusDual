package main.java.ejercicios_extra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pruebas {

        static double[] formatosMoneda = {200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};
        static int formatosMonedaLength = formatosMoneda.length;
        static double[][] cambioGuardado = new double[formatosMonedaLength][2];

        public static void calcularCambioRecurrente(double valorCambio) {
            int numero = 0;
            for (int i = 0; i < formatosMonedaLength; i++) {
                calcularCambio(valorCambio, numero);
                numero++;
                System.out.println("\n" + "----------------------*******************************-----------------------" + "\n");
            }
            System.out.println(Arrays.deepToString(cambioGuardado));
        }

        public static void calcularCambio(double valor, int numero) {
            for (int i = numero; i < formatosMonedaLength; i++) {
                cambioGuardado[i][0] = formatosMoneda[i];
                cambioGuardado[i][1] = Math.floor(valor / formatosMoneda[i]);
                if(cambioGuardado[i][1] > 0){
                    System.out.println("Se necesita " + cambioGuardado[i][1] + " de " + formatosMoneda[i]);
                    //System.out.println(formatosMoneda[i]);
                }
                //System.out.println("Valor antes" + valor);
                valor -= formatosMoneda[i] * cambioGuardado[i][1];
                //System.out.println("Valor despues" + valor);
            }
//        System.out.println(Arrays.deepToString(cambioGuardado));
            for (int k = 0; k < cambioGuardado[0].length; k++) {
                if(cambioGuardado[k][1] > 0){
                    // System.out.println("Cambio: " + cambioGuardado[k][0] + " - Cantidad: " + cambioGuardado[k][1]);
                    //System.out.println("HHYY" + cambioList[0][0]);
                }
            }
        }

        public static void calcularCambio2(double valor) {
            for (int i = 0; i < formatosMonedaLength; i++) {
                if (valor % formatosMoneda[i] == 0) {
                    System.out.println("kkkkkkkkkkkkkkkk" + formatosMoneda[1]);
                    System.out.println(Math.floor(valor / formatosMoneda[i]));
                }
            }
        }

        public static void main(String[] args) {
            Pruebas cambio = new Pruebas();
            cambio.calcularCambioRecurrente(298);
//        cambio.calcularCambio2(250);
        }


//    public static void main(String[] args) {
//        // Array con los valores de monedas y billetes
//        double[] valoresMonedasBilletes = {200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};
//
//        // Array bidimensional para almacenar la cantidad de billetes necesarios
//        int[][] billetesNecesarios = new int[valoresMonedasBilletes.length][2];
//
//        // Pedir la cantidad de dinero al usuario
//        System.out.println("Introduce la cantidad de dinero en euros: ");
//        double cantidad = 298;
//
//        // Calcular el cambio
//        calcularCambio(cantidad, valoresMonedasBilletes, billetesNecesarios);
//
//        // Mostrar el resultado
//        System.out.println("**Opciones para obtener " + cantidad + "€:**");
//        for (int i = 0; i < billetesNecesarios.length; i++) {
//            if (billetesNecesarios[i][1] > 0) {
//                if (billetesNecesarios[i][0] == 1) {
//                    System.out.println("- " + billetesNecesarios[i][1] + " moneda de " + billetesNecesarios[i][0] + "€");
//                } else {
//                    System.out.println("- " + billetesNecesarios[i][1] + " billetes de " + billetesNecesarios[i][0] + "€");
//                }
//            }
//        }
//    }
//
//    private static void calcularCambio(double cantidad, double[] valoresMonedasBilletes, int[][] billetesNecesarios) {
//        for (int i = 0; i < valoresMonedasBilletes.length; i++) {
//            billetesNecesarios[i][0] = (int) valoresMonedasBilletes[i];
//            billetesNecesarios[i][1] = (int) (cantidad / valoresMonedasBilletes[i]);
//            cantidad %= valoresMonedasBilletes[i];
//        }
//    }
}


////    public void showContact(String code) {
////        for (Map.Entry<String, Contact> data : data.entrySet()) {
////            if (Objects.equals(data.getValue().getCode(), code)) {
////                System.out.println("Nombre: " + data.getValue().getName() + " " + data.getValue().getSurnames());
////                System.out.println("Telefono: " + data.getValue().getPhone());
////                System.out.println("Código : " + data.getValue().getCode());
////                System.out.println();
////            }
////        }
//        try {
//            Contact selectedContact = this.getContactFromCode(code, data);
//            System.out.println("Nombre: " + selectedContact.getName() + " " + selectedContact.getSurnames());
//            System.out.println("Telefono: " + selectedContact.getPhone());
//            System.out.println("Código : " + selectedContact.getCode());
//            System.out.println();
//        } catch (Exception e) {
//            System.out.println("Código no válido, inténtelo de nuevo." + "\n");
//        }
//    }
//    /**
//     * Obtiene un objeto Contact a partir de su código y el mapa interno de contactos.
//     *
//     * @param code El código del contacto que se busca.
//     * @param data El mapa que contiene los contactos de la agenda.
//     * @return El objeto Contact correspondiente al código proporcionado, o null si no se encuentra.
//     */
//    public Contact getContactFromCode(String code, Map<String, Contact> data) {
//        for (Map.Entry<String, Contact> e : data.entrySet()) {
//            if (e.getValue().getCode().equals(code)) {
//
//                return e.getValue();
//            }
//        }
//        return null;
//    }

//    public double calcularCambio(double moneda) {
//        int indice = 0;
//        double valorCambio = 1;
//        for (double n : formatosMoneda) {
//            if (n < moneda) {
//                valorCambio = n;
//                break;
//            }
//
//        }
//        double kk = moneda / valorCambio;
//        int _kk = (int) kk;
//        System.out.println(valorCambio);
//        System.out.println(_kk);
//        if(cambioGuardado != null) {
//            cambioGuardado[indice][0] = valorCambio;
//            cambioGuardado[indice][1] = _kk;
//            indice++;
//        }
//        double modulo = devolverModulo(moneda % valorCambio); // Obtiene el resto para la siguiente iteración
//        return calcularCambio(modulo); // Llamada recursiva
//
//    }
//    public double calcularCambio(double valor) {
//        if (valor == 0) {
//            return 0;
//        }
//        for (int i = 0; i < formatosMonedaLen; i++) {
//            if (valor % formatosMoneda[i] != 0) {
//                double modulo = valor % formatosMoneda[i];
//                if(modulo >= formatosMoneda[i]) {
//                    System.out.println("Módulo de " + valor + " entre " + formatosMoneda[i] + ": " + modulo);
//                    calcularCambio(modulo);
//                }
//            }
//        }
//        return valor;


//        for(int i = 0; i < formatosMonedaLen; i++){
//            if(valorDeCambio % formatosMoneda[i] != 0){
//                double modulo = valorDeCambio % formatosMoneda[i];
//                for(int j = 0; j < formatosMonedaLen; j++){
//                    this.cambioGuardado[i][j] = valorDeCambio % formatosMoneda[i];
//                    //this.cambioGuardado[i] = formatosMoneda[i];
//                    }
//            }
//        }
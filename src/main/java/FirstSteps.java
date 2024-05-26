package main.java;

import com.sun.jdi.FloatType;

public class FirstSteps {
    public static void main(String[] args){
        System.out.println("Hola, Mundo");
        //Asignaciones de variables y tipos de datos
        int numeroEntero = 42;
        //long ? = ;
        double numeroDecimal = 3.14;
        float numeroFloat = 3.14f;
        char caracter= 'A'; //deben ser comillas simples
        boolean esVerdadero  = true;
        String cadenaTexto = "Hola";//deben ser comillas dobles
        final int CONST = 44; //final valor constante se usa -> final y MAYUSCULAS

        //CONVERSIONES DE TIPO
        String cnv = "200";
        Integer cnv_int = Integer.parseInt(cnv);
        String cnv_str = Integer.toString(cnv_int);
        Character cnv_chr = cnv.charAt(0);
        String cnv_chr_str = Character.toString(cnv_chr);
        Double cnv_dbl = Double.parseDouble((cnv));
        String cnv_dbl_str = String.valueOf(cnv_dbl);
        Float cnv_flt = Float.parseFloat(cnv);
        String cnv_flt_str = Float.toString(cnv_flt);
        Boolean cnv_bool = Boolean.valueOf(cnv);
        String cnv_bool_str = String.valueOf("true");

        String cnv1 = "100";
        String cnv2 = "200";

        Integer cnv1_int = Integer.parseInt(cnv1);
        Integer cnv2_int = Integer.parseInt(cnv2);
        Integer cnv_int2 = Integer.parseInt(cnv2);
        Double cnv1_dbl = Double.parseDouble(cnv1);
        Double cnv2_dbl = Double.parseDouble(cnv2);
        Double cnv_dbl2 = Double.parseDouble(cnv2);
        Float cnv1_flt = Float.parseFloat(cnv1);
        Float cnv2_flt = Float.parseFloat(cnv2);
        Float cnv_flt2 = Float.parseFloat(cnv2);

        Character cnv1_chr = cnv1.charAt(2);
        Character cnv2_chr = cnv2.charAt(1);
        Character cvn_chr2 = cnv2.charAt(0);
        Boolean cnv1_bool = Boolean.valueOf("true");
        Boolean cnv2_bool = Boolean.valueOf("false");
        Boolean cnv_bool2 = Boolean.valueOf("true");

        String int_str = Integer.toString(cnv1_int);
        String int1_str = Integer.toString(cnv1_int);
        String dbl_str2 = String.valueOf(cnv1_dbl);
        String dbl_str = String.valueOf(cnv2_dbl);
        String flt_str = Float.toString(cnv1_flt);
        String flt2_str = Float.toString(cnv2_flt);
        //Por que no usar toString() con Double???
        String dbl2_str = Double.toString(cnv_dbl2);

        String chr_str = cnv1_chr.toString();
        String shr_str2 = cnv2_chr.toString();
        String bool_str = String.valueOf(cnv1_bool);
        String bool_str2 = String.valueOf(cnv2_bool);


        String a = String.valueOf(cnv_int);//string desde integer
        String b = String.valueOf(cnv2_dbl);//string desde double
        String c = String.valueOf(cnv1_flt);//string desde float
        String d = String.valueOf(cnv_bool);// string desde booleano
        String e = Character.toString(cnv_chr);// string desde character
        String vd = String.valueOf("false");

//        String cnv = "200";
//        Integer cnv_int = Integer.parseInt(cnv);
//        String cnv_str = Integer.toString(cnv_int);
//        Character cnv_chr = cnv.charAt(0);
//        String cnv_str_chr = Character.toString(cnv_chr);
//        Double cnv_dbl = Double.parseDouble(cnv_str);
//        String cnv_dbl_str = String.valueOf(cnv_dbl);
//        Float cnv_flt = Float.parseFloat(cnv);
//        String cnv_flt_str = Float.toString(cnv_flt);
//        Boolean cnv_bool = Boolean.valueOf("true");
//        String cnv_bool_str = String.valueOf(cnv_bool);
    }
}

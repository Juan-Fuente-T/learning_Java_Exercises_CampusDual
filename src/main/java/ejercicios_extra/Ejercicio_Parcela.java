package main.java.ejercicios_extra;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class Ejercicio_Parcela {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader(new File("src/main/java/ejercicios_extra/Parcelas.txt")))) {
            String linea = "";
            String[] arrayLine;
            ArrayList<Parcela> listaParcelas = new ArrayList<>();
            while ((linea = br.readLine()) != null) {
                arrayLine = linea.split("-");
                arrayLine[4] = arrayLine[4].replace(";", "");
                String calle = arrayLine[0];
                int numero = Integer.parseInt(arrayLine[1]);
                String poblacion = arrayLine[2];
                String provincia = arrayLine[3];
                int metrosCuadrados = Integer.parseInt(arrayLine[4]);
                Parcela parcela = new Parcela(calle, numero, poblacion, provincia, metrosCuadrados);
                listaParcelas.add(parcela);
            }
            for (Parcela p:listaParcelas) {
                System.out.println(p.getDetails());
            }
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: no se ha encontrado el fichero");
            e.printStackTrace();
        } catch (IOException ex) {
            System.out.println("ERROR: ha fallado la lectura del fichero");
            ex.printStackTrace();
        }
    }
}
/**
 * Dada la siguiente clase Parcela, y el fichero parcelas.txt realizar un programa que lea los
 * datos de diferentes parcelas del fichero y cree un ArrayList de objetos de tipo Parcela (llena de los
 * objetos obtenidos del fichero).
 * Para esto, los datos del fichero tendrán el orden siguiente:
 * calle
 * número
 * poblacion
 * provincia
 * metros cuadrados
 * Cada dato irá separado del siguiente por un - y la separación entre parcelas será un ;
 * Por ejemplo, si tenemos un fichero con los siguientes datos:
 * Avda del Ejercito-17-A Coruña-A Coruña-175;Calle de la Palloza-5-A Coruña-A Coruña-150
 * Tendremos que crear un ArrayList con dos objetos de tipo Parcela que tendrán los datos:
 * Avda del Ejercito
 * 17
 * A Coruña
 * A Coruña
 * 175
 * y
 * Calle de la Palloza
 * 5
 * A Coruña
 * A Coruña
 * 150
 * Para obtener los datos de cada parcela del fichero de texto podeis utilizar el método split de String, que
 * parte una cadena de texto según una expresión regular (o, por ejemplo, según un a cadena de un
 * caracter).
 */


package main.java.ejercicios;
/*Crear un programa que:
 * 1º Tiene que aparecer por pantalla un mensaje de saludo con vuestro nombre
 * 2º Tiene que comprobar si vuestro usuario y contraseña son correctos
 *
 * Para ello:
 * Crear un método que reciba por parámetro un String y muestre por pantalla el saludo
 * y vuestro nombe
 *
 * Crear un método que recibiendo por parámetros dos String, compruebe que el usuario
 * es vuestro nombre y la contraseña es la vuestra (ojo a donde creais las variables)
 *
 * Mostrar por pantalla un mensaje que indique si el usuaro y la contraseña son correctos.
 * Un mensaje por cada campo (uno para user, otro para pass).
 *
 * No se pide al usuario que introduzca datos, sólo creais variables y las pasáis a los métodos.
 * Y en ellos se hacen las comprobaciones
 *
 * Cread un main() y desde él llamada a cada método.
 * */
public class Ejercicio5 {
    static String member;
    static String pass = "macarrones";
    public static void main(String[] args) {
        greet("Ataulfo");
        login("Ataulfo", "fideos");
        login("Ataulfo", "macarrones");
    }
    public static void greet(String name){
        member = name;
        System.out.println("Hola ¿qué tal todo hoy, " +  name + "?");
    }

    public static void login(String name, String password){
        if (password.equals(pass)){
        System.out.println("Bienvenido de nuevo, tu user es " +  name + ".");
        System.out.println("Tu contraseña es " +  password + ".");
        }else {
            System.out.println("Inténtalo de nuevo, por favor.");
        }
    }
}

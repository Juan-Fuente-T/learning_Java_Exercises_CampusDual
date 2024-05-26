package main.java;
public class Cat {
    /*
   Crea una clase llamada Cat
   La clase debe tener las siguientes propiedades sin inicializar:
   - nombre (name)
   - raza (breed)
   - sexo (sex)
   - edad en meses (age) (estática)
   - tamaño del pelo (hair)
   - color del pelo (colour) (estática)
   - un booleano que indique si está castrado/a o no (castrated)I

   La clase debe tener las siguientes propiedades con los valores inicializados
   - el color de los ojos (eyeColour): "green"

   @ Crea un constructor que incluya todos los atributos no inicializados

   @ Crea un método estático que cambie el color del pelo y otro no estático que cambie el color de los ojos

   @ Crea un método estático que cambie la edad del gato y otro no estático que permita recuperar ese valor cuando se invoque

   @ Crea un método no estático que pueda castrar a los gatos y otro no estático, llamado isCastrated, que devuelva su estado

   @ Crea un método no estático llamado catDetails() que muestre todas las características de un gato (sé original en la presentación de
   los datos, dale un poco de arte)

   @ Crea un main()

   @ Crea un gato de la raza siamesa, otro de raza persa, y otro de raza esfinge

   @ Castra a los dos primeros gatos cambiando su booleano a true. Deja el otro gato sin castrar (false)

   Cámbiale el color del pelo a los dos primeros gatos

   @ Cámbiale el color de los ojos al último gato

   Cambia la edad del último gato. Intenta ponerle un valor negativo (su setter debe hacer la comprobación)

   Muestra los detalles de cada gato (fijaros qué dato muestra en la edad y el color del pelo)

   Vuelve a hacer el ejercicio en una nueva clase CatEncapsulated, aplicando la encapsulación (atributos private, ninguno estático,
   getters y setters)
   Verás cómo afecta a los métodos estáticos
 */
    //Atributos
    public String name;
    public String breed;
    public String sex;
    public static int age;
    public int hair;
    public static String colour;
    public boolean isCastrated;
    public String eyeColour = "green";

    //Constructor
    public Cat(String name, String breed, String sex, int age, int hair, String colour) {
        this.name = name;
        this.breed = breed;
        this.sex = sex;
        Cat.age = age;
        this.hair = hair;
        Cat.colour = colour;
        this.isCastrated = false; //false por defecto
    }

    public static void setColour(String colour) {
        Cat.colour = colour;
    }

    public void setEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;
    }

    public static void setAge(int age) {
        if(age < 0) {
            System.out.println("No se puede introducir una edad negativa");
        }else{
            Cat.age = age;
        }
    }

    public int getAge() {
        return Cat.age;
    }

    public void setCastrated() {
        this.isCastrated = true;
    }

    public boolean isCastrated() {
        return this.isCastrated;
    }

    public void catDetails(Cat michi) {
        if (michi.sex.equals("gato")) {
            System.out.println("Se trata de un gato " + michi.breed + " llamado " + michi.name + " de " + michi.getAge() +
                    " meses. Tiene el pelo de color " + Cat.colour + " de " +
                    michi.hair + "cm y los ojos de color " + michi.eyeColour + ". Está castrato: " + michi.isCastrated());
        } else {
            System.out.println("Se trata de una gata " + michi.breed + " llamada " + michi.name + " de " + michi.getAge() +
                    " meses. Tiene el pelo de color " + Cat.colour + " de " +
                    michi.hair + "cm y los ojos de color " + michi.eyeColour + ". Está castrada: " + michi.isCastrated());
        }
    }

    public static void main(String[] args) {
        Cat michiSiames = new Cat("Feliciano", "siames", "gato", 5,1, "marrón");
        michiSiames.catDetails(michiSiames);
        Cat michiPersa = new Cat("Chindasvinto", "persa", "gato", 2,2, "blanco");
        michiSiames.catDetails(michiPersa);
        Cat michiEsfinge = new Cat("Hermenegilda", "esfinge", "gata", 7,0, "castaño");
        michiSiames.catDetails(michiEsfinge);
        michiSiames.setCastrated();
        michiPersa.setCastrated();
        Cat.setColour("Negro");//no se puede cambiar solo el color a una instancia de Cat al ser static el atributo colour
        michiEsfinge.setEyeColour("azul");
        //Cat.setAge(-2); //No se puede cambiar la edad solo a una instancia de Cat, al ser static el atributo edad. El check
        //funciona pero deja las edades de todos los gatos iguales.
        michiSiames.catDetails(michiSiames);
        michiSiames.catDetails(michiPersa);
        michiSiames.catDetails(michiEsfinge);
    }

}


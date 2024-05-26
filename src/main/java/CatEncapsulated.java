package main.java;

public class CatEncapsulated {
    //Atributos
    private String name;
    private String breed;
    private String sex;
    private int age;
    private int hair;
    private String colour;
    private boolean isCastrated;
    private String eyeColour = "green";

    //Constructor
    public CatEncapsulated(String name, String breed, String sex, int age, int hair, String colour) {
        this.name = name;
        this.breed = breed;
        this.sex = sex;
        this.age = age;
        this.hair = hair;
        this.colour = colour;
        this.isCastrated = false; //false por defecto, y despues de castrado no es reversible
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public int getAge(){
            return this.age;
    }

    public void setAge(int age) {
        if(age < 0) {
            System.out.println("No se puede introducir una edad negativa");
        }else{
            this.age = age;
        }
    }


    public int getHair() {
        return this.hair;
    }

    public void setHair(int hair) {
        this.hair = hair;
    }

    public String getColour() {
        return this.colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isCastrated() {
        return this.isCastrated;
    }

    public void setCastrated(boolean castrated) {
        this.isCastrated = castrated;
    }

    public String getEyeColour() {
        return eyeColour;
    }

    public void setEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;
    }

//    public void catDetails(Cat michi) {
//        if (michi.sex.equals("gato")) {
//            System.out.println("Se trata de un gato " + michi.breed + " llamado " + michi.name + " de " + michi.getAge() +
//                    " meses. Tiene el pelo de color " + michi.colour + " de " +
//                    michi.hair + "cm y los ojos de color " + michi.eyeColour + ". Está castrato: " + michi.isCastrated());
//        } else {
//            System.out.println("Se trata de una gata " + michi.breed + " llamada " + michi.name + " de " + michi.getAge() +
//                    " meses. Tiene el pelo de color " + michi.colour + " de " +
//                    michi.hair + "cm y los ojos de color " + michi.eyeColour + ". Está castrada: " + michi.isCastrated());
//        }
//    }
    public void catDetails() {
        if (this.sex.equals("gato")) {
            System.out.println("Se trata de un gato " + this.breed + " llamado " + this.name + " de " + this.getAge() +
                    " meses. Tiene el pelo de color " + this.colour + " de " +
                    this.hair + "cm y los ojos de color " + this.eyeColour + ". Está castrato: " + this.isCastrated());
        } else {
            System.out.println("Se trata de una gata " + this.breed + " llamada " + this.name + " de " + this.getAge() +
                    " meses. Tiene el pelo de color " + this.colour + " de " +
                    this.hair + "cm y los ojos de color " + this.eyeColour + ". Está castrada: " + this.isCastrated());
        }
    }
    public static void main(String[] args) {
        Cat michiSiames = new Cat("Feliciano", "siames", "gato", 15,1, "marrón");
        michiSiames.catDetails(michiSiames);
        Cat michiPersa = new Cat("Chindasvinto", "persa", "gato", 32,2, "blanco");
        michiSiames.catDetails(michiPersa);
        Cat michiEsfinge = new Cat("Hermenegilda", "esfinge", "gata", 7,0, "castaño");
        michiSiames.catDetails(michiEsfinge);
        michiSiames.setCastrated();
        michiPersa.setCastrated();
        michiSiames.setColour("Negro");//no se puede cambiar solo el color a una instancia de Cat al ser static
        michiPersa.setColour("Beige");//no se puede cambiar solo el color a una instancia de Cat al ser static
        michiEsfinge.setEyeColour("azul");
        //michiEsfinge.setAge(-2);
        //System.out.println(michiSiames.getColour());
        michiSiames.catDetails(michiSiames);
        michiSiames.catDetails(michiPersa);
        michiSiames.catDetails(michiEsfinge);
    }
}


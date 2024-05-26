package main.java.ejercicios_extra;

public class Parcela {
    protected String calle;
    protected int numero;
    protected String poblacion;
    protected String provincia;
    protected  int metrosCuadrados;

    public Parcela(String calle, int numero, String poblacion, String provincia, int metrosCuadrados){
        this.calle = calle;
        this.numero = numero;
        this.poblacion = poblacion;
        this.provincia = provincia;
        this.metrosCuadrados = metrosCuadrados;
    }

    public String getCalle() {
        return this.calle;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getPoblacion() {
        return this.poblacion;
    }

    public String getProvincia() {
        return this.provincia;
    }

    public int getMetrosCuadrados() {
        return this.metrosCuadrados;
    }

    public String getDetails() {
        StringBuilder builder = new StringBuilder();
        builder.append("Vivienda en ");
        builder.append(this.getCalle());
        builder.append(", ");
        builder.append(this.getNumero());
        builder.append(" de ");
        builder.append(this.getPoblacion());
        builder.append("-");
        builder.append(this.getProvincia());
        builder.append(", de ");
        builder.append(this.getMetrosCuadrados());
        builder.append(" metros cuadrados.");
        return builder.toString();
    }
}

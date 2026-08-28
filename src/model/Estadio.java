package model;

public class Estadio extends Recinto{
    protected String equipoLocal;
    protected  String deporteRealizar;

    public Estadio() {
    }

    public Estadio(String nombre, int capacidad, String equipoLocal, String deporteRealizar) {
        super(nombre, capacidad);
        this.equipoLocal = equipoLocal;
        this.deporteRealizar = deporteRealizar;
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public String getDeporteRealizar() {
        return deporteRealizar;
    }

    public void setDeporteRealizar(String deporteRealizar) {
        this.deporteRealizar = deporteRealizar;
    }

    @Override
    public String toString() {
        return "~~~~ Estadio ~~~~" +
                "\nEquipo Local: " + equipoLocal +
                "\nDeporte a Realizar: " + deporteRealizar +
                "\nNombre: " + nombre +
                "\nCapacidad: " + capacidad ;
    }

    @Override
    public void crearInfo(){
        System.out.println("No faltes al Encuentro de: " + this.equipoLocal);
    }
}

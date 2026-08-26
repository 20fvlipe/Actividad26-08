package model;

public abstract class Recinto {
    protected String nombre;
    protected int capacidad;

    public Recinto() {
    }

    public Recinto(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "~~~~ Recinto ~~~~" +
                "\nombre: " + nombre +
                "\ncapacidad: " + capacidad;
    }
}

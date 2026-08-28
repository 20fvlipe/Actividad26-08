package model;

public class Universidad extends Recinto{
    protected int cantidadCarreras;
    protected boolean estatal;

    public Universidad() {
    }

    public Universidad(String nombre, int capacidad, int cantidadCarreras, boolean estatal) {
        super(nombre, capacidad);
        this.cantidadCarreras = cantidadCarreras;
        this.estatal = estatal;
    }

    public int getCantidadCarreras() {
        return cantidadCarreras;
    }

    public void setCantidadCarreras(int cantidadCarreras) {
        this.cantidadCarreras = cantidadCarreras;
    }

    public boolean isEstatal() {
        return estatal;
    }

    public void setEstatal(boolean estatal) {
        this.estatal = estatal;
    }

    @Override
    public String toString() {
        return "~~~~ Universidad ~~~~" +
                "\nCantidad de Carreras: " + cantidadCarreras +
                "\nEstatal: " + cambiarEstatal() +
                "\nNombre: " + nombre +
                "\nCapacidad: " + capacidad ;
    }

    public String cambiarEstatal(){
        String mensaje = "no";
        if (this.isEstatal()){
            mensaje = "si";
        }
        return mensaje;
    }

    public void crearInfo(){
        System.out.println("Estudia con Nosotros, tenemos " + this.cantidadCarreras + "Carreras");
    }
}

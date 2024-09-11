package Domain;

public abstract class Persona {
    protected String cedula;
    protected String nombre;

    public Persona() {
        cedula = "";
        nombre = "";
    }

    public Persona(String cedula, String Nombre) {
        this.cedula = cedula;
        this.nombre = Nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public abstract String toString();
}

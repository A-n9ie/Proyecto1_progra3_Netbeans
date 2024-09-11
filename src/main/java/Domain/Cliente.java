package Domain;

public class Cliente extends Persona {
    private String correo;
    private String telefono;
    private double descuento;

    public Cliente() {
        super("indefinido","indefinido");
        correo = "indefinido";
        telefono = "indefinido";
        descuento = 0.0;
    }

    public Cliente(String correo, String telefono, double descuento, String cedula, String name) {
        super(cedula, name);
        this.correo = correo;
        this.telefono = telefono;
        this.descuento = descuento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    public String[] getDatosCliente(){
        String[] dataCustomer = {"cedula", "nombre", "telefono", "correo", "descuento"};
        
        return dataCustomer;
    }
    
    public String[] getDatos(){
        String discount = String.valueOf(descuento);
        String[] data = {cedula, nombre, telefono,correo, discount};
        return data;
    }

    @Override
    public String toString() {
        return """
               -Cliente-
               Cedula: """ + cedula + "\n" +
                "Nombre:" + nombre + "\n" +
                "Correo: " + correo + "\n" +
                "Telefono: " + telefono + "\n" +
                "Descuento: " + descuento + "\n";
    }
}

package Domain;

import jakarta.xml.bind.annotation.*;


@XmlRootElement
public class Producto {
    private String codigo;
    private String descripcion;
    private String unidad_m; //Unit of measurement
    private double precio;
    private float descuento;
    private int existencia;
    private String categoria;
    
    public Producto() {
        this.codigo = "indefinido";
        this.descripcion = "indefinida";
        this.unidad_m = "indefinida";
        this.precio = 0.0;
        this.descuento = 0.0f;
        this.existencia = 0;
        this.categoria = "indefinida";
    }

    public Producto(String codigo, String descripcion, String unidad_m, double precio, float descuento, int existencia, String categoria) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.unidad_m = unidad_m;
        this.precio = precio;
        this.descuento = descuento;
        this.existencia = existencia;
        this.categoria = categoria;
    }
@XmlAttribute
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
@XmlElement
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
@XmlElement
    public String getUnidad_m() {
        return unidad_m;
    }

    public void setUnidad_m(String unidad_m) {
        this.unidad_m = unidad_m;
    }
@XmlElement
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
@XmlElement
    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }
@XmlElement
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
@XmlElement
    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }
    
    public void venderProducto(int cant){
        existencia -= cant;
    }
    
    public String[] getDatosProducto(){
        String[] dataProduct = {"codigo", "descripcion", "unidad_m", "precio", "descuento", "existencia", "categoria"};
        return dataProduct;
    }
    
    public String[] getDatos(){
        String price = String.valueOf(precio);
        String discount = String.valueOf(descuento);
        String existence = String.valueOf(existencia);
        String[] data = {codigo, descripcion, unidad_m, price, discount, existence, categoria};
        return data;
    }

    @Override
    public String toString() {
        return """
               -Producto-
               Codigo: """ + codigo + "\n" +
                "Descripcion: " + descripcion + "\n" +
                "Unidad de medida: " + unidad_m + "\n" +
                "Precio: " + precio + "\n" +
                "Descuento: " + descuento + "\n" +
                "Existencia: " + existencia + "\n" +
                "Categoria: " + categoria + "\n";
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

/**
 *
 * @author angie
 */
public class DecoradorProducto extends DecoradorAbstracto {
    
    private Producto producto; 

    public DecoradorProducto(Producto producto, int cantidad, Compra article) {
        super(cantidad, article);
        this.producto = producto;
    }

    @Override
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public double importe() {
        return cantidad * precioNeto();
    }

    @Override
    public double precioNeto() {
        double neto = producto.getPrecio() - (producto.getPrecio() * producto.getDescuento());
        return neto;
    }

    @Override
    public double subtotal() {
       return articulo.subtotal() + importe();
    }

    @Override
    public double iva() {
        return (subtotal() * 0.13);
    }

    @Override
    public int canTotal() {
        return articulo.canTotal() + cantidad;
    }
    
    public String[] getDatosDecorador(){
     String[] dataFactura = {"cantidad"};
     return dataFactura;
    }
    
    public String[] getDatos(){
        String[] data = {String.valueOf(cantidad)};
        return data;
    }
    
    @Override
    public String toString(){
        String s = "";

	if (producto != null) {
        s = producto.getCodigo() + "\t" + producto.getDescripcion() +
                "\t" + producto.getCategoria() + "\t" + cantidad + "\t"
                + producto.getPrecio() + "\t" + producto.getDescuento() + "\t" 
                + precioNeto() + "\t" + importe() + "\n" + articulo.toString();
	}

	return s;
    }
}

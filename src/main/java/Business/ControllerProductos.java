package Business;

import Data.ArchivosXML;
import Data.ListaProductos;
import Data.MiniSuper;
import Domain.Categoria;
import Domain.DetalleVenta;
import Domain.Producto;
import Presentation.GUIFacturar;
import Presentation.VentanaBuscar;
import jakarta.xml.bind.JAXBException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControllerProductos {
    private GUIFacturar gFacturar;
    private LogicBuscar logvBuscar;
    private LogicProductos logProductos;
    private LogicEstadistica logEsta;
    private Producto producto;
    private ArchivosXML guardaXMl;
    private List<Producto> listaProductos;
    private List<Categoria> listaCategorias;
    private MiniSuper mercadito;
    private ControllerPDF contPDF;

    public ControllerProductos(GUIFacturar gFacturar, MiniSuper m) throws JAXBException {
        this.gFacturar = gFacturar;
        this.mercadito = m;
        this.listaProductos = m.getListaProductos();
        this.listaCategorias = m.getListaCategorias();
        this.logProductos = new LogicProductos(gFacturar, listaProductos);
        this.logEsta = new LogicEstadistica(mercadito.getListaFacturas(), gFacturar, mercadito.getListaCategorias());
        this.logvBuscar = new LogicBuscar(listaProductos);
        this.producto = new Producto();
        this.guardaXMl = new ArchivosXML();
        this.contPDF = new ControllerPDF();
    }

    public void getVentanaProductos() {
        guardar();
        modificar();
        limpiar();
        buscar();
        reporte();
        eliminar();
    }
    
    private void guardarCategoria(Producto producto){
        if(mercadito.buscarCategoria(producto.getCategoria().getNombre()) == false){
            listaCategorias.add(producto.getCategoria());
        actualizarCategorias();
        }
    }
    
    private void guardar(){
        gFacturar.addGuardarProductoBtn(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo = gFacturar.getCodigoTf();
                String descripcion = gFacturar.getDescripcionTf();
                String unidad = gFacturar.getUnidadTf();
                String precio = gFacturar.getPrecioTf();
                String desc = gFacturar.getDescProductoTf();
                String existencias = gFacturar.getExistenciasTf();
                String categoria = gFacturar.getCategoriaTf();
                

                if (codigo.isEmpty() || descripcion.isEmpty() || unidad.isEmpty() || precio.isEmpty() || desc.isEmpty() || existencias.isEmpty() || categoria.isEmpty()) {
                    gFacturar.notify("Ingrese toda la informacion solicitada");
                } else {
                    float descNum = Float.parseFloat(desc);
                    if(descNum >= 1)
                    descNum/=100;
                    
                    if(mercadito.buscarProducto(codigo) == null){
                    producto = new Producto(codigo, descripcion, unidad, Float.parseFloat(precio), descNum, Integer.parseInt(existencias), categoria);
                    

                    if (listaProductos == null) {
                        listaProductos = new ArrayList<>();
                    }
                    listaProductos.add(producto);
                    guardarCategoria(producto);
                    actualizarProductos();
                    } else
                       gFacturar.notify("El codigo del producto pertenece al sistema");
                }
            }
        });
    }
    
    private void modificar(){
        gFacturar.addModificarProductoBtn(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo = gFacturar.getCodigoTf();
                String descripcion = gFacturar.getDescripcionTf();
                String unidad = gFacturar.getUnidadTf();
                String precio = gFacturar.getPrecioTf();
                String desc = gFacturar.getDescProductoTf();
                String existencias = gFacturar.getExistenciasTf();
                String categoria = gFacturar.getCategoriaTf();
                String buscarNombre = gFacturar.getBusquedacCod();

                if (buscarNombre.isEmpty()) {
                    gFacturar.notify("Ingrese un Nombre");
                    return;
                }
                producto = mercadito.buscarProducto(buscarNombre);
                if (producto != null){
                    if (codigo.isEmpty() || descripcion.isEmpty() || unidad.isEmpty() || precio.isEmpty() || desc.isEmpty() || existencias.isEmpty() || categoria.isEmpty()) {
                        gFacturar.notify("Ingrese toda la informacion solicitada");
                    } else {
                        float descNum = Float.parseFloat(desc);
                         float pre = Float.parseFloat(precio);
                        if(descNum >= 1)
                        descNum/=100;

                        producto.setCodigo(codigo);
                        producto.setDescripcion(descripcion);
                        producto.setDescuento(descNum);
                        producto.setCategoria(new Categoria(categoria));
                        producto.setExistencia(Integer.parseInt(existencias));
                        producto.setPrecio(pre);
                        producto.setUnidad_m(unidad);

                        actualizarProductos();
                    }
                }else{
                    gFacturar.notify("No se encontro el producto");
                }
            }
        });

    }
    
    private void limpiar(){
        gFacturar.addLimpiarProductosBtn(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gFacturar.setCodigoTf("");
                gFacturar.setCategoriaTf("");
                gFacturar.setUnidadTf("");
                gFacturar.setPrecioTf("");
                gFacturar.setDescripcionTf("");
                gFacturar.setExistenciasTf("");
                gFacturar.setCategoriaTf("");
            }
        });
    }
    
    private void buscar(){
         gFacturar.addBuscarProductoBtn(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String buscarNombre = gFacturar.getBusquedacCod();

                if (buscarNombre.isEmpty()) {
                    gFacturar.notify("Ingrese un Nombre");
                    return;
                }
                producto = mercadito.buscarProducto(buscarNombre);

                if (producto != null) {
                    gFacturar.setCodigoTf(producto.getCodigo());
                    gFacturar.setDescripcionTf(producto.getDescripcion());
                    gFacturar.setUnidadTf(producto.getUnidad_m());
                    gFacturar.setPrecioTf(String.valueOf(producto.getPrecio()));
                    gFacturar.setDescProductoTf(String.valueOf(producto.getDescuento()));
                    gFacturar.setExistenciasTf(String.valueOf(producto.getExistencia()));
                    gFacturar.setCategoriaTf(String.valueOf(producto.getCategoria()));
                    producto = null;
                    return;
                }
                else{
                    gFacturar.notify("No se encontro el producto");
                }
            }

        });
    }
    
    private void reporte(){
        gFacturar.addReporteProductosBtn(new ActionListener(){
           
           @Override
           public void actionPerformed(ActionEvent e) {
             String buscarNombre = gFacturar.getBusquedacCod();
            
               if(buscarNombre.isEmpty()){
                   gFacturar.notify("Ingrese un Nombre");
                   return;
               }
                producto = mercadito.buscarProducto(buscarNombre);

               if(producto != null){
                   contPDF.mostrarProductoPDF(producto);
                   contPDF.getvPDF().setVisible(true);
               }
               else{
                    gFacturar.notify("No se encontro el producto");
                }
                   
           }
           
       });
    }
    
    private void eliminar(){
        gFacturar.addBorrarProductosBtn(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int productoSeleccionado = gFacturar.getTableProductosNuevos().getSelectedRow();

                if (productoSeleccionado < 0) {
                    gFacturar.notify("Seleccione el producto que desea eliminar");
                } else {
                    JTable tablaProductos = gFacturar.getTableProductosNuevos();
                    DefaultTableModel model = (DefaultTableModel) tablaProductos.getModel();

                    String codigoProducto = (String) model.getValueAt(productoSeleccionado, 0);

                    listaProductos.removeIf(producto -> producto.getCodigo().equals(codigoProducto));

                    model.removeRow(productoSeleccionado);

                    actualizarProductos();
                }
            }
        });
    }

    public void actualizarProductoEnGUI(Producto producto) {
        gFacturar.setProducto(producto);

        for (int i = 0; i < listaProductos.size(); i++) {
            if (listaProductos.get(i).getCodigo().equals(producto.getCodigo())) {
                listaProductos.set(i, producto);
                break;
            }
        }

        try {
            ArchivosXML.guardarProductos(listaProductos);
        } catch (JAXBException ex) {
            ex.printStackTrace();
            gFacturar.notify("Error al guardar los datos.");
        }
    }

    private void actualizarListaProductos(Producto productoActualizado) {
        for (int i = 0; i < listaProductos.size(); i++) {
            if (listaProductos.get(i).getCodigo().equals(productoActualizado.getCodigo())) {
                listaProductos.set(i, productoActualizado);
                break;
            }
        }
    }

    public void actualizarProductoCantidad(Producto producto, int cantidad) {
        if (producto != null) {
            Producto productoActualizado = listaProductos.stream()
                    .filter(p -> p.getCodigo().equals(producto.getCodigo()))
                    .findFirst()
                    .orElse(null);

            if (productoActualizado != null) {
                if (cantidad <= productoActualizado.getExistencia()) {
                    productoActualizado.venderProducto(cantidad);

                    actualizarListaProductos(productoActualizado);

                    actualizarProductos();
                } else {
                    System.out.println("La cantidad sobrepasa la existencia del producto");
                }
            } else {
                System.out.println("El producto no se encuentra en la lista");
            }
        }
    }

    private void actualizarProductos() {
        try {
             ArchivosXML.guardarProductos(listaProductos);
             mercadito.restablecerProductos();
             logProductos.actualizarLista();
             logvBuscar.actualizarLista();
        } catch (JAXBException ex) {
            ex.printStackTrace();
            System.out.println("Error al guardar los datos.");
        }
    }
    
    private void actualizarCategorias() {
        try {
             ArchivosXML.guardarCategorias(listaCategorias);
             mercadito.restablecerCategorias();
             logEsta.llenarCategorias();
        } catch (JAXBException ex) {
            ex.printStackTrace();
            System.out.println("Error al guardar los datos.");
        }
    }

    void agregarProducto(DetalleVenta detalle) {
        if (detalle != null && detalle.getProducto() != null) {
            JTable tablis = gFacturar.getTablaArticulos();
            DefaultTableModel model = (DefaultTableModel) tablis.getModel();

            if (detalle.getCantidad() <= detalle.getProducto().getExistencia()) {
                Object[] datos = {
                    detalle.getProducto().getCodigo(),
                    detalle.getProducto().getDescripcion(),
                    detalle.getCategoria(),
                    detalle.getCantidad(),
                    detalle.getProducto().getPrecio(),
                    detalle.getProducto().getDescuento(),
                    detalle.precioNeto(),
                    detalle.importe()
                };

                model.insertRow(0, datos);

                Producto productoActualizado = detalle.getProducto();
                //productoActualizado.venderProducto(detalle.getCantidad());

                gFacturar.setExistenciasTf(String.valueOf(productoActualizado.getExistencia()));

                actualizarListaProductos(productoActualizado);

                try {
                    ArchivosXML.guardarProductos(listaProductos);
                } catch (JAXBException ex) {
                    ex.printStackTrace();
                    gFacturar.notify("Error al guardar los datos.");
                }
            } else {
                gFacturar.notify("La cantidad a vender excede la existencia del producto.");
            }
        }
    }
    
    public void realizarCompra(List<DetalleVenta> detalles){
        for(DetalleVenta d: detalles){
            mercadito.buscarProducto(d.getProducto().getCodigo()).venderProducto(d.getCantidad());
        }
        listaProductos = mercadito.getListaProductos();
        actualizarProductos();
                 
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public boolean productoComprado(String nom) {
        JTable tablis = gFacturar.getTablaArticulos();
        DefaultTableModel model = (DefaultTableModel) tablis.getModel();

        for (int i = 0; i < model.getRowCount(); i++) {
            if (model.getValueAt(i, 1).equals(nom) || model.getValueAt(i, 0).equals(nom)) {
                return true;
            }
        }

        return false;
    }

    void cambiarValores(int fila, DetalleVenta detalle) {
        if (detalle != null && detalle.getProducto() != null) {
            JTable tablis = gFacturar.getTablaArticulos();
            DefaultTableModel model = (DefaultTableModel) tablis.getModel();

            if (detalle.getCantidad() <= detalle.getProducto().getExistencia()) {
                Object[] datos = {
                    detalle.getProducto().getCodigo(),
                    detalle.getProducto().getDescripcion(),
                    detalle.getCategoria(),
                    detalle.getCantidad(),
                    detalle.getProducto().getPrecio(),
                    detalle.getProducto().getDescuento(),
                    detalle.precioNeto(),
                    detalle.importe()
                };
                for (int j = 0; j < model.getColumnCount(); j++) {
                    model.setValueAt(datos[j], fila, j);
                }
            }
        }
    }

    public LogicBuscar getLogvBuscar() {
        return logvBuscar;
    }

}


package Presentation;


import Data.ListaClientes;
import Domain.Cajero;
import Domain.Cliente;
import Domain.Producto;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.*;

import Business.ControllerClientes;
import Business.ControllerCajeros;

public class GUIFacturar extends javax.swing.JFrame {

    private Producto producto;
    
    public GUIFacturar() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jTableFacturar = new javax.swing.JTabbedPane();
        panelFunciones = new javax.swing.JPanel();
        funciones = new javax.swing.JPanel();
        cobrarBtn = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        cantidadBtn = new javax.swing.JButton();
        eliminarBtn = new javax.swing.JButton();
        descuentoBtn = new javax.swing.JButton();
        cancelarBtn = new javax.swing.JButton();
        agregar = new javax.swing.JPanel();
        agregarBtn = new javax.swing.JButton();
        codigoProducto = new javax.swing.JTextField();
        codigoPng = new javax.swing.JLabel();
        comboBoxCliente = new javax.swing.JPanel();
        comboBoxClientes = new javax.swing.JComboBox<>();
        clientesPng = new javax.swing.JLabel();
        tableProductos = new javax.swing.JScrollPane();
        tablaArticulos = new javax.swing.JTable();
        comboBoxCajeros = new javax.swing.JPanel();
        jComboBoxcjaeros = new javax.swing.JComboBox<>();
        cajerosPng = new javax.swing.JLabel();
        Totales = new javax.swing.JPanel();
        panelClientes = new javax.swing.JPanel();
        clientes = new javax.swing.JPanel();
        datosClientes = new javax.swing.JPanel();
        idClientesLb = new javax.swing.JLabel();
        nombreClientesLb = new javax.swing.JLabel();
        telefonoClientesLb = new javax.swing.JLabel();
        idClientesTf = new javax.swing.JTextField();
        nombreClientesTf = new javax.swing.JTextField();
        telefonoClientesTf = new javax.swing.JTextField();
        emailClientesLb = new javax.swing.JLabel();
        emailClientesTf = new javax.swing.JTextField();
        descClientesLb = new javax.swing.JLabel();
        descClientesTf = new javax.swing.JTextField();
        guardarClientesBtn = new javax.swing.JButton();
        limpiarClientesBtn = new javax.swing.JButton();
        borrarClientesBtn = new javax.swing.JButton();
        busquedaClientes = new javax.swing.JPanel();
        nombreBudqClientesLb = new javax.swing.JLabel();
        nombreBusqClientesTf = new javax.swing.JTextField();
        busqClientesBtn = new javax.swing.JButton();
        reporteClientesBtn = new javax.swing.JButton();
        ScrollPaneClientes = new javax.swing.JScrollPane();
        clientesTable = new javax.swing.JTable();
        panelCajeros = new javax.swing.JPanel();
        cajereos = new javax.swing.JPanel();
        datosClientes1 = new javax.swing.JPanel();
        idCajeroLb = new javax.swing.JLabel();
        idCajeroTf = new javax.swing.JTextField();
        nombreCajeroLb = new javax.swing.JLabel();
        nombreCajeroTf = new javax.swing.JTextField();
        guardarCajeroBtn = new javax.swing.JButton();
        limpiarCajeroBtn = new javax.swing.JButton();
        borrarCajeroBtn = new javax.swing.JButton();
        busquedaCajeros = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        buscaNombreCajeroTf = new javax.swing.JTextField();
        buscarCajeroBtn = new javax.swing.JButton();
        reporteCajeroBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableCajeros = new javax.swing.JTable();
        panelProductos = new javax.swing.JPanel();
        productos = new javax.swing.JPanel();
        datosClientes11 = new javax.swing.JPanel();
        codigoPLb = new javax.swing.JLabel();
        descripcionPLb = new javax.swing.JLabel();
        unidadPLb = new javax.swing.JLabel();
        codigoProductoTf = new javax.swing.JTextField();
        descripcionProductoTf = new javax.swing.JTextField();
        unidadMTf = new javax.swing.JTextField();
        precioProductoLB = new javax.swing.JLabel();
        precioPTf = new javax.swing.JTextField();
        descPLb = new javax.swing.JLabel();
        descPTf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        existenciasPTF = new javax.swing.JTextField();
        Categoria = new javax.swing.JLabel();
        categoriaTf = new javax.swing.JTextField();
        guardarProductoBtn = new javax.swing.JButton();
        limpiarProductoBtn = new javax.swing.JButton();
        borrarProductoBtn = new javax.swing.JButton();
        busquedaClientes1 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        buscarProductoPorNombre = new javax.swing.JTextField();
        buscarProductoBtn = new javax.swing.JButton();
        rerporteProductoBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableProductosNuevos = new javax.swing.JTable();
        panelEstadistica = new javax.swing.JPanel();
        datosLb = new javax.swing.JPanel();
        desdeAnioCb = new javax.swing.JComboBox<>();
        hastaAnioCb = new javax.swing.JComboBox<>();
        desdeFechaCb = new javax.swing.JComboBox<>();
        hastaFechaCb = new javax.swing.JComboBox<>();
        desdeLb = new javax.swing.JLabel();
        hastaLb = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        categoriasLb = new javax.swing.JLabel();
        categoriasCb = new javax.swing.JComboBox<>();
        checkBtn = new javax.swing.JButton();
        dobleCheckBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableFacturar.setToolTipText("");

        funciones.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "FUNCIONES"));

        cobrarBtn.setText("COBRAR");
        cobrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cobrarBtnActionPerformed(evt);
            }
        });

        buscar.setText("BUSCAR");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        cantidadBtn.setText("CANTIDAD");
        cantidadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadBtnActionPerformed(evt);
            }
        });

        eliminarBtn.setText("ELIMINAR");

        descuentoBtn.setText("DESCUENTO");

        cancelarBtn.setText("CANCELAR");

        javax.swing.GroupLayout funcionesLayout = new javax.swing.GroupLayout(funciones);
        funciones.setLayout(funcionesLayout);
        funcionesLayout.setHorizontalGroup(
            funcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(funcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cobrarBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cantidadBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eliminarBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descuentoBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelarBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        funcionesLayout.setVerticalGroup(
            funcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(funcionesLayout.createSequentialGroup()
                .addGroup(funcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cobrarBtn)
                    .addComponent(buscar)
                    .addComponent(cantidadBtn)
                    .addComponent(eliminarBtn)
                    .addComponent(descuentoBtn)
                    .addComponent(cancelarBtn))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        agregar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "PRODUCTO"));

        agregarBtn.setText("AGREGAR");
        agregarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarBtnActionPerformed(evt);
            }
        });

        codigoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout agregarLayout = new javax.swing.GroupLayout(agregar);
        agregar.setLayout(agregarLayout);
        agregarLayout.setHorizontalGroup(
            agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, agregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(codigoPng)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(codigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(agregarBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        agregarLayout.setVerticalGroup(
            agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarLayout.createSequentialGroup()
                .addGroup(agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(codigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(agregarBtn))
                    .addComponent(codigoPng, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        comboBoxCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "CLIENTE"));

        comboBoxClientes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        comboBoxClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxClientesActionPerformed(evt);
            }
        });

        clientesPng.setToolTipText("");

        javax.swing.GroupLayout comboBoxClienteLayout = new javax.swing.GroupLayout(comboBoxCliente);
        comboBoxCliente.setLayout(comboBoxClienteLayout);
        comboBoxClienteLayout.setHorizontalGroup(
            comboBoxClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, comboBoxClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clientesPng)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(comboBoxClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        comboBoxClienteLayout.setVerticalGroup(
            comboBoxClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(comboBoxClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(clientesPng)
        );

        tablaArticulos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tablaArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Articulo", "Categoria", "Cantidad", "Precio", "Descuento", "Neto", "Importe"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Float.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaArticulos.setGridColor(new java.awt.Color(204, 204, 204));
        tablaArticulos.setInheritsPopupMenu(true);
        tablaArticulos.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tableProductos.setViewportView(tablaArticulos);

        comboBoxCajeros.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "CAJERO"));

        jComboBoxcjaeros.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout comboBoxCajerosLayout = new javax.swing.GroupLayout(comboBoxCajeros);
        comboBoxCajeros.setLayout(comboBoxCajerosLayout);
        comboBoxCajerosLayout.setHorizontalGroup(
            comboBoxCajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, comboBoxCajerosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cajerosPng)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jComboBoxcjaeros, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        comboBoxCajerosLayout.setVerticalGroup(
            comboBoxCajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jComboBoxcjaeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(cajerosPng)
        );

        Totales.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "TOTALES"));

        javax.swing.GroupLayout TotalesLayout = new javax.swing.GroupLayout(Totales);
        Totales.setLayout(TotalesLayout);
        TotalesLayout.setHorizontalGroup(
            TotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        TotalesLayout.setVerticalGroup(
            TotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelFuncionesLayout = new javax.swing.GroupLayout(panelFunciones);
        panelFunciones.setLayout(panelFuncionesLayout);
        panelFuncionesLayout.setHorizontalGroup(
            panelFuncionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFuncionesLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(panelFuncionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelFuncionesLayout.createSequentialGroup()
                        .addComponent(comboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboBoxCajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tableProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(panelFuncionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFuncionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(funciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Totales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelFuncionesLayout.setVerticalGroup(
            panelFuncionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFuncionesLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panelFuncionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboBoxCajeros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboBoxCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(tableProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(funciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(Totales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jTableFacturar.addTab("FACTURAR", panelFunciones);

        datosClientes.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Clientes"));

        idClientesLb.setText("ID");
        idClientesLb.setToolTipText("");

        nombreClientesLb.setText("Nombre");
        nombreClientesLb.setToolTipText("");

        telefonoClientesLb.setText("Telefono");
        telefonoClientesLb.setToolTipText("");

        emailClientesLb.setText("Email");

        descClientesLb.setText("Descuento");

        javax.swing.GroupLayout datosClientesLayout = new javax.swing.GroupLayout(datosClientes);
        datosClientes.setLayout(datosClientesLayout);
        datosClientesLayout.setHorizontalGroup(
            datosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(datosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(datosClientesLayout.createSequentialGroup()
                        .addComponent(telefonoClientesLb)
                        .addGap(18, 18, 18)
                        .addComponent(telefonoClientesTf))
                    .addGroup(datosClientesLayout.createSequentialGroup()
                        .addComponent(nombreClientesLb)
                        .addGap(18, 18, 18)
                        .addComponent(nombreClientesTf))
                    .addGroup(datosClientesLayout.createSequentialGroup()
                        .addComponent(idClientesLb)
                        .addGap(18, 18, 18)
                        .addComponent(idClientesTf, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(datosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(datosClientesLayout.createSequentialGroup()
                        .addComponent(emailClientesLb)
                        .addGap(18, 18, 18)
                        .addComponent(emailClientesTf, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(datosClientesLayout.createSequentialGroup()
                        .addComponent(descClientesLb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(descClientesTf, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        datosClientesLayout.setVerticalGroup(
            datosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosClientesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(datosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idClientesLb)
                    .addComponent(idClientesTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailClientesLb)
                    .addComponent(emailClientesTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(datosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreClientesLb)
                    .addComponent(nombreClientesTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descClientesLb)
                    .addComponent(descClientesTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(datosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonoClientesLb)
                    .addComponent(telefonoClientesTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        guardarClientesBtn.setText("Guardar");

        limpiarClientesBtn.setText("Limpiar");
        limpiarClientesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarClientesBtnActionPerformed(evt);
            }
        });

        borrarClientesBtn.setText("Borrar ");

        busquedaClientes.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Busqueda"));

        nombreBudqClientesLb.setText("Nombre");

        busqClientesBtn.setText("Buscar");

        reporteClientesBtn.setText("Reporte");

        javax.swing.GroupLayout busquedaClientesLayout = new javax.swing.GroupLayout(busquedaClientes);
        busquedaClientes.setLayout(busquedaClientesLayout);
        busquedaClientesLayout.setHorizontalGroup(
            busquedaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(busquedaClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombreBudqClientesLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nombreBusqClientesTf, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(busqClientesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(reporteClientesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        busquedaClientesLayout.setVerticalGroup(
            busquedaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(busquedaClientesLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(busquedaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreBudqClientesLb)
                    .addGroup(busquedaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nombreBusqClientesTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(busqClientesBtn)
                        .addComponent(reporteClientesBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        clientesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Telefono", "Email", "Descuento"
            }
        ));
        clientesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientesTableMouseClicked(evt);
            }
        });
        ScrollPaneClientes.setViewportView(clientesTable);

        javax.swing.GroupLayout clientesLayout = new javax.swing.GroupLayout(clientes);
        clientes.setLayout(clientesLayout);
        clientesLayout.setHorizontalGroup(
            clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(busquedaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ScrollPaneClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(clientesLayout.createSequentialGroup()
                        .addComponent(datosClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(guardarClientesBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(limpiarClientesBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(borrarClientesBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        clientesLayout.setVerticalGroup(
            clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientesLayout.createSequentialGroup()
                .addGroup(clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(clientesLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(datosClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(clientesLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(guardarClientesBtn)
                        .addGap(39, 39, 39)
                        .addComponent(limpiarClientesBtn)
                        .addGap(44, 44, 44)
                        .addComponent(borrarClientesBtn)))
                .addGap(18, 18, 18)
                .addComponent(busquedaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(ScrollPaneClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelClientesLayout = new javax.swing.GroupLayout(panelClientes);
        panelClientes.setLayout(panelClientesLayout);
        panelClientesLayout.setHorizontalGroup(
            panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelClientesLayout.setVerticalGroup(
            panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTableFacturar.addTab("CLIENTES", panelClientes);

        datosClientes1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cajeros"));

        idCajeroLb.setText("ID");
        idCajeroLb.setToolTipText("");

        nombreCajeroLb.setText("Nombre");

        javax.swing.GroupLayout datosClientes1Layout = new javax.swing.GroupLayout(datosClientes1);
        datosClientes1.setLayout(datosClientes1Layout);
        datosClientes1Layout.setHorizontalGroup(
            datosClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosClientes1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(idCajeroLb)
                .addGap(18, 18, 18)
                .addComponent(idCajeroTf, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nombreCajeroLb)
                .addGap(18, 18, 18)
                .addComponent(nombreCajeroTf, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        datosClientes1Layout.setVerticalGroup(
            datosClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosClientes1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(datosClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idCajeroLb)
                    .addComponent(idCajeroTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreCajeroLb)
                    .addComponent(nombreCajeroTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        guardarCajeroBtn.setText("Guardar");

        limpiarCajeroBtn.setText("Limpiar");
        limpiarCajeroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarCajeroBtnActionPerformed(evt);
            }
        });

        borrarCajeroBtn.setText("Borrar ");

        busquedaCajeros.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Busqueda"));

        jLabel12.setText("Nombre");

        buscarCajeroBtn.setText("Buscar");

        reporteCajeroBtn.setText("Reporte");

        javax.swing.GroupLayout busquedaCajerosLayout = new javax.swing.GroupLayout(busquedaCajeros);
        busquedaCajeros.setLayout(busquedaCajerosLayout);
        busquedaCajerosLayout.setHorizontalGroup(
            busquedaCajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(busquedaCajerosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buscaNombreCajeroTf, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buscarCajeroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(reporteCajeroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        busquedaCajerosLayout.setVerticalGroup(
            busquedaCajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(busquedaCajerosLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(busquedaCajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(busquedaCajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buscaNombreCajeroTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buscarCajeroBtn)
                        .addComponent(reporteCajeroBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableCajeros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Nombre"
            }
        ));
        jScrollPane2.setViewportView(tableCajeros);

        javax.swing.GroupLayout cajereosLayout = new javax.swing.GroupLayout(cajereos);
        cajereos.setLayout(cajereosLayout);
        cajereosLayout.setHorizontalGroup(
            cajereosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cajereosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cajereosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cajereosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(busquedaCajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cajereosLayout.createSequentialGroup()
                        .addComponent(datosClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(cajereosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(guardarCajeroBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(limpiarCajeroBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(borrarCajeroBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        cajereosLayout.setVerticalGroup(
            cajereosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cajereosLayout.createSequentialGroup()
                .addGroup(cajereosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cajereosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(datosClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cajereosLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(guardarCajeroBtn)
                        .addGap(39, 39, 39)
                        .addComponent(limpiarCajeroBtn)
                        .addGap(44, 44, 44)
                        .addComponent(borrarCajeroBtn)))
                .addGap(18, 18, 18)
                .addComponent(busquedaCajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelCajerosLayout = new javax.swing.GroupLayout(panelCajeros);
        panelCajeros.setLayout(panelCajerosLayout);
        panelCajerosLayout.setHorizontalGroup(
            panelCajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cajereos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelCajerosLayout.setVerticalGroup(
            panelCajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cajereos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTableFacturar.addTab("CAJEROS", panelCajeros);

        datosClientes11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Productos"));

        codigoPLb.setText("Codigo");
        codigoPLb.setToolTipText("");

        descripcionPLb.setText("Descripcion");
        descripcionPLb.setToolTipText("");

        unidadPLb.setText("Unidad Medida");
        unidadPLb.setToolTipText("");

        unidadMTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadMTfActionPerformed(evt);
            }
        });

        precioProductoLB.setText("Precio");

        descPLb.setText("Descuento");

        jLabel1.setText("Existencias");

        existenciasPTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                existenciasPTFActionPerformed(evt);
            }
        });

        Categoria.setText("Categoria");

        javax.swing.GroupLayout datosClientes11Layout = new javax.swing.GroupLayout(datosClientes11);
        datosClientes11.setLayout(datosClientes11Layout);
        datosClientes11Layout.setHorizontalGroup(
            datosClientes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosClientes11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(datosClientes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(datosClientes11Layout.createSequentialGroup()
                        .addComponent(unidadPLb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(unidadMTf))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, datosClientes11Layout.createSequentialGroup()
                        .addComponent(descripcionPLb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(descripcionProductoTf, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(datosClientes11Layout.createSequentialGroup()
                        .addComponent(codigoPLb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(codigoProductoTf, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(datosClientes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(datosClientes11Layout.createSequentialGroup()
                        .addGroup(datosClientes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(descPLb))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(datosClientes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(existenciasPTF, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(descPTf)))
                    .addGroup(datosClientes11Layout.createSequentialGroup()
                        .addComponent(Categoria)
                        .addGap(18, 18, 18)
                        .addComponent(categoriaTf))
                    .addGroup(datosClientes11Layout.createSequentialGroup()
                        .addComponent(precioProductoLB)
                        .addGap(18, 18, 18)
                        .addComponent(precioPTf, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        datosClientes11Layout.setVerticalGroup(
            datosClientes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosClientes11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(datosClientes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoPLb)
                    .addComponent(codigoProductoTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precioProductoLB)
                    .addComponent(precioPTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(datosClientes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descripcionProductoTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descripcionPLb)
                    .addComponent(descPLb)
                    .addComponent(descPTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(datosClientes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unidadMTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unidadPLb)
                    .addComponent(jLabel1)
                    .addComponent(existenciasPTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(datosClientes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Categoria)
                    .addComponent(categoriaTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        guardarProductoBtn.setText("Guardar");

        limpiarProductoBtn.setText("Limpiar");
        limpiarProductoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarProductoBtnActionPerformed(evt);
            }
        });

        borrarProductoBtn.setText("Borrar ");

        busquedaClientes1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Busqueda"));

        jLabel63.setText("Nombre");

        buscarProductoBtn.setText("Buscar");

        rerporteProductoBtn.setText("Reporte");

        javax.swing.GroupLayout busquedaClientes1Layout = new javax.swing.GroupLayout(busquedaClientes1);
        busquedaClientes1.setLayout(busquedaClientes1Layout);
        busquedaClientes1Layout.setHorizontalGroup(
            busquedaClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(busquedaClientes1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel63)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buscarProductoPorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buscarProductoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rerporteProductoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        busquedaClientes1Layout.setVerticalGroup(
            busquedaClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(busquedaClientes1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(busquedaClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel63)
                    .addGroup(busquedaClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buscarProductoPorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buscarProductoBtn)
                        .addComponent(rerporteProductoBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableProductosNuevos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Descripcion", "Unidad", "Precio", "Descuento", "Existencias", "Categoria"
            }
        ));
        jScrollPane3.setViewportView(tableProductosNuevos);

        javax.swing.GroupLayout productosLayout = new javax.swing.GroupLayout(productos);
        productos.setLayout(productosLayout);
        productosLayout.setHorizontalGroup(
            productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(busquedaClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(productosLayout.createSequentialGroup()
                        .addComponent(datosClientes11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(guardarProductoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(limpiarProductoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(borrarProductoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        productosLayout.setVerticalGroup(
            productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productosLayout.createSequentialGroup()
                .addGroup(productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(productosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(datosClientes11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(productosLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(guardarProductoBtn)
                        .addGap(39, 39, 39)
                        .addComponent(limpiarProductoBtn)
                        .addGap(44, 44, 44)
                        .addComponent(borrarProductoBtn)))
                .addGap(18, 18, 18)
                .addComponent(busquedaClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelProductosLayout = new javax.swing.GroupLayout(panelProductos);
        panelProductos.setLayout(panelProductosLayout);
        panelProductosLayout.setHorizontalGroup(
            panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelProductosLayout.setVerticalGroup(
            panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTableFacturar.addTab("PRODUCTOS", panelProductos);

        datosLb.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos"));

        desdeAnioCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        hastaAnioCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        desdeFechaCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        hastaFechaCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        desdeLb.setText("Desde");

        hastaLb.setText("Hasta");

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Categoria", "", "", ""
            }
        ));
        jScrollPane5.setViewportView(tablaProductos);

        categoriasLb.setText("Categorias");

        categoriasCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        checkBtn.setText("jButton16");

        dobleCheckBtn.setText("jButton17");

        javax.swing.GroupLayout datosLbLayout = new javax.swing.GroupLayout(datosLb);
        datosLb.setLayout(datosLbLayout);
        datosLbLayout.setHorizontalGroup(
            datosLbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosLbLayout.createSequentialGroup()
                .addGroup(datosLbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datosLbLayout.createSequentialGroup()
                        .addGroup(datosLbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(datosLbLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(desdeLb))
                            .addGroup(datosLbLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(hastaLb)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(datosLbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(desdeAnioCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hastaAnioCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(datosLbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(desdeFechaCb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hastaFechaCb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(datosLbLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(datosLbLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(categoriasLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(categoriasCb, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(checkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dobleCheckBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        datosLbLayout.setVerticalGroup(
            datosLbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosLbLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(datosLbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desdeAnioCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desdeFechaCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desdeLb))
                .addGap(27, 27, 27)
                .addGroup(datosLbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hastaAnioCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hastaFechaCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hastaLb))
                .addGap(26, 26, 26)
                .addGroup(datosLbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoriasLb)
                    .addComponent(categoriasCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkBtn)
                    .addComponent(dobleCheckBtn))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Grafico"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 235, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelEstadisticaLayout = new javax.swing.GroupLayout(panelEstadistica);
        panelEstadistica.setLayout(panelEstadisticaLayout);
        panelEstadisticaLayout.setHorizontalGroup(
            panelEstadisticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstadisticaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(datosLb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelEstadisticaLayout.setVerticalGroup(
            panelEstadisticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstadisticaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(datosLb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
            .addGroup(panelEstadisticaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTableFacturar.addTab("ESTADISTICAS", panelEstadistica);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 701, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 506, Short.MAX_VALUE)
        );

        jTableFacturar.addTab("HISTORICO", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTableFacturar, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTableFacturar, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codigoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoProductoActionPerformed
   
    }//GEN-LAST:event_codigoProductoActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed

    }//GEN-LAST:event_buscarActionPerformed

    private void cantidadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadBtnActionPerformed

    }//GEN-LAST:event_cantidadBtnActionPerformed

    private void agregarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarBtnActionPerformed

    }//GEN-LAST:event_agregarBtnActionPerformed

    private void cobrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cobrarBtnActionPerformed

    }//GEN-LAST:event_cobrarBtnActionPerformed

    private void limpiarClientesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarClientesBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_limpiarClientesBtnActionPerformed

    private void limpiarCajeroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarCajeroBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_limpiarCajeroBtnActionPerformed

    private void limpiarProductoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarProductoBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_limpiarProductoBtnActionPerformed

    private void clientesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_clientesTableMouseClicked

    private void comboBoxClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxClientesActionPerformed

    private void existenciasPTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_existenciasPTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_existenciasPTFActionPerformed

    private void unidadMTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadMTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unidadMTfActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Categoria;
    private javax.swing.JScrollPane ScrollPaneClientes;
    private javax.swing.JPanel Totales;
    private javax.swing.JPanel agregar;
    private javax.swing.JButton agregarBtn;
    private javax.swing.JButton borrarCajeroBtn;
    private javax.swing.JButton borrarClientesBtn;
    private javax.swing.JButton borrarProductoBtn;
    private javax.swing.JTextField buscaNombreCajeroTf;
    private javax.swing.JButton buscar;
    private javax.swing.JButton buscarCajeroBtn;
    private javax.swing.JButton buscarProductoBtn;
    private javax.swing.JTextField buscarProductoPorNombre;
    private javax.swing.JButton busqClientesBtn;
    private javax.swing.JPanel busquedaCajeros;
    private javax.swing.JPanel busquedaClientes;
    private javax.swing.JPanel busquedaClientes1;
    private javax.swing.JPanel cajereos;
    private javax.swing.JLabel cajerosPng;
    private javax.swing.JButton cancelarBtn;
    private javax.swing.JButton cantidadBtn;
    private javax.swing.JTextField categoriaTf;
    private javax.swing.JComboBox<String> categoriasCb;
    private javax.swing.JLabel categoriasLb;
    private javax.swing.JButton checkBtn;
    private javax.swing.JPanel clientes;
    private javax.swing.JLabel clientesPng;
    private javax.swing.JTable clientesTable;
    private javax.swing.JButton cobrarBtn;
    private javax.swing.JLabel codigoPLb;
    private javax.swing.JLabel codigoPng;
    private javax.swing.JTextField codigoProducto;
    private javax.swing.JTextField codigoProductoTf;
    private javax.swing.JPanel comboBoxCajeros;
    private javax.swing.JPanel comboBoxCliente;
    private javax.swing.JComboBox<Cliente> comboBoxClientes;
    private javax.swing.JPanel datosClientes;
    private javax.swing.JPanel datosClientes1;
    private javax.swing.JPanel datosClientes11;
    private javax.swing.JPanel datosLb;
    private javax.swing.JLabel descClientesLb;
    private javax.swing.JTextField descClientesTf;
    private javax.swing.JLabel descPLb;
    private javax.swing.JTextField descPTf;
    private javax.swing.JLabel descripcionPLb;
    private javax.swing.JTextField descripcionProductoTf;
    private javax.swing.JButton descuentoBtn;
    private javax.swing.JComboBox<String> desdeAnioCb;
    private javax.swing.JComboBox<String> desdeFechaCb;
    private javax.swing.JLabel desdeLb;
    private javax.swing.JButton dobleCheckBtn;
    private javax.swing.JButton eliminarBtn;
    private javax.swing.JLabel emailClientesLb;
    private javax.swing.JTextField emailClientesTf;
    private javax.swing.JTextField existenciasPTF;
    private javax.swing.JPanel funciones;
    private javax.swing.JButton guardarCajeroBtn;
    private javax.swing.JButton guardarClientesBtn;
    private javax.swing.JButton guardarProductoBtn;
    private javax.swing.JComboBox<String> hastaAnioCb;
    private javax.swing.JComboBox<String> hastaFechaCb;
    private javax.swing.JLabel hastaLb;
    private javax.swing.JLabel idCajeroLb;
    private javax.swing.JTextField idCajeroTf;
    private javax.swing.JLabel idClientesLb;
    private javax.swing.JTextField idClientesTf;
    private javax.swing.JComboBox<Cajero> jComboBoxcjaeros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable5;
    private javax.swing.JTabbedPane jTableFacturar;
    private javax.swing.JButton limpiarCajeroBtn;
    private javax.swing.JButton limpiarClientesBtn;
    private javax.swing.JButton limpiarProductoBtn;
    private javax.swing.JLabel nombreBudqClientesLb;
    private javax.swing.JTextField nombreBusqClientesTf;
    private javax.swing.JLabel nombreCajeroLb;
    private javax.swing.JTextField nombreCajeroTf;
    private javax.swing.JLabel nombreClientesLb;
    private javax.swing.JTextField nombreClientesTf;
    private javax.swing.JPanel panelCajeros;
    private javax.swing.JPanel panelClientes;
    private javax.swing.JPanel panelEstadistica;
    private javax.swing.JPanel panelFunciones;
    private javax.swing.JPanel panelProductos;
    private javax.swing.JTextField precioPTf;
    private javax.swing.JLabel precioProductoLB;
    private javax.swing.JPanel productos;
    private javax.swing.JButton reporteCajeroBtn;
    private javax.swing.JButton reporteClientesBtn;
    private javax.swing.JButton rerporteProductoBtn;
    private javax.swing.JTable tablaArticulos;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTable tableCajeros;
    private javax.swing.JScrollPane tableProductos;
    private javax.swing.JTable tableProductosNuevos;
    private javax.swing.JLabel telefonoClientesLb;
    private javax.swing.JTextField telefonoClientesTf;
    private javax.swing.JTextField unidadMTf;
    private javax.swing.JLabel unidadPLb;
    // End of variables declaration//GEN-END:variables
    
    
    //-------------FACTURAR----------------
    public void addCobrarBtn(ActionListener listener){
        cobrarBtn.addActionListener(listener);
    }
    
    public void addBuscarBtn(ActionListener listener){
        buscar.addActionListener(listener);
    }
    
    public void addDescuentoBtn(ActionListener listener){
        descuentoBtn.addActionListener(listener);
    }
    
    public void addCantidadBtn(ActionListener listener){
        cantidadBtn.addActionListener(listener);
    }
    
    public void addEliminarBtn(ActionListener listener){
        eliminarBtn.addActionListener(listener);
    }
    public String getCodigoProducto(){
        return codigoProducto.getText();
    }
    
    public void setCodigoProducto(String string){
        this.codigoProducto.setText(string);
    }
    
    public void notify(String message) {
    JOptionPane.showMessageDialog(null, message);
    }

    public void addAgregarBtn(ActionListener listener) {
        agregarBtn.addActionListener(listener);
    }
    
    public void addCancelarBtm(ActionListener listener) {
        cancelarBtn.addActionListener(listener);
    }

    public JTable getTablaArticulos() {
        return tablaArticulos;
    }

    public JComboBox<Cliente> getCBClientes() { return comboBoxClientes; }
    
    public JComboBox<Cajero> getCBCajeros(){
        return jComboBoxcjaeros;
    }

    //-----------CLIENTES---------------

    public String getIDClienteTf(){
        return idClientesTf.getText();
    }
    
    public void setIDClienteTf(String string){
        this.idClientesTf.setText(string);
    }

    public String getNombreClienteTf(){
        return nombreClientesTf.getText();
    }
    
    public void setNombreClienteTf(String string){
        this.nombreClientesTf.setText(string);
    }
    
    public String getTelefonoClienteTf(){
        return telefonoClientesTf.getText();
    }
    
    public void setTelefonoClienteTf(String string){
        this.telefonoClientesTf.setText(string);
    }
    
    public String getEmailClienteTf(){
        return emailClientesTf.getText();
    }
    
    public void setEmailClienteTf(String string){
        this.emailClientesTf.setText(string);
    }
    
    public String getDescClienteTf(){
        return descClientesTf.getText();
    }
    
    public void setDescClienteTf(String string){
        this.descClientesTf.setText(string);
    }
    
    public void addGuardarClienteBtn(ActionListener listener){
        guardarClientesBtn.addActionListener(listener);
    }
    
    public void addLimpiarClientesBtn(ActionListener listener){
        limpiarClientesBtn.addActionListener(listener);
    }
     
    public void addEliminarClienteBtn(ActionListener listener){
        borrarClientesBtn.addActionListener(listener);
    }
    
    public void addBuscarClienteBtn(ActionListener listener){
        busqClientesBtn.addActionListener(listener);
    }
    
    public void addReporteClienteBtn(ActionListener listener){
        reporteClientesBtn.addActionListener(listener);
    }
    
    public String getNombreBusq(){
        return nombreBusqClientesTf.getText();
    }
    public JTable getTableClientes(){ 
        return clientesTable;
    }

    public void cargarClientes(List<Cliente> listaClientes) {
        DefaultComboBoxModel<Cliente> model = new DefaultComboBoxModel<>();
        for (Cliente cliente : listaClientes) {
            model.addElement(cliente);
        }
        comboBoxClientes.setModel(model);
    }

    //-----------Cajeros-----------------
      public String getIDCajeroTf(){
        return idCajeroTf.getText();
    }
    
    public void setIDCajeroTf(String string){
        this.idCajeroTf.setText(string);
    }

    public String getNombreCajeroTf(){
        return nombreCajeroTf.getText();
    }
    
    public void setNombreCajeroTf(String string){
        this.nombreCajeroTf.setText(string);
    }
    
    public void addGuardarCajeroBtn(ActionListener listener){
        guardarCajeroBtn.addActionListener(listener);
    }
    
    public void addLimpiarCajeroBtn(ActionListener listener){
        limpiarCajeroBtn.addActionListener(listener);
    }
     
    public void addEliminarCajeroBtn(ActionListener listener){
        borrarCajeroBtn.addActionListener(listener);
    }
    
    public void addBuscarNombreCajeroBtn(ActionListener listener){
        buscarCajeroBtn.addActionListener(listener);
    }
    
    public void addReporteCajeroBtn(ActionListener listener){
        reporteCajeroBtn.addActionListener(listener);
    }
    
    public String getNombreBusqCajeros(){
        return buscaNombreCajeroTf.getText();
    }
    public JTable getTableCajeros(){ 
        return tableCajeros;
    }

    public void cargarCajeros(List<Cajero> listaCajeros) {
        DefaultComboBoxModel<Cajero> model = new DefaultComboBoxModel<>();
        for (Cajero cajero : listaCajeros) {
            model.addElement(cajero);
        }
        jComboBoxcjaeros.setModel(model);
    }
    //----------Productos-------------
    public String getCodigoTf(){
        return codigoProductoTf.getText();
    }
    
    public void setCodigoTf(String string){
        this.codigoProductoTf.setText(string);
    }

    public String getDescripcionTf(){
        return descripcionProductoTf.getText();
    }
    
    public void setDescripcionTf(String string){
        this.descripcionProductoTf.setText(string);
    }
    
    public String getUnidadTf(){
        return unidadMTf.getText();
    }
    
    public void setUnidadTf(String string){
        this.unidadMTf.setText(string);
    }
    
    public String getPrecioTf(){
        return precioPTf.getText();
    }
    
    public void setPrecioTf(String string){
        this.precioPTf.setText(string);
    }

    public String getDescProductoTf(){
        return descPTf.getText();
    }
    
    public void setDescProductoTf(String string){
        this.descPTf.setText(string);
    }
    
       public String getExistenciasTf(){
        return existenciasPTF.getText();
    }
    
    public void setExistenciasTf(String string){
        this.existenciasPTF.setText(string);
    }
    
       public String getCategoriaTf(){
        return categoriaTf.getText();
    }
    
    public void setCategoriaTf(String string){
        this.categoriaTf.setText(string);
    }

    public void setProducto(Producto producto) {this.producto = producto; }

    public void addGuardarProductoBtn(ActionListener listener){
        guardarProductoBtn.addActionListener(listener);
    }
    
    public void addLimpiarProductosBtn(ActionListener listener){
        limpiarProductoBtn.addActionListener(listener);
    }
     
    public void addBorrarProductosBtn(ActionListener listener){
        borrarProductoBtn.addActionListener(listener);
    }
    
    public void addBuscarProductoBtn(ActionListener listener){
        buscarProductoBtn.addActionListener(listener);
    }
    
    public void addReporteProductosBtn(ActionListener listener){
        rerporteProductoBtn.addActionListener(listener);
    }

    public String getBusquedacCod(){
        return buscarProductoPorNombre.getText();
    }
    public JTable getTableProductosNuevos(){ 
        return tableProductosNuevos;
    }

    public Producto getProducto() {
        return producto;
    }
}




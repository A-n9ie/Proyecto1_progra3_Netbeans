
package Presentation;


import Domain.Cajero;
import Domain.Categoria;
import Domain.Cliente;
import Domain.Factura;
import Domain.Producto;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import javax.swing.*;


import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;


public class GUIFacturar extends javax.swing.JFrame {

    private Producto producto;
    //private VentanaEstadisticas ventanaEstadisticas;
    public GUIFacturar() {
        //ventanaEstadisticas = new VentanaEstadisticas(obtenerCategorias());
        initComponents();
        
    }
    
    public void agregarGrafica(JFreeChart chart) {
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(panelGrafica.getWidth(), panelGrafica.getHeight())); // Tamaño de la gráfica
        panelGrafica.removeAll(); // Limpia el panel si ya hay algo
        panelGrafica.add(chartPanel, BorderLayout.CENTER); // Agrega la gráfica al panel
        panelGrafica.revalidate(); // Vuelve a validar el panel
        panelGrafica.repaint(); // Repaint para actualizar la interfaz
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
        codigoProducto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        agregarBtn = new javax.swing.JButton();
        comboBoxCliente = new javax.swing.JPanel();
        comboBoxClientes = new javax.swing.JComboBox<>();
        clientesPng = new javax.swing.JLabel();
        iconoCliente = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tableProductos = new javax.swing.JScrollPane();
        tablaArticulos = new javax.swing.JTable();
        comboBoxCajeros = new javax.swing.JPanel();
        jComboBoxcjaeros = new javax.swing.JComboBox<>();
        cajerosPng = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Totales = new javax.swing.JPanel();
        art_txt = new javax.swing.JLabel();
        artsTotal = new javax.swing.JLabel();
        des_txt = new javax.swing.JLabel();
        desTotal = new javax.swing.JLabel();
        sub_txt = new javax.swing.JLabel();
        subTotal = new javax.swing.JLabel();
        totaltt_txt1 = new javax.swing.JLabel();
        totalTotal = new javax.swing.JLabel();
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
        modificarCliente_btn = new javax.swing.JButton();
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
        modificarCajero_btn = new javax.swing.JButton();
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
        modificarProducto_btn = new javax.swing.JButton();
        panelEstadistica = new javax.swing.JPanel();
        datosLb = new javax.swing.JPanel();
        annioInicio = new javax.swing.JComboBox<>();
        annioFinal = new javax.swing.JComboBox<>();
        mesInicio = new javax.swing.JComboBox<>();
        mesFinal = new javax.swing.JComboBox<>();
        desdeLb = new javax.swing.JLabel();
        hastaLb = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableCategorias = new javax.swing.JTable();
        categoriasLb = new javax.swing.JLabel();
        categoriasCb = new javax.swing.JComboBox<>();
        checkBtn = new javax.swing.JButton();
        dobleCheckBtn = new javax.swing.JButton();
        rango_btn = new javax.swing.JButton();
        panelGrafica = new javax.swing.JPanel();
        panelHistorico = new javax.swing.JPanel();
        buscarFactura_txt = new javax.swing.JLabel();
        numFactura = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        listFacturas = new javax.swing.JTextArea();
        buscarFacturaBtn = new javax.swing.JButton();

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
        setTitle("POS: Point Of Sale");

        jTableFacturar.setBackground(java.awt.SystemColor.activeCaption);
        jTableFacturar.setToolTipText("");
        jTableFacturar.setVerifyInputWhenFocusTarget(false);

        panelFunciones.setBackground(new java.awt.Color(255, 255, 255));

        funciones.setBackground(new java.awt.Color(255, 255, 255));
        funciones.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "FUNCIONES"));

        cobrarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/moneda-de-dinero.png"))); // NOI18N
        cobrarBtn.setText("COBRAR");
        cobrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cobrarBtnActionPerformed(evt);
            }
        });

        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lupa_1.png"))); // NOI18N
        buscar.setText("BUSCAR");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        cantidadBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cantidad.png"))); // NOI18N
        cantidadBtn.setText("CANTIDAD");
        cantidadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadBtnActionPerformed(evt);
            }
        });

        eliminarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/quitar-carrito.png"))); // NOI18N
        eliminarBtn.setText("ELIMINAR");

        descuentoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/descuento.png"))); // NOI18N
        descuentoBtn.setText("DESCUENTO");

        cancelarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/boton-eliminar.png"))); // NOI18N
        cancelarBtn.setText("CANCELAR");

        javax.swing.GroupLayout funcionesLayout = new javax.swing.GroupLayout(funciones);
        funciones.setLayout(funcionesLayout);
        funcionesLayout.setHorizontalGroup(
            funcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(funcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cobrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cantidadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eliminarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descuentoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addGap(0, 12, Short.MAX_VALUE))
        );

        agregar.setBackground(new java.awt.Color(255, 255, 255));
        agregar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "PRODUCTO"));

        codigoProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        codigoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoProductoActionPerformed(evt);
            }
        });

        agregarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/agregar-contacto.png"))); // NOI18N
        agregarBtn.setText("AGREGAR");

        javax.swing.GroupLayout agregarLayout = new javax.swing.GroupLayout(agregar);
        agregar.setLayout(agregarLayout);
        agregarLayout.setHorizontalGroup(
            agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarLayout.createSequentialGroup()
                .addGroup(agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(agregarLayout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(jLabel4))
                    .addGroup(agregarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(codigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(agregarBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        agregarLayout.setVerticalGroup(
            agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregarBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        comboBoxCliente.setBackground(new java.awt.Color(255, 255, 255));
        comboBoxCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "CLIENTE"));

        comboBoxClientes.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        comboBoxClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        comboBoxClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxClientesActionPerformed(evt);
            }
        });

        clientesPng.setToolTipText("");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/public-service.png"))); // NOI18N

        javax.swing.GroupLayout comboBoxClienteLayout = new javax.swing.GroupLayout(comboBoxCliente);
        comboBoxCliente.setLayout(comboBoxClienteLayout);
        comboBoxClienteLayout.setHorizontalGroup(
            comboBoxClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, comboBoxClienteLayout.createSequentialGroup()
                .addComponent(iconoCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(comboBoxClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clientesPng)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxClientes, 0, 233, Short.MAX_VALUE)
                .addContainerGap())
        );
        comboBoxClienteLayout.setVerticalGroup(
            comboBoxClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(comboBoxClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(iconoCliente)
            .addComponent(jLabel2)
            .addComponent(clientesPng)
        );

        tablaArticulos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablaArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Articulo", "Categoria", "Cantidad", "Precio", "Descuento", "Neto", "Importe"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Float.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaArticulos.setGridColor(new java.awt.Color(204, 204, 204));
        tablaArticulos.setInheritsPopupMenu(true);
        tablaArticulos.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tableProductos.setViewportView(tablaArticulos);

        comboBoxCajeros.setBackground(new java.awt.Color(255, 255, 255));
        comboBoxCajeros.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "CAJERO"));

        jComboBoxcjaeros.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jComboBoxcjaeros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/salario.png"))); // NOI18N

        javax.swing.GroupLayout comboBoxCajerosLayout = new javax.swing.GroupLayout(comboBoxCajeros);
        comboBoxCajeros.setLayout(comboBoxCajerosLayout);
        comboBoxCajerosLayout.setHorizontalGroup(
            comboBoxCajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, comboBoxCajerosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cajerosPng)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxcjaeros, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        comboBoxCajerosLayout.setVerticalGroup(
            comboBoxCajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(comboBoxCajerosLayout.createSequentialGroup()
                .addComponent(cajerosPng)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jComboBoxcjaeros, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        Totales.setBackground(new java.awt.Color(255, 255, 255));
        Totales.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "TOTALES"));

        art_txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        art_txt.setText("Artículos:");

        artsTotal.setForeground(new java.awt.Color(51, 51, 255));
        artsTotal.setText("0");

        des_txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        des_txt.setText("Descuentos:");

        desTotal.setForeground(new java.awt.Color(51, 51, 255));
        desTotal.setText("0");

        sub_txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sub_txt.setText("Subtotal:");

        subTotal.setForeground(new java.awt.Color(51, 51, 255));
        subTotal.setText("0");

        totaltt_txt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        totaltt_txt1.setText("Total:");

        totalTotal.setForeground(new java.awt.Color(51, 51, 255));
        totalTotal.setText("0");

        javax.swing.GroupLayout TotalesLayout = new javax.swing.GroupLayout(Totales);
        Totales.setLayout(TotalesLayout);
        TotalesLayout.setHorizontalGroup(
            TotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TotalesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(art_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(artsTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(sub_txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(des_txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totaltt_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        TotalesLayout.setVerticalGroup(
            TotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TotalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sub_txt)
                        .addComponent(subTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(des_txt)
                        .addComponent(desTotal))
                    .addGroup(TotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(totaltt_txt1)
                        .addComponent(totalTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(TotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(art_txt)
                        .addComponent(artsTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelFuncionesLayout = new javax.swing.GroupLayout(panelFunciones);
        panelFunciones.setLayout(panelFuncionesLayout);
        panelFuncionesLayout.setHorizontalGroup(
            panelFuncionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFuncionesLayout.createSequentialGroup()
                .addGroup(panelFuncionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFuncionesLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(panelFuncionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFuncionesLayout.createSequentialGroup()
                                .addComponent(comboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboBoxCajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tableProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelFuncionesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelFuncionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFuncionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(funciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Totales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 36, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(funciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Totales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jTableFacturar.addTab("FACTURAR", panelFunciones);

        clientes.setBackground(new java.awt.Color(255, 255, 255));

        datosClientes.setBackground(new java.awt.Color(255, 255, 255));
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

        guardarClientesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/disco-flexible (1).png"))); // NOI18N
        guardarClientesBtn.setText("Guardar");

        limpiarClientesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/limpiar.png"))); // NOI18N
        limpiarClientesBtn.setText("Limpiar");
        limpiarClientesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarClientesBtnActionPerformed(evt);
            }
        });

        borrarClientesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/borrar.png"))); // NOI18N
        borrarClientesBtn.setText("Borrar ");

        busquedaClientes.setBackground(new java.awt.Color(255, 255, 255));
        busquedaClientes.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Busqueda"));

        nombreBudqClientesLb.setText("Nombre");

        busqClientesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lupa.png"))); // NOI18N
        busqClientesBtn.setText("Buscar");

        reporteClientesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/pdf.png"))); // NOI18N
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

            },
            new String [] {
                "ID", "Nombre", "Telefono", "Email", "Descuento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        clientesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientesTableMouseClicked(evt);
            }
        });
        ScrollPaneClientes.setViewportView(clientesTable);

        modificarCliente_btn.setText("Modificar");

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
                            .addComponent(borrarClientesBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(modificarCliente_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(177, Short.MAX_VALUE))
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
                        .addGap(18, 18, 18)
                        .addComponent(limpiarClientesBtn)
                        .addGap(18, 18, 18)
                        .addComponent(modificarCliente_btn)
                        .addGap(24, 24, 24)
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

        cajereos.setBackground(new java.awt.Color(255, 255, 255));

        datosClientes1.setBackground(new java.awt.Color(255, 255, 255));
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

        guardarCajeroBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/disco-flexible (1).png"))); // NOI18N
        guardarCajeroBtn.setText("Guardar");

        limpiarCajeroBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/limpiar.png"))); // NOI18N
        limpiarCajeroBtn.setText("Limpiar");
        limpiarCajeroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarCajeroBtnActionPerformed(evt);
            }
        });

        borrarCajeroBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/borrar.png"))); // NOI18N
        borrarCajeroBtn.setText("Borrar ");

        busquedaCajeros.setBackground(new java.awt.Color(255, 255, 255));
        busquedaCajeros.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Busqueda"));

        jLabel12.setText("Nombre");

        buscarCajeroBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lupa.png"))); // NOI18N
        buscarCajeroBtn.setText("Buscar");

        reporteCajeroBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/pdf.png"))); // NOI18N
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

            },
            new String [] {
                "ID", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableCajeros);

        modificarCajero_btn.setText("Modificar");

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
                            .addComponent(borrarCajeroBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(modificarCajero_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(177, Short.MAX_VALUE))
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
                        .addGap(18, 18, 18)
                        .addComponent(limpiarCajeroBtn)
                        .addGap(18, 18, 18)
                        .addComponent(modificarCajero_btn)
                        .addGap(24, 24, 24)
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

        productos.setBackground(new java.awt.Color(255, 255, 255));

        datosClientes11.setBackground(new java.awt.Color(255, 255, 255));
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datosClientes11Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(precioPTf, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(datosClientes11Layout.createSequentialGroup()
                        .addComponent(Categoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(categoriaTf))
                    .addGroup(datosClientes11Layout.createSequentialGroup()
                        .addGroup(datosClientes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(descPLb))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(datosClientes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descPTf, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(existenciasPTF, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(precioProductoLB))
                .addContainerGap(32, Short.MAX_VALUE))
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

        guardarProductoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/disco-flexible (1).png"))); // NOI18N
        guardarProductoBtn.setText("Guardar");

        limpiarProductoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/limpiar.png"))); // NOI18N
        limpiarProductoBtn.setText("Limpiar");
        limpiarProductoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarProductoBtnActionPerformed(evt);
            }
        });

        borrarProductoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/borrar.png"))); // NOI18N
        borrarProductoBtn.setText("Borrar ");

        busquedaClientes1.setBackground(new java.awt.Color(255, 255, 255));
        busquedaClientes1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Busqueda"));

        jLabel63.setText("Nombre");

        buscarProductoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lupa.png"))); // NOI18N
        buscarProductoBtn.setText("Buscar");

        rerporteProductoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/pdf.png"))); // NOI18N
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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tableProductosNuevos);

        modificarProducto_btn.setText("Modificar");
        modificarProducto_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarProducto_btnActionPerformed(evt);
            }
        });

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
                        .addGap(18, 18, 18)
                        .addGroup(productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(guardarProductoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(limpiarProductoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(borrarProductoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(modificarProducto_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(164, Short.MAX_VALUE))
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
                        .addGap(18, 18, 18)
                        .addComponent(limpiarProductoBtn)
                        .addGap(24, 24, 24)
                        .addComponent(modificarProducto_btn)
                        .addGap(18, 18, 18)
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

        panelEstadistica.setBackground(new java.awt.Color(255, 255, 255));

        datosLb.setBackground(new java.awt.Color(255, 255, 255));
        datosLb.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos"));

        annioInicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024" }));

        annioFinal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024" }));

        mesInicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero (1)", "Febrero (2)", "Marzo (3)", "Abril (4)", "Mayo (5)", "Junio (6)", "Julio (7)", "Agosto (8)", "Septiembre (9)", "Octubre (10)", "Noviembre (11)", "Diciembre (12)" }));

        mesFinal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero (1)", "Febrero (2)", "Marzo (3)", "Abril (4)", "Mayo (5)", "Junio (6)", "Julio (7)", "Agosto (8)", "Septiembre (9)", "Octubre (10)", "Noviembre (11)", "Diciembre (12)" }));

        desdeLb.setText("Desde");

        hastaLb.setText("Hasta");

        tableCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Categoria"
            }
        ));
        jScrollPane5.setViewportView(tableCategorias);

        categoriasLb.setText("Categorias");

        checkBtn.setText("Agregar");

        dobleCheckBtn.setText("Generar");
        dobleCheckBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobleCheckBtnActionPerformed(evt);
            }
        });

        rango_btn.setText("Fechas");
        rango_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rango_btnActionPerformed(evt);
            }
        });

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
                            .addComponent(annioInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(annioFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(datosLbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mesInicio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mesFinal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(datosLbLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(datosLbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(datosLbLayout.createSequentialGroup()
                                .addComponent(categoriasLb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(categoriasCb, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(datosLbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dobleCheckBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))))))
                .addContainerGap())
            .addGroup(datosLbLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(rango_btn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        datosLbLayout.setVerticalGroup(
            datosLbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosLbLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(datosLbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(annioInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desdeLb))
                .addGap(27, 27, 27)
                .addGroup(datosLbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(annioFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hastaLb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rango_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(datosLbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(datosLbLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(datosLbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(categoriasLb)
                            .addComponent(categoriasCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(datosLbLayout.createSequentialGroup()
                        .addComponent(checkBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dobleCheckBtn)))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        panelGrafica.setBackground(new java.awt.Color(255, 255, 255));
        panelGrafica.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Grafico"));

        javax.swing.GroupLayout panelGraficaLayout = new javax.swing.GroupLayout(panelGrafica);
        panelGrafica.setLayout(panelGraficaLayout);
        panelGraficaLayout.setHorizontalGroup(
            panelGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 441, Short.MAX_VALUE)
        );
        panelGraficaLayout.setVerticalGroup(
            panelGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 236, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelEstadisticaLayout = new javax.swing.GroupLayout(panelEstadistica);
        panelEstadistica.setLayout(panelEstadisticaLayout);
        panelEstadisticaLayout.setHorizontalGroup(
            panelEstadisticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstadisticaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(datosLb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelEstadisticaLayout.setVerticalGroup(
            panelEstadisticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstadisticaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(datosLb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
            .addGroup(panelEstadisticaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(panelGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTableFacturar.addTab("ESTADISTICAS", panelEstadistica);

        panelHistorico.setBackground(new java.awt.Color(255, 255, 255));

        buscarFactura_txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buscarFactura_txt.setText("# de Factura");

        numFactura.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        numFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numFacturaActionPerformed(evt);
            }
        });

        listFacturas.setEditable(false);
        listFacturas.setBackground(new java.awt.Color(255, 255, 255));
        listFacturas.setColumns(20);
        listFacturas.setRows(5);
        jScrollPane6.setViewportView(listFacturas);

        buscarFacturaBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lupa.png"))); // NOI18N
        buscarFacturaBtn.setText("Buscar");
        buscarFacturaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarFacturaBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelHistoricoLayout = new javax.swing.GroupLayout(panelHistorico);
        panelHistorico.setLayout(panelHistoricoLayout);
        panelHistoricoLayout.setHorizontalGroup(
            panelHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHistoricoLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(panelHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelHistoricoLayout.createSequentialGroup()
                        .addComponent(buscarFactura_txt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(buscarFacturaBtn)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        panelHistoricoLayout.setVerticalGroup(
            panelHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHistoricoLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(panelHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarFacturaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarFactura_txt))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jTableFacturar.addTab("HISTORICO", panelHistorico);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTableFacturar)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTableFacturar, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed

    }//GEN-LAST:event_buscarActionPerformed

    private void cantidadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadBtnActionPerformed

    }//GEN-LAST:event_cantidadBtnActionPerformed

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

    private void numFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numFacturaActionPerformed

    private void buscarFacturaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarFacturaBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarFacturaBtnActionPerformed

    private void codigoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoProductoActionPerformed

    }//GEN-LAST:event_codigoProductoActionPerformed

    private void modificarProducto_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarProducto_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarProducto_btnActionPerformed

    private void dobleCheckBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobleCheckBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobleCheckBtnActionPerformed

    private void rango_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rango_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rango_btnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Categoria;
    private javax.swing.JScrollPane ScrollPaneClientes;
    private javax.swing.JPanel Totales;
    private javax.swing.JPanel agregar;
    private javax.swing.JButton agregarBtn;
    private javax.swing.JComboBox<String> annioFinal;
    private javax.swing.JComboBox<String> annioInicio;
    private javax.swing.JLabel art_txt;
    private javax.swing.JLabel artsTotal;
    private javax.swing.JButton borrarCajeroBtn;
    private javax.swing.JButton borrarClientesBtn;
    private javax.swing.JButton borrarProductoBtn;
    private javax.swing.JTextField buscaNombreCajeroTf;
    private javax.swing.JButton buscar;
    private javax.swing.JButton buscarCajeroBtn;
    private javax.swing.JButton buscarFacturaBtn;
    private javax.swing.JLabel buscarFactura_txt;
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
    private javax.swing.JComboBox<Categoria> categoriasCb;
    private javax.swing.JLabel categoriasLb;
    private javax.swing.JButton checkBtn;
    private javax.swing.JPanel clientes;
    private javax.swing.JLabel clientesPng;
    private javax.swing.JTable clientesTable;
    private javax.swing.JButton cobrarBtn;
    private javax.swing.JLabel codigoPLb;
    private javax.swing.JTextField codigoProducto;
    private javax.swing.JTextField codigoProductoTf;
    private javax.swing.JPanel comboBoxCajeros;
    private javax.swing.JPanel comboBoxCliente;
    private javax.swing.JComboBox<Cliente> comboBoxClientes;
    private javax.swing.JPanel datosClientes;
    private javax.swing.JPanel datosClientes1;
    private javax.swing.JPanel datosClientes11;
    private javax.swing.JPanel datosLb;
    private javax.swing.JLabel desTotal;
    private javax.swing.JLabel des_txt;
    private javax.swing.JLabel descClientesLb;
    private javax.swing.JTextField descClientesTf;
    private javax.swing.JLabel descPLb;
    private javax.swing.JTextField descPTf;
    private javax.swing.JLabel descripcionPLb;
    private javax.swing.JTextField descripcionProductoTf;
    private javax.swing.JButton descuentoBtn;
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
    private javax.swing.JLabel hastaLb;
    private javax.swing.JLabel iconoCliente;
    private javax.swing.JLabel idCajeroLb;
    private javax.swing.JTextField idCajeroTf;
    private javax.swing.JLabel idClientesLb;
    private javax.swing.JTextField idClientesTf;
    private javax.swing.JComboBox<Cajero> jComboBoxcjaeros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable5;
    private javax.swing.JTabbedPane jTableFacturar;
    private javax.swing.JButton limpiarCajeroBtn;
    private javax.swing.JButton limpiarClientesBtn;
    private javax.swing.JButton limpiarProductoBtn;
    private javax.swing.JTextArea listFacturas;
    private javax.swing.JComboBox<String> mesFinal;
    private javax.swing.JComboBox<String> mesInicio;
    private javax.swing.JButton modificarCajero_btn;
    private javax.swing.JButton modificarCliente_btn;
    private javax.swing.JButton modificarProducto_btn;
    private javax.swing.JLabel nombreBudqClientesLb;
    private javax.swing.JTextField nombreBusqClientesTf;
    private javax.swing.JLabel nombreCajeroLb;
    private javax.swing.JTextField nombreCajeroTf;
    private javax.swing.JLabel nombreClientesLb;
    private javax.swing.JTextField nombreClientesTf;
    private javax.swing.JTextField numFactura;
    private javax.swing.JPanel panelCajeros;
    private javax.swing.JPanel panelClientes;
    private javax.swing.JPanel panelEstadistica;
    private javax.swing.JPanel panelFunciones;
    private javax.swing.JPanel panelGrafica;
    private javax.swing.JPanel panelHistorico;
    private javax.swing.JPanel panelProductos;
    private javax.swing.JTextField precioPTf;
    private javax.swing.JLabel precioProductoLB;
    private javax.swing.JPanel productos;
    private javax.swing.JButton rango_btn;
    private javax.swing.JButton reporteCajeroBtn;
    private javax.swing.JButton reporteClientesBtn;
    private javax.swing.JButton rerporteProductoBtn;
    private javax.swing.JLabel subTotal;
    private javax.swing.JLabel sub_txt;
    private javax.swing.JTable tablaArticulos;
    private javax.swing.JTable tableCajeros;
    private javax.swing.JTable tableCategorias;
    private javax.swing.JScrollPane tableProductos;
    private javax.swing.JTable tableProductosNuevos;
    private javax.swing.JLabel telefonoClientesLb;
    private javax.swing.JTextField telefonoClientesTf;
    private javax.swing.JLabel totalTotal;
    private javax.swing.JLabel totaltt_txt1;
    private javax.swing.JTextField unidadMTf;
    private javax.swing.JLabel unidadPLb;
    // End of variables declaration//GEN-END:variables


    //-------------FACTURAR----------------
    
    public void addCobrarBtn(ActionListener listener) {
        cobrarBtn.addActionListener(listener);
    }

    public void addBuscarBtn(ActionListener listener) {
        buscar.addActionListener(listener);
    }

    public void addDescuentoBtn(ActionListener listener) {
        descuentoBtn.addActionListener(listener);
    }

    public void addCantidadBtn(ActionListener listener) {
        cantidadBtn.addActionListener(listener);
    }

    public void addEliminarBtn(ActionListener listener) {
        eliminarBtn.addActionListener(listener);
    }

    public String getCodigoProducto() {
        return codigoProducto.getText();
    }

    public void setCodigoProducto(String string) {
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

    public JComboBox<Cliente> getCBClientes() {
        return comboBoxClientes;
    }

    public JComboBox<Cajero> getCBCajeros() {
        return jComboBoxcjaeros;
    }

    //-----------CLIENTES---------------

    public String getIDClienteTf() {
        return idClientesTf.getText();
    }

    public void setIDClienteTf(String string) {
        this.idClientesTf.setText(string);
    }

    public String getNombreClienteTf() {
        return nombreClientesTf.getText();
    }

    public void setNombreClienteTf(String string) {
        this.nombreClientesTf.setText(string);
    }

    public String getTelefonoClienteTf() {
        return telefonoClientesTf.getText();
    }

    public void setTelefonoClienteTf(String string) {
        this.telefonoClientesTf.setText(string);
    }

    public String getEmailClienteTf() {
        return emailClientesTf.getText();
    }

    public void setEmailClienteTf(String string) {
        this.emailClientesTf.setText(string);
    }

    public String getDescClienteTf() {
        return descClientesTf.getText();
    }

    public void setDescClienteTf(String string) {
        this.descClientesTf.setText(string);
    }

    public void addGuardarClienteBtn(ActionListener listener) {
        guardarClientesBtn.addActionListener(listener);
    }

    public void addLimpiarClientesBtn(ActionListener listener) {
        limpiarClientesBtn.addActionListener(listener);
    }

    public void addEliminarClienteBtn(ActionListener listener) {
        borrarClientesBtn.addActionListener(listener);
    }

    public void addBuscarClienteBtn(ActionListener listener) {
        busqClientesBtn.addActionListener(listener);
    }

    public void addReporteClienteBtn(ActionListener listener) {
        reporteClientesBtn.addActionListener(listener);
    }

    public String getNombreBusq() {
        return nombreBusqClientesTf.getText();
    }

    public JTable getTableClientes() {
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

    public void setArtsTotal(String txt) {
        this.artsTotal.setText(txt);
    }

    public void setDesTotal(String txt) {
        this.desTotal.setText(txt);
    }

    public void setSubTotal(String txt) {
        this.subTotal.setText(txt);
    }

    public void setTotalTotal(String txt) {
        this.totalTotal.setText(txt);
    }

    public String getTotalTotal() {
        return this.totalTotal.getText();
    }

    public Cliente obtenerClienteCombox(){
        return (Cliente) comboBoxClientes.getSelectedItem();
    }
            
    public Cajero obtenerCajeroCombox(){
        return  (Cajero) jComboBoxcjaeros.getSelectedItem();
    }   

    public JTextArea getListFacturas() {
        return listFacturas;
    }

    public void setListFacturas(JTextArea listFacturas) {
        this.listFacturas = listFacturas;
    }

    

    public String getNumFactura() {
        return numFactura.getText();
    }

    public void setNumFactura(String numFactura) {
        this.numFactura.setText(numFactura);
    }
    
    public void addBuscarFacturaBtn(ActionListener listener){
        this.buscarFacturaBtn.addActionListener(listener);
    }
    
    public void addModificarProductoBtn(ActionListener listener){
        this.modificarProducto_btn.addActionListener(listener);
    }
    
    public void addModificarClienteBtn(ActionListener listener){
        this.modificarCliente_btn.addActionListener(listener);
    }
    
    public void addModificarCajeroBtn(ActionListener listener){
        this.modificarCajero_btn.addActionListener(listener);
    }
    
    //-------Estadisticas----
    /*public VentanaEstadisticas getVentanaEstadisticas() {
        return ventanaEstadisticas;
    }*/

    public JComboBox<Categoria> getCategoriasCb() {
        return categoriasCb;
    }

    public JComboBox<String> getAnnioFinal() {
        return annioFinal;
    }

    public JComboBox<String> getAnnioInicio() {
        return annioInicio;
    }

    public JComboBox<String> getMesFinal() {
        return mesFinal;
    }

    public JComboBox<String> getMesInicio() {
        return mesInicio;
    }

    private List<String> obtenerCategorias() {
        // Implementa la lógica para obtener categorías
        return Arrays.asList("Categoria1", "Categoria2", "Categoria3");
    }

    public JTable getTableCategorias() {
        return tableCategorias;
    }
    
    public void addCheckBtn(ActionListener listener){
        this.checkBtn.addActionListener(listener);
    }
    
    public void addDoubleCheckBtn(ActionListener listener){
        this.dobleCheckBtn.addActionListener(listener);
    }
    
    public void addRangoBtn(ActionListener listener){
        this.rango_btn.addActionListener(listener);
    }

    public JPanel getPanelGrafica() {
        return panelGrafica;
    }
    
    public void cargarCategorias(List<Categoria> listaCategorias) {
        DefaultComboBoxModel<Categoria> model = new DefaultComboBoxModel<>();
        for (Categoria categoria : listaCategorias) {
            model.addElement(categoria);
        }
        this.categoriasCb.setModel(model);
    }
    
    
    
}




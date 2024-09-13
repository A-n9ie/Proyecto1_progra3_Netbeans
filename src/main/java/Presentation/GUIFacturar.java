
package Presentation;


import Domain.Producto;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;


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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        busquedaCajeros = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        panelProductos = new javax.swing.JPanel();
        productos = new javax.swing.JPanel();
        datosClientes11 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jTextField58 = new javax.swing.JTextField();
        jTextField59 = new javax.swing.JTextField();
        jTextField60 = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        jTextField61 = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        jTextField62 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        busquedaClientes1 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jTextField63 = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
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

        comboBoxClientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxClientes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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

        jComboBoxcjaeros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
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
        clientesTable.setColumnSelectionAllowed(true);
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

        jLabel7.setText("ID");
        jLabel7.setToolTipText("");

        jLabel8.setText("Nombre");
        jLabel8.setToolTipText("");

        jLabel9.setText("Telefono");
        jLabel9.setToolTipText("");

        jLabel10.setText("Email");

        jLabel11.setText("Descuento");

        javax.swing.GroupLayout datosClientes1Layout = new javax.swing.GroupLayout(datosClientes1);
        datosClientes1.setLayout(datosClientes1Layout);
        datosClientes1Layout.setHorizontalGroup(
            datosClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosClientes1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(datosClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(datosClientes1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField9))
                    .addGroup(datosClientes1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField8))
                    .addGroup(datosClientes1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(datosClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(datosClientes1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(datosClientes1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        datosClientes1Layout.setVerticalGroup(
            datosClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosClientes1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(datosClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(datosClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(datosClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jButton6.setText("Guardar");

        jButton7.setText("Limpiar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Borrar ");

        busquedaCajeros.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Busqueda"));

        jLabel12.setText("Nombre");

        jButton9.setText("Buscar");

        jButton10.setText("Reporte");

        javax.swing.GroupLayout busquedaCajerosLayout = new javax.swing.GroupLayout(busquedaCajeros);
        busquedaCajeros.setLayout(busquedaCajerosLayout);
        busquedaCajerosLayout.setHorizontalGroup(
            busquedaCajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(busquedaCajerosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        busquedaCajerosLayout.setVerticalGroup(
            busquedaCajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(busquedaCajerosLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(busquedaCajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(busquedaCajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton9)
                        .addComponent(jButton10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable3);

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
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))))
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
                        .addComponent(jButton6)
                        .addGap(39, 39, 39)
                        .addComponent(jButton7)
                        .addGap(44, 44, 44)
                        .addComponent(jButton8)))
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

        jLabel58.setText("ID");
        jLabel58.setToolTipText("");

        jLabel59.setText("Nombre");
        jLabel59.setToolTipText("");

        jLabel60.setText("Telefono");
        jLabel60.setToolTipText("");

        jLabel61.setText("Email");

        jLabel62.setText("Descuento");

        javax.swing.GroupLayout datosClientes11Layout = new javax.swing.GroupLayout(datosClientes11);
        datosClientes11.setLayout(datosClientes11Layout);
        datosClientes11Layout.setHorizontalGroup(
            datosClientes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosClientes11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(datosClientes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(datosClientes11Layout.createSequentialGroup()
                        .addComponent(jLabel60)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField60))
                    .addGroup(datosClientes11Layout.createSequentialGroup()
                        .addComponent(jLabel59)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField59))
                    .addGroup(datosClientes11Layout.createSequentialGroup()
                        .addComponent(jLabel58)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField58, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(datosClientes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(datosClientes11Layout.createSequentialGroup()
                        .addComponent(jLabel61)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField61, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(datosClientes11Layout.createSequentialGroup()
                        .addComponent(jLabel62)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField62, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        datosClientes11Layout.setVerticalGroup(
            datosClientes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosClientes11Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(datosClientes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(jTextField58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61)
                    .addComponent(jTextField61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(datosClientes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(jTextField59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62)
                    .addComponent(jTextField62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(datosClientes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(jTextField60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jButton11.setText("Guardar");

        jButton12.setText("Limpiar");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("Borrar ");

        busquedaClientes1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Busqueda"));

        jLabel63.setText("Nombre");

        jButton14.setText("Buscar");

        jButton15.setText("Reporte");

        javax.swing.GroupLayout busquedaClientes1Layout = new javax.swing.GroupLayout(busquedaClientes1);
        busquedaClientes1.setLayout(busquedaClientes1Layout);
        busquedaClientes1Layout.setHorizontalGroup(
            busquedaClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(busquedaClientes1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel63)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField63, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        busquedaClientes1Layout.setVerticalGroup(
            busquedaClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(busquedaClientes1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(busquedaClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel63)
                    .addGroup(busquedaClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton14)
                        .addComponent(jButton15)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable4);

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
                            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(jButton11)
                        .addGap(39, 39, 39)
                        .addComponent(jButton12)
                        .addGap(44, 44, 44)
                        .addComponent(jButton13)))
                .addGap(18, 18, 18)
                .addComponent(busquedaClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
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

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPaneClientes;
    private javax.swing.JPanel Totales;
    private javax.swing.JPanel agregar;
    private javax.swing.JButton agregarBtn;
    private javax.swing.JButton borrarClientesBtn;
    private javax.swing.JButton buscar;
    private javax.swing.JButton busqClientesBtn;
    private javax.swing.JPanel busquedaCajeros;
    private javax.swing.JPanel busquedaClientes;
    private javax.swing.JPanel busquedaClientes1;
    private javax.swing.JPanel cajereos;
    private javax.swing.JLabel cajerosPng;
    private javax.swing.JButton cancelarBtn;
    private javax.swing.JButton cantidadBtn;
    private javax.swing.JComboBox<String> categoriasCb;
    private javax.swing.JLabel categoriasLb;
    private javax.swing.JButton checkBtn;
    private javax.swing.JPanel clientes;
    private javax.swing.JLabel clientesPng;
    private javax.swing.JTable clientesTable;
    private javax.swing.JButton cobrarBtn;
    private javax.swing.JLabel codigoPng;
    private javax.swing.JTextField codigoProducto;
    private javax.swing.JPanel comboBoxCajeros;
    private javax.swing.JPanel comboBoxCliente;
    private javax.swing.JComboBox<String> comboBoxClientes;
    private javax.swing.JPanel datosClientes;
    private javax.swing.JPanel datosClientes1;
    private javax.swing.JPanel datosClientes11;
    private javax.swing.JPanel datosLb;
    private javax.swing.JLabel descClientesLb;
    private javax.swing.JTextField descClientesTf;
    private javax.swing.JButton descuentoBtn;
    private javax.swing.JComboBox<String> desdeAnioCb;
    private javax.swing.JComboBox<String> desdeFechaCb;
    private javax.swing.JLabel desdeLb;
    private javax.swing.JButton dobleCheckBtn;
    private javax.swing.JButton eliminarBtn;
    private javax.swing.JLabel emailClientesLb;
    private javax.swing.JTextField emailClientesTf;
    private javax.swing.JPanel funciones;
    private javax.swing.JButton guardarClientesBtn;
    private javax.swing.JComboBox<String> hastaAnioCb;
    private javax.swing.JComboBox<String> hastaFechaCb;
    private javax.swing.JLabel hastaLb;
    private javax.swing.JLabel idClientesLb;
    private javax.swing.JTextField idClientesTf;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBoxcjaeros;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTabbedPane jTableFacturar;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField58;
    private javax.swing.JTextField jTextField59;
    private javax.swing.JTextField jTextField60;
    private javax.swing.JTextField jTextField61;
    private javax.swing.JTextField jTextField62;
    private javax.swing.JTextField jTextField63;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton limpiarClientesBtn;
    private javax.swing.JLabel nombreBudqClientesLb;
    private javax.swing.JTextField nombreBusqClientesTf;
    private javax.swing.JLabel nombreClientesLb;
    private javax.swing.JTextField nombreClientesTf;
    private javax.swing.JPanel panelCajeros;
    private javax.swing.JPanel panelClientes;
    private javax.swing.JPanel panelEstadistica;
    private javax.swing.JPanel panelFunciones;
    private javax.swing.JPanel panelProductos;
    private javax.swing.JPanel productos;
    private javax.swing.JButton reporteClientesBtn;
    private javax.swing.JTable tablaArticulos;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JScrollPane tableProductos;
    private javax.swing.JLabel telefonoClientesLb;
    private javax.swing.JTextField telefonoClientesTf;
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

    public JTable getTablaArticulos() {
        return tablaArticulos;
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
        eliminarBtn.addActionListener(listener);
    }
    
    public JTable getTableClientes(){ 
        return clientesTable;
    }
}   




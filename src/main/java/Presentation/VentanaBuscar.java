/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentation;

import Domain.Producto;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author sharo
 */
public class VentanaBuscar extends javax.swing.JFrame {

    /**
     * Creates new form VentanaBuscar
     */
    public VentanaBuscar() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelBuscar = new javax.swing.JPanel();
        descripcionLb = new javax.swing.JLabel();
        descripcionTF = new javax.swing.JTextField();
        ProductoTable = new javax.swing.JScrollPane();
        ProductosTableView = new javax.swing.JTable();
        okBtn = new javax.swing.JButton();
        CancelBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        descripcionLb.setText("Descripcion");

        descripcionTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descripcionTFActionPerformed(evt);
            }
        });

        ProductosTableView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Descripcion", "Unidad", "Precio", "Categoria"
            }
        ));
        ProductoTable.setViewportView(ProductosTableView);

        okBtn.setText("OK");

        CancelBtn.setText("Cancel");

        javax.swing.GroupLayout PanelBuscarLayout = new javax.swing.GroupLayout(PanelBuscar);
        PanelBuscar.setLayout(PanelBuscarLayout);
        PanelBuscarLayout.setHorizontalGroup(
            PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBuscarLayout.createSequentialGroup()
                .addGroup(PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(PanelBuscarLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(okBtn)
                        .addGap(18, 18, 18)
                        .addComponent(CancelBtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelBuscarLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ProductoTable, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelBuscarLayout.createSequentialGroup()
                                .addComponent(descripcionLb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(descripcionTF, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(4, 4, 4)))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        PanelBuscarLayout.setVerticalGroup(
            PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBuscarLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descripcionLb)
                    .addComponent(descripcionTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(ProductoTable, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okBtn)
                    .addComponent(CancelBtn))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void descripcionTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descripcionTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descripcionTFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelBtn;
    private javax.swing.JPanel PanelBuscar;
    private javax.swing.JScrollPane ProductoTable;
    private javax.swing.JTable ProductosTableView;
    private javax.swing.JLabel descripcionLb;
    private javax.swing.JTextField descripcionTF;
    private javax.swing.JButton okBtn;
    // End of variables declaration//GEN-END:variables
    
    public void addOkBtn(ActionListener listener){
        okBtn.addActionListener(listener);
    }
    
    public void addCancelBtn(ActionListener listener){
        CancelBtn.addActionListener(listener);
    }

    public String getDescripcionTf(){
        return descripcionTF.getText();
    }
    
    public Producto mostrarProductos(){
        return new Producto();
    } 
    public void notify(String message) {
    JOptionPane.showMessageDialog(null, message);
    }

    public void setDescripcionTf(String string) {
        this.descripcionTF.setText(string);
    }

    public JButton getCancelBtn() {
        return CancelBtn;
    }

    public JPanel getPanelBuscar() {
        return PanelBuscar;
    }

    public JScrollPane getProductoTable() {
        return ProductoTable;
    }

    public JTable getProductosTableView() {
        return ProductosTableView;
    }

    public JLabel getDescripcionLb() {
        return descripcionLb;
    }

    public JTextField getDescripcionTF() {
        return descripcionTF;
    }

    public JButton getOkBtn() {
        return okBtn;
    }
    
    
}

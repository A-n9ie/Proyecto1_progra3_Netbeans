/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentation;

import javax.swing.JPanel;

/**
 *
 * @author angie
 */
public class VentanaPDF extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPDF
     */
    public VentanaPDF() {
        initComponents();
        //this.setVisible(true);
        this.setLocationRelativeTo(null);
        
        
         // Configura el layout del panel
        javax.swing.GroupLayout panelPDFLayout = new javax.swing.GroupLayout(panelPDF);
        panelPDF.setLayout(panelPDFLayout);
        panelPDFLayout.setHorizontalGroup(
            panelPDFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelPDFLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(info_txt)
                    .addContainerGap(panelPDF.getWidth(),Short.MAX_VALUE))
        );
        panelPDFLayout.setVerticalGroup(
            panelPDFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelPDFLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(info_txt)
                    .addContainerGap(panelPDF.getHeight(), Short.MAX_VALUE))
        );

        // Configura el layout de la ventana
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelPDF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelPDF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack(); 

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPDF = new javax.swing.JPanel();
        info_txt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        info_txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        info_txt.setText("Información");

        javax.swing.GroupLayout panelPDFLayout = new javax.swing.GroupLayout(panelPDF);
        panelPDF.setLayout(panelPDFLayout);
        panelPDFLayout.setHorizontalGroup(
            panelPDFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPDFLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(info_txt)
                .addContainerGap(226, Short.MAX_VALUE))
        );
        panelPDFLayout.setVerticalGroup(
            panelPDFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPDFLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(info_txt)
                .addContainerGap(248, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPDF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel info_txt;
    private javax.swing.JPanel panelPDF;
    // End of variables declaration//GEN-END:variables

    public String getInfo_txt(){
        return this.info_txt.getText();
    }
    
    public void setInfo_txt(String text){
        this.info_txt.setText(text);
    }

    public JPanel getPanelPDF() {
        return panelPDF;
    }
    

}

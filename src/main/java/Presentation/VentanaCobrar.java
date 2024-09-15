/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentation;

import java.awt.event.ActionListener;

/**
 *
 * @author sharo
 */
public class VentanaCobrar extends javax.swing.JFrame {

    /**
     * Creates new form VentanaCobrar
     */
    public VentanaCobrar() {
        initComponents();
        this.add(totalPagar);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        totalPagar = new javax.swing.JPanel();
        okBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        metodosPago = new javax.swing.JPanel();
        efectivoLb = new javax.swing.JLabel();
        tarjetaLb = new javax.swing.JLabel();
        chequeLb = new javax.swing.JLabel();
        sinpeLb = new javax.swing.JLabel();
        efectivoTf = new javax.swing.JTextField();
        tarjetaTf = new javax.swing.JTextField();
        chequeTf = new javax.swing.JTextField();
        sinpeTf = new javax.swing.JTextField();
        totalPgar = new javax.swing.JPanel();
        total_txt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        okBtn.setText("OK");

        cancelBtn.setText("Cancel");

        metodosPago.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Metodo de Pago"));

        efectivoLb.setText("Efectivo");

        tarjetaLb.setText("Tarjeta");

        chequeLb.setText("Cheque");
        chequeLb.setToolTipText("");

        sinpeLb.setText("SINPE");

        javax.swing.GroupLayout metodosPagoLayout = new javax.swing.GroupLayout(metodosPago);
        metodosPago.setLayout(metodosPagoLayout);
        metodosPagoLayout.setHorizontalGroup(
            metodosPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(metodosPagoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(metodosPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(metodosPagoLayout.createSequentialGroup()
                        .addComponent(efectivoLb)
                        .addGap(18, 18, 18)
                        .addComponent(efectivoTf, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(metodosPagoLayout.createSequentialGroup()
                        .addComponent(tarjetaLb)
                        .addGap(18, 18, 18)
                        .addComponent(tarjetaTf))
                    .addGroup(metodosPagoLayout.createSequentialGroup()
                        .addComponent(chequeLb)
                        .addGap(18, 18, 18)
                        .addComponent(chequeTf))
                    .addGroup(metodosPagoLayout.createSequentialGroup()
                        .addComponent(sinpeLb)
                        .addGap(18, 18, 18)
                        .addComponent(sinpeTf)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        metodosPagoLayout.setVerticalGroup(
            metodosPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(metodosPagoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(metodosPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(efectivoLb)
                    .addComponent(efectivoTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(metodosPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tarjetaLb)
                    .addComponent(tarjetaTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(metodosPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chequeLb)
                    .addComponent(chequeTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(metodosPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sinpeLb)
                    .addComponent(sinpeTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        totalPgar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Total"));

        total_txt.setText("0");

        javax.swing.GroupLayout totalPgarLayout = new javax.swing.GroupLayout(totalPgar);
        totalPgar.setLayout(totalPgarLayout);
        totalPgarLayout.setHorizontalGroup(
            totalPgarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, totalPgarLayout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addComponent(total_txt)
                .addGap(58, 58, 58))
        );
        totalPgarLayout.setVerticalGroup(
            totalPgarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(totalPgarLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(total_txt)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout totalPagarLayout = new javax.swing.GroupLayout(totalPagar);
        totalPagar.setLayout(totalPagarLayout);
        totalPagarLayout.setHorizontalGroup(
            totalPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, totalPagarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(metodosPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(totalPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, totalPagarLayout.createSequentialGroup()
                        .addComponent(okBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelBtn))
                    .addComponent(totalPgar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        totalPagarLayout.setVerticalGroup(
            totalPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(totalPagarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(totalPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalPgar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(metodosPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(totalPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okBtn)
                    .addComponent(cancelBtn))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(totalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(totalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel chequeLb;
    private javax.swing.JTextField chequeTf;
    private javax.swing.JLabel efectivoLb;
    private javax.swing.JTextField efectivoTf;
    private javax.swing.JPanel metodosPago;
    private javax.swing.JButton okBtn;
    private javax.swing.JLabel sinpeLb;
    private javax.swing.JTextField sinpeTf;
    private javax.swing.JLabel tarjetaLb;
    private javax.swing.JTextField tarjetaTf;
    private javax.swing.JPanel totalPagar;
    private javax.swing.JPanel totalPgar;
    private javax.swing.JLabel total_txt;
    // End of variables declaration//GEN-END:variables

    public void addOkBtn(ActionListener listener){
        okBtn.addActionListener(listener);
    }
    
    public void addCancel(ActionListener listener){
        cancelBtn.addActionListener(listener);
    }
    
    public String getEfectivo(){
        return efectivoTf.getText();
    }
    
    public String getTarjeta(){
        return tarjetaTf.getText();
    }
    
    public String getCheque(){
        return chequeTf.getText();
    }
    
    public String getSINPE(){
        return sinpeTf.getText();
    }

    public void setTotal(double total) {total_txt.setText("Total: " + String.format("%.2f", total));
    }
    
    public void setTotal(String t){
        this.total_txt.setText(t);
    }
    
    public String getTotal_txt(){
        return this.total_txt.getText();
    } 

}

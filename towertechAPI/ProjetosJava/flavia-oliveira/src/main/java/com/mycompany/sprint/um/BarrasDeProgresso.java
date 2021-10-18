/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sprint.um;

import java.awt.Color;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Flávia
 */
public class BarrasDeProgresso extends javax.swing.JFrame {

    Integer barraUm;
    Integer barraDois;
    Integer barraTres;
    
    Integer contador = 0;
    
    Integer minCPU;
    Integer maxCPU;
    Integer somaCPU = 0;
    Integer mediaCPU;
    
    Integer minDisco;
    Integer maxDisco;
    Integer somaDisco = 0;
    Integer mediaDisco;
    
    Integer minMemoria;
    Integer maxMemoria;
    Integer somaMemoria = 0;
    Integer mediaMemoria;
    
    public BarrasDeProgresso() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCPU = new javax.swing.JLabel();
        prgCPU = new javax.swing.JProgressBar();
        lblDisco = new javax.swing.JLabel();
        prgMemoria = new javax.swing.JProgressBar();
        lblMemoria = new javax.swing.JLabel();
        prgDisco = new javax.swing.JProgressBar();
        btnLeituras = new javax.swing.JButton();
        lblMinCPU = new javax.swing.JLabel();
        lblMedCPU = new javax.swing.JLabel();
        lblMaxCPU = new javax.swing.JLabel();
        lblMinCPU1 = new javax.swing.JLabel();
        lblMedCPU1 = new javax.swing.JLabel();
        lblMaxCPU1 = new javax.swing.JLabel();
        lblMinDisco = new javax.swing.JLabel();
        lblMinDisco1 = new javax.swing.JLabel();
        lblMedDisco = new javax.swing.JLabel();
        lblMedDisco1 = new javax.swing.JLabel();
        lblMaxDisco = new javax.swing.JLabel();
        lblMaxDisco1 = new javax.swing.JLabel();
        lblMinMemoria = new javax.swing.JLabel();
        lblMaxMemoria = new javax.swing.JLabel();
        lblMinMemoria1 = new javax.swing.JLabel();
        lblMedMemoria1 = new javax.swing.JLabel();
        lblMedMemoria = new javax.swing.JLabel();
        lblMaxMemoria1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCPU.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCPU.setForeground(new java.awt.Color(0, 0, 204));
        lblCPU.setText("CPU");

        prgCPU.setStringPainted(true);

        lblDisco.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDisco.setForeground(new java.awt.Color(0, 51, 204));
        lblDisco.setText("Disco");

        prgMemoria.setStringPainted(true);

        lblMemoria.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMemoria.setForeground(new java.awt.Color(0, 51, 204));
        lblMemoria.setText("Memória");

        prgDisco.setStringPainted(true);

        btnLeituras.setBackground(new java.awt.Color(153, 153, 255));
        btnLeituras.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLeituras.setText("Fazer leitura dos dados");
        btnLeituras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeiturasActionPerformed(evt);
            }
        });

        lblMinCPU.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblMinCPU.setText("Mínimo:");

        lblMedCPU.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblMedCPU.setText("Média:");

        lblMaxCPU.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblMaxCPU.setText("Máximo:");

        lblMinCPU1.setText("-");

        lblMedCPU1.setText("-");

        lblMaxCPU1.setText("-");

        lblMinDisco.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblMinDisco.setText("Mínimo:");

        lblMinDisco1.setText("-");

        lblMedDisco.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblMedDisco.setText("Média:");

        lblMedDisco1.setText("-");

        lblMaxDisco.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblMaxDisco.setText("Máximo:");

        lblMaxDisco1.setText("-");

        lblMinMemoria.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblMinMemoria.setText("Mínimo:");

        lblMaxMemoria.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblMaxMemoria.setText("Máximo:");

        lblMinMemoria1.setText("-");

        lblMedMemoria1.setText("-");

        lblMedMemoria.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblMedMemoria.setText("Média:");

        lblMaxMemoria1.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prgCPU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(prgDisco, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMinCPU)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMinCPU1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblMedCPU)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMedCPU1)
                        .addGap(150, 150, 150)
                        .addComponent(lblMaxCPU)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMaxCPU1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCPU)
                            .addComponent(lblMemoria)
                            .addComponent(lblDisco))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(prgMemoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblMinDisco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMinDisco1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblMedDisco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMedDisco1)
                        .addGap(150, 150, 150)
                        .addComponent(lblMaxDisco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMaxDisco1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMinMemoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMinMemoria1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblMedMemoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMedMemoria1)
                        .addGap(150, 150, 150)
                        .addComponent(lblMaxMemoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMaxMemoria1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLeituras)
                .addGap(170, 170, 170))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCPU)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prgCPU, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMinCPU)
                    .addComponent(lblMedCPU)
                    .addComponent(lblMaxCPU)
                    .addComponent(lblMinCPU1)
                    .addComponent(lblMedCPU1)
                    .addComponent(lblMaxCPU1))
                .addGap(28, 28, 28)
                .addComponent(lblDisco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prgDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMinDisco)
                    .addComponent(lblMedDisco)
                    .addComponent(lblMaxDisco)
                    .addComponent(lblMinDisco1)
                    .addComponent(lblMedDisco1)
                    .addComponent(lblMaxDisco1))
                .addGap(26, 26, 26)
                .addComponent(lblMemoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prgMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMinMemoria)
                    .addComponent(lblMedMemoria)
                    .addComponent(lblMaxMemoria)
                    .addComponent(lblMinMemoria1)
                    .addComponent(lblMedMemoria1)
                    .addComponent(lblMaxMemoria1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnLeituras, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLeiturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeiturasActionPerformed
        barraUm = ThreadLocalRandom.current().nextInt(0,101);
        barraDois = ThreadLocalRandom.current().nextInt(0,101);
        barraTres = ThreadLocalRandom.current().nextInt(0,101);
        prgCPU.setValue(barraUm);
        prgDisco.setValue(barraDois);
        prgMemoria.setValue(barraTres);
        
        contador = contador + 1;
        
        if(contador == 1){
            minCPU = barraUm;
            maxCPU = barraUm;
            
            minDisco = barraDois;
            maxDisco = barraDois;
            
            minMemoria = barraTres;
            maxMemoria = barraTres;
        }else{
            if(barraUm < minCPU){
                minCPU = barraUm;
            }
            if(barraUm > maxCPU){
                maxCPU = barraUm;
            }   
            
            if(barraDois < minDisco){
                minDisco = barraDois;
            }
            if(barraDois > maxDisco){
                maxDisco= barraDois;
            }
            
            if(barraTres < minMemoria){
                minMemoria = barraTres;
            }
            if(barraTres > maxMemoria){
                maxMemoria = barraTres;
            } 
            
        }
        
        somaCPU += barraUm;
        mediaCPU = somaCPU / contador;
        
        somaDisco += barraDois;
        mediaDisco = somaDisco / contador;
        
        somaMemoria += barraTres;
        mediaMemoria = somaMemoria / contador;
        
        
        lblMinCPU1.setText(minCPU.toString());
        lblMedCPU1.setText(mediaCPU.toString());
        lblMaxCPU1.setText(maxCPU.toString());
        
        lblMinDisco1.setText(minDisco.toString());
        lblMedDisco1.setText(mediaDisco.toString());
        lblMaxDisco1.setText(maxDisco.toString());
        
        lblMinMemoria1.setText(minMemoria.toString());
        lblMedMemoria1.setText(mediaMemoria.toString());
        lblMaxMemoria1.setText(maxMemoria.toString());
        
        
        
        
    }//GEN-LAST:event_btnLeiturasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BarrasDeProgresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BarrasDeProgresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BarrasDeProgresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BarrasDeProgresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BarrasDeProgresso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLeituras;
    private javax.swing.JLabel lblCPU;
    private javax.swing.JLabel lblDisco;
    private javax.swing.JLabel lblMaxCPU;
    private javax.swing.JLabel lblMaxCPU1;
    private javax.swing.JLabel lblMaxDisco;
    private javax.swing.JLabel lblMaxDisco1;
    private javax.swing.JLabel lblMaxMemoria;
    private javax.swing.JLabel lblMaxMemoria1;
    private javax.swing.JLabel lblMedCPU;
    private javax.swing.JLabel lblMedCPU1;
    private javax.swing.JLabel lblMedDisco;
    private javax.swing.JLabel lblMedDisco1;
    private javax.swing.JLabel lblMedMemoria;
    private javax.swing.JLabel lblMedMemoria1;
    private javax.swing.JLabel lblMemoria;
    private javax.swing.JLabel lblMinCPU;
    private javax.swing.JLabel lblMinCPU1;
    private javax.swing.JLabel lblMinDisco;
    private javax.swing.JLabel lblMinDisco1;
    private javax.swing.JLabel lblMinMemoria;
    private javax.swing.JLabel lblMinMemoria1;
    private javax.swing.JProgressBar prgCPU;
    private javax.swing.JProgressBar prgDisco;
    private javax.swing.JProgressBar prgMemoria;
    // End of variables declaration//GEN-END:variables
}
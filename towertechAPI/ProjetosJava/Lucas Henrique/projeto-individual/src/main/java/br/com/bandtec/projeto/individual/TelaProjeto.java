package br.com.bandtec.projeto.individual;

import java.util.concurrent.ThreadLocalRandom;

public class TelaProjeto extends javax.swing.JFrame {
   Integer valorCpu = 0;
   Integer maiorCpu = 0;
   Integer menorCpu = 100;
   
   Integer valorRam = 0;
   Integer maiorRam = 0;
   Integer menorRam = 8000;
   
   Integer valorDisco = 0;
   Integer maiorDisco = 0;
   Integer menorDisco = 1000;
   
   Integer contador = 0;
   
   
    public TelaProjeto() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pgrCpu = new javax.swing.JProgressBar();
        pgrDisco = new javax.swing.JProgressBar();
        pgrRam = new javax.swing.JProgressBar();
        btnLeitura = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblCpuValor = new javax.swing.JLabel();
        lblMaximoCpu = new javax.swing.JLabel();
        lblMinimoCpu = new javax.swing.JLabel();
        lblMediaCPU = new javax.swing.JLabel();
        lblMaximoRam = new javax.swing.JLabel();
        lblMinimoRam = new javax.swing.JLabel();
        lblMediaRam = new javax.swing.JLabel();
        lblMaximoDisco = new javax.swing.JLabel();
        lblMinimoDisco = new javax.swing.JLabel();
        lblMediaDisco = new javax.swing.JLabel();
        lblDiscoValor = new javax.swing.JLabel();
        lblRamValor = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pgrCpu.setStringPainted(true);

        pgrDisco.setMaximum(1000);
        pgrDisco.setStringPainted(true);

        pgrRam.setMaximum(8000);
        pgrRam.setStringPainted(true);

        btnLeitura.setText("Realizar leituras");
        btnLeitura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeituraActionPerformed(evt);
            }
        });

        jLabel1.setText("0");

        jLabel2.setText("100");

        lblCpuValor.setText("Valor uso CPU (%):");

        lblMaximoCpu.setText("Valor máximo:");

        lblMinimoCpu.setText("Valor minimo:");

        lblMediaCPU.setText("Média:");

        lblMaximoRam.setText("Valor máximo:");

        lblMinimoRam.setText("Valor minimo:");

        lblMediaRam.setText("Média:");

        lblMaximoDisco.setText("Valor máximo:");

        lblMinimoDisco.setText("Valor minimo:");

        lblMediaDisco.setText("Média:");

        lblDiscoValor.setText("Valor uso Disco (GB's):");

        lblRamValor.setText("Valor uso RAM (MB's):");

        jLabel3.setText("0");

        jLabel4.setText("8000");

        jLabel5.setText("0");

        jLabel6.setText("1000");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(75, 75, 75)
                            .addComponent(lblCpuValor))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pgrCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(8, 8, 8)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pgrRam, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pgrDisco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4)))
                                .addGap(8, 8, 8))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblDiscoValor)
                                .addGap(52, 52, 52))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblRamValor)
                                .addGap(45, 45, 45))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnLeitura)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMinimoCpu)
                    .addComponent(lblMaximoCpu)
                    .addComponent(lblMediaCPU)
                    .addComponent(lblMinimoRam)
                    .addComponent(lblMaximoRam)
                    .addComponent(lblMediaRam)
                    .addComponent(lblMinimoDisco)
                    .addComponent(lblMaximoDisco)
                    .addComponent(lblMediaDisco))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRamValor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pgrRam, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCpuValor)
                            .addComponent(lblMaximoCpu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pgrCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMinimoCpu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(lblMediaCPU))
                        .addGap(49, 49, 49)
                        .addComponent(lblMaximoRam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMinimoRam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMediaRam)
                        .addGap(48, 48, 48)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMaximoDisco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMinimoDisco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMediaDisco))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDiscoValor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pgrDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))))
                .addGap(18, 18, 18)
                .addComponent(btnLeitura)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLeituraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeituraActionPerformed
        //CPU
        Integer randomCpu = ThreadLocalRandom.current().nextInt(0,101); 
        pgrCpu.setValue(randomCpu);        
        lblCpuValor.setText("Valor uso CPU (%): " + randomCpu);
        
        if (randomCpu > maiorCpu) {
            maiorCpu = randomCpu;
            String txtMaior = maiorCpu.toString();
            lblMaximoCpu.setText("Valor máximo: " + txtMaior + " %");
        }
        
        if (randomCpu < menorCpu) {
            menorCpu = randomCpu;
            String txtMenor = menorCpu.toString();
            lblMinimoCpu.setText("Valor minimo: " + txtMenor + " %");
        }   
        
        contador++;
        valorCpu += randomCpu;        
        Integer mediaCpu = valorCpu / contador;
        lblMediaCPU.setText("Média: " + mediaCpu + " %");
        
        
        //Ram
        Integer randomRam = ThreadLocalRandom.current().nextInt(0,8001); 
        pgrRam.setValue(randomRam);        
        lblRamValor.setText("Valor uso RAM (MB's): " + randomRam);
        
        if (randomRam > maiorRam) {
            maiorRam = randomRam;            
            lblMaximoRam.setText("Valor máximo: " + maiorRam + " mb's");
        }
        
        if (randomRam < menorRam) {
            menorRam = randomCpu;            
            lblMinimoRam.setText("Valor minimo: " + menorRam + " mb's");
        }
        
        valorRam += randomRam;        
        Integer mediaRam = valorRam / contador;
        lblMediaRam.setText("Média: " + mediaRam + " mb's");
        
        
        //Disco
        Integer randomDisco = ThreadLocalRandom.current().nextInt(0,1001); 
        pgrDisco.setValue(randomDisco);        
        lblDiscoValor.setText("Valor uso Disco (GB's): " + randomDisco);
        
        if (randomDisco > maiorDisco) {
            maiorDisco = randomDisco;            
            lblMaximoDisco.setText("Valor máximo: " + maiorDisco + " gb's");
        }
        
        if (randomDisco < menorDisco) {
            menorDisco = randomDisco;            
            lblMinimoDisco.setText("Valor minimo: " + menorDisco + " gb's");
        }        
        
        valorDisco += randomDisco;        
        Integer mediaDisco = valorDisco / contador;
        lblMediaDisco.setText("Média: " + mediaDisco + " gb's");
        
        
    }//GEN-LAST:event_btnLeituraActionPerformed

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
            java.util.logging.Logger.getLogger(TelaProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProjeto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLeitura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblCpuValor;
    private javax.swing.JLabel lblDiscoValor;
    private javax.swing.JLabel lblMaximoCpu;
    private javax.swing.JLabel lblMaximoDisco;
    private javax.swing.JLabel lblMaximoRam;
    private javax.swing.JLabel lblMediaCPU;
    private javax.swing.JLabel lblMediaDisco;
    private javax.swing.JLabel lblMediaRam;
    private javax.swing.JLabel lblMinimoCpu;
    private javax.swing.JLabel lblMinimoDisco;
    private javax.swing.JLabel lblMinimoRam;
    private javax.swing.JLabel lblRamValor;
    private javax.swing.JProgressBar pgrCpu;
    private javax.swing.JProgressBar pgrDisco;
    private javax.swing.JProgressBar pgrRam;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guia3;

/**
 *
 * @author Rodrigo Velo
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ej1 = new javax.swing.JButton();
        ej2 = new javax.swing.JButton();
        ej3 = new javax.swing.JButton();
        ej4 = new javax.swing.JButton();
        ej5 = new javax.swing.JButton();
        ej6 = new javax.swing.JButton();
        ej7 = new javax.swing.JButton();
        ej8 = new javax.swing.JButton();
        ej9 = new javax.swing.JButton();
        ej10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Menu Principal");

        ej1.setText("Ejercicio 1");
        ej1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ej1ActionPerformed(evt);
            }
        });

        ej2.setText("Ejercicio 2");
        ej2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ej2ActionPerformed(evt);
            }
        });

        ej3.setText("Ejercicio 3");
        ej3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ej3ActionPerformed(evt);
            }
        });

        ej4.setText("Ejercicio 4");
        ej4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ej4ActionPerformed(evt);
            }
        });

        ej5.setText("Ejercicio 5");
        ej5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ej5ActionPerformed(evt);
            }
        });

        ej6.setText("Ejercicio 6");
        ej6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ej6ActionPerformed(evt);
            }
        });

        ej7.setText("Ejercicio 7");
        ej7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ej7ActionPerformed(evt);
            }
        });

        ej8.setText("Ejercicio 8");

        ej9.setText("Ejercicio 9");

        ej10.setText("Ejercicio 10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(ej10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(ej1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ej2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ej3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ej4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ej5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ej6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ej7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ej8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ej9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ej1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ej2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ej3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ej4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ej5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ej6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ej7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ej8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ej9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ej10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ej1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ej1ActionPerformed
        // TODO add your handling code here:
        ejercicio1 ej1 = new ejercicio1();
        
        ej1.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_ej1ActionPerformed

    private void ej2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ej2ActionPerformed
        // TODO add your handling code here:
        ejercicio2 ej2 = new ejercicio2();
        
        ej2.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_ej2ActionPerformed

    private void ej3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ej3ActionPerformed
        // TODO add your handling code here:
        ejercicio3 ej3 = new ejercicio3();
        
        ej3.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_ej3ActionPerformed

    private void ej4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ej4ActionPerformed
        // TODO add your handling code here:
        ejercicio4 ej4 = new ejercicio4();
        
        ej4.setVisible(true);
        
        dispose();
        
    }//GEN-LAST:event_ej4ActionPerformed

    private void ej5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ej5ActionPerformed
        // TODO add your handling code here:
        ejercicio5 ej5 = new ejercicio5();
        
        ej5.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_ej5ActionPerformed

    private void ej6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ej6ActionPerformed
        // TODO add your handling code here:
        ejercicio6 ej6 = new ejercicio6();
        
        ej6.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_ej6ActionPerformed

    private void ej7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ej7ActionPerformed
        // TODO add your handling code here:
        ejercicio7 ej7 = new ejercicio7();
        
        ej7.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_ej7ActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ej1;
    private javax.swing.JButton ej10;
    private javax.swing.JButton ej2;
    private javax.swing.JButton ej3;
    private javax.swing.JButton ej4;
    private javax.swing.JButton ej5;
    private javax.swing.JButton ej6;
    private javax.swing.JButton ej7;
    private javax.swing.JButton ej8;
    private javax.swing.JButton ej9;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

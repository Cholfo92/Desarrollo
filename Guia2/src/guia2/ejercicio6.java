/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guia2;

import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo Velo
 */
public class ejercicio6 extends javax.swing.JFrame {

    /**
     * Creates new form ejercicio6
     */
    public ejercicio6() {
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

        genero = new javax.swing.ButtonGroup();
        idioma = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        español = new javax.swing.JRadioButton();
        ingles = new javax.swing.JRadioButton();
        portugues = new javax.swing.JRadioButton();
        titulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        hojas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        autores = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        novela = new javax.swing.JRadioButton();
        poesia = new javax.swing.JRadioButton();
        mitologia = new javax.swing.JRadioButton();
        cuento = new javax.swing.JRadioButton();
        humor = new javax.swing.JRadioButton();
        terror = new javax.swing.JRadioButton();
        cFiccion = new javax.swing.JRadioButton();
        infantil = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        editorial = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Titulo:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 32, -1, -1));

        jLabel2.setText("Idioma");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 59, -1, -1));

        idioma.add(español);
        español.setText("Español");
        getContentPane().add(español, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 57, -1, -1));

        idioma.add(ingles);
        ingles.setText("Ingles");
        getContentPane().add(ingles, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 57, -1, -1));

        idioma.add(portugues);
        portugues.setText("Portugues");
        getContentPane().add(portugues, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 57, -1, -1));
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 29, 128, -1));

        jLabel3.setText("Cantidad de hojas:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 86, -1, -1));
        getContentPane().add(hojas, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 83, 146, -1));

        jLabel4.setText("Cantidad de Autores:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 114, -1, -1));

        autores.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                autoresFocusLost(evt);
            }
        });
        getContentPane().add(autores, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 111, 133, -1));

        jLabel5.setText("Genero:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 141, -1, -1));

        genero.add(novela);
        novela.setText("Novela");
        getContentPane().add(novela, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 139, -1, -1));

        genero.add(poesia);
        poesia.setText("Poesia");
        getContentPane().add(poesia, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 139, -1, -1));

        genero.add(mitologia);
        mitologia.setText("Mitologia");
        getContentPane().add(mitologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 165, -1, -1));

        genero.add(cuento);
        cuento.setText("Cuento");
        getContentPane().add(cuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 165, -1, -1));

        genero.add(humor);
        humor.setText("Humor");
        getContentPane().add(humor, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 191, -1, -1));

        genero.add(terror);
        terror.setText("Terror y misterio");
        getContentPane().add(terror, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 191, -1, -1));

        genero.add(cFiccion);
        cFiccion.setText("Ciencia Ficcion");
        getContentPane().add(cFiccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 217, -1, -1));

        genero.add(infantil);
        infantil.setText("Infantil");
        getContentPane().add(infantil, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 217, -1, -1));

        jLabel6.setText("Editorial:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 246, -1, -1));
        getContentPane().add(editorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 243, 193, -1));

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 271, -1, -1));

        jButton2.setText("Borrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, -1, -1));

        jButton3.setText("Cerrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, -1, -1));

        jLabel7.setText("Registro de Libros");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 7, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        titulo.setText("");
        idioma.clearSelection();
        hojas.setText("");
        autores.setText("");
        genero.clearSelection();
        editorial.setText("");
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String msj = "Datos Registrados: \n";
        
        msj+="\nTitulo: " + titulo.getText();
        
        if(español.isSelected()) msj+="\nIdioma: " + español.getText();
        if(ingles.isSelected()) msj+="\nIdioma: " + ingles.getText();
        if(portugues.isSelected()) msj+="\nIdioma: " + portugues.getText();
        
        msj+="\nCantidad de hojas: " + hojas.getText();
        
        msj+="\nPosee: " + autores.getText() + " Autores";
        
        for(int i = 0; i<Integer.parseInt(autores.getText());i++)
        {
            msj+= "\nAutor: " + JOptionPane.showInputDialog("Ingrese el nombre del Autor Nº "+ (i+1));
        }
        
        if(novela.isSelected()) msj+="\nGenero: " + novela.getText();
        if(poesia.isSelected()) msj+="\nGenero: " + poesia.getText();
        if(cuento.isSelected()) msj+="\nGenero: " + cuento.getText();
        if(mitologia.isSelected()) msj+="\nGenero: " + mitologia.getText();
        if(humor.isSelected()) msj+="\nGenero: " + humor.getText();
        if(terror.isSelected()) msj+="\nGenero: " + terror.getText();
        if(cFiccion.isSelected()) msj+="\nGenero: " + cFiccion.getText();
        if(infantil.isSelected()) msj+="\nGenero: " + infantil.getText();
        
        msj+="\nEditorial: " + editorial.getText();
        
        JOptionPane.showMessageDialog(rootPane, msj);
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void autoresFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_autoresFocusLost
        // TODO add your handling code here:
        if(Integer.parseInt(autores.getText())<1 || Integer.parseInt(autores.getText())>3)
        {
            autores.setText("");
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar una cantidad de autores validas!");
        }
    }//GEN-LAST:event_autoresFocusLost

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        principal obj = new principal();
        
        obj.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(ejercicio6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejercicio6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejercicio6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejercicio6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ejercicio6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField autores;
    private javax.swing.JRadioButton cFiccion;
    private javax.swing.JRadioButton cuento;
    private javax.swing.JTextField editorial;
    private javax.swing.JRadioButton español;
    private javax.swing.ButtonGroup genero;
    private javax.swing.JTextField hojas;
    private javax.swing.JRadioButton humor;
    private javax.swing.ButtonGroup idioma;
    private javax.swing.JRadioButton infantil;
    private javax.swing.JRadioButton ingles;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton mitologia;
    private javax.swing.JRadioButton novela;
    private javax.swing.JRadioButton poesia;
    private javax.swing.JRadioButton portugues;
    private javax.swing.JRadioButton terror;
    private javax.swing.JTextField titulo;
    // End of variables declaration//GEN-END:variables
}

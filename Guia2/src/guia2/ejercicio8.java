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
public class ejercicio8 extends javax.swing.JFrame {

    /**
     * Creates new form ejercicio8
     */
    public ejercicio8() {
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

        sexo = new javax.swing.ButtonGroup();
        ciudad = new javax.swing.ButtonGroup();
        trabaja = new javax.swing.ButtonGroup();
        estudia = new javax.swing.ButtonGroup();
        hijos = new javax.swing.ButtonGroup();
        obraSocial = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtOtro = new javax.swing.JTextField();
        estudiar = new javax.swing.JCheckBox();
        videoJuegos = new javax.swing.JCheckBox();
        tv = new javax.swing.JCheckBox();
        caminar = new javax.swing.JCheckBox();
        musica = new javax.swing.JCheckBox();
        leer = new javax.swing.JCheckBox();
        otros = new javax.swing.JCheckBox();
        dormir = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        fem = new javax.swing.JRadioButton();
        masc = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        rioGrande = new javax.swing.JRadioButton();
        tolhuin = new javax.swing.JRadioButton();
        ushuaia = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        siT = new javax.swing.JRadioButton();
        noT = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        noE = new javax.swing.JRadioButton();
        siE = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        noH = new javax.swing.JRadioButton();
        siH = new javax.swing.JRadioButton();
        txtHijos = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        noOs = new javax.swing.JRadioButton();
        siOs = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        txtObraS = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        aceptar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro"));

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellido:");

        jLabel3.setText("Pasatiempo:");

        txtOtro.setEnabled(false);

        estudiar.setText("Estudiar");

        videoJuegos.setText("Video Juegos");

        tv.setText("Ver Television");

        caminar.setText("Caminar");

        musica.setText("Escuchar Musica");

        leer.setText("Leer");

        otros.setText("Otros");
        otros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otrosActionPerformed(evt);
            }
        });

        dormir.setText("Dormir");

        jLabel4.setText("Sexo:");

        sexo.add(fem);
        fem.setText("Femenino");

        sexo.add(masc);
        masc.setText("Masculino");

        jLabel5.setText("Ciudad:");

        ciudad.add(rioGrande);
        rioGrande.setText("Rio Grande");

        ciudad.add(tolhuin);
        tolhuin.setText("Tolhuin");

        ciudad.add(ushuaia);
        ushuaia.setText("Ushuaia");

        jLabel6.setText("Trabaja:");

        trabaja.add(siT);
        siT.setText("Si");

        trabaja.add(noT);
        noT.setText("No");

        jLabel7.setText("Estudia:");

        estudia.add(noE);
        noE.setText("No");

        estudia.add(siE);
        siE.setText("Si");

        jLabel8.setText("Posee Hijos:");

        hijos.add(noH);
        noH.setText("No");
        noH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noHActionPerformed(evt);
            }
        });

        hijos.add(siH);
        siH.setText("Si");
        siH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siHActionPerformed(evt);
            }
        });

        txtHijos.setEnabled(false);

        jLabel9.setText("Cantidad:");

        jLabel10.setText("Posee Obra Social");

        obraSocial.add(noOs);
        noOs.setText("No");
        noOs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noOsActionPerformed(evt);
            }
        });

        obraSocial.add(siOs);
        siOs.setText("Si");
        siOs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siOsActionPerformed(evt);
            }
        });

        jLabel11.setText("Indique cual:");

        txtObraS.setEnabled(false);

        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        cerrar.setText("Cerrar");
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(estudiar)
                            .addComponent(caminar)
                            .addComponent(dormir))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(musica)
                                    .addComponent(tv))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(videoJuegos)
                                    .addComponent(leer)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtHijos, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(otros)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtOtro, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(masc))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rioGrande)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tolhuin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ushuaia))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(siT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(noT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(siE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(noE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(noH)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(siH)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(noOs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(siOs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtObraS, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(aceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(limpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cerrar)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(estudiar)
                    .addComponent(videoJuegos)
                    .addComponent(tv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caminar)
                    .addComponent(musica)
                    .addComponent(leer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(otros)
                    .addComponent(dormir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fem)
                    .addComponent(masc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rioGrande)
                    .addComponent(tolhuin)
                    .addComponent(ushuaia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(siT)
                    .addComponent(noT)
                    .addComponent(jLabel7)
                    .addComponent(siE)
                    .addComponent(noE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(noH)
                    .addComponent(siH)
                    .addComponent(txtHijos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(noOs)
                    .addComponent(siOs)
                    .addComponent(txtObraS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptar)
                    .addComponent(limpiar)
                    .addComponent(cerrar))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void noOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noOsActionPerformed
        // TODO add your handling code here:
        txtObraS.setEnabled(false);
        txtObraS.setText("");
    }//GEN-LAST:event_noOsActionPerformed

    private void otrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otrosActionPerformed
        // TODO add your handling code here:
        if(otros.isSelected()) txtOtro.setEnabled(true);
        else{
            txtOtro.setEnabled(false);
        }
    }//GEN-LAST:event_otrosActionPerformed

    private void siHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siHActionPerformed
        // TODO add your handling code here:
        if(siH.isSelected()) txtHijos.setEnabled(true);
        else{
            txtHijos.setEnabled(false);
        }
    }//GEN-LAST:event_siHActionPerformed

    private void siOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siOsActionPerformed
        // TODO add your handling code here:
        if(siOs.isSelected()) txtObraS.setEnabled(true);
        else{
            txtObraS.setEnabled(false);
        }
    }//GEN-LAST:event_siOsActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        // TODO add your handling code here:
        txtNombre.setText("");
        txtApellido.setText("");
        txtOtro.setText("");
        txtHijos.setText("");
        txtObraS.setText("");
        
        sexo.clearSelection();
        ciudad.clearSelection();
        hijos.clearSelection();
        obraSocial.clearSelection();
        trabaja.clearSelection();
        estudia.clearSelection();
        
        if(estudiar.isSelected()) estudiar.setSelected(false);
        if(tv.isSelected()) tv.setSelected(false);
        if(videoJuegos.isSelected()) videoJuegos.setSelected(false);
        if(caminar.isSelected()) caminar.setSelected(false);
        if(musica.isSelected()) musica.setSelected(false);
        if(leer.isSelected()) leer.setSelected(false);
        if(dormir.isSelected()) dormir.setSelected(false);
        if(otros.isSelected()) otros.setSelected(false);
        
        txtHijos.setEnabled(false);
        txtObraS.setEnabled(false);
        txtOtro.setEnabled(false);
        
        
        
    }//GEN-LAST:event_limpiarActionPerformed

    private void noHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noHActionPerformed
        // TODO add your handling code here:
        txtHijos.setEnabled(false);
        txtHijos.setText("");
    }//GEN-LAST:event_noHActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        // TODO add your handling code here:
        String msj = "Registrado con exito";
        
        msj+= "\nApellido: " + " " + txtApellido.getText();
        msj+= "\nNombre: " + " " + txtNombre.getText();
        
        msj+= "\nPasatiempo: ";
        
        if(estudiar.isSelected()) msj+= " " + estudiar.getText() + "-" ;
        if(tv.isSelected()) msj+= " " + tv.getText()+ "-";
        if(videoJuegos.isSelected()) msj+= " " + videoJuegos.getText()+ "-";
        if(caminar.isSelected()) msj+= " " + caminar.getText()+ "-";
        if(musica.isSelected()) msj+= " " + musica.getText()+ "-";
        if(leer.isSelected()) msj+= " " + leer.getText()+ "-";
        if(dormir.isSelected()) msj+= " " + dormir.getText()+ "-";
        if(otros.isSelected()) msj+= " " + txtOtro.getText()+ "-";
        
        msj+= "\nSexo: ";
        if(fem.isSelected()) msj+= " " + fem.getText();
        if(masc.isSelected()) msj+= " " + masc.getText();
        
        msj+= "\nCiudad: ";
        if(rioGrande.isSelected()) msj+= " " + rioGrande.getText();
        if(tolhuin.isSelected()) msj+= " " + tolhuin.getText();
        if(ushuaia.isSelected()) msj+= " " + ushuaia.getText();
        
        msj+= "\nTrabaja: ";
        if(siT.isSelected()) msj+= " " + siT.getText();
        if(noT.isSelected()) msj+= " " + noT.getText();
        
        msj+= "\nEstudia: ";
        if(siE.isSelected()) msj+= " " + siE.getText();
        if(noE.isSelected()) msj+= " " + noE.getText();
        
        msj+= "\nHijos: "; 
        if(siH.isSelected()) 
        {
            msj+= " " + siH.getText();
            msj+= " Posee: " + txtHijos.getText() + " hijos.";
        }
        if(noH.isSelected()) msj+= noH.getText();
        
        msj+= "\nObra Social: "; 
        if(siOs.isSelected()) 
        {
            msj+= " " + siOs.getText();
            msj+= " Posee: " + txtObraS.getText();
        }
        if(noOs.isSelected()) msj+= " " + noOs.getText();
        
        JOptionPane.showMessageDialog(rootPane, msj);
        
        
        
        
    }//GEN-LAST:event_aceptarActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        // TODO add your handling code here:
        principal obj = new principal();
        
        obj.setVisible(true);
        
        this.dispose();
        
    }//GEN-LAST:event_cerrarActionPerformed

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
            java.util.logging.Logger.getLogger(ejercicio8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejercicio8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejercicio8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejercicio8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ejercicio8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JCheckBox caminar;
    private javax.swing.JButton cerrar;
    private javax.swing.ButtonGroup ciudad;
    private javax.swing.JCheckBox dormir;
    private javax.swing.ButtonGroup estudia;
    private javax.swing.JCheckBox estudiar;
    private javax.swing.JRadioButton fem;
    private javax.swing.ButtonGroup hijos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox leer;
    private javax.swing.JButton limpiar;
    private javax.swing.JRadioButton masc;
    private javax.swing.JCheckBox musica;
    private javax.swing.JRadioButton noE;
    private javax.swing.JRadioButton noH;
    private javax.swing.JRadioButton noOs;
    private javax.swing.JRadioButton noT;
    private javax.swing.ButtonGroup obraSocial;
    private javax.swing.JCheckBox otros;
    private javax.swing.JRadioButton rioGrande;
    private javax.swing.ButtonGroup sexo;
    private javax.swing.JRadioButton siE;
    private javax.swing.JRadioButton siH;
    private javax.swing.JRadioButton siOs;
    private javax.swing.JRadioButton siT;
    private javax.swing.JRadioButton tolhuin;
    private javax.swing.ButtonGroup trabaja;
    private javax.swing.JCheckBox tv;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtHijos;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtObraS;
    private javax.swing.JTextField txtOtro;
    private javax.swing.JRadioButton ushuaia;
    private javax.swing.JCheckBox videoJuegos;
    // End of variables declaration//GEN-END:variables
}
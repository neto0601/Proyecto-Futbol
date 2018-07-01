/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemafutbol;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author H ERICK
 */
public class frmtipos_hechos extends javax.swing.JFrame {

    ResultSet rs = null;
    tipos_hechos ac = new tipos_hechos(); 
    boolean registro = false;
    boolean prueba = false;
    boolean newRecord = false;
    int cantidad = 0;
    int mayor = 0;
    public frmtipos_hechos() {
        initComponents();
        txtidtipo.setEnabled(false);
        txtdescripcion.setEnabled(false);
    }
    private void Bloquear(){
        txtidtipo.setEnabled(false);
        txtdescripcion.setEnabled(false);
        }
        
        private void Desbloquear() {
       txtdescripcion.setEnabled(true);
      }
        
        private void Limpiar() {
       txtdescripcion.setText("");
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblidtipo = new javax.swing.JLabel();
        txtidtipo = new javax.swing.JTextField();
        lbldescripcion = new javax.swing.JLabel();
        txtdescripcion = new javax.swing.JTextField();
        btnnuevo = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btnguardarmodificacion = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIPOS_HECHOS");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblidtipo.setText("ID TIPO:");
        getContentPane().add(lblidtipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
        getContentPane().add(txtidtipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 50, -1));

        lbldescripcion.setText("DESCRIPCION:");
        getContentPane().add(lbldescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        txtdescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdescripcionKeyTyped(evt);
            }
        });
        getContentPane().add(txtdescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 130, -1));

        btnnuevo.setText("NUEVO");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 120, -1));

        btnguardar.setText("GUARDAR");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        btnbuscar.setText("BUSCAR");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 120, -1));

        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        btnmodificar.setText("MODIFICAR");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        btnguardarmodificacion.setText("GUARDAR MODIFICACIÓN");
        btnguardarmodificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarmodificacionActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardarmodificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 190, -1));

        btncancelar.setText("CANCELAR");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 90, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtdescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdescripcionKeyTyped
        char val=evt.getKeyChar();
        if(Character.isDigit(val)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtdescripcionKeyTyped

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed

        // TODO add your handling code here:
        rs = null;
        //mÃ©todo en clase Clientes
        rs = ac.contarRegistros();
        try {
            while (rs.next()) {
                cantidad = rs.getInt(1);
                if (cantidad != 0) {
                    rs = null;
                    //mÃ©todo en clase Clientes
                    rs = ac.mayorRegistro();
                    while (rs.next()) {
                        mayor = rs.getInt(1) + 1;
                        //recuerde que debe completar 5 digitos
                        if (mayor < 10) {
                            txtidtipo.setText("0000" + mayor);
                        } else if (mayor < 100) {
                            this.txtidtipo.setText("000" + mayor);
                        } else if (mayor < 1000) {
                            txtidtipo.setText("00" + mayor);
                        } else if (mayor < 10000) {
                            txtidtipo.setText("0" + mayor);
                        } else {
                            txtidtipo.setText("" + mayor);
                        }
                    }
                } else {
                    txtidtipo.setText("0000"+1);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "AVISO DEL SISTEMA", 0);
        }
        Desbloquear();
        Limpiar();
        this.txtdescripcion.requestFocus();
        newRecord = true;
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed

        if (newRecord == true) {
            if (this.txtidtipo.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Debe existir un ID de Hecho", "AVISO DEL SISTEMA", 2);
            }
            else if (this.txtdescripcion.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Debe llenar el campo Descripción", "AVISO DEL SISTEMA", 2);
                this.txtdescripcion.requestFocus();
            }
            
            else{
                ac.insertar(this.txtidtipo.getText(), this.txtdescripcion.getText().toUpperCase());}
            JOptionPane.showMessageDialog(rootPane, "Registro guardado exitosamente!!", "AVISO DEL SISTEMA", 1);
            Bloquear();
            Limpiar();
            this.txtidtipo.setText("");
            newRecord = false;

        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed

        String codigo = JOptionPane.showInputDialog("Ingrese el ID del Arbitro a Busacar:");
        rs = ac.buscar(codigo);
        try {
            while (rs.next()) {
                this.txtidtipo.setText(rs.getString(1));
                this.txtdescripcion.setText(rs.getString(2));
                prueba = true;
                registro = true;
                newRecord = false;
            }
            if (registro == false) {
                JOptionPane.showMessageDialog(rootPane, "Registro no encontrado!!!", "AVISO DEL SISTEMA", 0);
                //this.txtCodigo.setText("");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "AVISO DEL SISTEMA", 0);
        }
        registro = false;
        Bloquear();
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed

        if (prueba == true) {
            String codigo = this.txtidtipo.getText();
            if (JOptionPane.showConfirmDialog(rootPane, "¿Desea eliminar el registro buscado?") == 0) {
                ac.eliminar(codigo);
                JOptionPane.showMessageDialog(rootPane, "Registro eliminado exitosamente!!", "AVISO DEL SISTEMA", 1);
                Bloquear();
                Limpiar();
                this.txtidtipo.setText("");
                this.btnnuevo.setVisible(true);
                this.btnguardar.setVisible(true);
                prueba = false;
            }
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        if (prueba == true) {
            Desbloquear();
        }
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btnguardarmodificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarmodificacionActionPerformed
        if (prueba == true) {
            if (this.txtidtipo.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Debe existir un Id de Hecho", "AVISO DEL SISTEMA", 2);
            }
            else if (this.txtdescripcion.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Debe llenar el campo Descripcion", "AVISO DEL SISTEMA", 2);
                this.txtdescripcion.requestFocus();
            }
            
            else{
                ac.modificar(this.txtidtipo.getText(), this.txtdescripcion.getText().toUpperCase());}
            JOptionPane.showMessageDialog(rootPane, "El registro ha sido correctamente actualizado!!", "AVISO DEL SISTEMA", 1);
            Bloquear();
            Limpiar();
            this.txtidtipo.setText("");
            prueba= false;
            newRecord = false;

        }
    }//GEN-LAST:event_btnguardarmodificacionActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        txtidtipo.setText("");
        txtdescripcion.setText("");
        Bloquear();
    }//GEN-LAST:event_btncancelarActionPerformed

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
            java.util.logging.Logger.getLogger(frmtipos_hechos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmtipos_hechos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmtipos_hechos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmtipos_hechos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmtipos_hechos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnguardarmodificacion;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JLabel lbldescripcion;
    private javax.swing.JLabel lblidtipo;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtidtipo;
    // End of variables declaration//GEN-END:variables
}

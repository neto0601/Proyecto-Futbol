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
public class frmcanchas extends javax.swing.JFrame {

    
    ResultSet rs = null;
    canchas est = new canchas(); 
    boolean registro = false;
    boolean prueba = false;
    boolean newRecord = false;
    int cantidad = 0;
    int mayor = 0;
    
    public frmcanchas() {
        initComponents();
        txtidcancha.setEnabled(false);
        txtnombre.setEnabled(false);
        txtubicacion.setEnabled(false);
    }
    private void Bloquear(){
        txtidcancha.setEnabled(false);
        txtnombre.setEnabled(false);
        txtubicacion.setEnabled(false);
        }

    private void Desbloquear() {
       txtnombre.setEnabled(true);
       txtubicacion.setEnabled(true);
       }

    private void Limpiar() {
       txtnombre.setText("");
       txtubicacion.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblidcancha = new javax.swing.JLabel();
        txtidcancha = new javax.swing.JTextField();
        lblnombre = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        lblubicacion = new javax.swing.JLabel();
        txtubicacion = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btnguardarmodificacion = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CANCHAS");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblidcancha.setText("ID CANCHA:");
        getContentPane().add(lblidcancha, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 24, -1, -1));
        getContentPane().add(txtidcancha, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 21, 51, -1));

        lblnombre.setText("NOMBRE:");
        getContentPane().add(lblnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 50, -1, -1));

        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 47, 174, -1));

        lblubicacion.setText("UBICACIÓN:");
        getContentPane().add(lblubicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 81, -1, -1));

        txtubicacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtubicacionKeyTyped(evt);
            }
        });
        getContentPane().add(txtubicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 78, 174, -1));

        btnguardar.setText("GUARDAR");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        btnnuevo.setText("NUEVO");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 120, -1));

        btnbuscar.setText("BUSCAR");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 120, -1));

        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        btnmodificar.setText("MODIFICAR");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

        btnguardarmodificacion.setText("GUARDAR MODIFICACIÓN");
        btnguardarmodificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarmodificacionActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardarmodificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 190, -1));

        btncancelar.setText("CANCELAR");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 90, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed

        if (newRecord == true) {
            if (this.txtidcancha.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Debe existir un Id de Cancha", "AVISO DEL SISTEMA", 2);
            }
            else if (this.txtnombre.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Debe llenar el campo Nombre", "AVISO DEL SISTEMA", 2);
                this.txtnombre.requestFocus();
            }
            else if (this.txtubicacion.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Debe llenar el campo Ubicación", "AVISO DEL SISTEMA", 2);
                this.txtubicacion.requestFocus();
            }
            else{
                est.insertar(this.txtidcancha.getText(), this.txtnombre.getText().toUpperCase(), this.txtubicacion.getText());}
            JOptionPane.showMessageDialog(rootPane, "Registro guardado exitosamente!!", "AVISO DEL SISTEMA", 1);
            Bloquear();
            Limpiar();
            this.txtidcancha.setText("");
            newRecord = false;

        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        // TODO add your handling code here:
        rs = null;
        //mÃ©todo en clase Clientes
        rs =est.contarRegistros();
        try {
            while (rs.next()) {
                cantidad = rs.getInt(1);
                if (cantidad != 0) {
                    rs = null;
                    //mÃ©todo en clase Clientes
                    rs = est.mayorRegistro();
                    while (rs.next()) {
                        mayor = rs.getInt(1) + 1;

                        if (mayor < 10) {
                            txtidcancha.setText("00" + mayor);
                        } else if (mayor < 100) {
                            this.txtidcancha.setText("0" + mayor);
                        }else {
                            txtidcancha.setText("" + mayor);
                        }
                    }
                } else {
                    txtidcancha.setText("00"+1);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "AVISO DEL SISTEMA", 0);
        }
        Desbloquear();
        Limpiar();
        this.txtnombre.requestFocus();
        newRecord = true;
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed

        String codigo = JOptionPane.showInputDialog("Ingrese el Id de Cancha a Buscar:");
        rs = est.buscar(codigo);
        try {
            while (rs.next()) {
                this.txtidcancha.setText(rs.getString(1));
                this.txtnombre.setText(rs.getString(2));
                this.txtubicacion.setText(rs.getString(3));
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
            String codigo = this.txtidcancha.getText();
            if (JOptionPane.showConfirmDialog(rootPane, "¿Desea eliminar el registro buscado?") == 0) {
                est.eliminar(codigo);
                JOptionPane.showMessageDialog(rootPane, "Registro eliminado exitosamente!!", "AVISO DEL SISTEMA", 1);
                Bloquear();
                Limpiar();
                this.txtidcancha.setText("");
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
            if (this.txtidcancha.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Debe existir un Id de Cancha", "AVISO DEL SISTEMA", 2);
            }
            else if (this.txtnombre.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Debe llenar el campo Nombre", "AVISO DEL SISTEMA", 2);
                this.txtnombre.requestFocus();
            }
            else if (this.txtubicacion.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Debe llenar el campo Ubicacion", "AVISO DEL SISTEMA", 2);
                this.txtubicacion.requestFocus();
            }
            else{
                est.modificar(this.txtidcancha.getText(), this.txtnombre.getText().toUpperCase(), this.txtubicacion.getText().toUpperCase());}
            JOptionPane.showMessageDialog(rootPane, "El registro ha sido correctamente actualizado!!", "AVISO DEL SISTEMA", 1);
            Bloquear();
            Limpiar();
            this.txtidcancha.setText("");
            prueba= false;
            newRecord = false;

        }
    }//GEN-LAST:event_btnguardarmodificacionActionPerformed

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        char val=evt.getKeyChar();
        if(Character.isDigit(val)){
            getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtubicacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtubicacionKeyTyped
        char val=evt.getKeyChar();
        if(Character.isDigit(val)){
            getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_txtubicacionKeyTyped

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        txtidcancha.setText("");
        txtnombre.setText("");
        txtubicacion.setText("");
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
            java.util.logging.Logger.getLogger(frmcanchas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmcanchas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmcanchas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmcanchas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmcanchas().setVisible(true);
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
    private javax.swing.JLabel lblidcancha;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblubicacion;
    private javax.swing.JTextField txtidcancha;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtubicacion;
    // End of variables declaration//GEN-END:variables
}

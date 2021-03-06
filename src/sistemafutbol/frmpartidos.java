/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemafutbol;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author H ERICK
 */
public class frmpartidos extends javax.swing.JFrame {

   ResultSet rs = null;
    partidos ac = new partidos(); 
    boolean registro = false;
    boolean prueba = false;
    boolean newRecord = false;
    int cantidad = 0;
    int mayor = 0;
    public frmpartidos() {
        initComponents();
        setLocationRelativeTo(null);
        txtidpartido.setEnabled(false);
        txtequipol.setEnabled(false);
        txtequipov.setEnabled(false);
        txtidcancha.setEnabled(false);
        ftxtFecha.setEnabled(false);
        
    }
    
    private void Bloquear(){
        txtidpartido.setEnabled(false);
        txtequipol.setEnabled(false);
        txtequipov.setEnabled(false);
        txtidcancha.setEnabled(false);
        ftxtFecha.setEnabled(false);
        }
        
        private void Desbloquear() {
       txtequipol.setEnabled(true);
       txtequipov.setEnabled(true);
       txtidcancha.setEnabled(true);
       ftxtFecha.setEnabled(true);
       }
        
        private void Limpiar() {
       txtequipol.setText("");
       txtequipov.setText("");
       txtidcancha.setText("");
       ftxtFecha.setText("");
       
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblidpartido = new javax.swing.JLabel();
        txtidpartido = new javax.swing.JTextField();
        lblequipol = new javax.swing.JLabel();
        txtequipol = new javax.swing.JTextField();
        lblequipov = new javax.swing.JLabel();
        txtequipov = new javax.swing.JTextField();
        lbidcancha = new javax.swing.JLabel();
        txtidcancha = new javax.swing.JTextField();
        lblfecha = new javax.swing.JLabel();
        ftxtFecha = new javax.swing.JFormattedTextField();
        lblformatoF = new javax.swing.JLabel();
        btnnuevo = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btnguardarmodificacion = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        btnmenu2 = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PARTIDOS");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblidpartido.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        lblidpartido.setText("ID PARTIDO:");
        getContentPane().add(lblidpartido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
        getContentPane().add(txtidpartido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 50, -1));

        lblequipol.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        lblequipol.setText("ID EQUIPO LOCAL:");
        getContentPane().add(lblequipol, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        txtequipol.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtequipolKeyTyped(evt);
            }
        });
        getContentPane().add(txtequipol, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 120, 20));

        lblequipov.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        lblequipov.setText("ID EQUIPO VISITANTE:");
        getContentPane().add(lblequipov, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 20));

        txtequipov.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtequipovKeyTyped(evt);
            }
        });
        getContentPane().add(txtequipov, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 120, 20));

        lbidcancha.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        lbidcancha.setText("ID CANCHA:");
        getContentPane().add(lbidcancha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        txtidcancha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidcanchaKeyTyped(evt);
            }
        });
        getContentPane().add(txtidcancha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 120, 20));

        lblfecha.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        lblfecha.setText("FECHA:");
        getContentPane().add(lblfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 20));

        try {
            ftxtFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtFechaActionPerformed(evt);
            }
        });
        getContentPane().add(ftxtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 120, 20));

        lblformatoF.setFont(new java.awt.Font("Britannic Bold", 0, 14)); // NOI18N
        lblformatoF.setText("( dd-MM-yyyy )");
        getContentPane().add(lblformatoF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 90, -1));

        btnnuevo.setFont(new java.awt.Font("Britannic Bold", 0, 14)); // NOI18N
        btnnuevo.setText("NUEVO");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 120, 20));

        btnguardar.setFont(new java.awt.Font("Britannic Bold", 0, 14)); // NOI18N
        btnguardar.setText("GUARDAR");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 120, 20));

        btnbuscar.setFont(new java.awt.Font("Britannic Bold", 0, 12)); // NOI18N
        btnbuscar.setText("BUSCAR");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 80, 20));

        btneliminar.setFont(new java.awt.Font("Britannic Bold", 0, 11)); // NOI18N
        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 80, 20));

        btnmodificar.setFont(new java.awt.Font("Britannic Bold", 0, 14)); // NOI18N
        btnmodificar.setText("MODIFICAR");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 120, 20));

        btnguardarmodificacion.setFont(new java.awt.Font("Britannic Bold", 0, 12)); // NOI18N
        btnguardarmodificacion.setText("GUARDAR MODIFICACIÓN");
        btnguardarmodificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarmodificacionActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardarmodificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 170, 20));

        btncancelar.setFont(new java.awt.Font("Britannic Bold", 0, 14)); // NOI18N
        btncancelar.setText("CANCELAR");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 120, 20));

        btnmenu2.setFont(new java.awt.Font("Britannic Bold", 0, 14)); // NOI18N
        btnmenu2.setText("REGRESAR");
        btnmenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenu2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnmenu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 120, 20));

        lblFondo.setFont(new java.awt.Font("Britannic Bold", 0, 12)); // NOI18N
        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/partidosPS.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ftxtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxtFechaActionPerformed

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
                            txtidpartido.setText("0000" + mayor);
                        } else if (mayor < 100) {
                            this.txtidpartido.setText("000" + mayor);
                        } else if (mayor < 1000) {
                            txtidpartido.setText("00" + mayor);
                        } else if (mayor < 10000) {
                            txtidpartido.setText("0" + mayor);
                        } else {
                            txtidpartido.setText("" + mayor);
                        }
                    }
                } else {
                    txtidpartido.setText("0000"+1);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "AVISO DEL SISTEMA", 0);
        }
        Desbloquear();
        Limpiar();
        this.txtequipol.requestFocus();
        newRecord = true;
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed

        if (newRecord == true) {
            if (this.txtidpartido.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Debe existir un codigo de Actor", "AVISO DEL SISTEMA", 2);
            } else if (this.txtequipol.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Debe llenar el campo ID EQUIPO LOCAL", "AVISO DEL SISTEMA", 2);
                this.txtequipol.requestFocus();
            }else if (this.txtequipov.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Debe llenar el campo ID EQUIPO VISITANTE", "AVISO DEL SISTEMA", 2);
                this.txtequipov.requestFocus();
            }else if (this.txtidcancha.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Debe llenar el campo ID CANCHA", "AVISO DEL SISTEMA", 2);
                this.txtidcancha.requestFocus();
            } else if (this.ftxtFecha.getText().equals("  /  /    ")) {
                JOptionPane.showMessageDialog(rootPane, "Debe llenar el campo FECHA DE PARTIDO!!", "AVISO DEL SISTEMA", 2);
                this.ftxtFecha.requestFocus();
            }  else if (!this.ftxtFecha.getText().equals("  /  /    ")) {
                //validar fecha
                Date fechaActual = new Date();
                SimpleDateFormat formato = new SimpleDateFormat("yyyyMMdd");
                String cadenaFecha = formato.format(fechaActual);
                String day = "" + cadenaFecha.charAt(6) + "" + cadenaFecha.charAt(7);
                String month = "" + cadenaFecha.charAt(4) + "" + cadenaFecha.charAt(5);
                String year = "" + cadenaFecha.charAt(0) + "" + cadenaFecha.charAt(1) + "" + cadenaFecha.charAt(2) + "" + cadenaFecha.charAt(3);
                int d = Integer.parseInt(day);
                int m = Integer.parseInt(month);
                int y = Integer.parseInt(year);
                String texto = this.ftxtFecha.getText();
                String dias = texto.charAt(0) + "" + texto.charAt(1);
                String meses = texto.charAt(3) + "" + texto.charAt(4);
                String anios = texto.charAt(6) + "" + texto.charAt(7) + "" + texto.charAt(8) + "" + texto.charAt(9);
                int dia = Integer.parseInt(dias);
                int mes = Integer.parseInt(meses);
                int anio = Integer.parseInt(anios);
                if ((dia <= 0) || (dia > 31)) {
                    JOptionPane.showMessageDialog(rootPane, "El Dia de la fecha ingresada es invalida!!!", "AVISO DEL SISTEMA", 0);
                    this.ftxtFecha.setText("");
                    this.ftxtFecha.requestFocus();
                } else if ((mes < 1) || (mes > 12)) {
                    JOptionPane.showMessageDialog(rootPane, "El Mes de la fecha ingresada es invalida", "AVISO DEL SISTEMA", 0);
                    this.ftxtFecha.setText("");
                    this.ftxtFecha.requestFocus();
                } else if ((anio > y)) {
                    JOptionPane.showMessageDialog(rootPane, "El Año de la fecha ingresada no puede ser mayor al aÃ±o actual (" + y + ")!!!", "AVISO DEL SISTEMA", 0);
                    this.ftxtFecha.setText("");
                    this.ftxtFecha.requestFocus();
                } else if ((anio < 1920)) {
                    JOptionPane.showMessageDialog(rootPane, "El Año de la fecha ingresada es incoherente!!!", "AVISO DEL SISTEMA", 0);
                    this.ftxtFecha.setText("");
                    this.ftxtFecha.requestFocus();
                } else if ((anio == y) && (dia < d)) {
                    if (d >= 10) {
                        JOptionPane.showMessageDialog(rootPane, "El Dia de la fecha ingresada no puede ser menor al dia actual (" + d + ")!!!", "AVISO DEL SISTEMA", 0);
                        this.ftxtFecha.setText("");
                        this.ftxtFecha.requestFocus();
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "El Dia de la fecha ingresada no puede ser menor al dia actual (0" + d + ")!!!", "AVISO DEL SISTEMA", 0);
                        this.ftxtFecha.setText("");
                        this.ftxtFecha.requestFocus();
                    }
                } else if ((anio == y) && (mes < m)) {
                    if (m >= 10) {
                        JOptionPane.showMessageDialog(rootPane, "El Mes de la fecha ingresada no puede ser menor al mes actual (" + m + ")!!!", "AVISO DEL SISTEMA", 0);
                        this.ftxtFecha.setText("");
                        this.ftxtFecha.requestFocus();
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "El Mes de la fecha ingresada no puede ser menor al mes actual (0" + m + ")!!!", "AVISO DEL SISTEMA", 0);
                        this.ftxtFecha.setText("");
                        this.ftxtFecha.requestFocus();
                    }
                } else {
                     
                            ac.insertar(this.txtidpartido.getText(), this.txtequipol.getText().toUpperCase(), this.txtequipov.getText().toUpperCase(), this.txtidcancha.getText().toUpperCase(), this.ftxtFecha.getText());
                        JOptionPane.showMessageDialog(rootPane, "Registro guardado exitosamente!!", "AVISO DEL SISTEMA", 1);
                        Bloquear();
                        Limpiar();
                        this.txtidpartido.setText("");
                        newRecord = false;
                    
                }
            }
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed

        String codigo = JOptionPane.showInputDialog("Ingrese el codigo de PARTIOD a buscar:");
        rs = ac.buscar(codigo);
        try {
            while (rs.next()) {
                this.txtidpartido.setText(rs.getString(1));
                this.txtequipol.setText(rs.getString(2));
                this.txtequipov.setText(rs.getString(3));
                this.txtidcancha.setText(rs.getString(4));
                this.ftxtFecha.setText(rs.getString(5));
                
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
            String codigo = this.txtidpartido.getText();
            if (JOptionPane.showConfirmDialog(rootPane, "¿Desea eliminar el registro buscado?") == 0) {
                ac.eliminar(codigo);
                JOptionPane.showMessageDialog(rootPane, "Registro eliminado exitosamente!!", "AVISO DEL SISTEMA", 1);
                Bloquear();
                Limpiar();
                this.txtidpartido.setText("");
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
            if (this.txtidpartido.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Debe existir un ID DE PARTIDO", "AVISO DEL SISTEMA", 2);
            } else if (this.txtequipol.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Debe llenar el campo EQUIPO LOCAL", "AVISO DEL SISTEMA", 2);
                this.txtequipol.requestFocus();
            }else if (this.txtequipov.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Debe llenar el campo EQUIPO VISITANTE", "AVISO DEL SISTEMA", 2);
                this.txtequipov.requestFocus();
            } else if (this.txtidcancha.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Debe llenar el campo ID CANCHA", "AVISO DEL SISTEMA", 2);
                this.txtidcancha.requestFocus();
            } else if (this.ftxtFecha.getText().equals("  /  /    ")) {
                JOptionPane.showMessageDialog(rootPane, "Debe llenar el campo FECHA!!", "AVISO DEL SISTEMA", 2);
                this.ftxtFecha.requestFocus();
            } else if (!this.ftxtFecha.getText().equals("  /  /    ")) {
                //validar fecha
                Date fechaActual = new Date();
                SimpleDateFormat formato = new SimpleDateFormat("yyyyMMdd");
                String cadenaFecha = formato.format(fechaActual);
                String day = "" + cadenaFecha.charAt(6) + "" + cadenaFecha.charAt(7);
                String month = "" + cadenaFecha.charAt(4) + "" + cadenaFecha.charAt(5);
                String year = "" + cadenaFecha.charAt(0) + "" + cadenaFecha.charAt(1) + "" + cadenaFecha.charAt(2) + "" + cadenaFecha.charAt(3);
                int d = Integer.parseInt(day);
                int m = Integer.parseInt(month);
                int y = Integer.parseInt(year);
                String texto = this.ftxtFecha.getText();
                String dias = texto.charAt(0) + "" + texto.charAt(1);
                String meses = texto.charAt(3) + "" + texto.charAt(4);
                String anios = texto.charAt(6) + "" + texto.charAt(7) + "" + texto.charAt(8) + "" + texto.charAt(9);
                int dia = Integer.parseInt(dias);
                int mes = Integer.parseInt(meses);
                int anio = Integer.parseInt(anios);
                if ((dia <= 0) || (dia > 31)) {
                    JOptionPane.showMessageDialog(rootPane, "El Dia de la fecha ingresada es invalida!!!", "AVISO DEL SISTEMA", 0);
                    this.ftxtFecha.setText("");
                    this.ftxtFecha.requestFocus();
                } else if ((mes < 1) || (mes > 12)) {
                    JOptionPane.showMessageDialog(rootPane, "El Mes de la fecha ingresada es invalida", "AVISO DEL SISTEMA", 0);
                    this.ftxtFecha.setText("");
                    this.ftxtFecha.requestFocus();
                } else if ((anio > y)) {
                    JOptionPane.showMessageDialog(rootPane, "El Año de la fecha ingresada no puede ser mayor al aÃ±o actual (" + y + ")!!!", "AVISO DEL SISTEMA", 0);
                    this.ftxtFecha.setText("");
                    this.ftxtFecha.requestFocus();
                } else if ((anio < 1920)) {
                    JOptionPane.showMessageDialog(rootPane, "El Año de la fecha ingresada es incoherente!!!", "AVISO DEL SISTEMA", 0);
                    this.ftxtFecha.setText("");
                    this.ftxtFecha.requestFocus();
                } else if ((anio == y) && (dia < d)) {
                    if (d >= 10) {
                        JOptionPane.showMessageDialog(rootPane, "El Dia de la fecha ingresada no puede ser menor al dia actual (" + d + ")!!!", "AVISO DEL SISTEMA", 0);
                        this.ftxtFecha.setText("");
                        this.ftxtFecha.requestFocus();
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "El Dia de la fecha ingresada no puede ser menor al dia actual (0" + d + ")!!!", "AVISO DEL SISTEMA", 0);
                        this.ftxtFecha.setText("");
                        this.ftxtFecha.requestFocus();
                    }
                } else if ((anio == y) && (mes < m)) {
                    if (m >= 10) {
                        JOptionPane.showMessageDialog(rootPane, "El Mes de la fecha ingresada no puede ser menor al mes actual (" + m + ")!!!", "AVISO DEL SISTEMA", 0);
                        this.ftxtFecha.setText("");
                        this.ftxtFecha.requestFocus();
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "El Mes de la fecha ingresada no puede ser menor al mes actual (0" + m + ")!!!", "AVISO DEL SISTEMA", 0);
                        this.ftxtFecha.setText("");
                        this.ftxtFecha.requestFocus();
                    }
                } else {
                            ac.modificar(this.txtidpartido.getText(), this.txtequipol.getText().toUpperCase(), this.txtequipov.getText().toUpperCase(), this.txtidcancha.getText().toUpperCase(), this.ftxtFecha.getText());
                        JOptionPane.showMessageDialog(rootPane, "El registro ha sido correctamente actualizado!!", "AVISO DEL SISTEMA", 1);
                        Bloquear();
                        Limpiar();
                        this.txtidpartido.setText("");
                        prueba= false;
                        newRecord = false;
                    
                }
            }
        }
    }//GEN-LAST:event_btnguardarmodificacionActionPerformed

    private void txtequipolKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtequipolKeyTyped
        char val=evt.getKeyChar();
        if(Character.isLetter(val)){
            getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_txtequipolKeyTyped

    private void txtequipovKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtequipovKeyTyped
        char val=evt.getKeyChar();
        if(Character.isLetter(val)){
            getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_txtequipovKeyTyped

    private void txtidcanchaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidcanchaKeyTyped
         char val=evt.getKeyChar();
        if(Character.isLetter(val)){
            getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_txtidcanchaKeyTyped

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
       txtidpartido.setText("");
       txtequipol.setText("");
       txtequipov.setText("");
       txtidcancha.setText("");
       ftxtFecha.setText("");
       Bloquear();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnmenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenu2ActionPerformed
        MENU ab = new MENU();
        ab.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnmenu2ActionPerformed

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
            java.util.logging.Logger.getLogger(frmpartidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmpartidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmpartidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmpartidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmpartidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnguardarmodificacion;
    private javax.swing.JButton btnmenu2;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JFormattedTextField ftxtFecha;
    private javax.swing.JLabel lbidcancha;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblequipol;
    private javax.swing.JLabel lblequipov;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JLabel lblformatoF;
    private javax.swing.JLabel lblidpartido;
    private javax.swing.JTextField txtequipol;
    private javax.swing.JTextField txtequipov;
    private javax.swing.JTextField txtidcancha;
    private javax.swing.JTextField txtidpartido;
    // End of variables declaration//GEN-END:variables

}

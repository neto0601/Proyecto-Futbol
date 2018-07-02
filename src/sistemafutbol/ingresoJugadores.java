
package sistemafutbol;



import javax.swing.JOptionPane;


public class ingresoJugadores extends javax.swing.JFrame {

   private jugadores jo;
    private sqlJugadores sjr;
    
    public ingresoJugadores() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        Carnet = new javax.swing.JLabel();
        Nombres = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        Apellidos = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        Carrera = new javax.swing.JLabel();
        txtCarrera = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        idequipo = new javax.swing.JLabel();
        txtidequipo = new javax.swing.JTextField();
        txtCarnet = new javax.swing.JFormattedTextField();
        btnSalir = new javax.swing.JButton();
        btnmenu2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JUGADORES");
        setPreferredSize(new java.awt.Dimension(455, 427));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Ingrese los datos del jugador");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 340, 29));

        Carnet.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        Carnet.setForeground(new java.awt.Color(255, 255, 255));
        Carnet.setText("Carnet:");
        getContentPane().add(Carnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 64, -1));

        Nombres.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        Nombres.setForeground(new java.awt.Color(255, 255, 255));
        Nombres.setText("Nombres:");
        getContentPane().add(Nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 80, 20));
        getContentPane().add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 120, 20));

        Apellidos.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        Apellidos.setForeground(new java.awt.Color(255, 255, 255));
        Apellidos.setText("Apellidos:");
        getContentPane().add(Apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 80, -1));
        getContentPane().add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 120, 20));

        Carrera.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        Carrera.setForeground(new java.awt.Color(255, 255, 255));
        Carrera.setText("Carrera:");
        getContentPane().add(Carrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 80, -1));
        getContentPane().add(txtCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 120, 20));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 120, 20));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 120, 20));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 120, 20));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 120, 20));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 120, 20));

        idequipo.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        idequipo.setForeground(new java.awt.Color(255, 255, 255));
        idequipo.setText("id equipo:");
        getContentPane().add(idequipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 90, -1));
        getContentPane().add(txtidequipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 120, 20));

        try {
            txtCarnet.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("UU#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCarnet.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(txtCarnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 120, 20));

        btnSalir.setText("Salir");
        btnSalir.setMaximumSize(new java.awt.Dimension(70, 50));
        btnSalir.setMinimumSize(new java.awt.Dimension(70, 50));
        btnSalir.setPreferredSize(new java.awt.Dimension(70, 50));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 120, 20));

        btnmenu2.setText("Regresar");
        btnmenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenu2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnmenu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 120, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/jugadoresPS.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void Limpiar(){
        txtCarnet.setText(null);
        txtNombres.setText(null);
        txtApellidos.setText(null);
        txtidequipo.setText(null);
        txtCarrera.setText(null);
    }
    
    
      
    
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
         if(!txtCarnet.getText().isEmpty() && !txtNombres.getText().isEmpty() && !txtApellidos.getText().isEmpty() && !txtidequipo.getText().isEmpty() && !txtCarrera.getText().isEmpty()){
        sqlJugadores mas = new sqlJugadores();
        jugadores met = new jugadores();
        
        met.setCarnet(txtCarnet.getText());
        met.setNombres(txtNombres.getText());
        met.setApellidos(txtApellidos.getText());
        met.setIdequipo(Integer.parseInt(txtidequipo.getText()));
        met.setCarrera(txtCarrera.getText());
        if(mas.registrar(met)){
            JOptionPane.showMessageDialog(null, "Se han ingresado los datos correctamente");
        }else{
            JOptionPane.showMessageDialog(null, "Error al ingresar el registro");
        }
        Limpiar();
        
        }else{
    
            JOptionPane.showMessageDialog(null, "Debe de llenar todos los campos");
    
                }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        if(!txtCarnet.getText().isEmpty()){
           sjr = new sqlJugadores();       
           sjr.Eliminar(txtCarnet.getText());
           JOptionPane.showMessageDialog(null, "Se ha eliminado exitosamente el registro del jugador");
           Limpiar();
       }else{
           JOptionPane.showMessageDialog(null,"Debe de introducir el carnet del jugador para eliminar el registro");
       }
        
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
       
        if(!txtCarnet.getText().isEmpty() && !txtNombres.getText().isEmpty() && !txtApellidos.getText().isEmpty() && !txtCarrera.getText().isEmpty()){
         sjr = new sqlJugadores();
        
        jo = new jugadores(txtCarnet.getText(), txtNombres.getText(), txtApellidos.getText(),Integer.parseInt(txtidequipo.getText()), txtCarrera.getText());
        sjr.updateJugador(jo);   
        JOptionPane.showMessageDialog(null, "Se han modificado exitosamente los datos del jugador");
        Limpiar();
        }else{
            JOptionPane.showMessageDialog(null, "Debe de llenar todos los campos de informacion");
        }
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        if(!txtCarnet.getText().isEmpty()){
        sjr = new sqlJugadores();
        jo = sjr.buscarJugador(txtCarnet.getText());
        txtNombres.setText(jo.getNombres());
        txtApellidos.setText(jo.getApellidos());
        txtidequipo.setText(String.valueOf(jo.getIdequipo()));
        txtCarrera.setText(jo.getCarrera());
        
      }else{
          JOptionPane.showMessageDialog(null,"Debe de introducir el carnet del jugador que desea buscar");
      } 
        
      
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        
        Limpiar();
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(ingresoJugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ingresoJugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ingresoJugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ingresoJugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ingresoJugadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellidos;
    private javax.swing.JLabel Carnet;
    private javax.swing.JLabel Carrera;
    private javax.swing.JLabel Nombres;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnmenu2;
    private javax.swing.JLabel idequipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JFormattedTextField txtCarnet;
    private javax.swing.JTextField txtCarrera;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtidequipo;
    // End of variables declaration//GEN-END:variables
}

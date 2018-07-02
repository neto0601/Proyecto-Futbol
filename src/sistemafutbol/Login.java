
package sistemafutbol;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;




public class Login extends javax.swing.JFrame {

   
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
     } 
    MetodoLogin met = new MetodoLogin();

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtfUsuario = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        btnIniciar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jlblContraseña = new javax.swing.JLabel();
        jlblUsuario = new javax.swing.JLabel();
        Título = new javax.swing.JLabel();
        ImagenFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(424, 400));
        setMinimumSize(new java.awt.Dimension(424, 400));
        setPreferredSize(new java.awt.Dimension(424, 420));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtfUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jtfUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 200, 20));

        jPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordKeyPressed(evt);
            }
        });
        getContentPane().add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 200, 20));

        btnIniciar.setFont(new java.awt.Font("Aparajita", 3, 24)); // NOI18N
        btnIniciar.setText("Iniciar");
        btnIniciar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIniciar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 160, 30));

        btnSalir.setFont(new java.awt.Font("Aparajita", 3, 24)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalir.setMaximumSize(new java.awt.Dimension(61, 23));
        btnSalir.setMinimumSize(new java.awt.Dimension(61, 23));
        btnSalir.setPreferredSize(new java.awt.Dimension(61, 23));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 160, 30));

        jlblContraseña.setFont(new java.awt.Font("Aparajita", 3, 24)); // NOI18N
        jlblContraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblContraseña.setText("Contraseña:");
        getContentPane().add(jlblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 110, 20));

        jlblUsuario.setFont(new java.awt.Font("Britannic Bold", 2, 18)); // NOI18N
        jlblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblUsuario.setText("Usuario:");
        getContentPane().add(jlblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 80, 20));

        Título.setBackground(new java.awt.Color(0, 0, 0));
        Título.setFont(new java.awt.Font("Britannic Bold", 2, 36)); // NOI18N
        Título.setForeground(new java.awt.Color(255, 255, 255));
        Título.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Título.setText("Inicio de Sesión");
        getContentPane().add(Título, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 300, 40));

        ImagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/loginPS.jpg"))); // NOI18N
        ImagenFondo.setMaximumSize(new java.awt.Dimension(1000, 1000));
        ImagenFondo.setMinimumSize(new java.awt.Dimension(1000, 1000));
        ImagenFondo.setPreferredSize(new java.awt.Dimension(1000, 1000));
        getContentPane().add(ImagenFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        if(met.validar()==1){
            this.dispose();
            
            JOptionPane.showMessageDialog(null,"Bienvenido:\n Has ingresado satisfactoriamente al sistema","Mensaje de Bienvenida", JOptionPane.INFORMATION_MESSAGE);
            MENU show = new MENU();
            show.setVisible(true);
            
        }else{
          JOptionPane.showMessageDialog(null,"Acceso Negado\n Por favor ingrese usuario y contraseña correctos","Acceso denegado", JOptionPane.ERROR_MESSAGE);
            
        }
        
// TODO add your handling code here:
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordKeyPressed
    if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        btnIniciarActionPerformed(null);
    }


// TODO add your handling code here:
    }//GEN-LAST:event_jPasswordKeyPressed

    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImagenFondo;
    private javax.swing.JLabel Título;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnSalir;
    public static javax.swing.JPasswordField jPassword;
    private javax.swing.JLabel jlblContraseña;
    private javax.swing.JLabel jlblUsuario;
    public static javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables

}

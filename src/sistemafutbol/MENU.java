/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemafutbol;

/**
 *
 * @author H ERICK
 */
public class MENU extends javax.swing.JFrame {

    /**
     * Creates new form MENU
     */
    public MENU() {
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

        btnequipos = new javax.swing.JButton();
        btnjugadores = new javax.swing.JButton();
        btncanchas = new javax.swing.JButton();
        btnarbitro = new javax.swing.JButton();
        btntipohrchos = new javax.swing.JButton();
        btnpartidos = new javax.swing.JButton();
        btnarbitrospartidos = new javax.swing.JButton();
        btnhechos = new javax.swing.JButton();
        lblmenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU PRICIPAL");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnequipos.setText("EQUIPOS");
        btnequipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnequiposActionPerformed(evt);
            }
        });
        getContentPane().add(btnequipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 130, -1));

        btnjugadores.setText("JUGADORES");
        btnjugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnjugadoresActionPerformed(evt);
            }
        });
        getContentPane().add(btnjugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 130, -1));

        btncanchas.setText("CANCHAS");
        btncanchas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncanchasActionPerformed(evt);
            }
        });
        getContentPane().add(btncanchas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 130, -1));

        btnarbitro.setText("ARBITROS");
        btnarbitro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnarbitroActionPerformed(evt);
            }
        });
        getContentPane().add(btnarbitro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 130, -1));

        btntipohrchos.setText("TIPO DE HECHOS");
        btntipohrchos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntipohrchosActionPerformed(evt);
            }
        });
        getContentPane().add(btntipohrchos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 160, -1));

        btnpartidos.setText("PARTIDOS");
        btnpartidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpartidosActionPerformed(evt);
            }
        });
        getContentPane().add(btnpartidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 160, -1));

        btnarbitrospartidos.setText("ARBITROS POR PARTIDOS");
        btnarbitrospartidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnarbitrospartidosActionPerformed(evt);
            }
        });
        getContentPane().add(btnarbitrospartidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        btnhechos.setText("HECHOS");
        btnhechos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhechosActionPerformed(evt);
            }
        });
        getContentPane().add(btnhechos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 160, -1));

        lblmenu.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblmenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmenu.setText("B I E N V E N I D O");
        getContentPane().add(lblmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 210, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnequiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnequiposActionPerformed
        frmequipos ab = new frmequipos();
       ab.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnequiposActionPerformed

    private void btnjugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjugadoresActionPerformed
      ingresoJugadores   ab = new ingresoJugadores();
       ab.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnjugadoresActionPerformed

    private void btncanchasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncanchasActionPerformed
        frmcanchas ab = new frmcanchas();
       ab.setVisible(true);
       dispose();
    }//GEN-LAST:event_btncanchasActionPerformed

    private void btnarbitroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnarbitroActionPerformed
       frmarbitros ab = new frmarbitros();
       ab.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnarbitroActionPerformed

    private void btntipohrchosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntipohrchosActionPerformed
        frmtipos_hechos ab = new frmtipos_hechos();
       ab.setVisible(true);
       dispose();
    }//GEN-LAST:event_btntipohrchosActionPerformed

    private void btnpartidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpartidosActionPerformed
        frmpartidos ab = new frmpartidos();
       ab.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnpartidosActionPerformed

    private void btnarbitrospartidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnarbitrospartidosActionPerformed
        frmarbitros_partidos ab = new frmarbitros_partidos();
       ab.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnarbitrospartidosActionPerformed

    private void btnhechosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhechosActionPerformed
      frmhechos ab = new frmhechos();
       ab.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnhechosActionPerformed

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
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnarbitro;
    private javax.swing.JButton btnarbitrospartidos;
    private javax.swing.JButton btncanchas;
    private javax.swing.JButton btnequipos;
    private javax.swing.JButton btnhechos;
    private javax.swing.JButton btnjugadores;
    private javax.swing.JButton btnpartidos;
    private javax.swing.JButton btntipohrchos;
    private javax.swing.JLabel lblmenu;
    // End of variables declaration//GEN-END:variables
}


package com.arcos.gestion_ordenes.GUI;

import com.arcos.gestion_ordenes.DAOinter.DAO;
import com.arcos.gestion_ordenes.DAO.DAOTecnicosImpl;
import com.arcos.gestion_ordenes.Logica.Tecnico;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.FlatArcOrangeIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDarkerIJTheme;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;


public class Login extends javax.swing.JFrame {

 
    public Login() {
        initComponents();
        initThings();
       
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JpanelFondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        lbUsuario = new javax.swing.JLabel();
        lbContrasena = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(414, 408));
        setMinimumSize(new java.awt.Dimension(414, 408));
        setResizable(false);

        JpanelFondo.setBackground(new java.awt.Color(204, 204, 204));
        JpanelFondo.setMaximumSize(new java.awt.Dimension(414, 408));
        JpanelFondo.setMinimumSize(new java.awt.Dimension(414, 408));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iniciar-sesion.png"))); // NOI18N

        btnIngresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        lbUsuario.setText("Usuario:");

        lbContrasena.setText("Contraseña:");

        javax.swing.GroupLayout JpanelFondoLayout = new javax.swing.GroupLayout(JpanelFondo);
        JpanelFondo.setLayout(JpanelFondoLayout);
        JpanelFondoLayout.setHorizontalGroup(
            JpanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelFondoLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(JpanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbContrasena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUsuario)
                    .addComponent(txtContrasena, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        JpanelFondoLayout.setVerticalGroup(
            JpanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelFondoLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbUsuario)
                .addGap(1, 1, 1)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbContrasena)
                .addGap(10, 10, 10)
                .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JpanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JpanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
       DashBoard dash=new DashBoard();
       dash.setVisible(true);
       this.setVisible(false);
 
       
  
    }//GEN-LAST:event_btnIngresarActionPerformed

 
    public static void main(String args[]) {
      
        /* Set the Nimbus look and feel */
        try {
            FlatArcOrangeIJTheme.setup();
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JpanelFondo;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbContrasena;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JTextField txtContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    private void initThings() {
         setLocationRelativeTo(null);
    lbUsuario.putClientProperty( "FlatLaf.style", "font: bold $h3.regular.font" );
    lbContrasena.putClientProperty("FlatLaf.style", "font: bold $h3.regular.font");
    }
}

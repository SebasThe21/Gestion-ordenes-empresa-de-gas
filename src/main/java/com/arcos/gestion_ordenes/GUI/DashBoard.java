
package com.arcos.gestion_ordenes.GUI;


import com.arcos.gestion_ordenes.GUI.views.*;

import com.formdev.flatlaf.intellijthemes.FlatArcOrangeIJTheme;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class DashBoard extends javax.swing.JFrame {

   
    public DashBoard() {
        initComponents();
        initStyles();
        runn();
    }
   public void runn(){
         /* Set the Nimbus look and feel */
                try {
            FlatArcOrangeIJTheme.setup();
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

       setLocationRelativeTo(null);
     
       setPanel(new Inicio1());
       
       
   }
   public static void setPanel(JPanel p){
       p.setSize(680,530);
       p.setLocation(0,0);
       
       content.removeAll();
       content.add(p,BorderLayout.CENTER);
       content.revalidate();
       content.repaint();
   }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DashPanel = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        labelMenu = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        btnIngresarSolicitud1 = new javax.swing.JButton();
        btnTrabajos = new javax.swing.JButton();
        btnCrearOrden1 = new javax.swing.JButton();
        btnVerOrdenes1 = new javax.swing.JButton();
        btnVerClientes1 = new javax.swing.JButton();
        btnVerTecnicos1 = new javax.swing.JButton();
        btnVerAlmacen1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(870, 140));
        setResizable(false);
        setSize(new java.awt.Dimension(870, 140));

        DashPanel.setBackground(new java.awt.Color(255, 255, 255));
        DashPanel.setPreferredSize(new java.awt.Dimension(870, 140));

        Menu.setBackground(new java.awt.Color(255, 153, 51));

        labelMenu.setText("Gases de Cali");

        btnInicio.setBackground(new java.awt.Color(255, 204, 0));
        btnInicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hogar (1).png"))); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnInicio.setBorderPainted(false);
        btnInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInicio.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnInicio.setIconTextGap(10);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnIngresarSolicitud1.setBackground(new java.awt.Color(255, 204, 0));
        btnIngresarSolicitud1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnIngresarSolicitud1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agregar-archivo.png"))); // NOI18N
        btnIngresarSolicitud1.setText("Ingresar solicitud");
        btnIngresarSolicitud1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnIngresarSolicitud1.setBorderPainted(false);
        btnIngresarSolicitud1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnIngresarSolicitud1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnIngresarSolicitud1.setIconTextGap(10);
        btnIngresarSolicitud1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarSolicitud1ActionPerformed(evt);
            }
        });

        btnTrabajos.setBackground(new java.awt.Color(255, 204, 0));
        btnTrabajos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTrabajos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tuberia-de-gas.png"))); // NOI18N
        btnTrabajos.setText("Trabajos");
        btnTrabajos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnTrabajos.setBorderPainted(false);
        btnTrabajos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTrabajos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnTrabajos.setIconTextGap(10);
        btnTrabajos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrabajosActionPerformed(evt);
            }
        });

        btnCrearOrden1.setBackground(new java.awt.Color(255, 204, 0));
        btnCrearOrden1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCrearOrden1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lista-de-verificacion.png"))); // NOI18N
        btnCrearOrden1.setText("Crear orden");
        btnCrearOrden1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnCrearOrden1.setBorderPainted(false);
        btnCrearOrden1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCrearOrden1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCrearOrden1.setIconTextGap(10);
        btnCrearOrden1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearOrden1ActionPerformed(evt);
            }
        });

        btnVerOrdenes1.setBackground(new java.awt.Color(255, 204, 0));
        btnVerOrdenes1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVerOrdenes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nota.png"))); // NOI18N
        btnVerOrdenes1.setText("Ver ordenes");
        btnVerOrdenes1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnVerOrdenes1.setBorderPainted(false);
        btnVerOrdenes1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVerOrdenes1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnVerOrdenes1.setIconTextGap(10);
        btnVerOrdenes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerOrdenes1ActionPerformed(evt);
            }
        });

        btnVerClientes1.setBackground(new java.awt.Color(255, 204, 0));
        btnVerClientes1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVerClientes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente.png"))); // NOI18N
        btnVerClientes1.setText("Ver clientes");
        btnVerClientes1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnVerClientes1.setBorderPainted(false);
        btnVerClientes1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVerClientes1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnVerClientes1.setIconTextGap(10);
        btnVerClientes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerClientes1ActionPerformed(evt);
            }
        });

        btnVerTecnicos1.setBackground(new java.awt.Color(255, 204, 0));
        btnVerTecnicos1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVerTecnicos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/soporte-tecnico.png"))); // NOI18N
        btnVerTecnicos1.setText("Ver técnicos");
        btnVerTecnicos1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnVerTecnicos1.setBorderPainted(false);
        btnVerTecnicos1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVerTecnicos1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnVerTecnicos1.setIconTextGap(10);
        btnVerTecnicos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTecnicos1ActionPerformed(evt);
            }
        });

        btnVerAlmacen1.setBackground(new java.awt.Color(255, 204, 0));
        btnVerAlmacen1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVerAlmacen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/almacen.png"))); // NOI18N
        btnVerAlmacen1.setText("Ver Almacén");
        btnVerAlmacen1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnVerAlmacen1.setBorderPainted(false);
        btnVerAlmacen1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVerAlmacen1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnVerAlmacen1.setIconTextGap(10);
        btnVerAlmacen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerAlmacen1ActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gas-natural.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(btnVerClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnIngresarSolicitud1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnVerAlmacen1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnTrabajos, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnVerOrdenes1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnCrearOrden1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnVerTecnicos1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(labelMenu))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(labelMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(btnVerClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnIngresarSolicitud1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(btnVerAlmacen1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(btnTrabajos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btnVerOrdenes1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(btnCrearOrden1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(btnVerTecnicos1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        content.setBackground(new java.awt.Color(204, 204, 204));
        content.setOpaque(false);

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout DashPanelLayout = new javax.swing.GroupLayout(DashPanel);
        DashPanel.setLayout(DashPanelLayout);
        DashPanelLayout.setHorizontalGroup(
            DashPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashPanelLayout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(DashPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        DashPanelLayout.setVerticalGroup(
            DashPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(DashPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DashPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DashPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 489, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnTrabajosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrabajosActionPerformed
        setPanel(new verTrabajos());
    }//GEN-LAST:event_btnTrabajosActionPerformed

    private void btnIngresarSolicitud1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarSolicitud1ActionPerformed
       int opcionSeleccionada = JOptionPane.showOptionDialog(
                null, "¿Es un cliente nuevo?",  "Confirmación",JOptionPane.YES_NO_OPTION,  JOptionPane.QUESTION_MESSAGE, // Tipo de mensaje (pregunta)
                null,  new Object[]{"Sí", "No"}, "Sí");

        if (opcionSeleccionada == JOptionPane.YES_OPTION) {
             setPanel(new IngresoSolicitud());
        } else if (opcionSeleccionada == JOptionPane.NO_OPTION) {
            setPanel(new IngresoSolicitudClienteExistente());
        } else {
            setPanel(new IngresoSolicitud());
        }
    

       
    }//GEN-LAST:event_btnIngresarSolicitud1ActionPerformed

    private void btnCrearOrden1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearOrden1ActionPerformed
        setPanel(new CrearOrden());
    }//GEN-LAST:event_btnCrearOrden1ActionPerformed

    private void btnVerOrdenes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerOrdenes1ActionPerformed
        setPanel(new verOrdenes());
    }//GEN-LAST:event_btnVerOrdenes1ActionPerformed

    private void btnVerClientes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerClientes1ActionPerformed
        setPanel(new verClientes());
    }//GEN-LAST:event_btnVerClientes1ActionPerformed

    private void btnVerTecnicos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTecnicos1ActionPerformed
        setPanel(new verTecnicos());
    }//GEN-LAST:event_btnVerTecnicos1ActionPerformed

    private void btnVerAlmacen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerAlmacen1ActionPerformed
        setPanel(new verAlmacen());
    }//GEN-LAST:event_btnVerAlmacen1ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DashPanel;
    private javax.swing.JPanel Menu;
    private javax.swing.JButton btnCrearOrden1;
    private javax.swing.JButton btnIngresarSolicitud1;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnTrabajos;
    private javax.swing.JButton btnVerAlmacen1;
    private javax.swing.JButton btnVerClientes1;
    private javax.swing.JButton btnVerOrdenes1;
    private javax.swing.JButton btnVerTecnicos1;
    private static javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelMenu;
    // End of variables declaration//GEN-END:variables

    private void initStyles() {
         labelMenu.putClientProperty("FlatLaf.style", "font: bold $h3.regular.font");
    }
}

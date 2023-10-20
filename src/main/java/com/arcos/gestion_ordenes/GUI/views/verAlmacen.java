/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.arcos.gestion_ordenes.GUI.views;

import com.arcos.gestion_ordenes.DAO.DAOMaterialImpl;
import com.arcos.gestion_ordenes.DAOinter.DAOMaterial;
import com.arcos.gestion_ordenes.Logica.Material;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sebar
 */
public class verAlmacen extends javax.swing.JPanel {

    private DAOMaterial dMateriales = new DAOMaterialImpl();
    private List<Material> lMaterial = null;

    public verAlmacen() {
        initComponents();
        cargarMateriales();
    }

    public void init() {
        labelMain.putClientProperty("FlatLaf.style", "font: bold $h1.regular.font");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelMain = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMateriales = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnAgregar2 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(680, 440));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(680, 440));

        labelMain.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelMain.setForeground(new java.awt.Color(0, 0, 0));
        labelMain.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMain.setText("Almacen Gases S.A");

        tableMateriales.setBackground(new java.awt.Color(255, 255, 204));
        tableMateriales.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tableMateriales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableMateriales);

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lupa.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/borrar (1).png"))); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnEditar.setIconTextGap(2);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnAgregar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boton-agregar.png"))); // NOI18N
        btnAgregar2.setText("Agregar");
        btnAgregar2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAgregar2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAgregar2.setIconTextGap(2);
        btnAgregar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(labelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAgregar2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBorrar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(labelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrar)
                    .addComponent(btnEditar)
                    .addComponent(btnAgregar2))
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    //<editor-fold defaultstate="collapsed" desc="Metodos botones">
    private void btnAgregar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar2ActionPerformed
        final AgregarEditMaterial aM = new AgregarEditMaterial();
        aM.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        aM.setVisible(true);
        aM.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                cargarMateriales();
            }
        });
    }//GEN-LAST:event_btnAgregar2ActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (tableMateriales.getRowCount() > 0 && tableMateriales.getSelectedRow() != -1) {
            int id_material = Integer.parseInt(String.valueOf(tableMateriales.getValueAt(tableMateriales.getSelectedRow(), 0)));
            final AgregarEditMaterial aM = new AgregarEditMaterial(id_material);
            aM.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            aM.setVisible(true);
            aM.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                    cargarMateriales();
                }
            });
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        if (tableMateriales.getRowCount() > 0 && tableMateriales.getSelectedRow() != -1) {
            try {
                int id_material = Integer.parseInt(String.valueOf(tableMateriales.getValueAt(tableMateriales.getSelectedRow(), 0)));
                dMateriales.eliminar(id_material);
                javax.swing.JOptionPane.showMessageDialog(this, "Material eliminado. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                cargarMateriales();
            } catch (Exception ex) {
                Logger.getLogger(verAlmacen.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al eliminar, seleccione un material. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        DefaultTableModel tModel = modeloTabla();
        try {
            String nombreMaterial = txtBuscar.getText();
            List<Material> materialesBuscados = dMateriales.buscarMateriales(nombreMaterial);
            if (materialesBuscados != null) {
                for (Material mate : materialesBuscados) {
                    Object materiales[] = {mate.getId_material(), mate.getNombre_material(), mate.getCoste_material(), mate.getUnidades_disponibles()};
                    tModel.addRow(materiales);
                }
                tableMateriales.setModel(tModel);
            }
        } catch (Exception ex) {
            Logger.getLogger(verAlmacen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed
    //</editor-fold>
   
    //<editor-fold defaultstate="collapsed" desc="Carga de objetos y modelados">
    private void cargarMateriales() {
        DefaultTableModel tModel = modeloTabla();
        try {
            lMaterial = dMateriales.traerTodos();
            if (lMaterial != null) {
                for (Material mate : lMaterial) {
                    Object materiales[] = {mate.getId_material(), mate.getNombre_material(), mate.getCoste_material(), mate.getUnidades_disponibles()};
                    tModel.addRow(materiales);
                }
                tableMateriales.setModel(tModel);
            }
        } catch (Exception ex) {
            Logger.getLogger(verAlmacen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public DefaultTableModel modeloTabla() {
        DefaultTableModel tModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        String titleTable[] = {"ID", "Nombre", "Costo unidad", "Cantidad disponibles"};
        tModel.setColumnIdentifiers(titleTable);
        return tModel;
    }
    //</editor-fold>
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar2;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelMain;
    private javax.swing.JTable tableMateriales;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}

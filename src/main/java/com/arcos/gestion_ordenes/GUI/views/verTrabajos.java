
package com.arcos.gestion_ordenes.GUI.views;

import com.arcos.gestion_ordenes.DAO.DAOTrabajosImpl;
import com.arcos.gestion_ordenes.DAOinter.DAOTrabajo;

import com.arcos.gestion_ordenes.Logica.Trabajos;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;


public class verTrabajos extends javax.swing.JPanel {

    private DAOTrabajo dTrabajos=new DAOTrabajosImpl();
    private List<Trabajos>lTrabajos=null;
    public verTrabajos() {
        initComponents();
        cargarTrabajos();
    }
    
    public void init(){
        labelMain.putClientProperty("FlatLaf.style", "font: bold $h1.regular.font");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelMain = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTrabajos = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(680, 440));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(680, 440));

        labelMain.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelMain.setForeground(new java.awt.Color(0, 0, 0));
        labelMain.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMain.setText("Trabajos Gases S.A");

        tableTrabajos.setBackground(new java.awt.Color(255, 255, 204));
        tableTrabajos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tableTrabajos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableTrabajos);

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

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boton-agregar.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAgregar.setIconTextGap(2);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
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
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBuscar))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnEditar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBorrar))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                    .addComponent(btnAgregar))
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

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        final AgregarEditTrabajos aTrabajos = new AgregarEditTrabajos();
        aTrabajos.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        aTrabajos.setVisible(true);
        aTrabajos.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                cargarTrabajos();
            }
        });
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (tableTrabajos.getRowCount() > 0 && tableTrabajos.getSelectedRow() != -1) {
            int id_trabajos = Integer.parseInt(String.valueOf(tableTrabajos.getValueAt(tableTrabajos.getSelectedRow(), 0)));
            final AgregarEditTrabajos aTrabajos = new AgregarEditTrabajos(id_trabajos);
            aTrabajos.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            aTrabajos.setVisible(true);
            aTrabajos.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                    cargarTrabajos();
                }
            });
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
         if (tableTrabajos.getRowCount() > 0 && tableTrabajos.getSelectedRow() != -1) {
             try {
                 int id_trabajos = Integer.parseInt(String.valueOf(tableTrabajos.getValueAt(tableTrabajos.getSelectedRow(), 0)));
                 dTrabajos.eliminar(id_trabajos);
                  javax.swing.JOptionPane.showMessageDialog(this, "Material eliminado. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                  cargarTrabajos();
             } catch (Exception ex) {
                 Logger.getLogger(verTrabajos.class.getName()).log(Level.SEVERE, null, ex);
             }
               
         }
         else{
              javax.swing.JOptionPane.showMessageDialog(this, "Error al eliminar. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        DefaultTableModel tModel=modeloTabla();
        try {
            String nombre=txtBuscar.getText();
            List<Trabajos>trabajosBusqueda=dTrabajos.BuscarTrabajos(nombre);
            for(Trabajos t:trabajosBusqueda){
                 Object trabajos[]={t.getId_trabajos(),t.getNombre_trabajos(),t.getCosto_unidad()};
                tModel.addRow(trabajos);
            }
            tableTrabajos.setModel(tModel);
        } catch (Exception ex) {
            Logger.getLogger(verTrabajos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed
    private void cargarTrabajos(){
        try {
            DefaultTableModel tModel=modeloTabla();
            lTrabajos=dTrabajos.traerTodos();
            
            for(Trabajos t:lTrabajos){
                Object trabajos[]={t.getId_trabajos(),t.getNombre_trabajos(),t.getCosto_unidad()};
                tModel.addRow(trabajos);
            }
            tableTrabajos.setModel(tModel);
        } catch (Exception ex) {
            Logger.getLogger(verTrabajos.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    public DefaultTableModel modeloTabla() {
        DefaultTableModel tModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        String titleTable[] = {"ID", "Nombre", "Costo unidad"};
        tModel.setColumnIdentifiers(titleTable);
        return tModel;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelMain;
    private javax.swing.JTable tableTrabajos;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}

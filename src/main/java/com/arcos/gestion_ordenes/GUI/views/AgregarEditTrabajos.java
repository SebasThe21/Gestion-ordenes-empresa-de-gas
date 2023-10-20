
package com.arcos.gestion_ordenes.GUI.views;

import com.arcos.gestion_ordenes.DAO.DAOTrabajosImpl;
import com.arcos.gestion_ordenes.DAOinter.DAOTrabajo;
import com.arcos.gestion_ordenes.Logica.Trabajos;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AgregarEditTrabajos extends javax.swing.JFrame {
//<editor-fold defaultstate="collapsed" desc="Instanciamiento del DAO y listas globales">
private DAOTrabajo dTrabajos=new DAOTrabajosImpl();
private int idTrabajos;   
boolean isEdit=false;
Trabajos trabajo=null;
//</editor-fold>
public AgregarEditTrabajos() {
        initComponents();
       
    }
public AgregarEditTrabajos(int id){
     initComponents();
     idTrabajos=id;
     isEdit=true;
     cargarTrabajo();
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCostoUnidad = new javax.swing.JTextField();
        txtNombreTrabajos = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Trabajos");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre trabajos:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Costo unidad:");

        btnGuardar.setBackground(new java.awt.Color(204, 204, 204));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salvar.png"))); // NOI18N
        btnGuardar.setBorder(null);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/limpiar.png"))); // NOI18N
        btnLimpiar.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(122, 122, 122))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpiar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 45, Short.MAX_VALUE))
                            .addComponent(txtNombreTrabajos))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtCostoUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCostoUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreTrabajos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar)
                    .addComponent(btnLimpiar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
      if(isEdit){
          editarTrabajo();
      }
      else{
          guardarTrabajo();
      }
    }//GEN-LAST:event_btnGuardarActionPerformed
   
    //<editor-fold defaultstate="collapsed" desc="Metodo de guardado, editado y carga de objeto">
    private void guardarTrabajo(){
        try {
        Trabajos traba=new Trabajos();
        
        traba.setNombre_trabajos(txtNombreTrabajos.getText());
        traba.setCosto_unidad(Double.parseDouble(txtCostoUnidad.getText()));
        dTrabajos.guardar(traba);
         javax.swing.JOptionPane.showMessageDialog(this, "Trabajo guardado. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
         this.dispose();
    } catch (Exception ex) {
        Logger.getLogger(AgregarEditTrabajos.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    private void editarTrabajo(){
        try {
        trabajo.setNombre_trabajos(txtNombreTrabajos.getText());
        trabajo.setCosto_unidad(Double.parseDouble(txtCostoUnidad.getText()));
        dTrabajos.actualizar(trabajo);
         javax.swing.JOptionPane.showMessageDialog(this, "Trabajo actualizado. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
         this.dispose();
    } catch (Exception ex) {
        Logger.getLogger(AgregarEditTrabajos.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
    private void cargarTrabajo(){
    try {
        trabajo=(Trabajos) dTrabajos.traerUno(idTrabajos);
        txtNombreTrabajos.setText(trabajo.getNombre_trabajos());
        txtCostoUnidad.setText(String.valueOf(trabajo.getCosto_unidad()));
    } catch (Exception ex) {
        Logger.getLogger(AgregarEditTrabajos.class.getName()).log(Level.SEVERE, null, ex);
    }
   }
   //</editor-fold>


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCostoUnidad;
    private javax.swing.JTextField txtNombreTrabajos;
    // End of variables declaration//GEN-END:variables
}

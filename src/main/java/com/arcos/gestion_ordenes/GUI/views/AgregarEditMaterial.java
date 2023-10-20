
package com.arcos.gestion_ordenes.GUI.views;

import com.arcos.gestion_ordenes.DAO.DAOMaterialImpl;
import com.arcos.gestion_ordenes.DAOinter.DAOMaterial;
import com.arcos.gestion_ordenes.Logica.Material;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AgregarEditMaterial extends javax.swing.JFrame {

    //<editor-fold defaultstate="collapsed" desc="Instanciamiento del DAO y listas globales">
    private DAOMaterial dMaterial=new DAOMaterialImpl();
    private boolean isEdit;
    private int id_material;
    private Material material=null;
    //</editor-fold>
    public AgregarEditMaterial() {
        initComponents();
        isEdit=false;
    }
    public AgregarEditMaterial(int id){
        initComponents();
        isEdit=true;
        id_material=id;
        cargarMaterial();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCantidadDisponible = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombreMaterial = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCostoUnidad = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Materiales");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cantidad disponible:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre material:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Costo unidad:");

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNombreMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txtCostoUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCantidadDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidadDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCostoUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar)
                    .addComponent(btnLimpiar))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(isEdit){
            editarMaterial();
        }
        else{
            guardarMaterial();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed
    //<editor-fold defaultstate="collapsed" desc="Metodos de guardado , editado y carga de objeto">  
    private void editarMaterial(){
            try {  
            material.setNombre_material(txtNombreMaterial.getText());
            material.setCoste_material(Double.parseDouble(txtCostoUnidad.getText()));
            material.setUnidades_disponibles(Integer.parseInt(txtCantidadDisponible.getText()));
            dMaterial.actualizar(material);
             javax.swing.JOptionPane.showMessageDialog(this, "Material actualizado. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
           this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(AgregarEditMaterial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void guardarMaterial(){
                try {
            Material mate=new Material();
            mate.setNombre_material(txtNombreMaterial.getText());
            mate.setCoste_material(Double.parseDouble(txtCostoUnidad.getText()));
            mate.setUnidades_disponibles(Integer.parseInt(txtCantidadDisponible.getText()));
            dMaterial.guardar(mate);
             javax.swing.JOptionPane.showMessageDialog(this, "Material agregado. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
           this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(AgregarEditMaterial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void cargarMaterial(){
        try {
            material=(Material) dMaterial.traerUno(id_material);
            txtNombreMaterial.setText(material.getNombre_material());
            txtCostoUnidad.setText(String.valueOf(material.getCoste_material()));
            txtCantidadDisponible.setText(String.valueOf(material.getUnidades_disponibles()));
        } catch (Exception ex) {
            Logger.getLogger(AgregarEditMaterial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//</editor-fold>


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCantidadDisponible;
    private javax.swing.JTextField txtCostoUnidad;
    private javax.swing.JTextField txtNombreMaterial;
    // End of variables declaration//GEN-END:variables
}

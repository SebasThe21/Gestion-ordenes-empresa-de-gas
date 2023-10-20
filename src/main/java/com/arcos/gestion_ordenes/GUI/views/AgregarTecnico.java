
package com.arcos.gestion_ordenes.GUI.views;

import com.arcos.gestion_ordenes.DAO.DAOTecnicosImpl;
import com.arcos.gestion_ordenes.DAO.DAOZonaImpl;
import com.arcos.gestion_ordenes.DAOinter.DAO;
import com.arcos.gestion_ordenes.DAOinter.DAOTecnico;
import com.arcos.gestion_ordenes.Logica.Barrio;
import com.arcos.gestion_ordenes.Logica.Tecnico;
import com.arcos.gestion_ordenes.Logica.Zona;
import com.formdev.flatlaf.intellijthemes.FlatArcOrangeIJTheme;
import java.awt.Component;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;


public class AgregarTecnico extends javax.swing.JFrame {
    //<editor-fold defaultstate="collapsed" desc="Instanciamiento del DAO y listas globales"> 
   private boolean isEdit;
   private int idTecnico;
   private DAOTecnico dTecnico=new DAOTecnicosImpl();
   private DAO dZona=new DAOZonaImpl();
   private List<Zona> lZona=null;
   private Tecnico tecnico=null;
   //</editor-fold>
    
   public AgregarTecnico() {
        initComponents();
        runn();
        isEdit=false;
        cargarZona();
    }
    
    public AgregarTecnico(int id_tecnico){
        initComponents();
        runn();
        cargarZona();
        isEdit=true;
        idTecnico=id_tecnico;
        cargarTecnico();
    }
    public void runn() {
        /* Set the Nimbus look and feel */
        try {
            FlatArcOrangeIJTheme.setup();
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbZona = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtSegundoApellido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("      Técnicos");

        btnGuardar.setBackground(new java.awt.Color(204, 204, 204));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salvar.png"))); // NOI18N
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/limpiar.png"))); // NOI18N
        btnLimpiar.setBorder(null);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cedula:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Apellido:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Zona:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Segundo apellido:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Telefono");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombre)
                    .addComponent(txtSegundoApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbZona, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel5)))))
                .addGap(227, 227, 227))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       if(isEdit){
           editarTecnico();
       }
       else{
           guardarTecnico();
       }
               
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
       txtNombre.setText("");
       txtApellido.setText("");
       txtSegundoApellido.setText("");
       txtCedula.setText("");
       txtTelefono.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed
    //<editor-fold defaultstate="collapsed" desc="Metodo de guardar,editar y cargar objetos">
    public void editarTecnico() {
        if (tecnico != null) {
            int id_zona = ((Zona) cmbZona.getSelectedItem()).getId_zona();
            tecnico.setNombre(txtNombre.getText());
            tecnico.setApellido(txtApellido.getText());
            tecnico.setS_apellido(txtSegundoApellido.getText());
            tecnico.setCedula(txtCedula.getText());
            tecnico.setTelefono(txtTelefono.getText());
            tecnico.setId_zona(id_zona);
            try {
                dTecnico.actualizar(tecnico);
                javax.swing.JOptionPane.showMessageDialog(this, "Tecnico actualizado. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            } catch (Exception ex) {
                Logger.getLogger(AgregarTecnico.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
    public void guardarTecnico() {
        Tecnico tecni = new Tecnico();
        int id_zona = ((Zona) cmbZona.getSelectedItem()).getId_zona();
        tecni.setNombre(txtNombre.getText());
        tecni.setApellido(txtApellido.getText());
        tecni.setS_apellido(txtSegundoApellido.getText());
        tecni.setCedula(txtCedula.getText());
        tecni.setTelefono(txtTelefono.getText());
        tecni.setId_zona(id_zona);
        try {
            dTecnico.guardar(tecni);
            javax.swing.JOptionPane.showMessageDialog(this, "Tecnico guardado. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(AgregarTecnico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void cargarTecnico(){
       try {
           tecnico=(Tecnico) dTecnico.traerUno(idTecnico);
           Zona zona=lZona.stream().filter(zo->tecnico.getId_zona()==zo.getId_zona()).findFirst().orElse(null);
           cmbZona.setSelectedItem(zona);
           txtNombre.setText(tecnico.getNombre());
           txtApellido.setText(tecnico.getApellido());
           txtSegundoApellido.setText(tecnico.getS_apellido());
           txtCedula.setText(tecnico.getCedula());
           txtTelefono.setText(tecnico.getTelefono());
           
           
       } catch (Exception ex) {
           Logger.getLogger(AgregarTecnico.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
     public void cargarZona(){
       try {
           lZona=dZona.traerTodos();
           DefaultComboBoxModel<Zona> cModel=new DefaultComboBoxModel<>(lZona.toArray(new Zona[0]));
           cmbZona.setModel(cModel);
           cmbZona.setRenderer(new ZonaListCellRenderer());
       } catch (Exception ex) {
           Logger.getLogger(AgregarTecnico.class.getName()).log(Level.SEVERE, null, ex);
       }
     }
     
      private static class ZonaListCellRenderer extends JLabel implements ListCellRenderer<Zona> {

        @Override
        public Component getListCellRendererComponent(JList<? extends Zona> list, Zona value, int index, boolean isSelected, boolean cellHasFocus) {
            if (value != null) {
                setText(value.getZona_nombre());
            } else {
                setText("");
            }

            setOpaque(true);
            setBackground(isSelected ? list.getSelectionBackground() : list.getBackground());
            setForeground(isSelected ? list.getSelectionForeground() : list.getForeground());

            return this;
        }
    }
      //</editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<Zona> cmbZona;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSegundoApellido;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}

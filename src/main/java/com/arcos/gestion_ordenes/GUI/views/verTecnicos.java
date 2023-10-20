
package com.arcos.gestion_ordenes.GUI.views;

import com.arcos.gestion_ordenes.DAOinter.DAO;
import com.arcos.gestion_ordenes.DAO.DAOTecnicosImpl;
import com.arcos.gestion_ordenes.DAO.DAOZonaImpl;
import com.arcos.gestion_ordenes.DAOinter.DAOTecnico;
import com.arcos.gestion_ordenes.Logica.Tecnico;
import com.arcos.gestion_ordenes.Logica.Zona;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;


public class verTecnicos extends javax.swing.JPanel {

   private DAOTecnico control=new DAOTecnicosImpl();
   private DAO dZona=new DAOZonaImpl();
   private List<Zona> lZona=null;
   private  List<Tecnico> listTec=null;
    public verTecnicos() {
        initComponents();
        mostrarTecnicos();
        
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
        tableTecnico = new javax.swing.JTable();
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
        labelMain.setText("Técnicos Gases S.A");

        tableTecnico.setBackground(new java.awt.Color(255, 255, 204));
        tableTecnico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tableTecnico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableTecnico);

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

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agregar-usuario.png"))); // NOI18N
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
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAgregar)
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
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(147, Short.MAX_VALUE))
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
       final AgregarTecnico aT=new AgregarTecnico();
       aT.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       aT.setVisible(true);
          aT.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
               mostrarTecnicos();

            }
        });
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(tableTecnico.getRowCount()>0 && tableTecnico.getSelectedRow()!=-1){
            int id_tecnico=Integer.parseInt(String.valueOf(tableTecnico.getValueAt(tableTecnico.getSelectedRow(), 0)));
            AgregarTecnico at=new AgregarTecnico(id_tecnico);
            at.setVisible(true);
             at.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
               mostrarTecnicos();

            }
        });
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        if(tableTecnico.getRowCount()>0 && tableTecnico.getSelectedRow()!=-1){
            try {
                int id_tecnico=Integer.parseInt(String.valueOf(tableTecnico.getValueAt(tableTecnico.getSelectedRow(), 0)));
                control.eliminar(id_tecnico);
                mostrarTecnicos();
                javax.swing.JOptionPane.showMessageDialog(this, "Tecnico eliminado. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);

            } catch (Exception ex) {
                Logger.getLogger(verTecnicos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       try {
           String criterio=txtBuscar.getText();
           DAOTecnico dTecnico=new DAOTecnicosImpl();
           List<Tecnico> listaBuscarTecnico=dTecnico.buscar(criterio);
           DefaultTableModel tModel=modeloTabla();
           for(Tecnico t:listaBuscarTecnico){
               Zona zon=lZona.stream().filter(zo->zo.getId_zona()==t.getId_zona()).findFirst().orElse(null);
               Object tec[]={t.getId_tecnico(),t.getNombre(),t.getApellido(),t.getS_apellido(),t.getCedula(),zon.getZona_nombre(),t.getTelefono()};
               tModel.addRow(tec);
               
               tableTecnico.setModel(tModel);
           }
       } catch (Exception ex) {
           Logger.getLogger(verTecnicos.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelMain;
    private javax.swing.JTable tableTecnico;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

    private void mostrarTecnicos() {
        DefaultTableModel tModel=modeloTabla();
       try {
           listTec=control.traerTodos();
           lZona=dZona.traerTodos();
           if(listTec!=null){
               for(Tecnico t:listTec){
                   Zona zon=lZona.stream().filter(zo->zo.getId_zona()==t.getId_zona()).findFirst().orElse(null);
                   Object tec[]={t.getId_tecnico(),t.getNombre(),t.getApellido(),t.getS_apellido(),t.getCedula(),zon.getZona_nombre(),t.getTelefono()};
                   tModel.addRow(tec);
               }
               tableTecnico.setModel(tModel);
           }
       } catch (Exception ex) {
           Logger.getLogger(verTecnicos.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        
    }
    public DefaultTableModel modeloTabla(){
                DefaultTableModel tModel=new DefaultTableModel(){
               @Override
               public boolean isCellEditable(int row,int column){
                    return false;
                }
        };
        
        String titleTable[]={"ID","Nombre","Apellido","Segundo Apellido","Cedula","Zona","Telefono"};
        tModel.setColumnIdentifiers(titleTable);
        return tModel;
    }
    private void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

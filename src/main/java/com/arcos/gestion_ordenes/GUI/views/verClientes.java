package com.arcos.gestion_ordenes.GUI.views;

import com.arcos.gestion_ordenes.DAO.DAOBarrioImpl;
import com.arcos.gestion_ordenes.DAO.DAOClienteImpl;
import com.arcos.gestion_ordenes.DAO.DAODireccionImpl;
import com.arcos.gestion_ordenes.DAOinter.DAO;
import com.arcos.gestion_ordenes.DAOinter.DAOCliente;
import com.arcos.gestion_ordenes.DAOinter.DAODireccion;
import com.arcos.gestion_ordenes.GUI.DashBoard;
import com.arcos.gestion_ordenes.Logica.Barrio;
import com.arcos.gestion_ordenes.Logica.Cliente;
import com.arcos.gestion_ordenes.Logica.Direccion;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class verClientes extends javax.swing.JPanel {
    //<editor-fold defaultstate="collapsed" desc="Instanciamiento del DAO y listas globales">
    private DAOCliente dCliente = new DAOClienteImpl();
    private DAODireccion dDireccion = new DAODireccionImpl();
    private DAO dBarrio = new DAOBarrioImpl();
    private List<Cliente> lClientes = null;
    private List<Direccion> lDireccion = null;
    private List<Barrio> lBarrio = null;
    //</editor-fold>
    
    public verClientes() {
        initComponents();
        cargarTabla();
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
        tableClientes = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(680, 440));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(680, 440));

        labelMain.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelMain.setForeground(new java.awt.Color(0, 0, 0));
        labelMain.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMain.setText("Clientes Gases S.A");

        tableClientes.setBackground(new java.awt.Color(255, 255, 204));
        tableClientes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableClientes);

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lupa.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
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

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/borrar (1).png"))); // NOI18N
        btnBorrar.setText("borrar");
        btnBorrar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnBorrar.setIconTextGap(2);
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(labelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(113, 113, 113)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnBuscar)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnEditar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnBorrar))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(btnEditar)
                    .addComponent(btnBorrar))
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
    
    //<editor-fold defaultstate="collapsed" desc="Metodos de botones">
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (tableClientes.getRowCount() > 0 && tableClientes.getSelectedRow() != -1) {
            int id_cliente = Integer.parseInt(String.valueOf(tableClientes.getValueAt(tableClientes.getSelectedRow(), 0)));
            DashBoard.setPanel(new editarCliente(id_cliente));
        }
    }//GEN-LAST:event_btnEditarActionPerformed
 
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            String criterio = txtBuscar.getText();
            DefaultTableModel tClientesModel = modelarTabla();
            List<Cliente> lClienteBuscar=dCliente.buscarClientes(criterio);
            for (Cliente cliente : lClienteBuscar) {
                
                Direccion direccion = lDireccion.stream().filter(dir -> dir.getId_direccion() == cliente.getId_direccion()).findFirst().orElse(null);
                Barrio barrio = direccion != null ? lBarrio.stream().filter(barr -> direccion.getId_barrio() == barr.getId_barrio()).findFirst().orElse(null) : null;
                if (barrio != null) {
                    Object[] rows = {cliente.getId_cliente(), cliente.getCedula(), cliente.getNombre(), cliente.getApellido(), direccion.getTipo_via() + " " + direccion.getNumero_nombre_via()
                            + " " + direccion.getOrientacion() + " " + direccion.getPlaca(), cliente.getTelefono(), barrio.getNombre_barrio()};
                    tClientesModel.addRow(rows);
                }
            
            }
            tableClientes.setModel(tClientesModel);
        } catch (Exception ex) {
            Logger.getLogger(verClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        if (tableClientes.getRowCount() > 0 && tableClientes.getSelectedRow() != -1) {
            int id_cliente = Integer.parseInt(String.valueOf(tableClientes.getValueAt(tableClientes.getSelectedRow(), 0)));
            try {
                dCliente.eliminar(id_cliente);
                javax.swing.JOptionPane.showMessageDialog(this, "El cliente ha sido borrado. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                cargarTabla();
            } catch (Exception ex) {
                Logger.getLogger(verClientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al eliminar. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnBorrarActionPerformed
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Carga de objetos y modelado">
    private void cargarTabla() {
        DefaultTableModel tClientesModel = modelarTabla();
        try {
            lClientes = dCliente.traerTodos();
            lDireccion = dDireccion.traerTodos();
            lBarrio = dBarrio.traerTodos();
            for (Cliente cliente : lClientes) {
                Direccion direccion = lDireccion.stream().filter(dir -> dir.getId_direccion() == cliente.getId_direccion()).findFirst().orElse(null);
                Barrio barrio = direccion != null ? lBarrio.stream().filter(barr -> direccion.getId_barrio() == barr.getId_barrio()).findFirst().orElse(null) : null;
                if (barrio != null) {
                    Object[] rows = {cliente.getId_cliente(), cliente.getCedula(), cliente.getNombre(), cliente.getApellido(), direccion.getTipo_via() + " " + direccion.getNumero_nombre_via()
                        + " " + direccion.getOrientacion() + " " + direccion.getPlaca(), cliente.getTelefono(), barrio.getNombre_barrio()};
                    tClientesModel.addRow(rows);
                }
            }
            tableClientes.setModel(tClientesModel);
        } catch (Exception ex) {
            Logger.getLogger(verClientes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private DefaultTableModel modelarTabla() {
        DefaultTableModel tModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        String[] columnas = {"ID", "Cedula", "Nombre", "Apellido", "Direccion", "Telefono", "Barrio"};
        tModel.setColumnIdentifiers(columnas);
        return tModel;
    }
    //</editor-fold>
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelMain;
    private javax.swing.JTable tableClientes;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}

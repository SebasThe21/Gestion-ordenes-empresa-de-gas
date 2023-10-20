package com.arcos.gestion_ordenes.GUI.views;

import com.arcos.gestion_ordenes.DAO.DAOBarrioImpl;
import com.arcos.gestion_ordenes.DAO.DAOClienteImpl;
import com.arcos.gestion_ordenes.DAO.DAODireccionImpl;
import com.arcos.gestion_ordenes.DAO.DAOSolicitudImpl;
import com.arcos.gestion_ordenes.DAOinter.*;
import com.arcos.gestion_ordenes.GUI.views.CrearOrden;
import com.arcos.gestion_ordenes.GUI.views.Inicio1;
import com.arcos.gestion_ordenes.Logica.*;
import com.formdev.flatlaf.intellijthemes.FlatArcOrangeIJTheme;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Solicitud_GUI extends javax.swing.JFrame {
    //<editor-fold defaultstate="collapsed" desc="Instanciamiento del DAO y listas globales">

    private DAO dSolicitud = new DAOSolicitudImpl();
    private DAOCliente dCliente = new DAOClienteImpl();
    private DAODireccion dDireccion = new DAODireccionImpl();
    private DAO dBarrio = new DAOBarrioImpl();
    private List<SolicitudOrden> lSo = null;
    private List<Cliente> lCli = null;
    private List<Direccion> lDir = null;
    private List<Barrio> lBarr = null;
    private int idd;
    //</editor-fold>

    public Solicitud_GUI() {
        initComponents();
        runn();
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        labelMain = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSolicitud = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnSeleccionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(680, 440));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(680, 440));

        labelMain.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelMain.setForeground(new java.awt.Color(0, 0, 0));
        labelMain.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMain.setText("Lista de solicitudes");

        tableSolicitud.setBackground(new java.awt.Color(255, 255, 204));
        tableSolicitud.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tableSolicitud.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableSolicitud);

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lupa.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnSeleccionar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSeleccionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editar.png"))); // NOI18N
        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSeleccionar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSeleccionar.setIconTextGap(2);
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(labelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(113, 113, 113)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnBuscar)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnSeleccionar)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(labelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSeleccionar)
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        idd = traerId();
        System.out.println(this.traerId() + "solicitud_gui");
        this.dispose();
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    public void runn() {
        /* Set the Nimbus look and feel */
        try {
            FlatArcOrangeIJTheme.setup();
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        setLocationRelativeTo(null);

    }

    public int getIdd() {
        return idd;
    }
   //<editor-fold defaultstate="collapsed" desc="Metodo para cargar la tabla y reenviar la información">
    public void cargarTabla() {
        DefaultTableModel tModel = createTableModel();

        try {
            List<SolicitudOrden> lSo = dSolicitud.traerTodos();
            List<Cliente> lCli = dCliente.traerTodos();
            List<Direccion> lDir = dDireccion.traerTodos();
            List<Barrio> lBarr = dBarrio.traerTodos();
            for (SolicitudOrden s : lSo) {
                Cliente cliente = lCli.stream().filter(c -> c.getCedula().equals(s.getCedula_cliente())).findFirst().orElse(null);
                Direccion direccion = (cliente != null) ? lDir.stream().filter(d -> d.getId_direccion() == cliente.getId_direccion()).findFirst().orElse(null) : null;
                Barrio barrio = (direccion != null) ? lBarr.stream().filter(b -> b.getId_barrio() == direccion.getId_barrio()).findFirst().orElse(null) : null;

                if (barrio != null) {
                    Object[] sol = {s.getId_solicitud(), s.getRazon_trabajo(), cliente.getCedula(),
                        cliente.getNombre() + " " + cliente.getApellido(), barrio.getNombre_barrio(),
                        direccion.getTipo_via() + " " + direccion.getNumero_nombre_via() + " " + direccion.getOrientacion() + " " + direccion.getPlaca(),
                        barrio.getNumero_comuna()};
                    tModel.addRow(sol);

                }
            }
            tableSolicitud.setModel(tModel);
        } catch (Exception ex) {
            Logger.getLogger(Solicitud_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private DefaultTableModel createTableModel() {
        DefaultTableModel tModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        String[] titleTable = {"ID", "Razon del trabajo", "Cedula cliente", "Cliente", "Barrio", "Direccion", "Comuna"};
        tModel.setColumnIdentifiers(titleTable);

        return tModel;
    }

    public int traerId() {
        int id = 0;
        if (tableSolicitud.getRowCount() > 0) {
            if (tableSolicitud.getSelectedRow() != -1) {
                id = Integer.parseInt(String.valueOf(tableSolicitud.getValueAt(tableSolicitud.getSelectedRow(), 0)));
            }
        }
        return id;
    }
   //</editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelMain;
    private javax.swing.JTable tableSolicitud;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

}

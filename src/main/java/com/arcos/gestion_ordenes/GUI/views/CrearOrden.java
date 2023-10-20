package com.arcos.gestion_ordenes.GUI.views;

import com.arcos.gestion_ordenes.DAO.*;

import com.arcos.gestion_ordenes.DAOinter.*;

import com.arcos.gestion_ordenes.Logica.*;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.ListCellRenderer;
import javax.swing.table.DefaultTableModel;

public class CrearOrden extends javax.swing.JPanel {

    //<editor-fold defaultstate="collapsed" desc="Instanciamiento del DAO y listas globales">
    private DAOTecnico dTecnico = new DAOTecnicosImpl();
    private DAOMaterial dMaterial = new DAOMaterialImpl();
    private DAO dOrden_material = new DAOOrden_MaterialImpl();
    private DAO dOrden_trabajo = new DAOOrden_TrabajosImpl();
    private DAOTrabajo dTrabajos = new DAOTrabajosImpl();
    private DAOOrden dOrden = new DAOOrdenTrabajoImpl();
    private DefaultTableModel tModelM;
    private DefaultTableModel tModelT;
    private double t = 0;
    private int id_solicitudd;
    private List<itemMaterial> aMaterial = new ArrayList();
    private List<itemTrabajo> aTrabajos = new ArrayList();
    private List<Tecnico> lTecnico = null;
    private List<Material> lMaterial = null;
    private List<Trabajos> lTrabajos = null;
//</editor-fold>

    public CrearOrden() {
        initComponents();
        javax.swing.JOptionPane.showMessageDialog(this, "Recuerde revisar la disponibilidad de los materiales. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        cargarTecnicos();
        cargarMaterial();
        cargarTrabajos();

    }

    public void init() {
        lbTitulo.putClientProperty("FlatLaf.style", "font: bold $h1.regular.font");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        lbMateriales = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        lbTecnico = new javax.swing.JLabel();
        lbSolicitud = new javax.swing.JLabel();
        JdFecha = new com.toedter.calendar.JDateChooser();
        btnAgregarTrabajo = new javax.swing.JButton();
        lbCantidadM = new javax.swing.JLabel();
        txtCantidadMateriales = new javax.swing.JTextField();
        cmbTrabajos = new javax.swing.JComboBox<>();
        cmbTecnico = new javax.swing.JComboBox<>();
        lbTrabajos = new javax.swing.JLabel();
        cmbMateriales = new javax.swing.JComboBox<>();
        lbCantidadTrabajos = new javax.swing.JLabel();
        txtCantidadTrabajos = new javax.swing.JTextField();
        btnAgregarMaterial = new javax.swing.JButton();
        lbFecha = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnSeleccionarSolicitud = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        TableMateriales = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        TableTrabajos = new javax.swing.JTable();
        btnQuitarMaterial1 = new javax.swing.JButton();
        btnQuitarTrabajo = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable2);

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(680, 440));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(680, 440));

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTitulo.setText("Crear orden de trabajo");

        lbMateriales.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbMateriales.setForeground(new java.awt.Color(0, 0, 0));
        lbMateriales.setText("Materiales");

        lbTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTotal.setForeground(new java.awt.Color(0, 0, 0));
        lbTotal.setText("Total:");

        lbTecnico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTecnico.setForeground(new java.awt.Color(0, 0, 0));
        lbTecnico.setText("Técnico");

        lbSolicitud.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbSolicitud.setForeground(new java.awt.Color(0, 0, 0));
        lbSolicitud.setText("Solicitud");

        btnAgregarTrabajo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregarTrabajo.setText("+");
        btnAgregarTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTrabajoActionPerformed(evt);
            }
        });

        lbCantidadM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbCantidadM.setForeground(new java.awt.Color(0, 0, 0));
        lbCantidadM.setText("Cantidad");

        txtCantidadMateriales.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadMaterialesKeyTyped(evt);
            }
        });

        lbTrabajos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTrabajos.setForeground(new java.awt.Color(0, 0, 0));
        lbTrabajos.setText("Trabajos");

        lbCantidadTrabajos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbCantidadTrabajos.setForeground(new java.awt.Color(0, 0, 0));
        lbCantidadTrabajos.setText("Cantidad");

        txtCantidadTrabajos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadTrabajosKeyTyped(evt);
            }
        });

        btnAgregarMaterial.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregarMaterial.setText("+");
        btnAgregarMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMaterialActionPerformed(evt);
            }
        });

        lbFecha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbFecha.setForeground(new java.awt.Color(0, 0, 0));
        lbFecha.setText("Fecha");

        txtTotal.setBackground(new java.awt.Color(255, 255, 255));
        txtTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btnLimpiar.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/limpiar.png"))); // NOI18N
        btnLimpiar.setBorder(null);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(204, 204, 204));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salvar.png"))); // NOI18N
        btnGuardar.setBorder(null);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnSeleccionarSolicitud.setText("Seleccionar solicitud");
        btnSeleccionarSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarSolicitudActionPerformed(evt);
            }
        });

        TableMateriales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(TableMateriales);

        TableTrabajos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(TableTrabajos);

        btnQuitarMaterial1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnQuitarMaterial1.setText("-");
        btnQuitarMaterial1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarMaterial1ActionPerformed(evt);
            }
        });

        btnQuitarTrabajo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnQuitarTrabajo.setText("-");
        btnQuitarTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarTrabajoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbMateriales, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbMateriales, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbCantidadM, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtCantidadMateriales, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAgregarMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnQuitarMaterial1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbSolicitud)
                            .addComponent(btnSeleccionarSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbTrabajos, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(lbCantidadTrabajos, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmbTrabajos, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCantidadTrabajos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAgregarTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnQuitarTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTecnico)
                    .addComponent(lbSolicitud)
                    .addComponent(lbFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSeleccionarSolicitud)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMateriales)
                            .addComponent(lbCantidadM))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbMateriales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantidadMateriales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregarMaterial)
                            .addComponent(btnQuitarMaterial1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbTrabajos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbTrabajos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCantidadTrabajos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAgregarTrabajo)
                                    .addComponent(btnQuitarTrabajo)))
                            .addComponent(lbCantidadTrabajos))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTotal)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    //<editor-fold defaultstate="collapsed" desc="Metodos de los botones">
    private void btnSeleccionarSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarSolicitudActionPerformed
        final Solicitud_GUI s = new Solicitud_GUI();
        s.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        s.setVisible(true);

        s.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                id_solicitudd = s.getIdd();

            }
        });


    }//GEN-LAST:event_btnSeleccionarSolicitudActionPerformed


    private void btnAgregarMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMaterialActionPerformed
       Material mate = (Material) cmbMateriales.getSelectedItem();
        int nCantidad = Integer.parseInt(txtCantidadMateriales.getText());
        itemMaterial iM = new itemMaterial(mate, nCantidad);

        if (mate.getUnidades_disponibles() > nCantidad) {
            aMaterial.add(iM);
            actualizarTablaMaterial();
        } else {
        javax.swing.JOptionPane.showMessageDialog(this, "No hay suficiente material. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            
        }
        
    }//GEN-LAST:event_btnAgregarMaterialActionPerformed

    private void btnAgregarTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTrabajoActionPerformed

        Trabajos trabajos = (Trabajos) cmbTrabajos.getSelectedItem();
        int nCantidadTrabajos = Integer.parseInt(txtCantidadTrabajos.getText());
        itemTrabajo iT = new itemTrabajo(trabajos, nCantidadTrabajos);
        aTrabajos.add(iT);
        actualizarTablaTrabajos();

    }//GEN-LAST:event_btnAgregarTrabajoActionPerformed

    public int getId_solicitudd() {
        return id_solicitudd;
    }

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (validarCampos() &&validarFecha() &&id_solicitudd!=0) {
             OrdenTrabajo ordenTrabajo= new OrdenTrabajo();
            Tecnico t1 = (Tecnico) cmbTecnico.getSelectedItem();
            int id_ordenTrabajo = 0;
            int idSolicitud = id_solicitudd;
                        try {
                ordenTrabajo.setFecha(JdFecha.getDate());
                ordenTrabajo.setId_solicitud(idSolicitud);
                ordenTrabajo.setId_tecnico(t1.getId_tecnico());
                ordenTrabajo.setTotal(Double.parseDouble(txtTotal.getText()));
                id_ordenTrabajo = dOrden.guardar(ordenTrabajo);
                
                guardarMateriales(id_ordenTrabajo);
                guardarTrabajos(id_ordenTrabajo);
                aMaterial.clear();
                aTrabajos.clear();
                limpiar();
                 javax.swing.JOptionPane.showMessageDialog(this, "La orden se ha ingresado correctamente. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                Logger.getLogger(IngresoSolicitud.class.getName()).log(Level.SEVERE, null, e);
               
            }
        } else {
              javax.swing.JOptionPane.showMessageDialog(this, "Error al ingresar la solicitud. \n La fecha debe ser a partir del dia actual y debe seleccionar una solicitud.", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnQuitarMaterial1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarMaterial1ActionPerformed

        Iterator<itemMaterial> iteratorM = aMaterial.iterator();
        double costeMaterial = 0;
        double cantidadMaterial = 0;
        if (TableMateriales.getRowCount() > 0 && TableMateriales.getSelectedRow() != -1) {
            String nombreMaterial = String.valueOf(TableMateriales.getValueAt(TableMateriales.getSelectedRow(), 0));
            int cantidad = Integer.parseInt(String.valueOf(TableMateriales.getValueAt(TableMateriales.getSelectedRow(), 1)));

            while (iteratorM.hasNext()) {
                itemMaterial m = iteratorM.next();
                costeMaterial = m.getMaterial().getCoste_material();
                cantidadMaterial = m.getCantidad();
                Material material = m.getMaterial();
                int cantidadM = m.getCantidad();
                if (nombreMaterial.equals(material.getNombre_material()) && cantidad == cantidadM) {
                    iteratorM.remove();
                    break;
                }
            }
            t -= cantidadMaterial * costeMaterial;
            tModelM.removeRow(TableMateriales.getSelectedRow());
            double totalRedondeado = Math.round(t * 100.0) / 100.0;
            txtTotal.setText(String.valueOf(totalRedondeado));

        }




    }//GEN-LAST:event_btnQuitarMaterial1ActionPerformed

    private void btnQuitarTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarTrabajoActionPerformed
        Iterator<itemTrabajo> iteratorT = aTrabajos.iterator();
        double costeTrabajo = 0;
        double cantidadTrabajo = 0;
        if (TableTrabajos.getRowCount() > 0 && TableTrabajos.getSelectedRow() != -1) {

            String nombreTrabajo = String.valueOf(TableTrabajos.getValueAt(TableTrabajos.getSelectedRow(), 0));
            int cantidadTrabajosLista = Integer.parseInt(String.valueOf(TableTrabajos.getValueAt(TableTrabajos.getSelectedRow(), 1)));

            while (iteratorT.hasNext()) {
                itemTrabajo iT = iteratorT.next();
                costeTrabajo = iT.getTrabajos().getCosto_unidad();
                cantidadTrabajo = iT.getCantidad();
                if (nombreTrabajo.equals(iT.getTrabajos().getNombre_trabajos()) && cantidadTrabajosLista == iT.getCantidad()) {
                    iteratorT.remove();
                    break;
                }
            }
            t -= cantidadTrabajo * costeTrabajo;
            tModelT.removeRow(TableTrabajos.getSelectedRow());
            double totalRedondeado = Math.round(t * 100.0) / 100.0;

            txtTotal.setText(String.valueOf(totalRedondeado));



        }
    }//GEN-LAST:event_btnQuitarTrabajoActionPerformed
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Metodos de validación">
    private void txtCantidadMaterialesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadMaterialesKeyTyped
        validacionCamposNumeros(evt, txtCantidadMateriales, 5);
    }//GEN-LAST:event_txtCantidadMaterialesKeyTyped

    private void txtCantidadTrabajosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadTrabajosKeyTyped
        validacionCamposNumeros(evt, txtCantidadTrabajos, 5);
    }//GEN-LAST:event_txtCantidadTrabajosKeyTyped

    private void validacionCamposNumeros(KeyEvent evt, JTextField jT, int maxLe) {
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros || jT.getText().length() > maxLe) {
            evt.consume();
        }
    }

    private boolean validarFecha() {
        java.util.Date fechaSeleccionada = (java.util.Date) JdFecha.getDate();
        LocalDate fechaActual = LocalDate.now();
        if (fechaSeleccionada != null) {
            LocalDate fechaSeleccionadaLocalDate = fechaSeleccionada.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            if (fechaSeleccionadaLocalDate.isBefore(fechaActual)) {
                //JdFecha.setDate(Date.from(fechaActual.atStartOfDay(ZoneId.systemDefault()).toInstant()));
                return false;
            }
        }
        return true;
    }

    private boolean validarCampos() {
        if (JdFecha.getDate() == null || TableMateriales == null || TableTrabajos == null || txtCantidadMateriales.getText().isEmpty()
                || txtCantidadTrabajos.getText().isEmpty() || txtTotal.getText().isEmpty()) {

            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            JdFecha.requestFocus();
            return false;
        } else {
            return true;
        }
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Metodos para el manejo de tablas y guardado de ordenes">
    private void limpiar() {
        DefaultTableModel modelo = new DefaultTableModel();
        TableMateriales.setModel(modelo);
        TableMateriales.repaint();
        TableTrabajos.setModel(modelo);
        TableTrabajos.repaint();
        txtTotal.setText("");
        txtCantidadMateriales.setText("");
        txtCantidadTrabajos.setText("");
        t = 0;
    }
    
    private void guardarMateriales(int id_oT) {
        Orden_Material ordenMaterial = new Orden_Material();
        try {
            for (itemMaterial material : aMaterial) {
                ordenMaterial.setCantidad_materia(material.getCantidad());
                ordenMaterial.setId_orden(id_oT);
                ordenMaterial.setId_material(material.getMaterial().getId_material());
                dOrden_material.guardar(ordenMaterial);
            }
        } catch (Exception ex) {
            Logger.getLogger(CrearOrden.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void guardarTrabajos(int id_oT) {
        Orden_Trabajos ordenTrabajos = new Orden_Trabajos();
        try{
        for (itemTrabajo trabajo : aTrabajos) {
            ordenTrabajos.setCantidad_trabajos(trabajo.getCantidad());
            ordenTrabajos.setId_orden(id_oT);
            ordenTrabajos.setId_trabajos(trabajo.getTrabajos().getId_trabajos());
            dOrden_trabajo.guardar(ordenTrabajos);
        }
        }catch (Exception ex) {
            Logger.getLogger(CrearOrden.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void actualizarMateriales(){
       try{
        for(itemMaterial iM:aMaterial){
            Material mate=iM.getMaterial();
            int MaterialesActuales=mate.getUnidades_disponibles();
            int MaterialesUsados=iM.getCantidad();
            int operacion=MaterialesActuales-MaterialesUsados;
            mate.setUnidades_disponibles(mate.getUnidades_disponibles()-iM.getCantidad());

            dMaterial.actualizar(mate);
        }
       }catch(Exception ex){
            Logger.getLogger(CrearOrden.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    private void actualizarTablaMaterial() {
        double material = 0;
        int cantidad = 0;
        tModelM = createTableModel("Material", "Cantidad");

        for (itemMaterial m : aMaterial) {
            material = m.getMaterial().getCoste_material();
            cantidad = m.getCantidad();

            Object[] aMateriales = {m.getMaterial().getNombre_material(), m.getCantidad()};
            tModelM.addRow(aMateriales);

        }
        t += material * cantidad;
        TableMateriales.setModel(tModelM);

        double totalRedondeado = Math.round(t * 100.0) / 100.0;

        txtTotal.setText(String.valueOf(totalRedondeado));
    }

    private void actualizarTablaTrabajos() {
        double trabajo = 0;
        double cantidad = 0;
        tModelT = createTableModel("Nombre trabajo", "Cantidad");
        for (itemTrabajo tra : aTrabajos) {
            trabajo = tra.getTrabajos().getCosto_unidad();
            cantidad = tra.getCantidad();
            Object[] aTrabajos = {tra.getTrabajos().getNombre_trabajos(), tra.getCantidad()};
            tModelT.addRow(aTrabajos);

        }
        t += trabajo * cantidad;
        TableTrabajos.setModel(tModelT);
        double totalRedondeado = Math.round(t * 100.0) / 100.0;

        txtTotal.setText(String.valueOf(totalRedondeado));
    }

    private DefaultTableModel createTableModel(String campo1, String campo2) {
        DefaultTableModel tModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        String[] titleTable = {campo1, campo2};
        tModel.setColumnIdentifiers(titleTable);

        return tModel;
    }
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Cargar ComboBoxes">      
    private void cargarTecnicos() {
        try {
            lTecnico = dTecnico.traerTodos();
            DefaultComboBoxModel<Tecnico> cmbTModel = new DefaultComboBoxModel<>(lTecnico.toArray(new Tecnico[0]));
            cmbTecnico.setModel(cmbTModel);
            cmbTecnico.setRenderer(new TecnicoListCellRenderer());
        } catch (Exception ex) {
            Logger.getLogger(CrearOrden.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cargarMaterial() {
        try {
            lMaterial = dMaterial.traerTodos();
            DefaultComboBoxModel<Material> cmbMModel = new DefaultComboBoxModel<>(lMaterial.toArray(new Material[0]));
            cmbMateriales.setModel(cmbMModel);
            cmbMateriales.setRenderer(new MaterialListCellRenderer());
        } catch (Exception ex) {
            Logger.getLogger(CrearOrden.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cargarTrabajos() {
        try {
            lTrabajos = dTrabajos.traerTodos();
            DefaultComboBoxModel<Trabajos> cmbTModel = new DefaultComboBoxModel<>(lTrabajos.toArray(new Trabajos[0]));
            cmbTrabajos.setModel(cmbTModel);
            cmbTrabajos.setRenderer(new TrabajosListCellRenderer());

        } catch (Exception ex) {
            Logger.getLogger(CrearOrden.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static class TrabajosListCellRenderer extends JLabel implements ListCellRenderer<Trabajos> {

        @Override
        public Component getListCellRendererComponent(JList<? extends Trabajos> list, Trabajos value, int index, boolean isSelected, boolean cellHasFocus) {
            if (value != null) {
                setText(value.getNombre_trabajos() + " " + " precio: " + String.valueOf(value.getCosto_unidad()));
            } else {
                setText("");
            }

            setOpaque(true);
            setBackground(isSelected ? list.getSelectionBackground() : list.getBackground());
            setForeground(isSelected ? list.getSelectionForeground() : list.getForeground());

            return this;
        }
    }

    private static class TecnicoListCellRenderer extends JLabel implements ListCellRenderer<Tecnico> {

        @Override
        public Component getListCellRendererComponent(JList<? extends Tecnico> list, Tecnico value, int index, boolean isSelected, boolean cellHasFocus) {
            if (value != null) {
                setText(value.getNombre() + " " + value.getApellido()+" Zona: "+value.getId_zona());
            } else {
                setText("");
            }

            setOpaque(true);
            setBackground(isSelected ? list.getSelectionBackground() : list.getBackground());
            setForeground(isSelected ? list.getSelectionForeground() : list.getForeground());

            return this;
        }
    }

    private static class MaterialListCellRenderer extends JLabel implements ListCellRenderer<Material> {

        @Override
        public Component getListCellRendererComponent(JList<? extends Material> list, Material value, int index, boolean isSelected, boolean cellHasFocus) {
            if (value != null) {
                setText(value.getNombre_material() + " " + " disp: " + String.valueOf(value.getUnidades_disponibles()));
            } else {
                setText("");
            }
    
            setOpaque(true);
            setBackground(isSelected ? list.getSelectionBackground() : list.getBackground());
            setForeground(isSelected ? list.getSelectionForeground() : list.getForeground());

            return this;
        }

    }
    // </editor-fold>          

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser JdFecha;
    private javax.swing.JTable TableMateriales;
    private javax.swing.JTable TableTrabajos;
    private javax.swing.JButton btnAgregarMaterial;
    private javax.swing.JButton btnAgregarTrabajo;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnQuitarMaterial1;
    private javax.swing.JButton btnQuitarTrabajo;
    public javax.swing.JButton btnSeleccionarSolicitud;
    private javax.swing.JComboBox<Material> cmbMateriales;
    private javax.swing.JComboBox<Tecnico> cmbTecnico;
    private javax.swing.JComboBox<Trabajos> cmbTrabajos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lbCantidadM;
    private javax.swing.JLabel lbCantidadTrabajos;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JLabel lbMateriales;
    private javax.swing.JLabel lbSolicitud;
    private javax.swing.JLabel lbTecnico;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JLabel lbTrabajos;
    private javax.swing.JTextField txtCantidadMateriales;
    private javax.swing.JTextField txtCantidadTrabajos;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

}


package com.arcos.gestion_ordenes.GUI.views;

import com.arcos.gestion_ordenes.DAOinter.DAO;
import com.arcos.gestion_ordenes.DAO.DAOBarrioImpl;
import com.arcos.gestion_ordenes.DAO.DAOClienteImpl;
import com.arcos.gestion_ordenes.DAO.DAODireccionImpl;
import com.arcos.gestion_ordenes.DAO.DAOSolicitudImpl;
import com.arcos.gestion_ordenes.DAOinter.DAOCliente;
import com.arcos.gestion_ordenes.DAOinter.DAODireccion;
import com.arcos.gestion_ordenes.Logica.*;
import java.awt.event.KeyEvent;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class IngresoSolicitud extends javax.swing.JPanel {

    DAO DBarrio = new DAOBarrioImpl();
    List<Barrio> lBarrio = null;

    public IngresoSolicitud() {
        initComponents();
        cargarBarrios();
    }

    public void init() {
        labelMain.putClientProperty("FlatLaf.style", "font: bold $h1.regular.font");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelMain = new javax.swing.JLabel();
        lbComentarios = new javax.swing.JLabel();
        txtCedulaCliente = new javax.swing.JTextField();
        lbNombre = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        lbCedula = new javax.swing.JLabel();
        txtSApellidoCliente = new javax.swing.JTextField();
        lbTipoVia = new javax.swing.JLabel();
        txtTipoVia = new javax.swing.JTextField();
        lbNombrevia = new javax.swing.JLabel();
        txtNombreONumeroVia = new javax.swing.JTextField();
        lbOrientacion = new javax.swing.JLabel();
        txtOrientacion = new javax.swing.JTextField();
        lbApellido = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        lbPlaca = new javax.swing.JLabel();
        cmbBarrios = new javax.swing.JComboBox<>();
        lbBarrio = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComentarios = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtPApellidoCliente = new javax.swing.JTextField();
        lbTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lbApellido1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(680, 440));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(680, 440));

        labelMain.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelMain.setForeground(new java.awt.Color(0, 0, 0));
        labelMain.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMain.setText("Ingreso de solicitud");

        lbComentarios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbComentarios.setForeground(new java.awt.Color(0, 0, 0));
        lbComentarios.setText("Comentarios");

        txtCedulaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaClienteKeyTyped(evt);
            }
        });

        lbNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbNombre.setForeground(new java.awt.Color(0, 0, 0));
        lbNombre.setText("Nombre");

        txtNombreCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreClienteKeyTyped(evt);
            }
        });

        lbCedula.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbCedula.setForeground(new java.awt.Color(0, 0, 0));
        lbCedula.setText("Cedula");

        txtSApellidoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSApellidoClienteKeyTyped(evt);
            }
        });

        lbTipoVia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTipoVia.setForeground(new java.awt.Color(0, 0, 0));
        lbTipoVia.setText("Tipo de via");

        txtTipoVia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTipoViaKeyTyped(evt);
            }
        });

        lbNombrevia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbNombrevia.setForeground(new java.awt.Color(0, 0, 0));
        lbNombrevia.setText("Nombre o numero de via");

        txtNombreONumeroVia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreONumeroViaKeyTyped(evt);
            }
        });

        lbOrientacion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbOrientacion.setForeground(new java.awt.Color(0, 0, 0));
        lbOrientacion.setText("Orientación");

        txtOrientacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOrientacionKeyTyped(evt);
            }
        });

        lbApellido.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbApellido.setForeground(new java.awt.Color(0, 0, 0));
        lbApellido.setText("Segundo Apellido");

        txtPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPlacaKeyTyped(evt);
            }
        });

        lbPlaca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbPlaca.setForeground(new java.awt.Color(0, 0, 0));
        lbPlaca.setText("Placa");

        cmbBarrios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBarriosActionPerformed(evt);
            }
        });

        lbBarrio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbBarrio.setForeground(new java.awt.Color(0, 0, 0));
        lbBarrio.setText("Barrio");

        txtComentarios.setColumns(20);
        txtComentarios.setRows(5);
        txtComentarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtComentariosKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtComentarios);

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
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        txtPApellidoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPApellidoClienteKeyTyped(evt);
            }
        });

        lbTelefono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTelefono.setForeground(new java.awt.Color(0, 0, 0));
        lbTelefono.setText("Teléfono");

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        lbApellido1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbApellido1.setForeground(new java.awt.Color(0, 0, 0));
        lbApellido1.setText("Primer apellido");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(lbTipoVia, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTipoVia, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbApellido1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtSApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbApellido))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbTelefono)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lbNombrevia)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lbOrientacion, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtNombreONumeroVia, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(28, 28, 28)
                                                .addComponent(txtOrientacion, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(2, 2, 2)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(labelMain)))
                            .addComponent(jScrollPane1))
                        .addContainerGap(147, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbBarrios, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbBarrio)
                            .addComponent(lbComentarios, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbCedula)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(labelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbNombre)
                                    .addComponent(lbApellido1)
                                    .addComponent(lbApellido)
                                    .addComponent(lbTelefono))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(lbTipoVia))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbNombrevia)
                                    .addComponent(lbOrientacion)
                                    .addComponent(lbPlaca))))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTipoVia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOrientacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreONumeroVia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtPlaca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbBarrio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbBarrios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbComentarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

     // <editor-fold defaultstate="collapsed" desc="Botones">

    private void cmbBarriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBarriosActionPerformed

    }//GEN-LAST:event_cmbBarriosActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (this.validarCampos() == true  ) {
            DAODireccion dDireccion = new DAODireccionImpl();
            DAOCliente dCliente = new DAOClienteImpl();
            DAO dSolicitud = new DAOSolicitudImpl();
            Direccion dir = new Direccion();
            Cliente cli = new Cliente();
            SolicitudOrden sO = new SolicitudOrden();
            int id_dir = 0;
            int id_cli = 0;
            int id_barrio = 0;
            String nombre = (String) cmbBarrios.getSelectedItem();

            for (Barrio fB : lBarrio) {
                if (nombre != null) {
                    if (nombre.equals(fB.getNombre_barrio())) {
                        id_barrio = fB.getId_barrio();
                    }
                }
            }

            try {
                dir.setTipo_via(txtTipoVia.getText());
                dir.setOrientacion(txtOrientacion.getText());
                dir.setId_barrio(id_barrio);
                dir.setPlaca(txtPlaca.getText());
                dir.setNumero_nombre_via(txtNombreONumeroVia.getText());
                id_dir = dDireccion.guardar(dir);

                cli.setNombre(txtNombreCliente.getText());
                cli.setApellido(txtPApellidoCliente.getText());
                cli.setS_apellido(txtSApellidoCliente.getText());
                cli.setCedula(txtCedulaCliente.getText());
                cli.setTelefono(txtTelefono.getText());
                cli.setId_direccion(id_dir);
                id_cli = dCliente.guardar(cli);

                sO.setCedula_cliente(txtCedulaCliente.getText());
                sO.setRazon_trabajo(txtComentarios.getText());
                dSolicitud.guardar(sO);
            } catch (Exception ex) {
                Logger.getLogger(IngresoSolicitud.class.getName()).log(Level.SEVERE, null, ex);
                javax.swing.JOptionPane.showMessageDialog(this, "Error al ingresar la solicitud. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
                   javax.swing.JOptionPane.showMessageDialog(this, "La solicitud se ha ingresado correctamente. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
      
         else{
            return;
        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtTipoVia.setText("");
        txtOrientacion.setText("");
        txtPlaca.setText("");
        txtNombreONumeroVia.setText("");
        txtNombreCliente.setText("");
        txtPApellidoCliente.setText("");
        txtSApellidoCliente.setText("");
        txtCedulaCliente.setText("");
        txtTelefono.setText("");
        txtComentarios.setText("");

    }//GEN-LAST:event_btnLimpiarActionPerformed
    // </editor-fold>

    
    // <editor-fold defaultstate="collapsed" desc="Control de caracteres TextField">
    private void validacionCamposTexto(KeyEvent evt,JTextField jT, int maxLe){
        int key=evt.getKeyChar();
        boolean mayusculas=key>=65 && key <=90 || key == 209 ;
        boolean minusculas=key>=97 && key <=122 || key==241 ;
    
     
        
        if(!(mayusculas || minusculas ) || jT.getText().length()>maxLe){
            evt.consume(); 
        }
    }
    private void validacionCamposNumeros(KeyEvent evt,JTextField jT, int maxLe){
         int key=evt.getKeyChar();
        boolean numeros=key>=48  && key <=57;
        if(!numeros || jT.getText().length()>maxLe){
            evt.consume();
        }       
        
        
    }
    
    private void txtCedulaClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaClienteKeyTyped
       validacionCamposNumeros(evt, txtCedulaCliente, 15);
    }//GEN-LAST:event_txtCedulaClienteKeyTyped

    private void txtNombreClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreClienteKeyTyped
        validacionCamposTexto(evt, txtNombreCliente, 25);
    }//GEN-LAST:event_txtNombreClienteKeyTyped

    private void txtPApellidoClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPApellidoClienteKeyTyped
        validacionCamposTexto(evt, txtPApellidoCliente, 16);
    }//GEN-LAST:event_txtPApellidoClienteKeyTyped

    private void txtSApellidoClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSApellidoClienteKeyTyped
        validacionCamposTexto(evt, txtSApellidoCliente, 16);
    }//GEN-LAST:event_txtSApellidoClienteKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        validacionCamposNumeros(evt, txtTelefono,15);
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtTipoViaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoViaKeyTyped
        validacionCamposTexto(evt, txtTipoVia, 15);
    }//GEN-LAST:event_txtTipoViaKeyTyped

    private void txtNombreONumeroViaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreONumeroViaKeyTyped
        if(txtNombreONumeroVia.getText().length()>15){
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreONumeroViaKeyTyped

    private void txtOrientacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOrientacionKeyTyped
          if(txtOrientacion.getText().length()>15){
            evt.consume();
        }
    }//GEN-LAST:event_txtOrientacionKeyTyped

    private void txtPlacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacaKeyTyped
        validacionCamposNumeros(evt, txtPlaca,10);
    }//GEN-LAST:event_txtPlacaKeyTyped

    private void txtComentariosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtComentariosKeyTyped
            if(txtComentarios.getText().length()>400){
            evt.consume();
        }
    }//GEN-LAST:event_txtComentariosKeyTyped
   // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Metodos de validacion de campos y carga de Combo box">

    private void cargarBarrios() {
        try {
            lBarrio = DBarrio.traerTodos();
            DefaultComboBoxModel<String> cModel = new DefaultComboBoxModel<>();
            for (Barrio b : lBarrio) {
                String nombreB = b.getNombre_barrio();
                cModel.addElement(nombreB);
            }
            cmbBarrios.setModel(cModel);
        } catch (Exception ex) {
            Logger.getLogger(IngresoSolicitud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private boolean validarCampos() {
        if (txtTipoVia.getText().isEmpty() || txtOrientacion.getText().isEmpty() || txtPlaca.getText().isEmpty() || txtNombreONumeroVia.getText().isEmpty() || txtNombreCliente.getText().isEmpty()
                || txtPApellidoCliente.getText().isEmpty()
                || txtSApellidoCliente.getText().isEmpty()
                || txtCedulaCliente.getText().isEmpty()
                || txtTelefono.getText().isEmpty()
                || txtComentarios.getText().isEmpty()) {

            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            txtCedulaCliente.requestFocus();
            return false;
        } else {
            return true;
        }
    }
// </editor-fold>


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbBarrios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelMain;
    private javax.swing.JLabel lbApellido;
    private javax.swing.JLabel lbApellido1;
    private javax.swing.JLabel lbBarrio;
    private javax.swing.JLabel lbCedula;
    private javax.swing.JLabel lbComentarios;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbNombrevia;
    private javax.swing.JLabel lbOrientacion;
    private javax.swing.JLabel lbPlaca;
    private javax.swing.JLabel lbTelefono;
    private javax.swing.JLabel lbTipoVia;
    private javax.swing.JTextField txtCedulaCliente;
    private javax.swing.JTextArea txtComentarios;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreONumeroVia;
    private javax.swing.JTextField txtOrientacion;
    private javax.swing.JTextField txtPApellidoCliente;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtSApellidoCliente;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTipoVia;
    // End of variables declaration//GEN-END:variables

}

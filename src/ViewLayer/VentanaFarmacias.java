package ViewLayer;

import DataAccessLayer.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentanaFarmacias extends javax.swing.JDialog {

    Conexion cc = new Conexion();
    Connection con = cc.conexion();

    PreparedStatement pst;
    Statement st;
    ResultSet rs;

    public VentanaFarmacias(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("FARMACIAS");
        mostrarDatosTablaFarmacias();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatosFarmacias = new javax.swing.JTable();
        btnCerrarVentanaFarmacia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel2.setText("Nombre:");

        jLabel4.setText("Dirección:");

        jLabel5.setText("Teléfono:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre)
                    .addComponent(txtDireccion)
                    .addComponent(txtTelefono))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones"));

        btnGuardar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/añadir.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnActualizar)
                .addGap(54, 54, 54))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnEliminar)
                    .addComponent(btnActualizar))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jLabel1.setText("Buscar farmacia por ID:");

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Consulta de Datos de Farmacias"));

        TablaDatosFarmacias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaDatosFarmacias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDatosFarmaciasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaDatosFarmacias);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnCerrarVentanaFarmacia.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCerrarVentanaFarmacia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar.png"))); // NOI18N
        btnCerrarVentanaFarmacia.setText("Cerrar Ventana y Desconectar DB");
        btnCerrarVentanaFarmacia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarVentanaFarmaciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(btnCerrarVentanaFarmacia)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrarVentanaFarmacia)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //BOTONES Y EVENTOS.

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        insertarDatosFarmacias();
        mostrarDatosTablaFarmacias();
        limpiarCajas();


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void TablaDatosFarmaciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDatosFarmaciasMouseClicked

        int filaSeleccionada = TablaDatosFarmacias.rowAtPoint(evt.getPoint());

        txtNombre.setText(TablaDatosFarmacias.getValueAt(filaSeleccionada, 1).toString());
        txtDireccion.setText(TablaDatosFarmacias.getValueAt(filaSeleccionada, 2).toString());
        txtTelefono.setText(TablaDatosFarmacias.getValueAt(filaSeleccionada, 3).toString());
        
        
    }//GEN-LAST:event_TablaDatosFarmaciasMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizarDatosFarmacias();
        limpiarCajas();
        mostrarDatosTablaFarmacias();

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarDatosFarmacias();
        mostrarDatosTablaFarmacias();
        limpiarCajas();

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        filtrarDatosTablaFarmacias(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnCerrarVentanaFarmaciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarVentanaFarmaciaActionPerformed
        this.dispose();
        Principal.estadoF = true;
        DesconexionDbFarmacias();


    }//GEN-LAST:event_btnCerrarVentanaFarmaciaActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    //MÉTODOS.
    public void insertarDatosFarmacias() {

        try {

            String query = "insert into farmacias (nombre, direccion, telefono) values (?,?,?)";

            pst = con.prepareStatement(query);

            pst.setString(1, txtNombre.getText());
            pst.setString(2, txtDireccion.getText());
            pst.setString(3, txtTelefono.getText());

            pst.execute();

            JOptionPane.showMessageDialog(null, "Registro completado.");

            pst.close();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error al registrar la información: " + e);

        }

    }

    public void actualizarDatosFarmacias() {

        try {

            String query = "update  farmacias set nombre=?, direccion=?, telefono=? where idFarmacia=?";

            int filaSeleccionada = TablaDatosFarmacias.getSelectedRow();

            String dao = (String) TablaDatosFarmacias.getValueAt(filaSeleccionada, 0);

            pst = con.prepareStatement(query);

            pst.setString(1, txtNombre.getText());
            pst.setString(2, txtDireccion.getText());
            pst.setString(3, txtTelefono.getText());

            pst.setString(4, dao);

            pst.execute();

            pst.close();

            JOptionPane.showMessageDialog(null, "Registro editado correctamente.");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error al editar la información. No ha seleccionado ningún registro.");

            JOptionPane.showMessageDialog(null, "Error --> " + e);

        }

    }

    public void eliminarDatosFarmacias() {

        int filaSeleccionada = TablaDatosFarmacias.getSelectedRow();

        try {

            String query = "delete from farmacias where idFarmacia=" + TablaDatosFarmacias.getValueAt(filaSeleccionada, 0);

            st = con.createStatement();

            int n = st.executeUpdate(query);

            if (n >= 0) {

                JOptionPane.showMessageDialog(null, "Registro eliminado correctamente.");

                st.close();

            } else {

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error al eliminar el registro: " + e);

        }

    }

    public void mostrarDatosTablaFarmacias() {

        String[] titulosTablaFarmacia = {"ID Farmacia", "Nombre", "Dirección", "Teléfono"};

        String[] registrosFarmacias = new String[4];

        DefaultTableModel modelo = new DefaultTableModel(null, titulosTablaFarmacia){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
                
            }
            
        };

        String query = "select * from farmacias";

        try {

            st = con.createStatement();
            rs = st.executeQuery(query);

            while (rs.next()) {

                registrosFarmacias[0] = rs.getString("idFarmacia");
                registrosFarmacias[1] = rs.getString("nombre");
                registrosFarmacias[2] = rs.getString("direccion");
                registrosFarmacias[3] = rs.getString("telefono");

                modelo.addRow(registrosFarmacias);

            }

            TablaDatosFarmacias.setModel(modelo);

            st.close();
            rs.close();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error al mostrar datos de la tabla farmacias: " + e);

        }

    }

    public void limpiarCajas() {
        txtNombre.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
    }

    public void DesconexionDbFarmacias() {

        try {

            JOptionPane.showMessageDialog(null, "Desconexión de farmacias exitosa.");

            con.close();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Fallo en la desconexión de la base de datos (Farmacias): " + e);

        }

    }

    public void filtrarDatosTablaFarmacias(String valor) {

        String[] titulosTablaFarmacia = {"ID Farmacia", "Nombre", "Dirección", "Teléfono"};

        String[] registrosFarmacias = new String[4];

        DefaultTableModel modelo = new DefaultTableModel(null, titulosTablaFarmacia);

        String query = "select * from farmacias where idFarmacia like '%" + valor + "%'";

        try {

            //Statement st = con.createStatement();
            st = con.createStatement();

            //ResultSet rs = st.executeQuery(SQL);
            rs = st.executeQuery(query);

            while (rs.next()) {

                registrosFarmacias[0] = rs.getString("idFarmacia");
                registrosFarmacias[1] = rs.getString("nombre");
                registrosFarmacias[2] = rs.getString("direccion");
                registrosFarmacias[3] = rs.getString("telefono");

                modelo.addRow(registrosFarmacias);

            }

            TablaDatosFarmacias.setModel(modelo);
            st.close();
            rs.close();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error al mostrar datos de la tabla farmacias: " + e);

        }

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaFarmacias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaFarmacias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaFarmacias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaFarmacias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaFarmacias dialog = new VentanaFarmacias(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDatosFarmacias;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCerrarVentanaFarmacia;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}

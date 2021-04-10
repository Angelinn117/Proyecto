package ViewLayer;

import BusinessModelLayer.Farmacia;
import DataAccessLayer.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentanaProductos extends javax.swing.JDialog {

    Conexion cc = new Conexion();
    Connection con = cc.conexion();

    PreparedStatement pst;
    Statement st;
    ResultSet rs;

    ArrayList ListaNombresFarmacias;

    public VentanaProductos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        txtIdTemporal.setVisible(false);
        this.setLocationRelativeTo(null);
        setTitle("PRODUCTOS");
        mostrarDatosTablaProductos();

        añadirElementosComboBox();

        ListaNombresFarmacias = new ArrayList();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIdProducto = new javax.swing.JTextField();
        txtCaducidad = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        cbIdFarmacias = new javax.swing.JComboBox<>();
        txtIdTemporal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatosProductos = new javax.swing.JTable();
        btnCerrarVentanaProducto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel2.setText("Nombre:");

        jLabel3.setText("ID de Producto:");

        jLabel4.setText("Caducidad:");

        jLabel5.setText("Stock:");

        cbIdFarmacias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una Farmacia" }));

        txtIdTemporal.setEnabled(false);

        jLabel1.setText("Aún no funciona del todo (falta que tome el ID) ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdProducto)
                    .addComponent(txtNombre)
                    .addComponent(txtCaducidad)
                    .addComponent(txtStock)
                    .addComponent(cbIdFarmacias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(181, 181, 181)
                .addComponent(txtIdTemporal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                        .addComponent(txtCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbIdFarmacias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdTemporal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnActualizar)
                .addGap(35, 35, 35))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnEliminar)
                    .addComponent(btnActualizar))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de Productos"));

        TablaDatosProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TablaDatosProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDatosProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaDatosProductos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCerrarVentanaProducto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCerrarVentanaProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar.png"))); // NOI18N
        btnCerrarVentanaProducto.setText("Cerrar Ventana y Desconectar DB");
        btnCerrarVentanaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarVentanaProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(btnCerrarVentanaProducto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrarVentanaProducto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //BOTONES Y EVENTOS.

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        insertarDatosProductos();
        mostrarDatosTablaProductos();
        limpiarCajas();

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarDatosProductos();
        mostrarDatosTablaProductos();
        añadirElementosComboBox();
        limpiarCajas();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizarDatosProductos();
        mostrarDatosTablaProductos();
        limpiarCajas();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnCerrarVentanaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarVentanaProductoActionPerformed
        this.dispose();
        Principal.estadoP = true;
        DesconexionDbProductos();

    }//GEN-LAST:event_btnCerrarVentanaProductoActionPerformed

    private void TablaDatosProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDatosProductosMouseClicked

        int filaSeleccionada = TablaDatosProductos.rowAtPoint(evt.getPoint());

        txtIdProducto.setText(TablaDatosProductos.getValueAt(filaSeleccionada, 0).toString());
        txtNombre.setText(TablaDatosProductos.getValueAt(filaSeleccionada, 1).toString());
        txtCaducidad.setText(TablaDatosProductos.getValueAt(filaSeleccionada, 2).toString());
        txtStock.setText(TablaDatosProductos.getValueAt(filaSeleccionada, 3).toString());


    }//GEN-LAST:event_TablaDatosProductosMouseClicked

    //MÉTODOS.
    public void limpiarCajas() {
        txtIdProducto.setText("");
        txtNombre.setText("");
        txtCaducidad.setText("");
        txtStock.setText("");

    }

    public void añadirElementosComboBox() {

        try {

            cbIdFarmacias.removeAllItems();
            cbIdFarmacias.addItem("Seleccione una farmacia");
            ListaNombresFarmacias = cc.NombresFarmacias();
            Iterator iterador = ListaNombresFarmacias.iterator();

            while (iterador.hasNext()) {

                Farmacia farmacia = (Farmacia) iterador.next();
                cbIdFarmacias.addItem(farmacia.toString());

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error en lo del combo: " + e);

        }

    }

    public void DesconexionDbProductos() {

        try {

            JOptionPane.showMessageDialog(null, "Desconexión de productos exitosa.");

            con.close();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Fallo en la desconexión de la base de datos (Productos): " + e);

        }
    }

    public void insertarDatosProductos() {

        try {

            String query = "insert into productos (idProducto, nombre, caducidad, stock) values (?,?,?,?)";

            pst = con.prepareStatement(query);

            pst.setString(1, txtIdProducto.getText());
            pst.setString(2, txtNombre.getText());
            pst.setString(3, txtCaducidad.getText());
            pst.setString(4, txtStock.getText());

            pst.execute();

            pst.close();

            JOptionPane.showMessageDialog(null, "Registro completado.");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error al registrar la información: " + e);

        }

    }

    public void eliminarDatosProductos() {

        int filaSeleccionada = TablaDatosProductos.getSelectedRow();

        try {

            String query = "delete from productos where idProducto=" + TablaDatosProductos.getValueAt(filaSeleccionada, 0);

            st = con.createStatement();

            int n = st.executeUpdate(query);

            if (n >= 0) {

                JOptionPane.showMessageDialog(null, "Registro eliminado correctamente.");

            } else {

            }

            st.close();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error al eliminar el registro: " + e);

        }

    }

    public void actualizarDatosProductos() {

        try {

            String query = "update  productos set IdProducto=?, nombre=?, caducidad=?, stock=? where idProducto=?";

            int filaSeleccionada = TablaDatosProductos.getSelectedRow();

            //¿Porqué es necesario poner esto?
            String dao = (String) TablaDatosProductos.getValueAt(filaSeleccionada, 0);

            pst = con.prepareStatement(query);

            pst.setInt(1, Integer.parseInt(txtIdProducto.getText()));
            pst.setString(2, txtNombre.getText());
            pst.setString(3, txtCaducidad.getText());
            pst.setString(4, txtStock.getText());

            //Y esto...
            pst.setString(5, dao);

            pst.execute();

            pst.close();

            JOptionPane.showMessageDialog(null, "Registro editado correctamente.");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error al editar la información. No ha seleccionado ningún registro.");

            JOptionPane.showMessageDialog(null, "Error --> " + e);

        }

    }

    public void mostrarDatosTablaProductos() {

        String[] titulosTablaProductos = {"ID Producto", "Nombre", "Caducidad", "Stock"};

        String[] registrosProductos = new String[4];

        DefaultTableModel modelo = new DefaultTableModel(null, titulosTablaProductos){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
                
            }
            
        };

        String query = "select * from productos";

        try {

            st = con.createStatement();
            rs = st.executeQuery(query);

            while (rs.next()) {

                registrosProductos[0] = rs.getString("idProducto");
                registrosProductos[1] = rs.getString("nombre");
                registrosProductos[2] = rs.getString("caducidad");
                registrosProductos[3] = rs.getString("stock");

                modelo.addRow(registrosProductos);

            }

            TablaDatosProductos.setModel(modelo);

            st.close();
            rs.close();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error al mostrar datos de la tabla productos: " + e);

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaProductos dialog = new VentanaProductos(new javax.swing.JFrame(), true);
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
    private javax.swing.JTable TablaDatosProductos;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCerrarVentanaProducto;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbIdFarmacias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCaducidad;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtIdTemporal;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}

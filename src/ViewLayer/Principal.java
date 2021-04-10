package ViewLayer;

import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    public static boolean estadoF = true;
    public static boolean estadoP = true;

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Proyecto 1er Parcial");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnAbrirVentanaFarmacias = new javax.swing.JButton();
        btnAbrirVentanaProductos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btonAyuda = new javax.swing.JButton();
        btnSalirFarmacias = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proyecto");
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cuidado-de-la-salud.png"))); // NOI18N

        btnAbrirVentanaFarmacias.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnAbrirVentanaFarmacias.setText("Farmacias");
        btnAbrirVentanaFarmacias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirVentanaFarmaciasActionPerformed(evt);
            }
        });

        btnAbrirVentanaProductos.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnAbrirVentanaProductos.setText("Productos");
        btnAbrirVentanaProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirVentanaProductosActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Eras Demi ITC", 1, 18)); // NOI18N
        jLabel2.setText("Por favor, selecciona una opción:");

        jLabel3.setFont(new java.awt.Font("Eras Demi ITC", 1, 36)); // NOI18N
        jLabel3.setText("SimiSoft 2.0");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/farmacia.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/productos-lacteos.png"))); // NOI18N

        btonAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ayuda.png"))); // NOI18N
        btonAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonAyudaActionPerformed(evt);
            }
        });

        btnSalirFarmacias.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnSalirFarmacias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar.png"))); // NOI18N
        btnSalirFarmacias.setText("Salir del programa");
        btnSalirFarmacias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirFarmaciasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel4))
                            .addComponent(btnAbrirVentanaFarmacias))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(btnAbrirVentanaProductos))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addGap(25, 25, 25))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btonAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel2)))
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btnSalirFarmacias)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btonAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAbrirVentanaFarmacias))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAbrirVentanaProductos)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalirFarmacias)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbrirVentanaFarmaciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirVentanaFarmaciasActionPerformed

        validarVentanaFarmacias();

    }//GEN-LAST:event_btnAbrirVentanaFarmaciasActionPerformed

    private void btnAbrirVentanaProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirVentanaProductosActionPerformed

        validarVentanaProductos();

    }//GEN-LAST:event_btnAbrirVentanaProductosActionPerformed

    private void btonAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonAyudaActionPerformed
        JOptionPane.showMessageDialog(null, "Programa hecho por Angel Alexis González Flores.\nFecha: 9/ABR/2021.");
    }//GEN-LAST:event_btonAyudaActionPerformed

    private void btnSalirFarmaciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirFarmaciasActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnSalirFarmaciasActionPerformed

    public void validarVentanaFarmacias() {

        if (estadoF) {

            estadoF = false;

            VentanaFarmacias obj = new VentanaFarmacias(null, false);
            obj.setVisible(true);

        } else {

        }

    }

    public void validarVentanaProductos() {

        if (estadoP) {

            estadoP = false;

            VentanaProductos obj = new VentanaProductos(null, false);
            obj.setVisible(true);

        } else {

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirVentanaFarmacias;
    private javax.swing.JButton btnAbrirVentanaProductos;
    private javax.swing.JButton btnSalirFarmacias;
    private javax.swing.JButton btonAyuda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}

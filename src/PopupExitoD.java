package Popups;

public class PopupExitoD extends javax.swing.JDialog {
    
    public PopupExitoD(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setOpacity(0.85f);
    }
    
    public PopupExitoD(java.awt.Frame parent, boolean modal,String msg) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setOpacity(0.85f);
        Mensaje.setText(msg);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PanelBotonAceptar = new javax.swing.JPanel();
        BotonAceptar = new javax.swing.JButton();
        Icono = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        Mensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelBotonAceptar.setBackground(new java.awt.Color(59, 228, 189));

        BotonAceptar.setFont(new java.awt.Font("Andis", 0, 20)); // NOI18N
        BotonAceptar.setText("Aceptar");
        BotonAceptar.setContentAreaFilled(false);
        BotonAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonAceptarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonAceptarMouseExited(evt);
            }
        });
        BotonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBotonAceptarLayout = new javax.swing.GroupLayout(PanelBotonAceptar);
        PanelBotonAceptar.setLayout(PanelBotonAceptarLayout);
        PanelBotonAceptarLayout.setHorizontalGroup(
            PanelBotonAceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotonAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );
        PanelBotonAceptarLayout.setVerticalGroup(
            PanelBotonAceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotonAceptar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(PanelBotonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 290, 50));

        Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Exito.png"))); // NOI18N
        jPanel1.add(Icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 70, 80));

        Titulo.setFont(new java.awt.Font("Andis", 1, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(55, 198, 165));
        Titulo.setText("Éxito");
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 110, 60));

        Mensaje.setFont(new java.awt.Font("Andis", 0, 18)); // NOI18N
        Mensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mensaje.setText("Texto Ejemplo ");
        Mensaje.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Mensaje.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Mensaje.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jPanel1.add(Mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 190, 280, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonAceptarMouseEntered
        PanelBotonAceptar.setBackground(new java.awt.Color(23,176,141));
    }//GEN-LAST:event_BotonAceptarMouseEntered

    private void BotonAceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonAceptarMouseExited
        PanelBotonAceptar.setBackground(new java.awt.Color(59,228,189));
    }//GEN-LAST:event_BotonAceptarMouseExited

    private void BotonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAceptarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BotonAceptarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(PopupExitoD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PopupExitoD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PopupExitoD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PopupExitoD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PopupExitoD dialog = new PopupExitoD(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton BotonAceptar;
    private javax.swing.JLabel Icono;
    private javax.swing.JLabel Mensaje;
    private javax.swing.JPanel PanelBotonAceptar;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

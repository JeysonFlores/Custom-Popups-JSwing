package Popups;

public class PopupPreguntaD extends javax.swing.JDialog {
    public static final int RET_CANCEL = 0;
    public static final int RET_OK = 1;
   
    public PopupPreguntaD(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setOpacity(0.85f);
    }
    
    public PopupPreguntaD(java.awt.Frame parent, boolean modal,String msg) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setOpacity(0.85f);
        Mensaje.setText(msg);
    }
    
    public int getReturnStatus() {
        return returnStatus;
    }
    
    private void doClose(int retStatus) {
        returnStatus = retStatus;
        setVisible(false);
        dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Icono = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        Mensaje = new javax.swing.JLabel();
        BotonAceptar = new rojeru_san.complementos.RSButtonHover();
        BotonCancelar = new rojeru_san.complementos.RSButtonHover();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Pregunta.png"))); // NOI18N
        jPanel1.add(Icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 70, 80));

        Titulo.setFont(new java.awt.Font("Andis", 1, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.setText("Alerta");
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 130, 60));

        Mensaje.setFont(new java.awt.Font("Andis", 0, 18)); // NOI18N
        Mensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mensaje.setText("Texto Ejemplo ");
        Mensaje.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Mensaje.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Mensaje.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jPanel1.add(Mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 310, 70));

        BotonAceptar.setBackground(new java.awt.Color(59, 228, 189));
        BotonAceptar.setBorder(null);
        BotonAceptar.setText("Aceptar");
        BotonAceptar.setColorHover(new java.awt.Color(23, 176, 141));
        BotonAceptar.setFont(new java.awt.Font("Andis", 0, 20)); // NOI18N
        BotonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 150, 50));

        BotonCancelar.setBackground(new java.awt.Color(254, 110, 110));
        BotonCancelar.setBorder(null);
        BotonCancelar.setText("Cancelar");
        BotonCancelar.setColorHover(new java.awt.Color(204, 86, 86));
        BotonCancelar.setFont(new java.awt.Font("Andis", 0, 20)); // NOI18N
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 160, 50));

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

    private void BotonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAceptarActionPerformed
        doClose(RET_OK);
    }//GEN-LAST:event_BotonAceptarActionPerformed

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        doClose(RET_CANCEL);
    }//GEN-LAST:event_BotonCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(PopupPreguntaD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PopupPreguntaD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PopupPreguntaD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PopupPreguntaD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PopupPreguntaD dialog = new PopupPreguntaD(new javax.swing.JFrame(), true);
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
    private rojeru_san.complementos.RSButtonHover BotonAceptar;
    private rojeru_san.complementos.RSButtonHover BotonCancelar;
    private javax.swing.JLabel Icono;
    private javax.swing.JLabel Mensaje;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    private int returnStatus = RET_CANCEL;
}

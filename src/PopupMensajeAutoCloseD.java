package Popups;
import Clases.SimpleTimer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import java.util.Timer;

public class PopupMensajeAutoCloseD extends javax.swing.JDialog {
    SimpleTimer timer = new SimpleTimer();
     Timer t = new Timer();
     
     public PopupMensajeAutoCloseD(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocation(parent.getHeight(),parent.getWidth()-parent.getY()-this.getHeight());
        this.setOpacity(1.0f);
    }
     
     public PopupMensajeAutoCloseD() {
        initComponents();
        this.setOpacity(1.0f);
    }
     
    public PopupMensajeAutoCloseD(java.awt.Frame parent, boolean modal,String msg) {
       // super(parent, modal);
        super.setEnabled(true);
        initComponents();
        this.setLocation(parent.getHeight(),parent.getY()+this.getHeight());
        this.setOpacity(1.0f);
         Mensaje.setText(msg);
    }
    
    private class EjecutarTimerAlerta extends TimerTask{
        
        PopupMensajeAutoCloseD po = new PopupMensajeAutoCloseD();
        double a=1.0;
        
        public EjecutarTimerAlerta(PopupMensajeAutoCloseD uwu){
            this.po = uwu;
        }
        

        @Override
        public void run() {
            if(timer.ElapsedTimeRemainingMilis(3400) <= 0){
                this.cancel();
                po.dispose();
            }
            else{
               po.setOp(a);
               a-=0.002941176;
               
            }
        }
    }
    
    public void setOp(double a){
        float f=(float) 0;
        this.setOpacity((float)(a));
    }

    @Override
    public void toFront() {
        super.toFront();
    }

    @Override
    public void toBack() {
        super.toBack(); 
    }
    public void aber(){
        timer.Start();

        t.scheduleAtFixedRate(new EjecutarTimerAlerta(this), 0, 10);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelP = new javax.swing.JPanel();
        Mensaje = new javax.swing.JLabel();
        PanelBotonX = new javax.swing.JPanel();
        BotonX = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(410, 60));

        PanelP.setBackground(new java.awt.Color(27, 34, 36));
        PanelP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Mensaje.setFont(new java.awt.Font("Andis", 0, 24)); // NOI18N
        Mensaje.setForeground(new java.awt.Color(255, 255, 255));
        Mensaje.setText("Texto Ejemplo 123");
        PanelP.add(Mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 310, 40));

        PanelBotonX.setBackground(new java.awt.Color(21, 28, 30));
        PanelBotonX.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Error45.png"))); // NOI18N
        BotonX.setBorderPainted(false);
        BotonX.setContentAreaFilled(false);
        BotonX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonXActionPerformed(evt);
            }
        });
        PanelBotonX.add(BotonX, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 90, 80));

        PanelP.add(PanelBotonX, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 70, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PanelP, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PanelP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonXActionPerformed
        // TODO add your handling code here:
       // t.cancel();
        this.dispose();
    }//GEN-LAST:event_BotonXActionPerformed

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
            java.util.logging.Logger.getLogger(PopupMensajeAutoCloseD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PopupMensajeAutoCloseD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PopupMensajeAutoCloseD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PopupMensajeAutoCloseD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PopupMensajeAutoCloseD dialog = new PopupMensajeAutoCloseD(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton BotonX;
    private javax.swing.JLabel Mensaje;
    private javax.swing.JPanel PanelBotonX;
    private javax.swing.JPanel PanelP;
    // End of variables declaration//GEN-END:variables
}

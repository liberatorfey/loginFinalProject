
import java.util.Random;
import javax.swing.Icon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jirawan
 */
public class MainPage extends javax.swing.JFrame {
    

    /**
     * Creates new form NewJFrame
     */
    public MainPage() {
        initComponents();
        MainpageService.getInfo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        detatilbtn1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        detatilbtn2 = new javax.swing.JButton();
        detatilbtn3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        detatilbtn4 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        detatilbtn5 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        detatilbtn6 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        cartBtn = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        x6 = new javax.swing.JLabel();
        x1 = new javax.swing.JLabel();
        x2 = new javax.swing.JLabel();
        x3 = new javax.swing.JLabel();
        x4 = new javax.swing.JLabel();
        x5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        x12 = new javax.swing.JLabel();
        x10 = new javax.swing.JLabel();
        x11 = new javax.swing.JLabel();
        x13 = new javax.swing.JLabel();
        x14 = new javax.swing.JLabel();
        x15 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(746, 600));
        getContentPane().setLayout(null);

        detatilbtn1.setText("รายละเอียด");
        detatilbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detatilbtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(detatilbtn1);
        detatilbtn1.setBounds(60, 250, 90, 23);

        jButton2.setText("+");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(150, 250, 40, 23);

        detatilbtn2.setText("รายละเอียด");
        detatilbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detatilbtn2ActionPerformed(evt);
            }
        });
        getContentPane().add(detatilbtn2);
        detatilbtn2.setBounds(290, 250, 90, 23);

        detatilbtn3.setText("รายละเอียด");
        detatilbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detatilbtn3ActionPerformed(evt);
            }
        });
        getContentPane().add(detatilbtn3);
        detatilbtn3.setBounds(530, 250, 90, 23);

        jButton7.setText("+");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(380, 250, 40, 23);

        detatilbtn4.setText("รายละเอียด");
        detatilbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detatilbtn4ActionPerformed(evt);
            }
        });
        getContentPane().add(detatilbtn4);
        detatilbtn4.setBounds(60, 440, 90, 23);

        jButton9.setText("+");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(150, 440, 40, 23);

        detatilbtn5.setText("รายละเอียด");
        detatilbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detatilbtn5ActionPerformed(evt);
            }
        });
        getContentPane().add(detatilbtn5);
        detatilbtn5.setBounds(300, 440, 90, 23);

        jButton11.setText("+");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(390, 440, 40, 23);

        detatilbtn6.setText("รายละเอียด");
        detatilbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detatilbtn6ActionPerformed(evt);
            }
        });
        getContentPane().add(detatilbtn6);
        detatilbtn6.setBounds(530, 440, 90, 23);

        jButton13.setText("+");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13);
        jButton13.setBounds(620, 440, 40, 23);

        cartBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cartBtn.setText("ตะกร้าสินค้า");
        cartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartBtnActionPerformed(evt);
            }
        });
        getContentPane().add(cartBtn);
        cartBtn.setBounds(260, 490, 200, 40);

        jButton14.setText("Profile");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14);
        jButton14.setBounds(540, 60, 70, 23);

        jLabel1.setText("รูปโปรไฟล์");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(620, 20, 90, 100);
        getContentPane().add(x6);
        x6.setBounds(540, 330, 90, 100);

        x1.setMinimumSize(new java.awt.Dimension(120, 200));
        x1.setName("picture1");
        x1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                x1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                x1AncestorRemoved(evt);
            }
        });
        getContentPane().add(x1);
        x1.setBounds(70, 140, 100, 100);
        getContentPane().add(x2);
        x2.setBounds(310, 140, 100, 100);
        getContentPane().add(x3);
        x3.setBounds(540, 140, 90, 100);
        getContentPane().add(x4);
        x4.setBounds(70, 330, 100, 100);
        getContentPane().add(x5);
        x5.setBounds(310, 330, 100, 100);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setText("ซื้อเหอะอยากขาย");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(80, 30, 290, 70);

        x12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(x12);
        x12.setBounds(520, 110, 130, 20);

        x10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(x10);
        x10.setBounds(70, 110, 130, 20);

        x11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(x11);
        x11.setBounds(290, 110, 200, 20);

        x13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(x13);
        x13.setBounds(80, 300, 160, 20);

        x14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(x14);
        x14.setBounds(300, 300, 150, 20);

        x15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(x15);
        x15.setBounds(550, 300, 120, 20);

        jButton15.setText("+");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton15);
        jButton15.setBounds(620, 250, 40, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\FinalProjects-master\\src\\org\\me\\myimageapp\\resources\\bg.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -10, 750, 590);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void detatilbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detatilbtn1ActionPerformed
        ProductDetailService.showProductDetail();
        ProductDetailService.getDetailProduct("S01");
    }//GEN-LAST:event_detatilbtn1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void detatilbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detatilbtn2ActionPerformed
        ProductDetailService.showProductDetail();
        ProductDetailService.getDetailProduct("S02");
    }//GEN-LAST:event_detatilbtn2ActionPerformed

    private void detatilbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detatilbtn3ActionPerformed
       ProductDetailService.showProductDetail();
       ProductDetailService.getDetailProduct("S03");
    }//GEN-LAST:event_detatilbtn3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void detatilbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detatilbtn4ActionPerformed
        ProductDetailService.showProductDetail();
        ProductDetailService.getDetailProduct("S04");
    }//GEN-LAST:event_detatilbtn4ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void detatilbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detatilbtn5ActionPerformed
        ProductDetailService.showProductDetail();
        ProductDetailService.getDetailProduct("S05");
    }//GEN-LAST:event_detatilbtn5ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void detatilbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detatilbtn6ActionPerformed
        ProductDetailService.showProductDetail();
        ProductDetailService.getDetailProduct("S06");
    }//GEN-LAST:event_detatilbtn6ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void cartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartBtnActionPerformed
        MainpageService.showCart();
        String user ;
         user = LoginForm.usercurent;
         System.out.println(user);
         System.out.println("MainPage.main()");
        
    }//GEN-LAST:event_cartBtnActionPerformed

    private void x1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_x1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_x1AncestorAdded

    private void x1AncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_x1AncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_x1AncestorRemoved

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cartBtn;
    private javax.swing.JButton detatilbtn1;
    private javax.swing.JButton detatilbtn2;
    private javax.swing.JButton detatilbtn3;
    private javax.swing.JButton detatilbtn4;
    private javax.swing.JButton detatilbtn5;
    private javax.swing.JButton detatilbtn6;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel x1;
    public static javax.swing.JLabel x10;
    public static javax.swing.JLabel x11;
    public static javax.swing.JLabel x12;
    public static javax.swing.JLabel x13;
    public static javax.swing.JLabel x14;
    public static javax.swing.JLabel x15;
    public static javax.swing.JLabel x2;
    public static javax.swing.JLabel x3;
    public static javax.swing.JLabel x4;
    public static javax.swing.JLabel x5;
    public static javax.swing.JLabel x6;
    // End of variables declaration//GEN-END:variables
}

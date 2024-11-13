/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pemkom1;
import java.awt.Color;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author mfaiz
 */

public class Admin extends javax.swing.JFrame {
    
    Color DefaultColor,ClikedColor;
    

    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents();
        DefaultColor = new Color(0,0,0);
        ClikedColor = new Color(51,51,255);
        
        DataUser.setBackground(DefaultColor);
        DataProduk.setBackground(DefaultColor);
        DataTrans.setBackground(DefaultColor);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        DataUser = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        DataProduk = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        DataTrans = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DataUser.setBackground(new java.awt.Color(0, 0, 0));
        DataUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DataUserMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DataUserMousePressed(evt);
            }
        });
        DataUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/user (2).png"))); // NOI18N
        jLabel1.setText("Data User");
        DataUser.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 120, -1));

        jPanel1.add(DataUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 32, 220, 46));

        DataProduk.setBackground(new java.awt.Color(0, 0, 0));
        DataProduk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DataProdukMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DataProdukMousePressed(evt);
            }
        });
        DataProduk.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/user (2).png"))); // NOI18N
        jLabel2.setText("Data Produk");
        DataProduk.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 120, -1));

        jPanel1.add(DataProduk, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 133, 220, 50));

        DataTrans.setBackground(new java.awt.Color(0, 0, 0));
        DataTrans.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DataTransMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DataTransMousePressed(evt);
            }
        });
        DataTrans.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/user (2).png"))); // NOI18N
        jLabel3.setText("Data Transaksi");
        DataTrans.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 130, -1));

        jPanel1.add(DataTrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 237, 220, 47));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 220, 720));

        jPanel2.setBackground(java.awt.Color.gray);

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/profile (1).png"))); // NOI18N
        jLabel5.setText("Admin Toko Online");

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButton1.setText("KELUAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1212, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 80));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1320, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 1320, 730));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DataUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DataUserMousePressed
        // TODO add your handling code here:
        DataUser.setBackground(ClikedColor);
        DataProduk.setBackground(DefaultColor);
        DataTrans.setBackground(DefaultColor);
        
    }//GEN-LAST:event_DataUserMousePressed

    private void DataProdukMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DataProdukMousePressed
        // TODO add your handling code here:
        DataUser.setBackground(DefaultColor);
        DataProduk.setBackground(ClikedColor);
        DataTrans.setBackground(DefaultColor);
       
    }//GEN-LAST:event_DataProdukMousePressed

    private void DataTransMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DataTransMousePressed
        // TODO add your handling code here:
        DataUser.setBackground(DefaultColor);
        DataProduk.setBackground(DefaultColor);
        DataTrans.setBackground(ClikedColor);
        
    }//GEN-LAST:event_DataTransMousePressed

    private void DataUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DataUserMouseClicked
        // TODO add your handling code here:
        DataUser DataUser= new DataUser();
        jPanel3.removeAll();
        jPanel3.add(DataUser).setVisible(true);
        
    }//GEN-LAST:event_DataUserMouseClicked

    private void DataProdukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DataProdukMouseClicked
        // TODO add your handling code here:
        DataProduk DataProduk= new DataProduk();
        jPanel3.removeAll();
        jPanel3.add(DataProduk).setVisible(true);
        
    }//GEN-LAST:event_DataProdukMouseClicked

    private void DataTransMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DataTransMouseClicked
        // TODO add your handling code here:
        DataTrans DataTrans= new DataTrans();
        jPanel3.removeAll();
        jPanel3.add(DataTrans).setVisible(true);
       
    }//GEN-LAST:event_DataTransMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        JOptionPane.showMessageDialog(null, "Anda berhasil Keluar");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DataProduk;
    private javax.swing.JPanel DataTrans;
    private javax.swing.JPanel DataUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

}
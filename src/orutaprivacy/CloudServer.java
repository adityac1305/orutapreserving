/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package orutaprivacy;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RameshKumar
 */
public class CloudServer extends javax.swing.JFrame {

    //String filename;
    /**
     * Creates new form CloudServer
     */
    String user = "";

    public CloudServer() {
        initComponents();
        //this.getContentPane().setBackground(Color.CYAN);
    }

    public CloudServer(String user) {
        this.user = user;
        initComponents();
        System.out.println(user + " name......");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem6 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        backgroundimg = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        jMenuItem6.setText("ViewCloudAttacker");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));
        setPreferredSize(new java.awt.Dimension(805, 640));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cloud Server");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 800, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("View All Owner Files");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 183, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ownername", "Filename", "Privatekey", "block1", "block2", "block3", "block4", "block5"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 740, 246));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inter/backbtn.jpg"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 255, 255));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 160, -1));

        backgroundimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/7.jpg"))); // NOI18N
        getContentPane().add(backgroundimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 590));

        jMenu3.setText("File");

        jMenuItem5.setText("ViewCloudAttacker");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuBar2.add(jMenu3);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new ViewCloudAttakers().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
         try {
            Connection con = null;
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/orutapreserving", "root", "");
            if (con != null) {
                System.out.println("connected");
            }
               PreparedStatement gr = con.prepareStatement("select * from fileupload");
                ResultSet rs1 = gr.executeQuery();
                while (rs1.next()) {
                    final DefaultTableModel tm = (DefaultTableModel) jTable1.getModel();
                    tm.addRow(new Object[]{rs1.getString("Username"),rs1.getString("Filename"), rs1.getString("Privatekey"), rs1.getString("rsignatureblock1"), rs1.getString("rsignatureblock2"), rs1.getString("rsignatureblock3"), rs1.getString("rsignatureblock4"), rs1.getString("rsignatureblock5")});
            }

        } catch (Exception ex) {
            //System.out.println(ex);
            Logger.getLogger(CloudServer.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
        
        /* try {
            Connection con = null;
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/orutapreserving", "root", "");
            if (con != null) {
                System.out.println("connected");
            }
            PreparedStatement st = con.prepareStatement("select * from fileupload");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                //String group = rs.getString("UserGroup");
                //System.out.println(group);
                //PreparedStatement gr = con.prepareStatement("select * from fileupload where UserGroup='" + group + "'");
                //ResultSet rs1 = gr.executeQuery();
               // while (rs1.next()) {
                    final DefaultTableModel tm = (DefaultTableModel) jTable1.getModel();
                    tm.addRow(new Object[]{rs.getString("Username"),rs.getString("Filename"),rs.getString("Privatekey"), rs.getString("rsignatureblock1"), rs.getString("rsignatureblock2"), rs.getString("rsignatureblock3"), rs.getString("rsignatureblock4"), rs.getString("rsignatureblock5")});

                //}
            }

        } catch (Exception ex) {
            //System.out.println(ex);
            Logger.getLogger(CloudServer.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
               //jTable1.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        new DataOwner().setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(CloudServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CloudServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CloudServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CloudServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CloudServer().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundimg;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package orutaprivacy;

import com.dropbox.core.DbxException;
import com.dropbox.core.json.JsonReader;
import com.ecs.api.dropbox.FileUploader;
import com.ecs.api.util.AppConfiguration;
import static com.ecs.api.util.AppConfiguration.CONF_APP_AUTH;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author RameshKumar
 */
public class Update extends javax.swing.JFrame {

    Connection con;
    String url;
    String driver;
    String db;
    String cloud_path;
    String id ;
    
    
    private AppConfiguration appConfig;
    private FileUploader fileUploader;

    /**
     * Creates new form Update
     */
    public Update() {
        initComponents();
            appConfig = new AppConfiguration();
            if (!appConfig.loadConfiguration()) {
                showAuthorizationError();
                this.dispose();
            }
            try {
                fileUploader = new FileUploader(appConfig.getSpecificProp(CONF_APP_AUTH));
            } catch (JsonReader.FileLoadException ex) {
                ex.printStackTrace();
            }
    }



    /**
     *
     * @param username
     */
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        user_txt = new javax.swing.JTextField();
        file_txt = new javax.swing.JTextField();
        skey_txt = new javax.swing.JTextField();
        udate_txt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        uname_txt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        fname_txt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        pkey_txt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        date_txt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        block1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        block2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        block3 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        block4 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        block5 = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        backgroundimg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 255));
        jLabel3.setText("Ownername");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 159, 100, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 255));
        jLabel4.setText("Filename");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 209, 70, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 255, 255));
        jLabel6.setText("Updatedate");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, 80, -1));

        user_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_txtActionPerformed(evt);
            }
        });
        getContentPane().add(user_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 120, -1));
        getContentPane().add(file_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 119, -1));
        getContentPane().add(skey_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 119, -1));

        udate_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                udate_txtActionPerformed(evt);
            }
        });
        getContentPane().add(udate_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, 117, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 157, 233, 208));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 255, 255));
        jLabel7.setText("Ownername");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 400, 80, -1));

        uname_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uname_txtActionPerformed(evt);
            }
        });
        getContentPane().add(uname_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 117, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 255, 255));
        jLabel8.setText("Filename");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, 70, -1));

        fname_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fname_txtActionPerformed(evt);
            }
        });
        getContentPane().add(fname_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, 117, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 255, 255));
        jLabel9.setText("Privatekey");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 490, 80, -1));
        getContentPane().add(pkey_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, 120, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 204));
        jLabel11.setText("Update File");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 110, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inter/updateimag.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 570, 80, 40));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 255, 255));
        jLabel13.setText("    Date");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 50, -1));

        date_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date_txtActionPerformed(evt);
            }
        });
        getContentPane().add(date_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 120, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inter/resetimg123.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, 20));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inter/resetimg123.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 580, 80, 20));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inter/backbtn.jpg"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 80, 30));

        block1.setColumns(20);
        block1.setRows(5);
        jScrollPane2.setViewportView(block1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, -1, 70));

        block2.setColumns(20);
        block2.setRows(5);
        jScrollPane3.setViewportView(block2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, -1, 80));

        block3.setColumns(20);
        block3.setRows(5);
        jScrollPane4.setViewportView(block3);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, -1, 80));

        block4.setColumns(20);
        block4.setRows(5);
        jScrollPane5.setViewportView(block4);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, -1, 70));

        block5.setColumns(20);
        block5.setRows(5);
        jScrollPane6.setViewportView(block5);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 490, -1, 80));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 255, 255));
        jLabel14.setText("Block5");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 520, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 255, 255));
        jLabel18.setText("Block1");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 255, 255));
        jLabel19.setText("Block2");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 255, 255));
        jLabel20.setText("Block3");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 255, 255));
        jLabel21.setText("Block4");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 255, 255));
        jLabel22.setText("Privatekey");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 255, 80, -1));

        jButton1.setBackground(java.awt.Color.red);
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, -1, 20));

        backgroundimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/7.jpg"))); // NOI18N
        backgroundimg.setPreferredSize(new java.awt.Dimension(940, 700));
        getContentPane().add(backgroundimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void udate_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_udate_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_udate_txtActionPerformed

    private void user_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_txtActionPerformed

    private void uname_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uname_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uname_txtActionPerformed

    private void date_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_date_txtActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        user_txt.setText("");
        file_txt.setText("");
        skey_txt.setText("");
        date_txt.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        uname_txt.setText("");
        fname_txt.setText("");
        pkey_txt.setText("");
        udate_txt.setText("");
        jTextArea1.setText("");
        block1.setText("");
        block2.setText("");
        block3.setText("");
        block4.setText("");
        block5.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        new DataOwner().setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel17MouseClicked

    private void fname_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fname_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fname_txtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        date_txt.setText(dateFormat.format(date));
        date_txt.setEnabled(false);

        String username = user_txt.getText();
        String filename = file_txt.getText();
        String privatek = skey_txt.getText();
        try {
            con = null;
            url = "jdbc:mysql://localhost:3306/";
            driver = "com.mysql.jdbc.Driver";
            db = "orutapreserving";
            Class.forName(driver);
            con = (Connection) DriverManager.getConnection(url + db, "root", "");
            java.sql.Statement st = con.createStatement();
            String sql = "select * from fileupload WHERE Filename like'%" + filename + "%' and  Username='" + username + "'";
            System.out.println(sql);
            ResultSet rs = st.executeQuery(sql);
            if (privatek.isEmpty()) {
                return;
            }
            if (rs.next()) {
                if (privatek.equals(rs.getString("privatekey"))) {
                    id = rs.getString("Id");
                    String u_name = rs.getString("Username");
                    uname_txt.setText(u_name);
                    String f_name = rs.getString("Filename");
                    fname_txt.setText(f_name);
                    cloud_path = rs.getString("cloud_path");

                    //If So need to downloads from dropbox
                    String fileCont = rs.getString("File");
                    jTextArea1.setText(fileCont);

                    Scanner scan = new Scanner(fileCont);
                    ArrayList<String> lines = new ArrayList<String>();
                    while (scan.hasNextLine()) {
                        lines.add(scan.nextLine());
                    }

                    // Update File Blocks
                    updateBlocks(lines);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid privatekey");
            }
        } catch (Exception ex) {
            System.out.println(ex);
            ex.printStackTrace();
        } // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        date_txt.setText(dateFormat.format(date));
        date_txt.setEnabled(false);

        udate_txt.setText(dateFormat.format(date));
        udate_txt.setEnabled(false);

        try {
            String Username = uname_txt.getText();
            String Filename = fname_txt.getText();
            String Privatekey = pkey_txt.getText();
            String Upldate = udate_txt.getText();
            String File = jTextArea1.getText();

            Scanner scan = new Scanner(File);
            ArrayList<String> lines = new ArrayList<String>();
            while (scan.hasNextLine()) {
                lines.add(scan.nextLine());
            }

            // Update File Blocks
            updateBlocks(lines);

            String Block1 = block1.getText();
            String Block2 = block2.getText();
            String Block3 = block3.getText();
            String Block4 = block4.getText();
            String Block5 = block5.getText();
            Class.forName(driver);
            con = (Connection) DriverManager.getConnection(url + db, "root", "");
            String sql = "UPDATE `orutapreserving`.`fileupload` SET `Username` = ?, `Filename` = ?, `Privatekey` = ?, `Upldate` = ?, `File` = ?, `Block1` = ?, `Block2` = ?, `Block3` = ?, `Block4` = ?, `Block5` = ?, `cloud_path` = ? WHERE `fileupload`.`Id` = "+id;
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, Username);
            stm.setString(2, Filename);
            stm.setString(3, Privatekey);
            stm.setString(4, Upldate);
            stm.setString(5, File);
            stm.setString(6, Block1);
            stm.setString(7, Block2);
            stm.setString(8, Block3);
            stm.setString(9, Block4);
            stm.setString(10,Block5);
            stm.setString(11, cloud_path);

            InputStream in = null;
            // Get InputStream from String
            in = new ByteArrayInputStream(File.getBytes());
            // File Uploaded to Cloud
            int lstInd = cloud_path.lastIndexOf("/");
            uploadtoCloud(cloud_path.substring(lstInd + 1), in);
            System.out.println(sql+"file updated");
            stm.executeUpdate();

            System.out.println("value updated");
        } catch (Exception ex) {
            System.out.println(ex);
        }
        String Username = uname_txt.getText();
        String Filename = fname_txt.getText();
        String Upldate = udate_txt.getText();
        try
        {
            con = (Connection) DriverManager.getConnection(url + "orutapreserving", "root", "");
            java.sql.Statement st1 = con.createStatement();
            String sql =  "INSERT INTO `updatedet`(`uname`,`filename`,`upldate`) VALUES ('"+Username+"','"+Filename+"','"+Upldate+"')";
            System.out.println(sql+"123");
            st1.executeUpdate(sql);
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        /*String traceuser=trace.getText();
        try
        {
            con = (Connection) DriverManager.getConnection(url + "orutapreserving", "root", "");
            java.sql.Statement st2 = con.createStatement();
            String sql1 =  "INSERT INTO `traceablity`(`username`,`filename`) VALUES ('"+traceuser+"','"+Filename+"')";
            System.out.println(sql1+"trceablity");
            st2.executeUpdate(sql1);
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }*/
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseClicked

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
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        new Update();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundimg;
    private javax.swing.JTextArea block1;
    private javax.swing.JTextArea block2;
    private javax.swing.JTextArea block3;
    private javax.swing.JTextArea block4;
    private javax.swing.JTextArea block5;
    private javax.swing.JTextField date_txt;
    private javax.swing.JTextField file_txt;
    private javax.swing.JTextField fname_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField pkey_txt;
    private javax.swing.JTextField skey_txt;
    private javax.swing.JTextField udate_txt;
    private javax.swing.JTextField uname_txt;
    private javax.swing.JTextField user_txt;
    // End of variables declaration//GEN-END:variables

    private void updateBlocks(ArrayList<String> lines) {

        ArrayList<JTextArea> blocks = new ArrayList<JTextArea>();
        blocks.add(block1);
        blocks.add(block2);
        blocks.add(block3);
        blocks.add(block4);
        blocks.add(block5);

        int number_of_lines = lines.size();
        int parts = 5;
        int lines_per_part = (int) Math.ceil(((double) number_of_lines) / parts);

        int counter = 0;
        JTextArea current_block = blocks.get(counter);

        for (int i = 1; i <= number_of_lines; i++) {
            String line = lines.get(i - 1);
            if (current_block.getText().isEmpty()) {
                current_block.append(line);
            } else {
                current_block.append("\n" + line);
            }
            if (i % lines_per_part == 0 && i != number_of_lines) {
                counter++;
                System.out.println(i + " " + counter);
                current_block = blocks.get(counter);
            }
        }
    }

    private void uploadtoCloud(String filename, InputStream in) {
        // Upload Cloud to Data
        if (in != null) {
            if (!cloud_path.isEmpty()) {
                try {
                    int lstInd = cloud_path.lastIndexOf("/");
                    fileUploader.setPath(cloud_path.substring(0, lstInd));
                    if (fileUploader.checkValidPath()) {
                        String pathErr = fileUploader.checkPathErr(filename);
                        if (pathErr != null) {
                            showSomeError(pathErr);
                        }
                        if (fileUploader.updateFile(filename, in)) {
                            String message = "File Updated in Dropbox Successfully";
                            JOptionPane.showConfirmDialog(rootPane, message, "Updated File", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            showSomeError("File Uploading failed due to some reason");
                        }
                    } else {
                        showSomeError("Invalid DropBox Path : Provide Valid Path");
                    }
                } catch (DbxException ex) {
                    ex.printStackTrace();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            } else {
                showSomeError("Select Dropbox Path before Uploading!");
            }
        } else {
            showSomeError("Select File to Upload!");
        }
    }

    private void showSomeError(String message) {
        JOptionPane.showConfirmDialog(rootPane, message, "Error", JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
    }

    private void showAuthorizationError() {
        JOptionPane.showConfirmDialog(rootPane, "Authorization Error : Please Authorize the Application and the Proceed", "Authorization Error", JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
    }

}
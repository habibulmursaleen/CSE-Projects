/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logins;

import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.lang.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import logins.FacultyMain;
import logins.dbconnect;

/**
 *
 * @author Acer
 */
public class logIn extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    /**
     * Creates new form logIn
     */
    public logIn() {
        initComponents();
        conn = dbconnect.dbconnector();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTexUserName = new javax.swing.JTextField();
        jPass = new javax.swing.JPasswordField();
        jButLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("LogIn"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1146, 770));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255), 10));
        jPanel1.setForeground(new java.awt.Color(0, 204, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("Log In");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("User Name :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Password :");

        jTexUserName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTexUserName.setToolTipText("");
        jTexUserName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 255), 2, true));

        jPass.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 255), 2, true));

        jButLogin.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButLogin.setForeground(new java.awt.Color(0, 204, 51));
        jButLogin.setText("Log In");
        jButLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(143, 143, 143)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPass, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTexUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(460, 460, 460)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButLogin)
                            .addComponent(jLabel2))))
                .addContainerGap(233, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel2)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTexUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92)
                .addComponent(jButLogin)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Attendence System");

        jButExit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButExit.setForeground(new java.awt.Color(255, 51, 51));
        jButExit.setText("Exit");
        jButExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButExit)
                .addGap(149, 149, 149))
            .addGroup(layout.createSequentialGroup()
                .addGap(334, 334, 334)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButExit)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButExitActionPerformed

    private void jButLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButLoginActionPerformed
        String userName = jTexUserName.getText();
        String pass = jPass.getText();
        
//        if (userName.equals("admin") && pass.equals("admin") ) {
//            JOptionPane.showMessageDialog(null , "You have successfull loged in to System.");
//            new logIn().setVisible(false);
//            jTexUserName.setText(null);
//            jPass.setText(null);
//            
//            dispose();
//            FacultyMain fMain = new FacultyMain();
//            fMain.setVisible(true);
//            
//        } else {
//            JOptionPane.showMessageDialog(null , "Incorrect Unsr Name or Password.");
//            jTexUserName.setText(null);
//            jPass.setText(null);
//        }
        
        
        
               try{
                    //con = DriverManager.getConnection("jdbc:mysql://localhost/test_db","root","");
                    ps = conn.prepareStatement("select username,password,Sec_Table from teacher where username = ?");
                    ps.setString(1,userName);
                    //ps.setString(2,pass);
                    rs = ps.executeQuery();
                    System.out.println(rs.next());
//               if (rs.next()) {
//                   String namedb = rs.getString(1);
//                   System.out.println(namedb);
//                   String passdb = rs.getString(2);
//                   System.out.println(passdb);
//                   String db = rs.getString(3);
//                   System.out.println(db);
//                   
//                   
//                    JOptionPane.showMessageDialog(null , "You have successfull loged in to System.");
//                    new logIn().setVisible(false);
//                    jTexUserName.setText(null);
//                    jPass.setText(null);
//
//                    dispose();
//                    FacultyMain fMain = new FacultyMain();
//                    fMain.setVisible(true);
//               } else {
//                    JOptionPane.showMessageDialog(null , "Incorrect Unsr Name or Password.");
//                    jTexUserName.setText(null);
//                    jPass.setText(null);
//               }
                boolean flag = false;
                   // while (rs.next()) {
                        String namedb = rs.getString(1);
                        System.out.println(namedb);
                        String passdb = rs.getString(2);
                        System.out.println(passdb);
                        String sec_db = rs.getString(3);
                        System.out.println(sec_db);
                        
                        if (userName.equals(namedb.toString()) && pass.equals(passdb.toString())) {
                            JOptionPane.showMessageDialog(null , "You have successfull loged in to System.");
                            new logIn().setVisible(false);
                            jTexUserName.setText(null);
                            jPass.setText(null);
                            flag = true;

                            
                            dispose();
                            FacultyMain fMain = new FacultyMain(sec_db);
//                            Sections Sec = new Sections(sec_db);
                            fMain.setVisible(true);
                        }
                        
                    //}
                    if (flag == false) {
                            JOptionPane.showMessageDialog(null , "Incorrect Unsr Name or Password.");
                            jTexUserName.setText(null);
                            jPass.setText(null);
                        }
                    
               }catch(SQLException ex){
                  JOptionPane.showMessageDialog(null, ex.getMessage());
               }
               
    }//GEN-LAST:event_jButLoginActionPerformed

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
            java.util.logging.Logger.getLogger(logIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(logIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(logIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(logIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                logIn log = new logIn();
                log.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButExit;
    private javax.swing.JButton jButLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPasswordField jPass;
    public javax.swing.JTextField jTexUserName;
    // End of variables declaration//GEN-END:variables
}

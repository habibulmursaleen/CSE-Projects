/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logins;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import logins.dbconnect; 
//??

/**
 *
 * @author Acer
 */
public class Sections extends javax.swing.JFrame {
    
    public String sec_db;
    
    Connection conn = null;//??
    ResultSet rs = null;//??
    PreparedStatement ps = null;//??
    
    public String jButSec01;
    public String jButSec02;
    public String jButSec03;
    public String jButSec04;
    
    /**
     * Creates new form Sections
     */
    public Sections() {
//        conn = dbconnect.dbconnector();
        initComponents();
    }
    
    public Sections(String Sec_db) {
//        System.out.println(Sec_db);
        initComponents();
        sec_db = Sec_db;
        this.connection();//???
//        System.out.println(sec_db);
    }
    
    public void connection () {
        try{
            conn = dbconnect.dbconnector();
//            System.out.println(sec_db);
                String sql = "select * from " + sec_db;
//                System.out.println(sql);
                    //con = DriverManager.getConnection("jdbc:mysql://localhost/test_db","root","");
                    ps = conn.prepareStatement("select class, section, sec_student_table from " + sec_db);
//                    ps.setString(1,sec_db);
                    //ps.setString(2,pass);
                    rs = ps.executeQuery();
//                    System.out.println(rs.next());
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
//                boolean flag = false;
                int num = 1;
                    while (rs.next()) {
                        String classNamedb = rs.getString(1);
//                        System.out.println(classNamedb);
                        String sectionNamedb = rs.getString(2);
//                        System.out.println(sectionNamedb);
                        String sectionStudentdb = rs.getString(3);
//                        System.out.println(sectionStudentdb);
//                        
                        switch (num) {
                            case 1:
                                jTextFieldClassName01.setText(classNamedb);
                                jTextFieldClassName01.setEditable(false);
                                jTextFieldSectionName01.setText(sectionNamedb);
                                jTextFieldSectionName01.setEditable(false);
                                jButSec01 = sectionStudentdb;
                                break;
                            case 2:
                                jTextFieldClassName02.setText(classNamedb);
                                jTextFieldClassName02.setEditable(false);
                                jTextFieldSectionName02.setText(sectionNamedb);
                                jTextFieldSectionName02.setEditable(false);
                                jButSec02 = sectionStudentdb;
                                break;
                            case 3:
                                jTextFieldClassName03.setText(classNamedb);
                                jTextFieldClassName03.setEditable(false);
                                jTextFieldSectionName03.setText(sectionNamedb);
                                jTextFieldSectionName03.setEditable(false);
                                jButSec03 = sectionStudentdb;
                                break;
                            case 4:
                                jTextFieldClassName04.setText(classNamedb);
                                jTextFieldClassName04.setEditable(false);
                                jTextFieldSectionName04.setText(sectionNamedb);
                                jTextFieldSectionName04.setEditable(false);
                                jButSec04 = sectionStudentdb;
                                break;
                            
                        }
                        num++;
                        
                        
                        
//                        String sec_db = rs.getString(3);
//                        System.out.println(sec_db);
                        
//                        if (userName.equals(namedb.toString()) && pass.equals(passdb.toString())) {
//                            JOptionPane.showMessageDialog(null , "You have successfull loged in to System.");
//                            new logIn().setVisible(false);
//                            jTexUserName.setText(null);
//                            jPass.setText(null);
//                            flag = true;
//
//                            
//                            dispose();
//                            FacultyMain fMain = new FacultyMain();
//                            Sections Sec = new Sections(sec_db);
//                            fMain.setVisible(true);
//                        }
                        
                    //}
//                    if (flag == false) {
//                            JOptionPane.showMessageDialog(null , "Incorrect Unsr Name or Password.");
//                            jTexUserName.setText(null);
//                            jPass.setText(null);
//                        }
                    }
               }catch(SQLException ex){
                  JOptionPane.showMessageDialog(null, ex.getMessage());
               }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButExit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldSectionName01 = new javax.swing.JTextField();
        jBut_Sec01 = new javax.swing.JButton();
        jTextFieldClassName01 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jBut_Sec02 = new javax.swing.JButton();
        jBut_Sec03 = new javax.swing.JButton();
        jBut_Sec04 = new javax.swing.JButton();
        jTextFieldSectionName02 = new javax.swing.JTextField();
        jTextFieldSectionName03 = new javax.swing.JTextField();
        jTextFieldSectionName04 = new javax.swing.JTextField();
        jTextFieldClassName02 = new javax.swing.JTextField();
        jTextFieldClassName03 = new javax.swing.JTextField();
        jTextFieldClassName04 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Section :");

        jTextFieldSectionName01.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jBut_Sec01.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jBut_Sec01.setText("Goto");
        jBut_Sec01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_Sec01ActionPerformed(evt);
            }
        });

        jTextFieldClassName01.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldClassName01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldClassName01ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Class :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Class :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Class :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Class :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Section :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Section :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Section :");

        jBut_Sec02.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jBut_Sec02.setText("Goto");
        jBut_Sec02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_Sec02ActionPerformed(evt);
            }
        });

        jBut_Sec03.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jBut_Sec03.setText("Goto");
        jBut_Sec03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_Sec03ActionPerformed(evt);
            }
        });

        jBut_Sec04.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jBut_Sec04.setText("Goto");
        jBut_Sec04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_Sec04ActionPerformed(evt);
            }
        });

        jTextFieldSectionName02.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jTextFieldSectionName03.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jTextFieldSectionName04.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jTextFieldClassName02.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jTextFieldClassName03.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jTextFieldClassName04.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldClassName01)
                    .addComponent(jTextFieldClassName04)
                    .addComponent(jTextFieldClassName03)
                    .addComponent(jTextFieldClassName02, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldSectionName01, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(jTextFieldSectionName02)
                    .addComponent(jTextFieldSectionName03)
                    .addComponent(jTextFieldSectionName04))
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBut_Sec01, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(jBut_Sec02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBut_Sec03, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBut_Sec04, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(101, 101, 101))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBut_Sec01, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldSectionName01, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldClassName01, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBut_Sec02, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSectionName02, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldClassName02, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBut_Sec03, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSectionName03, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldClassName03, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBut_Sec04, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSectionName04, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldClassName04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(jLabel1)
                .addContainerGap(264, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButExit)))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButExit)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButExitActionPerformed

    private void jTextFieldClassName01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldClassName01ActionPerformed
        // TODO add your handling code here:
        //???
    }//GEN-LAST:event_jTextFieldClassName01ActionPerformed

    private void jBut_Sec01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_Sec01ActionPerformed
        // TODO add your handling code here:
        dispose();
        ClassAttendence Sec = new ClassAttendence(jButSec01, sec_db);
        Sec.setVisible(true);
    }//GEN-LAST:event_jBut_Sec01ActionPerformed

    private void jBut_Sec02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_Sec02ActionPerformed
        // TODO add your handling code here:
        dispose();
        ClassAttendence Sec = new ClassAttendence(jButSec02, sec_db);
        Sec.setVisible(true);
    }//GEN-LAST:event_jBut_Sec02ActionPerformed

    private void jBut_Sec03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_Sec03ActionPerformed
        // TODO add your handling code here:
        dispose();
        ClassAttendence Sec = new ClassAttendence(jButSec03, sec_db);
        Sec.setVisible(true);
    }//GEN-LAST:event_jBut_Sec03ActionPerformed

    private void jBut_Sec04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_Sec04ActionPerformed
        // TODO add your handling code here:
        dispose();
        ClassAttendence Sec = new ClassAttendence(jButSec04, sec_db);
        Sec.setVisible(true);
    }//GEN-LAST:event_jBut_Sec04ActionPerformed

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
            java.util.logging.Logger.getLogger(Sections.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sections.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sections.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sections.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sections().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButExit;
    private javax.swing.JButton jBut_Sec01;
    private javax.swing.JButton jBut_Sec02;
    private javax.swing.JButton jBut_Sec03;
    private javax.swing.JButton jBut_Sec04;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldClassName01;
    private javax.swing.JTextField jTextFieldClassName02;
    private javax.swing.JTextField jTextFieldClassName03;
    private javax.swing.JTextField jTextFieldClassName04;
    private javax.swing.JTextField jTextFieldSectionName01;
    private javax.swing.JTextField jTextFieldSectionName02;
    private javax.swing.JTextField jTextFieldSectionName03;
    private javax.swing.JTextField jTextFieldSectionName04;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logins;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import logins.dbconnect;

/**
 *
 * @author Acer
 */
public class StudentINfo extends javax.swing.JFrame {
    
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    
    public String sec_student_db;
    
    public int serial_num;
    
    public int total_class;
    
    public String[] attendence_count = new String[20];
    
    public float mark;    
    
    public int present_count = 0;
    public int absent_count = 0;
    public int late_count = 0;

    /**
     * Creates new form StudentINfo
     */
    public StudentINfo() {
        initComponents();
        this.connection();
    }
    
    public StudentINfo(String Sec_Student_db, int num) {
        initComponents();
        serial_num = num;
        sec_student_db = Sec_Student_db;
        this.connection();
        this.ini();
    }

    
    public void connection () {
        
        for (int i=0; i<20; i++) {
                attendence_count[i]="";
        }
        
        try{
            conn = dbconnect.dbconnector();
            System.out.println(sec_student_db);
            
            String columnName;
                
            String sql = "select * from " + sec_student_db;
                
                ps = conn.prepareStatement(sql);
                rs = ps.executeQuery();

                ResultSetMetaData rsmd = rs.getMetaData();
                int columns = rsmd.getColumnCount();
                total_class = columns-4;
                System.out.println(columns);
                
                String sql2 = "SELECT * FROM "+sec_student_db+" WHERE serial="+ serial_num;
                
                ps = conn.prepareStatement(sql2);
                rs = ps.executeQuery();
                
//                while(rs.next()) {
//                
//                    jTexStuName.setText(rs.getString("name"));
//                }
                
                

                int i=0;
                 while(rs.next()) {
                    for (int x = 2; x <= columns; x++) {
//                        System.out.println(rsmd.getColumnName(x));
    //                  
                        

                        switch (x) {

                            case 2:
                                    jTexStuID.setText(rs.getString(rsmd.getColumnName(x)));
                                    jTexStuID.setEditable(false);
                                    break;
                            
                            case 3:
                                    jTexStuName.setText(rs.getString(rsmd.getColumnName(x)));
                                    jTexStuName.setEditable(false);
                                    break;

                            case 5:
                                    jTexStuDate01.setText(rsmd.getColumnName(x));
                                    jTexStuDate01.setEditable(false);
                                    jTexStuAtten01.setText(rs.getString(rsmd.getColumnName(x)));
                                    attendence_count[i] = jTexStuAtten01.getText();
//                                    System.out.println(attendence_count[i]);
//                                    System.out.println(i);
                                    i=i+1;
                                    jTexStuAtten01.setEditable(false);
                                    break;
                            case 6:
                                    jTexStuDate02.setText(rsmd.getColumnName(x));
                                    jTexStuDate02.setEditable(false);
                                    jTexStuAtten02.setText(rs.getString(rsmd.getColumnName(x)));
                                    attendence_count[i] =  jTexStuAtten02.getText();
//                                    System.out.println(attendence_count[i]);
//                                    System.out.println(i);
                                    i++;
                                    jTexStuAtten02.setEditable(false);
                                    break;
                            case 7:
                                    jTexStuDate03.setText(rsmd.getColumnName(x));
                                    jTexStuDate03.setEditable(false);
                                    jTexStuAtten03.setText(rs.getString(rsmd.getColumnName(x)));
                                    attendence_count[i] = jTexStuAtten03.getText();
//                                    System.out.println(attendence_count[i]);
//                                    System.out.println(i);
                                    i++;
                                    jTexStuAtten03.setEditable(false);
                                    break;
                            case 8:
                                    jTexStuDate04.setText(rsmd.getColumnName(x));
                                    jTexStuDate04.setEditable(false);
                                    jTexStuAtten04.setText(rs.getString(rsmd.getColumnName(x)));
                                    attendence_count[i] = jTexStuAtten04.getText();
//                                    System.out.println(attendence_count[i]);
//                                    System.out.println(i);
                                    i++;
                                    jTexStuAtten04.setEditable(false);
                                    break;
                            case 9:
                                    jTexStuDate05.setText(rsmd.getColumnName(x));
                                    jTexStuDate05.setEditable(false);
                                    jTexStuAtten05.setText(rs.getString(rsmd.getColumnName(x)));
                                    attendence_count[i] = jTexStuAtten05.getText();
//                                    System.out.println(attendence_count[i]);
//                                    System.out.println(i);
                                    i++;
                                    jTexStuAtten05.setEditable(false);
                                    break;
                            case 10:
                                    jTexStuDate06.setText(rsmd.getColumnName(x));
                                    jTexStuDate06.setEditable(false);
                                    jTexStuAtten06.setText(rs.getString(rsmd.getColumnName(x)));
                                    attendence_count[i] = jTexStuAtten06.getText();
//                                    System.out.println(attendence_count[i]);
//                                    System.out.println(i);
                                    i++;
                                    jTexStuAtten06.setEditable(false);
                                    break;
                            case 11:
                                    jTexStuDate07.setText(rsmd.getColumnName(x));
                                    jTexStuDate07.setEditable(false);
                                    jTexStuAtten07.setText(rs.getString(rsmd.getColumnName(x)));
                                    attendence_count[i] = jTexStuAtten07.getText();
//                                    System.out.println(attendence_count[i]);
                                    i++;
                                    jTexStuAtten07.setEditable(false);
                                    break;
                            case 12:
                                    jTexStuDate08.setText(rsmd.getColumnName(x));
                                    jTexStuDate08.setEditable(false);
                                    jTexStuAtten08.setText(rs.getString(rsmd.getColumnName(x)));
                                    attendence_count[i] = jTexStuAtten08.getText();
//                                    System.out.println(attendence_count[i]);
                                    i++;
                                    jTexStuAtten08.setEditable(false);
                                    break;
                            case 13:
                                    jTexStuDate09.setText(rsmd.getColumnName(x));
                                    jTexStuDate09.setEditable(false);
                                    jTexStuAtten09.setText(rs.getString(rsmd.getColumnName(x)));
                                    attendence_count[i] = jTexStuAtten09.getText();
//                                    System.out.println(attendence_count[i]);
                                    i++;
                                    jTexStuAtten09.setEditable(false);
                                    break;
                            case 14:
                                    jTexStuDate10.setText(rsmd.getColumnName(x));
                                    jTexStuDate10.setEditable(false);
                                    jTexStuAtten10.setText(rs.getString(rsmd.getColumnName(x)));
                                    attendence_count[i] = jTexStuAtten10.getText();
//                                    System.out.println(attendence_count[i]);
                                    i++;
                                    jTexStuAtten10.setEditable(false);
                                    break;
                            case 15:
                                    jTexStuDate11.setText(rsmd.getColumnName(x));
                                    jTexStuDate11.setEditable(false);
                                    jTexStuAtten11.setText(rs.getString(rsmd.getColumnName(x)));
                                    attendence_count[i] = jTexStuAtten11.getText();
//                                    System.out.println(attendence_count[i]);
                                    i++;
                                    jTexStuAtten11.setEditable(false);
                                    break;
                            case 16:
                                    jTexStuDate12.setText(rsmd.getColumnName(x));
                                    jTexStuDate12.setEditable(false);
                                    jTexStuAtten12.setText(rs.getString(rsmd.getColumnName(x)));
                                    attendence_count[i] = jTexStuAtten12.getText();
//                                    System.out.println(attendence_count[i]);
                                    i++;
                                    jTexStuAtten12.setEditable(false);
                                    break;
                            

                        }
                    
                    }
                }
            
                
//                String sql2 = "SELECT * FROM "+sec_student_db+" WHERE serial=1";
//                
//                ps = conn.prepareStatement(sql2);
//                rs = ps.executeQuery();
//                
//                while(rs.next()) {
//                
//                    jTexStuName.setText(rs.getString("name"));
//                }
                
                

//            SELECT * FROM employee WHERE emp_id=
            
            
//            conn = dbconnect.dbconnector();
//            System.out.println(sec_student_db);
//                String sql = "select id, name, student_info_table from " + sec_student_db;
//                System.out.println(sql);
                
                
                
                    //con = DriverManager.getConnection("jdbc:mysql://localhost/test_db","root","");
                    
//                    ps = conn.prepareStatement(sql);
//                    rs = ps.executeQuery();
                     
//                    ps.setString(1,sec_db);
                    //ps.setString(2,pass);
                   
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
//                int num = 1;
//                    while (rs.next()) {
//                        String studentIDdb = rs.getString(1);
//                        System.out.println(studentIDdb);
//                        String studentNamedb = rs.getString(2);
//                        System.out.println(studentNamedb);
//                        String studentInfoTabdb = rs.getString(3);
//                        System.out.println(studentInfoTabdb);
//                        
//                        switch (num) {
//                            case 1:
//                                jTextStudentID01.setText(studentIDdb);
//                                jTextStudentID01.setEditable(false);
//                                jTextStudentName01.setText(studentNamedb);
//                                jTextStudentName01.setEditable(false);
//                                jButStudent_Info01 = studentInfoTabdb;
//                                break;
//                            case 2:
//                                jTextStudentID02.setText(studentIDdb);
//                                jTextStudentID02.setEditable(false);
//                                jTextStudentName02.setText(studentNamedb);
//                                jTextStudentName02.setEditable(false);
//                                jButStudent_Info02 = studentInfoTabdb;
//                                break;
//                            case 3:
//                                jTextStudentID03.setText(studentIDdb);
//                                jTextStudentID03.setEditable(false);
//                                jTextStudentName03.setText(studentNamedb);
//                                jTextStudentName03.setEditable(false);
//                                jButStudent_Info03 = studentInfoTabdb;
//                                break;
//                            case 4:
//                                jTextStudentID04.setText(studentIDdb);
//                                jTextStudentID04.setEditable(false);
//                                jTextStudentName04.setText(studentNamedb);
//                                jTextStudentName04.setEditable(false);
//                                jButStudent_Info04 = studentInfoTabdb;
//                                break;
//                            case 5:
//                                jTextStudentID05.setText(studentIDdb);
//                                jTextStudentID05.setEditable(false);
//                                jTextStudentName05.setText(studentNamedb);
//                                jTextStudentName05.setEditable(false);
//                                jButStudent_Info05 = studentInfoTabdb;
//                                break;
//                            case 6:
//                                jTextStudentID06.setText(studentIDdb);
//                                jTextStudentID06.setEditable(false);
//                                jTextStudentName06.setText(studentNamedb);
//                                jTextStudentName06.setEditable(false);
//                                jButStudent_Info06 = studentInfoTabdb;
//                                break;
//                            case 7:
//                                jTextStudentID07.setText(studentIDdb);
//                                jTextStudentID07.setEditable(false);
//                                jTextStudentName07.setText(studentNamedb);
//                                jTextStudentName07.setEditable(false);
//                                jButStudent_Info07 = studentInfoTabdb;
//                                break;
//                            case 8:
//                                jTextStudentID08.setText(studentIDdb);
//                                jTextStudentID08.setEditable(false);
//                                jTextStudentName08.setText(studentNamedb);
//                                jTextStudentName08.setEditable(false);
//                                jButStudent_Info08 = studentInfoTabdb;
//                                break;
//                            case 9:
//                                jTextStudentID09.setText(studentIDdb);
//                                jTextStudentID09.setEditable(false);
//                                jTextStudentName09.setText(studentNamedb);
//                                jTextStudentName09.setEditable(false);
//                                jButStudent_Info09 = studentInfoTabdb;
//                                break;
//                            case 10:
//                                jTextStudentID10.setText(studentIDdb);
//                                jTextStudentID10.setEditable(false);
//                                jTextStudentName10.setText(studentNamedb);
//                                jTextStudentName10.setEditable(false);
//                                jButStudent_Info10 = studentInfoTabdb;
//                                break;
//                            
//                        }
//                        num++;
//                        
                        
                    
//                    }
    
                    
                    
//                    int present_count = 0;
//                    int absent_count = 0;
//                    int late_count = 0;
                    
//                    System.out.println(attendence_count[0]);
//                    System.out.println(attendence_count[1]);
//                    System.out.println(attendence_count[2]);
//                    System.out.println(attendence_count[3]);
//                    System.out.println(attendence_count[4]);
                    
//                    String p = "Present";
//                    
//                    for (int j=0; j<12; j++) {
//                        System.out.print("----");
//                        System.out.println(attendence_count[j]);
//                        
//                        String a = attendence_count[j];
////                        
//                        if(a.equals(p)) {
//                            present_count++;
//                            System.out.println(present_count);
//                        }
//                        if(attendence_count[j].equals("Absent")) {
//                            absent_count++;
//                            System.out.println(absent_count);
//                        }
//                        else if(attendence_count[j].equals("Late")) {
//                            late_count++;
//                            System.out.println(absent_count);
//                        }
//                        else if(attendence_count[j].equals(null)) {
//                            break;
//                        }
//                    }
                    
                    
                    
                    
               }catch(SQLException ex){
                  JOptionPane.showMessageDialog(null, ex.getMessage());
               }
    }
    
    public void ini() {
    
//        String p = "Present";
            String a;
//           int i=0;
//                    while (i<10) {
//                    
                    for (int j=0; j<12; j++) {
//                        System.out.print("----");
//                        System.out.println(attendence_count[j]);
                        
                        a = attendence_count[j];
                         if(!a.equals(null)) {
                             if(a.equals("Present")){
                             present_count++;
                            }
                            if(a.equals("Absent")){ 
                                absent_count++;
                            }
                            if(a.equals("Late")){ 
                                late_count++;
                            }
                         }
//                         
//                         a = attendence_count[0];
//                         if(a.equals("Present")){
//                             present_count++;
//                         }
//                         if(a.equals("Absent")){ 
//                             absent_count++;
//                         }
//                         if(a.equals("Late")){ 
//                             late_count++;
//                         }
//                         
//                         a = attendence_count[1];
//                         if(a.equals("Present")){
//                             present_count++;
//                         }
//                         if(a.equals("Absent")){ 
//                             absent_count++;
//                         }
//                         if(a.equals("Late")){ 
//                             late_count++;
//                         }
//                         
//                         a = attendence_count[2];
//                         if(a.equals("Present")){
//                             present_count++;
//                         }
//                         if(a.equals("Absent")){ 
//                             absent_count++;
//                         }
//                         if(a.equals("Late")){ 
//                             late_count++;
//                         }
////                         
//                         a = attendence_count[3];
//                         if(a.equals("Present")){
//                             present_count++;
//                         }
//                         if(a.equals("Absent")){ 
//                             absent_count++;
//                         }
//                         if(a.equals("Late")){ 
//                             late_count++;
//                         }
////                         
//                         a = attendence_count[4];
//                         if(a.equals("Present")){
//                             present_count++;
//                         }
//                         if(a.equals("Absent")){ 
//                             absent_count++;
//                         }
//                         if(a.equals("Late")){ 
//                             late_count++;
//                         }
//                         
//                         a = attendence_count[5];
//                         if(a.equals("Present")){
//                             present_count++;
//                         }
//                         if(a.equals("Absent")){ 
//                             absent_count++;
//                         }
//                         if(a.equals("Late")){ 
//                             late_count++;
//                         }
//                         
//                         a = attendence_count[6];
//                         if(a.equals("Present")){
//                             present_count++;
//                         }
//                         if(a.equals("Absent")){ 
//                             absent_count++;
//                         }
//                         if(a.equals("Late")){ 
//                             late_count++;
//                         }
//                         
//                         a = attendence_count[7];
//                         if(a.equals("Present")){
//                             present_count++;
//                         }
//                         if(a.equals("Absent")){ 
//                             absent_count++;
//                         }
//                         if(a.equals("Late")){ 
//                             late_count++;
//                         }
//                         
//                         a = attendence_count[8];
//                         if(a.equals("Present")){
//                             present_count++;
//                         }
//                         if(a.equals("Absent")){ 
//                             absent_count++;
//                         }
//                         if(a.equals("Late")){ 
//                             late_count++;
//                         }
//                         
//                         a = attendence_count[9];
//                         if(a.equals("Present")){
//                             present_count++;
//                         }
//                         if(a.equals("Absent")){ 
//                             absent_count++;
//                         }
//                         if(a.equals("Late")){ 
//                             late_count++;
//                         }
//                         
//                         a = attendence_count[10];
//                         if(a.equals("Present")){
//                             present_count++;
//                         }
//                         if(a.equals("Absent")){ 
//                             absent_count++;
//                         }
//                         if(a.equals("Late")){ 
//                             late_count++;
//                         }
//                         
//                         a = attendence_count[11];
//                         if(a.equals("Present")){
//                             present_count++;
//                         }
//                         if(a.equals("Absent")){ 
//                             absent_count++;
//                         }
//                         if(a.equals("Late")){ 
//                             late_count++;
//                         }
//                         
//                         a = attendence_count[12];
//                         if(a.equals("Present")){
//                             present_count++;
//                         }
//                         if(a.equals("Absent")){ 
//                             absent_count++;
//                         }
//                         if(a.equals("Late")){ 
//                             late_count++;
//                         }
//                         
                         
                                 
                                 
                         
////                        
//                        if(a.equals(p)) {
//                            present_count++;
//                            System.out.println(present_count);
//                        }
//                        if(attendence_count[j].equals("Absent")) {
//                            absent_count++;
//                            System.out.println(absent_count);
//                        }
//                        else if(attendence_count[j].equals("Late")) {
//                            late_count++;
//                            System.out.println(absent_count);
//                        }
//                        else if(attendence_count[j].equals(null)) {
//                            break;
//                        }
                    }
                    
                    jTextotal_class_counter.setText(Integer.toString(total_class));
                    jTextotal_class_counter.setEditable(false);
                    
                    total_present_counter.setText(Integer.toString(present_count));
                    total_present_counter.setEditable(false);
                    
                    total_absent_counter.setText(Integer.toString(absent_count));
                    total_absent_counter.setEditable(false);
                    
                    total_late_counter.setText(Integer.toString(late_count));
                    total_late_counter.setEditable(false);
                    
                    
                    int per = (present_count*100)/total_class;
                    
                    
                    total_parcentage_counter.setText(Integer.toString(per)+"%");
                    total_parcentage_counter.setEditable(false);
                    
                    float late = (float) (late_count * 0.85);
                    
                    mark = (per/10) + late;
                    
                    mark_counter.setText(Float.toString(mark));
                    
    
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
        jLabel3 = new javax.swing.JLabel();
        jTexStuName = new javax.swing.JTextField();
        jTexStuID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTexStuDate01 = new javax.swing.JTextField();
        jTexStuAtten01 = new javax.swing.JTextField();
        jTexStuDate02 = new javax.swing.JTextField();
        jTexStuDate03 = new javax.swing.JTextField();
        jTexStuDate04 = new javax.swing.JTextField();
        jTexStuDate05 = new javax.swing.JTextField();
        jTexStuDate06 = new javax.swing.JTextField();
        jTexStuDate07 = new javax.swing.JTextField();
        jTexStuDate08 = new javax.swing.JTextField();
        jTexStuDate09 = new javax.swing.JTextField();
        jTexStuDate10 = new javax.swing.JTextField();
        jTexStuDate11 = new javax.swing.JTextField();
        jTexStuAtten02 = new javax.swing.JTextField();
        jTexStuAtten03 = new javax.swing.JTextField();
        jTexStuAtten04 = new javax.swing.JTextField();
        jTexStuAtten05 = new javax.swing.JTextField();
        jTexStuAtten06 = new javax.swing.JTextField();
        jTexStuAtten07 = new javax.swing.JTextField();
        jTexStuAtten08 = new javax.swing.JTextField();
        jTexStuAtten09 = new javax.swing.JTextField();
        jTexStuAtten10 = new javax.swing.JTextField();
        jTexStuAtten11 = new javax.swing.JTextField();
        jTexStuDate12 = new javax.swing.JTextField();
        jTexStuAtten12 = new javax.swing.JTextField();
        jTextotal_class_counter = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        total_present_counter = new javax.swing.JTextField();
        total_absent_counter = new javax.swing.JTextField();
        total_late_counter = new javax.swing.JTextField();
        mark_counter = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        total_parcentage_counter = new javax.swing.JTextField();
        total_bonus_counter = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

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
        jLabel2.setText("Name :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("ID :");

        jTexStuName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jTexStuID.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Date");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Attendence");

        jTexStuDate01.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTexStuAtten01.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTexStuDate02.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTexStuDate03.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTexStuDate04.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTexStuDate05.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTexStuDate06.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTexStuDate07.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTexStuDate08.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTexStuDate09.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTexStuDate10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTexStuDate11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTexStuAtten02.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTexStuAtten03.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTexStuAtten04.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTexStuAtten05.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTexStuAtten06.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTexStuAtten07.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTexStuAtten08.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTexStuAtten09.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTexStuAtten10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTexStuAtten11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTexStuDate12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTexStuAtten12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextotal_class_counter.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextotal_class_counter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextotal_class_counterActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Total Class : ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Present :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Absent :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Late :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Mark :");

        total_present_counter.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        total_absent_counter.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        total_late_counter.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        mark_counter.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("Persentage :");

        total_parcentage_counter.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        total_bonus_counter.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("Bonus :");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("ADD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTexStuName, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTexStuID, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTexStuDate10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(37, 37, 37)
                                .addComponent(jLabel5))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTexStuDate11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                        .addComponent(jTexStuDate09, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTexStuDate08, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTexStuDate07, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTexStuDate06, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTexStuDate04, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTexStuDate03, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTexStuDate02, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTexStuDate01, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jTexStuDate12, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTexStuAtten07, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTexStuAtten06, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTexStuAtten08, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTexStuAtten09, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTexStuAtten10, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTexStuAtten11, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTexStuAtten12, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jTexStuDate05, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTexStuAtten05, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(jTexStuAtten04)
                                    .addComponent(jTexStuAtten03)
                                    .addComponent(jTexStuAtten02)
                                    .addComponent(jTexStuAtten01))))
                        .addGap(0, 17, Short.MAX_VALUE)))
                .addGap(118, 118, 118)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(total_bonus_counter, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextotal_class_counter, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                .addComponent(total_present_counter)
                                .addComponent(total_absent_counter)
                                .addComponent(total_late_counter)
                                .addComponent(mark_counter))
                            .addComponent(total_parcentage_counter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addComponent(jButton2)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTexStuName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTexStuID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTexStuDate01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTexStuAtten01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTexStuDate02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTexStuAtten02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextotal_class_counter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTexStuDate03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTexStuAtten03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(total_present_counter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTexStuDate04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTexStuAtten04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTexStuAtten05, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTexStuDate05, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(total_absent_counter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(total_late_counter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTexStuDate06, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTexStuAtten06, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(total_parcentage_counter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTexStuDate07, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTexStuAtten07, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTexStuDate08, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTexStuAtten08, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total_bonus_counter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jButton2))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTexStuDate09, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTexStuAtten09, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTexStuDate10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTexStuAtten10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mark_counter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTexStuDate11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTexStuAtten11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTexStuAtten12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTexStuDate12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 0, 255));
        jButton1.setText("Go Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(332, 332, 332))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(34, 34, 34)
                                .addComponent(jButExit))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButExit)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButExitActionPerformed

    private void jTextotal_class_counterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextotal_class_counterActionPerformed
        // TODO add your handling code here:
//        total_class_counter.setText(total_class.toString());
//        String a = Integer.toString(total_class);
//        System.out.println(a);
//        jTextotal_class_counter.setText(Integer.toString(total_class));
//        jTextotal_class_counter.setEditable(false);
    }//GEN-LAST:event_jTextotal_class_counterActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        ClassAttendence Sec = new ClassAttendence(sec_student_db);
        Sec.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String Sbonus = total_bonus_counter.getText();
        float fBonus = Float.parseFloat(Sbonus);
        mark = mark + fBonus;
        mark_counter.setText(Float.toString(mark));
        total_bonus_counter.setText(null);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentINfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentINfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentINfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentINfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentINfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButExit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTexStuAtten01;
    private javax.swing.JTextField jTexStuAtten02;
    private javax.swing.JTextField jTexStuAtten03;
    private javax.swing.JTextField jTexStuAtten04;
    private javax.swing.JTextField jTexStuAtten05;
    private javax.swing.JTextField jTexStuAtten06;
    private javax.swing.JTextField jTexStuAtten07;
    private javax.swing.JTextField jTexStuAtten08;
    private javax.swing.JTextField jTexStuAtten09;
    private javax.swing.JTextField jTexStuAtten10;
    private javax.swing.JTextField jTexStuAtten11;
    private javax.swing.JTextField jTexStuAtten12;
    private javax.swing.JTextField jTexStuDate01;
    private javax.swing.JTextField jTexStuDate02;
    private javax.swing.JTextField jTexStuDate03;
    private javax.swing.JTextField jTexStuDate04;
    private javax.swing.JTextField jTexStuDate05;
    private javax.swing.JTextField jTexStuDate06;
    private javax.swing.JTextField jTexStuDate07;
    private javax.swing.JTextField jTexStuDate08;
    private javax.swing.JTextField jTexStuDate09;
    private javax.swing.JTextField jTexStuDate10;
    private javax.swing.JTextField jTexStuDate11;
    private javax.swing.JTextField jTexStuDate12;
    private javax.swing.JTextField jTexStuID;
    private javax.swing.JTextField jTexStuName;
    private javax.swing.JTextField jTextotal_class_counter;
    private javax.swing.JTextField mark_counter;
    private javax.swing.JTextField total_absent_counter;
    private javax.swing.JTextField total_bonus_counter;
    private javax.swing.JTextField total_late_counter;
    private javax.swing.JTextField total_parcentage_counter;
    private javax.swing.JTextField total_present_counter;
    // End of variables declaration//GEN-END:variables
}

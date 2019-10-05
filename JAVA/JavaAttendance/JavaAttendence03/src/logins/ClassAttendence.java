/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logins;

//import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.Calendar;
import logins.dbconnect;


/**
 *
 * @author Acer
 */
public class ClassAttendence extends javax.swing.JFrame {

    public String sec_student_db;
    
    public String selected_date;
    
    public String jButStudent_Info01;
    public String jButStudent_Info02;
    public String jButStudent_Info03;
    public String jButStudent_Info04;
    public String jButStudent_Info05;
    public String jButStudent_Info06;
    public String jButStudent_Info07;
    public String jButStudent_Info08;
    public String jButStudent_Info09;
    public String jButStudent_Info10;
    
    public String sec_db;
    
    public String[] attendence = {"Absent", "Absent", "Absent", "Absent", "Absent", "Absent", "Absent", "Absent", "Absent", "Absent"};
    
//    public JDateChooser date_chooser;
    
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    
    
    /**
     * Creates new form ClassAttendence
     */
    public ClassAttendence() {
        initComponents();
        jPanel2.setVisible(false);
        this.connection();
    }
    
    public ClassAttendence(String Sec_Student_db) {
        System.out.println(Sec_Student_db);
        initComponents();
        jPanel2.setVisible(false);
        sec_student_db = Sec_Student_db;
        this.connection();
    }
    
    public ClassAttendence(String Sec_Student_db, String Sec_db) {
        System.out.println(Sec_Student_db);
        initComponents();
        sec_db = Sec_db;
        jPanel2.setVisible(false);
        sec_student_db = Sec_Student_db;
        this.connection();
    }

//    ClassAttendence(String sec_student_db) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
    public void connection () {
        
        
        try{
            conn = dbconnect.dbconnector();
//            System.out.println(sec_student_db);
                String sql = "select id, name, student_info_table from " + sec_student_db;
//                System.out.println(sql);
                
                
                
                    //con = DriverManager.getConnection("jdbc:mysql://localhost/test_db","root","");
                    
                    ps = conn.prepareStatement(sql);//??
                    rs = ps.executeQuery();
                     
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
                int num = 1;
                    while (rs.next()) { //??
                        String studentIDdb = rs.getString(1);
//                        System.out.println(studentIDdb);
                        String studentNamedb = rs.getString(2);
//                        System.out.println(studentNamedb);
                        String studentInfoTabdb = rs.getString(3);
//                        System.out.println(studentInfoTabdb);
                        
                        switch (num) {
                            case 1:
                                jTextStudentID01.setText(studentIDdb);
                                jTextStudentID01.setEditable(false);
                                jTextStudentName01.setText(studentNamedb);
                                jTextStudentName01.setEditable(false);
                                jButStudent_Info01 = studentInfoTabdb;//??
                                break;
                            case 2:
                                jTextStudentID02.setText(studentIDdb);
                                jTextStudentID02.setEditable(false);
                                jTextStudentName02.setText(studentNamedb);
                                jTextStudentName02.setEditable(false);
                                jButStudent_Info02 = studentInfoTabdb;
                                break;
                            case 3:
                                jTextStudentID03.setText(studentIDdb);
                                jTextStudentID03.setEditable(false);
                                jTextStudentName03.setText(studentNamedb);
                                jTextStudentName03.setEditable(false);
                                jButStudent_Info03 = studentInfoTabdb;
                                break;
                            case 4:
                                jTextStudentID04.setText(studentIDdb);
                                jTextStudentID04.setEditable(false);
                                jTextStudentName04.setText(studentNamedb);
                                jTextStudentName04.setEditable(false);
                                jButStudent_Info04 = studentInfoTabdb;
                                break;
                            case 5:
                                jTextStudentID05.setText(studentIDdb);
                                jTextStudentID05.setEditable(false);
                                jTextStudentName05.setText(studentNamedb);
                                jTextStudentName05.setEditable(false);
                                jButStudent_Info05 = studentInfoTabdb;
                                break;
                            case 6:
                                jTextStudentID06.setText(studentIDdb);
                                jTextStudentID06.setEditable(false);
                                jTextStudentName06.setText(studentNamedb);
                                jTextStudentName06.setEditable(false);
                                jButStudent_Info06 = studentInfoTabdb;
                                break;
                            case 7:
                                jTextStudentID07.setText(studentIDdb);
                                jTextStudentID07.setEditable(false);
                                jTextStudentName07.setText(studentNamedb);
                                jTextStudentName07.setEditable(false);
                                jButStudent_Info07 = studentInfoTabdb;
                                break;
                            case 8:
                                jTextStudentID08.setText(studentIDdb);
                                jTextStudentID08.setEditable(false);
                                jTextStudentName08.setText(studentNamedb);
                                jTextStudentName08.setEditable(false);
                                jButStudent_Info08 = studentInfoTabdb;
                                break;
                            case 9:
                                jTextStudentID09.setText(studentIDdb);
                                jTextStudentID09.setEditable(false);
                                jTextStudentName09.setText(studentNamedb);
                                jTextStudentName09.setEditable(false);
                                jButStudent_Info09 = studentInfoTabdb;
                                break;
                            case 10:
                                jTextStudentID10.setText(studentIDdb);
                                jTextStudentID10.setEditable(false);
                                jTextStudentName10.setText(studentNamedb);
                                jTextStudentName10.setEditable(false);
                                jButStudent_Info10 = studentInfoTabdb;
                                break;
                            
                        }
                        num++;
                        
                        
                  
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jButExit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextStudentID01 = new javax.swing.JTextField();
        jTextStudentName01 = new javax.swing.JTextField();
        jTextStudentID02 = new javax.swing.JTextField();
        jTextStudentID03 = new javax.swing.JTextField();
        jTextStudentID04 = new javax.swing.JTextField();
        jTextStudentID05 = new javax.swing.JTextField();
        jTextStudentID06 = new javax.swing.JTextField();
        jTextStudentID07 = new javax.swing.JTextField();
        jTextStudentName02 = new javax.swing.JTextField();
        jTextStudentName03 = new javax.swing.JTextField();
        jTextStudentName04 = new javax.swing.JTextField();
        jTextStudentName05 = new javax.swing.JTextField();
        jTextStudentName06 = new javax.swing.JTextField();
        jTextStudentName07 = new javax.swing.JTextField();
        jTextStudentID08 = new javax.swing.JTextField();
        jTextStudentID09 = new javax.swing.JTextField();
        jTextStudentID10 = new javax.swing.JTextField();
        jTextStudentName08 = new javax.swing.JTextField();
        jTextStudentName09 = new javax.swing.JTextField();
        jTextStudentName10 = new javax.swing.JTextField();
        date_chooser = new com.toedter.calendar.JDateChooser();
        jButStudentInfo01 = new javax.swing.JButton();
        jButStudentInfo02 = new javax.swing.JButton();
        jButStudentInfo03 = new javax.swing.JButton();
        jButStudentInfo04 = new javax.swing.JButton();
        jButStudentInfo05 = new javax.swing.JButton();
        jButStudentInfo06 = new javax.swing.JButton();
        jButStudentInfo07 = new javax.swing.JButton();
        jButStudentInfo08 = new javax.swing.JButton();
        jButStudentInfo09 = new javax.swing.JButton();
        jButStudentInfo10 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jRadioGro1But1 = new javax.swing.JRadioButton();
        jRadioGro1But2 = new javax.swing.JRadioButton();
        jRadioGro1But3 = new javax.swing.JRadioButton();
        jRadioGro2But1 = new javax.swing.JRadioButton();
        jRadioGro2But2 = new javax.swing.JRadioButton();
        jRadioGro2But3 = new javax.swing.JRadioButton();
        jRadioGro3But1 = new javax.swing.JRadioButton();
        jRadioGro3But2 = new javax.swing.JRadioButton();
        jRadioGro3But3 = new javax.swing.JRadioButton();
        jRadioGro4But1 = new javax.swing.JRadioButton();
        jRadioGro4But2 = new javax.swing.JRadioButton();
        jRadioGro4But3 = new javax.swing.JRadioButton();
        jRadioGro5But1 = new javax.swing.JRadioButton();
        jRadioGro5But2 = new javax.swing.JRadioButton();
        jRadioGro5But3 = new javax.swing.JRadioButton();
        jRadioGro6But1 = new javax.swing.JRadioButton();
        jRadioGro6But2 = new javax.swing.JRadioButton();
        jRadioGro6But3 = new javax.swing.JRadioButton();
        jRadioGro7But1 = new javax.swing.JRadioButton();
        jRadioGro7But2 = new javax.swing.JRadioButton();
        jRadioGro7But3 = new javax.swing.JRadioButton();
        jRadioGro10But1 = new javax.swing.JRadioButton();
        jRadioGro9But1 = new javax.swing.JRadioButton();
        jRadioGro8But1 = new javax.swing.JRadioButton();
        jRadioGro8But2 = new javax.swing.JRadioButton();
        jRadioGro9But2 = new javax.swing.JRadioButton();
        jRadioGro10But2 = new javax.swing.JRadioButton();
        jRadioGro8But3 = new javax.swing.JRadioButton();
        jRadioGro9But3 = new javax.swing.JRadioButton();
        jRadioGro10But3 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

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
        jLabel2.setText("ID");
        jLabel2.setFocusCycleRoot(true);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Attendence");

        jTextStudentID01.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jTextStudentName01.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jTextStudentID02.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jTextStudentID03.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jTextStudentID04.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jTextStudentID05.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jTextStudentID06.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jTextStudentID07.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jTextStudentName02.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jTextStudentName03.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jTextStudentName04.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jTextStudentName05.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jTextStudentName06.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jTextStudentName07.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jTextStudentID08.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jTextStudentID09.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jTextStudentID10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jTextStudentName08.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jTextStudentName09.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jTextStudentName10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        date_chooser.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        date_chooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                date_chooserPropertyChange(evt);
            }
        });

        jButStudentInfo01.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButStudentInfo01.setText("Goto");
        jButStudentInfo01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButStudentInfo01ActionPerformed(evt);
            }
        });

        jButStudentInfo02.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButStudentInfo02.setText("Goto");
        jButStudentInfo02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButStudentInfo02ActionPerformed(evt);
            }
        });

        jButStudentInfo03.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButStudentInfo03.setText("Goto");
        jButStudentInfo03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButStudentInfo03ActionPerformed(evt);
            }
        });

        jButStudentInfo04.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButStudentInfo04.setText("Goto");
        jButStudentInfo04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButStudentInfo04ActionPerformed(evt);
            }
        });

        jButStudentInfo05.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButStudentInfo05.setText("Goto");
        jButStudentInfo05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButStudentInfo05ActionPerformed(evt);
            }
        });

        jButStudentInfo06.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButStudentInfo06.setText("Goto");
        jButStudentInfo06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButStudentInfo06ActionPerformed(evt);
            }
        });

        jButStudentInfo07.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButStudentInfo07.setText("Goto");
        jButStudentInfo07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButStudentInfo07ActionPerformed(evt);
            }
        });

        jButStudentInfo08.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButStudentInfo08.setText("Goto");
        jButStudentInfo08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButStudentInfo08ActionPerformed(evt);
            }
        });

        jButStudentInfo09.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButStudentInfo09.setText("Goto");
        jButStudentInfo09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButStudentInfo09ActionPerformed(evt);
            }
        });

        jButStudentInfo10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButStudentInfo10.setText("Goto");
        jButStudentInfo10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButStudentInfo10ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Goto Date");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setForeground(new java.awt.Color(255, 0, 0));

        buttonGroup1.add(jRadioGro1But1);
        jRadioGro1But1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jRadioGro1But1.setForeground(new java.awt.Color(51, 255, 102));
        jRadioGro1But1.setText("Present");
        jRadioGro1But1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioGro1But1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioGro1But2);
        jRadioGro1But2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jRadioGro1But2.setForeground(new java.awt.Color(255, 153, 0));
        jRadioGro1But2.setText("Late");
        jRadioGro1But2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioGro1But2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioGro1But3);
        jRadioGro1But3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jRadioGro1But3.setForeground(new java.awt.Color(255, 0, 0));
        jRadioGro1But3.setSelected(true);
        jRadioGro1But3.setText("Absent");
        jRadioGro1But3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioGro1But3ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioGro2But1);
        jRadioGro2But1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jRadioGro2But1.setForeground(new java.awt.Color(0, 255, 0));
        jRadioGro2But1.setText("Present");
        jRadioGro2But1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioGro2But1ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioGro2But2);
        jRadioGro2But2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jRadioGro2But2.setForeground(new java.awt.Color(255, 153, 0));
        jRadioGro2But2.setText("Late");
        jRadioGro2But2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioGro2But2ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioGro2But3);
        jRadioGro2But3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jRadioGro2But3.setForeground(new java.awt.Color(255, 0, 0));
        jRadioGro2But3.setSelected(true);
        jRadioGro2But3.setText("Absent");

        buttonGroup3.add(jRadioGro3But1);
        jRadioGro3But1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jRadioGro3But1.setForeground(new java.awt.Color(51, 255, 51));
        jRadioGro3But1.setText("Present");
        jRadioGro3But1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioGro3But1ActionPerformed(evt);
            }
        });

        buttonGroup3.add(jRadioGro3But2);
        jRadioGro3But2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jRadioGro3But2.setForeground(new java.awt.Color(255, 153, 0));
        jRadioGro3But2.setText("Late");
        jRadioGro3But2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioGro3But2ActionPerformed(evt);
            }
        });

        buttonGroup3.add(jRadioGro3But3);
        jRadioGro3But3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jRadioGro3But3.setForeground(new java.awt.Color(255, 0, 0));
        jRadioGro3But3.setSelected(true);
        jRadioGro3But3.setText("Absent");

        buttonGroup4.add(jRadioGro4But1);
        jRadioGro4But1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jRadioGro4But1.setForeground(new java.awt.Color(0, 255, 0));
        jRadioGro4But1.setText("Present");
        jRadioGro4But1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioGro4But1ActionPerformed(evt);
            }
        });

        buttonGroup4.add(jRadioGro4But2);
        jRadioGro4But2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jRadioGro4But2.setForeground(new java.awt.Color(255, 153, 0));
        jRadioGro4But2.setText("Late");
        jRadioGro4But2.setToolTipText("");
        jRadioGro4But2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioGro4But2ActionPerformed(evt);
            }
        });

        buttonGroup4.add(jRadioGro4But3);
        jRadioGro4But3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jRadioGro4But3.setForeground(new java.awt.Color(255, 0, 0));
        jRadioGro4But3.setSelected(true);
        jRadioGro4But3.setText("Absent");

        buttonGroup5.add(jRadioGro5But1);
        jRadioGro5But1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jRadioGro5But1.setForeground(new java.awt.Color(51, 255, 0));
        jRadioGro5But1.setText("Present");
        jRadioGro5But1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioGro5But1ActionPerformed(evt);
            }
        });

        buttonGroup5.add(jRadioGro5But2);
        jRadioGro5But2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jRadioGro5But2.setForeground(new java.awt.Color(255, 153, 0));
        jRadioGro5But2.setText("Late");
        jRadioGro5But2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioGro5But2ActionPerformed(evt);
            }
        });

        buttonGroup5.add(jRadioGro5But3);
        jRadioGro5But3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jRadioGro5But3.setForeground(new java.awt.Color(255, 0, 0));
        jRadioGro5But3.setSelected(true);
        jRadioGro5But3.setText("Absent");

        buttonGroup6.add(jRadioGro6But1);
        jRadioGro6But1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jRadioGro6But1.setForeground(new java.awt.Color(0, 255, 0));
        jRadioGro6But1.setText("Present");
        jRadioGro6But1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioGro6But1ActionPerformed(evt);
            }
        });

        buttonGroup6.add(jRadioGro6But2);
        jRadioGro6But2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jRadioGro6But2.setForeground(new java.awt.Color(255, 153, 0));
        jRadioGro6But2.setText("Late");
        jRadioGro6But2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioGro6But2ActionPerformed(evt);
            }
        });

        buttonGroup6.add(jRadioGro6But3);
        jRadioGro6But3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jRadioGro6But3.setForeground(new java.awt.Color(255, 0, 0));
        jRadioGro6But3.setSelected(true);
        jRadioGro6But3.setText("Absent");

        buttonGroup7.add(jRadioGro7But1);
        jRadioGro7But1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jRadioGro7But1.setForeground(new java.awt.Color(0, 255, 0));
        jRadioGro7But1.setText("Present");
        jRadioGro7But1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioGro7But1ActionPerformed(evt);
            }
        });

        buttonGroup7.add(jRadioGro7But2);
        jRadioGro7But2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jRadioGro7But2.setForeground(new java.awt.Color(255, 153, 0));
        jRadioGro7But2.setText("Late");
        jRadioGro7But2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioGro7But2ActionPerformed(evt);
            }
        });

        buttonGroup7.add(jRadioGro7But3);
        jRadioGro7But3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jRadioGro7But3.setForeground(new java.awt.Color(255, 51, 0));
        jRadioGro7But3.setSelected(true);
        jRadioGro7But3.setText("Absent");

        buttonGroup10.add(jRadioGro10But1);
        jRadioGro10But1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jRadioGro10But1.setForeground(new java.awt.Color(0, 255, 0));
        jRadioGro10But1.setText("Present");
        jRadioGro10But1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioGro10But1ActionPerformed(evt);
            }
        });

        buttonGroup9.add(jRadioGro9But1);
        jRadioGro9But1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jRadioGro9But1.setForeground(new java.awt.Color(0, 255, 0));
        jRadioGro9But1.setText("Present");
        jRadioGro9But1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioGro9But1ActionPerformed(evt);
            }
        });

        buttonGroup8.add(jRadioGro8But1);
        jRadioGro8But1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jRadioGro8But1.setForeground(new java.awt.Color(0, 255, 0));
        jRadioGro8But1.setText("Present");
        jRadioGro8But1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioGro8But1ActionPerformed(evt);
            }
        });

        buttonGroup8.add(jRadioGro8But2);
        jRadioGro8But2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jRadioGro8But2.setForeground(new java.awt.Color(255, 153, 0));
        jRadioGro8But2.setText("Late");
        jRadioGro8But2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioGro8But2ActionPerformed(evt);
            }
        });

        buttonGroup9.add(jRadioGro9But2);
        jRadioGro9But2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jRadioGro9But2.setForeground(new java.awt.Color(255, 153, 0));
        jRadioGro9But2.setText("Late");
        jRadioGro9But2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioGro9But2ActionPerformed(evt);
            }
        });

        buttonGroup10.add(jRadioGro10But2);
        jRadioGro10But2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jRadioGro10But2.setForeground(new java.awt.Color(255, 153, 0));
        jRadioGro10But2.setText("Late");
        jRadioGro10But2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioGro10But2ActionPerformed(evt);
            }
        });

        buttonGroup8.add(jRadioGro8But3);
        jRadioGro8But3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jRadioGro8But3.setForeground(new java.awt.Color(255, 0, 0));
        jRadioGro8But3.setSelected(true);
        jRadioGro8But3.setText("Absent");

        buttonGroup9.add(jRadioGro9But3);
        jRadioGro9But3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jRadioGro9But3.setForeground(new java.awt.Color(255, 0, 0));
        jRadioGro9But3.setSelected(true);
        jRadioGro9But3.setText("Absent");

        buttonGroup10.add(jRadioGro10But3);
        jRadioGro10But3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jRadioGro10But3.setForeground(new java.awt.Color(255, 0, 51));
        jRadioGro10But3.setSelected(true);
        jRadioGro10But3.setText("Absent");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioGro1But1)
                            .addComponent(jRadioGro6But1))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioGro1But2)
                            .addComponent(jRadioGro6But2))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jRadioGro1But3)
                                .addContainerGap(61, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jRadioGro6But3)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jRadioGro5But1)
                                .addGap(55, 55, 55)
                                .addComponent(jRadioGro5But2)
                                .addGap(53, 53, 53)
                                .addComponent(jRadioGro5But3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jRadioGro2But1)
                                .addGap(55, 55, 55)
                                .addComponent(jRadioGro2But2)
                                .addGap(53, 53, 53)
                                .addComponent(jRadioGro2But3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jRadioGro3But1)
                                    .addComponent(jRadioGro4But1))
                                .addGap(55, 55, 55)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioGro3But2)
                                    .addComponent(jRadioGro4But2))
                                .addGap(53, 53, 53)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioGro3But3)
                                    .addComponent(jRadioGro4But3)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jRadioGro7But1)
                                .addGap(55, 55, 55)
                                .addComponent(jRadioGro7But2)
                                .addGap(53, 53, 53)
                                .addComponent(jRadioGro7But3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jRadioGro8But1)
                                .addGap(55, 55, 55)
                                .addComponent(jRadioGro8But2)
                                .addGap(53, 53, 53)
                                .addComponent(jRadioGro8But3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jRadioGro9But1)
                                .addGap(55, 55, 55)
                                .addComponent(jRadioGro9But2)
                                .addGap(53, 53, 53)
                                .addComponent(jRadioGro9But3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jRadioGro10But1)
                                .addGap(55, 55, 55)
                                .addComponent(jRadioGro10But2)
                                .addGap(53, 53, 53)
                                .addComponent(jRadioGro10But3)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioGro1But1)
                    .addComponent(jRadioGro1But2)
                    .addComponent(jRadioGro1But3))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioGro2But1)
                    .addComponent(jRadioGro2But2)
                    .addComponent(jRadioGro2But3))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioGro3But1)
                    .addComponent(jRadioGro3But2)
                    .addComponent(jRadioGro3But3))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioGro4But1)
                    .addComponent(jRadioGro4But2)
                    .addComponent(jRadioGro4But3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioGro5But1)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioGro5But2)
                        .addComponent(jRadioGro5But3)))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioGro6But1)
                        .addComponent(jRadioGro6But2))
                    .addComponent(jRadioGro6But3))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioGro7But1)
                    .addComponent(jRadioGro7But2)
                    .addComponent(jRadioGro7But3))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioGro8But1)
                    .addComponent(jRadioGro8But2)
                    .addComponent(jRadioGro8But3))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioGro9But3)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioGro9But1)
                        .addComponent(jRadioGro9But2)))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioGro10But1)
                    .addComponent(jRadioGro10But2)
                    .addComponent(jRadioGro10But3))
                .addGap(76, 76, 76))
        );

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("Done");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextStudentID08, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(jTextStudentID09)
                    .addComponent(jTextStudentID10)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextStudentID01)
                    .addComponent(jTextStudentID02)
                    .addComponent(jTextStudentID03)
                    .addComponent(jTextStudentID04)
                    .addComponent(jTextStudentID05)
                    .addComponent(jTextStudentID06)
                    .addComponent(jTextStudentID07))
                .addGap(97, 97, 97)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextStudentName09, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextStudentName06, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextStudentName05, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextStudentName04, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextStudentName03, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextStudentName02, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextStudentName01, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextStudentName07)
                    .addComponent(jTextStudentName08)
                    .addComponent(jTextStudentName10, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(56, 56, 56)
                        .addComponent(date_chooser, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(36, 36, 36))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButStudentInfo02, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButStudentInfo03, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButStudentInfo04, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButStudentInfo05, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButStudentInfo06, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButStudentInfo07, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButStudentInfo08, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButStudentInfo09, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButStudentInfo10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButStudentInfo01, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(23, 23, 23))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addComponent(date_chooser, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextStudentID01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextStudentName01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButStudentInfo01))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextStudentID02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextStudentName02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButStudentInfo02))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextStudentID03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextStudentName03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButStudentInfo03))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextStudentID04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextStudentName04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButStudentInfo04))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextStudentID05, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextStudentName05, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButStudentInfo05))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextStudentID06, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextStudentName06, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButStudentInfo06))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextStudentID07, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextStudentName07, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButStudentInfo07))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextStudentID08, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextStudentName08, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButStudentInfo08))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextStudentID09, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextStudentName09, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButStudentInfo09))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextStudentID10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextStudentName10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButStudentInfo10)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 0, 255));
        jButton3.setText("Go Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(324, 324, 324)
                .addComponent(jLabel1)
                .addContainerGap(514, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButExit)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButExit)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButExitActionPerformed

    private void date_chooserPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_date_chooserPropertyChange
        // TODO add your handling code here:
//        if ("date".equals(evt.getPropertyName())) {
//                System.out.println(e.getPropertyName()+ ": " +  evt.getNewValue());
//            }
    }//GEN-LAST:event_date_chooserPropertyChange

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//        dateOftoday = date_chooser.getDate();
//        calendar.getDayChooser().setAlwaysFireDayProperty(true);
            DateFormat df = new SimpleDateFormat("dd_MM_yyyy");
            selected_date = df.format(date_chooser.getDate());
//            System.out.println(selected_date);
            
            
            
            boolean flag = false;
                
             try{
                 
                 String columnName = selected_date;
                
                String sql = "select * from " + sec_student_db;
                
                ps = conn.prepareStatement(sql);//??
                rs = ps.executeQuery();

                ResultSetMetaData rsmd = rs.getMetaData();//??
                int columns = rsmd.getColumnCount();//??
//                System.out.println(columns);
                for (int x = 1; x <= columns; x++) {
                    if (columnName.equals(rsmd.getColumnName(x))) {//??
                        System.out.println("Name Found");
                        flag = true;
                    }
                }
//            conn = dbconnect.dbconnector();
//            System.out.println(sec_student_db);
//                String sql = "ALTER TABLE " + sec_student_db + " ADD " + selected_date +" VARCHAR(60)";
//                 System.out.println(sql);
////                ps = conn.prepareStatement(sql);
////                rs = ps.executeQuery();
//                    
//                Statement st = conn.createStatement();
//                int n = st.executeUpdate(sql);
//                System.out.println("Query OK, " + n + " rows affected");
                
                
                
                    //con = DriverManager.getConnection("jdbc:mysql://localhost/test_db","root","");
                    
//                    ps = conn.prepareStatement(sql);
//                    rs = ps.executeQuery();
                     
//                    ps.setString(1,sec_db);
                    //ps.setString(2,pass);
               
                
                        
                  
                    
               }catch(SQLException ex){
                  JOptionPane.showMessageDialog(null, ex.getMessage());
               }
            
             
             if (flag==false) {
                 jPanel2.setVisible(true);
             } else {
                 JOptionPane.showMessageDialog(null , "Slected Date is Already in Database.");
                 jPanel2.setVisible(false);
             }
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioGro1But1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioGro1But1ActionPerformed
        // TODO add your handling code here:
        attendence[0] = jRadioGro1But1.getText();
//        System.out.println(jRadioGro1But1.getText());
    }//GEN-LAST:event_jRadioGro1But1ActionPerformed

    private void jRadioGro1But2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioGro1But2ActionPerformed
        // TODO add your handling code here:
        attendence[0] = jRadioGro1But2.getText();
//        System.out.println(jRadioGro1But2.getText());
    }//GEN-LAST:event_jRadioGro1But2ActionPerformed

    private void jRadioGro1But3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioGro1But3ActionPerformed
        // TODO add your handling code here:
//        attendence[0] = jRadioGro01But3.getText();
//        System.out.println(attendence[0]);
    }//GEN-LAST:event_jRadioGro1But3ActionPerformed

    private void jRadioGro3But1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioGro3But1ActionPerformed
        // TODO add your handling code here:
        attendence[2] = jRadioGro3But1.getText();
//        System.out.println(jRadioGro3But1.getText());
    }//GEN-LAST:event_jRadioGro3But1ActionPerformed

    private void jRadioGro10But1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioGro10But1ActionPerformed
        // TODO add your handling code here:
        attendence[9] = jRadioGro10But1.getText();
//        System.out.println(jRadioGro10But1.getText());
    }//GEN-LAST:event_jRadioGro10But1ActionPerformed

    private void jRadioGro4But2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioGro4But2ActionPerformed
        // TODO add your handling code here:
        attendence[3] = jRadioGro4But2.getText();
//        System.out.println(jRadioGro4But2.getText());
    }//GEN-LAST:event_jRadioGro4But2ActionPerformed

    private void jRadioGro2But1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioGro2But1ActionPerformed
        // TODO add your handling code here:
        attendence[1] = jRadioGro2But1.getText();
//        System.out.println(jRadioGro2But1.getText());
    }//GEN-LAST:event_jRadioGro2But1ActionPerformed

    private void jRadioGro4But1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioGro4But1ActionPerformed
        // TODO add your handling code here:
        attendence[3] = jRadioGro4But1.getText();
//        System.out.println(jRadioGro4But1.getText());
    }//GEN-LAST:event_jRadioGro4But1ActionPerformed

    private void jRadioGro5But1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioGro5But1ActionPerformed
        // TODO add your handling code here:
        attendence[4] = jRadioGro5But1.getText();
//        System.out.println(jRadioGro5But1.getText());
    }//GEN-LAST:event_jRadioGro5But1ActionPerformed

    private void jRadioGro6But1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioGro6But1ActionPerformed
        // TODO add your handling code here:
        attendence[5] = jRadioGro6But1.getText();
//        System.out.println(jRadioGro6But1.getText());
    }//GEN-LAST:event_jRadioGro6But1ActionPerformed

    private void jRadioGro7But1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioGro7But1ActionPerformed
        // TODO add your handling code here:
        attendence[6] = jRadioGro7But1.getText();
//        System.out.println(jRadioGro7But1.getText());
    }//GEN-LAST:event_jRadioGro7But1ActionPerformed

    private void jRadioGro8But1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioGro8But1ActionPerformed
        // TODO add your handling code here:
        attendence[7] = jRadioGro8But1.getText();
//        System.out.println(jRadioGro8But1.getText());
    }//GEN-LAST:event_jRadioGro8But1ActionPerformed

    private void jRadioGro9But1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioGro9But1ActionPerformed
        // TODO add your handling code here:
        attendence[8] = jRadioGro9But1.getText();
//        System.out.println(jRadioGro9But1.getText());
    }//GEN-LAST:event_jRadioGro9But1ActionPerformed

    private void jRadioGro2But2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioGro2But2ActionPerformed
        // TODO add your handling code here:
        attendence[1] = jRadioGro2But2.getText();
//        System.out.println(jRadioGro2But2.getText());
    }//GEN-LAST:event_jRadioGro2But2ActionPerformed

    private void jRadioGro3But2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioGro3But2ActionPerformed
        // TODO add your handling code here:
        attendence[2] = jRadioGro3But2.getText();
//        System.out.println(jRadioGro3But2.getText());
    }//GEN-LAST:event_jRadioGro3But2ActionPerformed

    private void jRadioGro5But2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioGro5But2ActionPerformed
        // TODO add your handling code here:
        attendence[4] = jRadioGro5But2.getText();
//        System.out.println(jRadioGro5But2.getText());
    }//GEN-LAST:event_jRadioGro5But2ActionPerformed

    private void jRadioGro7But2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioGro7But2ActionPerformed
        // TODO add your handling code here:
        attendence[6] = jRadioGro7But2.getText();
//        System.out.println(jRadioGro7But2.getText());
    }//GEN-LAST:event_jRadioGro7But2ActionPerformed

    private void jRadioGro8But2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioGro8But2ActionPerformed
        // TODO add your handling code here:
        attendence[7] = jRadioGro8But2.getText();
//        System.out.println(jRadioGro8But2.getText());
    }//GEN-LAST:event_jRadioGro8But2ActionPerformed

    private void jRadioGro6But2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioGro6But2ActionPerformed
        // TODO add your handling code here:
        attendence[5] = jRadioGro6But2.getText();
//        System.out.println(jRadioGro6But2.getText());
    }//GEN-LAST:event_jRadioGro6But2ActionPerformed

    private void jRadioGro9But2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioGro9But2ActionPerformed
        // TODO add your handling code here:
        attendence[8] = jRadioGro9But2.getText();
//        System.out.println(jRadioGro9But2.getText());
    }//GEN-LAST:event_jRadioGro9But2ActionPerformed

    private void jRadioGro10But2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioGro10But2ActionPerformed
        // TODO add your handling code here:
        attendence[9] = jRadioGro10But2.getText();
//        System.out.println(jRadioGro10But2.getText());
    }//GEN-LAST:event_jRadioGro10But2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        for (int i=0; i<10; i++) {
            System.out.println(" " + attendence[i]);
        }
        
//        System.out.println(sql);
//        ps = conn.prepareStatement(sql);
//        rs = ps.executeQuery();


        try{
//            conn = dbconnect.dbconnector();
//            System.out.println(sec_student_db);
                String sql = "ALTER TABLE " + sec_student_db + " ADD " + selected_date +" VARCHAR(60)"; //??
//                 System.out.println(sql);
//                ps = conn.prepareStatement(sql);
//                rs = ps.executeQuery();
                    
                Statement st = conn.createStatement();//??
                int n = st.executeUpdate(sql);//??
                System.out.println("Query OK, " + n + " rows affected");
                
                
                
                    
                    
//                    ps = conn.prepareStatement(sql);
//                    rs = ps.executeQuery();
                     
//                    ps.setString(1,sec_db);
                    //ps.setString(2,pass);
               
                for (int i=1; i<11; i++) {
                    
//                    ps = conn.prepareStatement("UPDATE username,password,Sec_Table from teacher where username = ?");
//                    ps.setString(1,userName);
                    
//                    String update = "UPDATE java_d SET 07_05_2018=? where serial=?";
//                    ps = conn.prepareStatement(update);
//                    ps.setString(1, attendence[i-1]);
//                    ps.setString(2, "1");
//                    
////                    String sql_value = "update " + sec_student_db + " set " + selected_date + "=" + attendence[i-1] +" where serial=" + i;
////                    String sql_value = "update java_d set 07_05_2018=? where serial=?";
//                        String sql_value = "UPDATE "+sec_student_db+" SET `05_05_2018`=\"Absent\" WHERE serial="+i;
//                        String sql_value = "UPDATE "+sec_student_db+" SET "+selected_date+"=\"Absent\" WHERE serial="+i;
                        String attend = attendence[i-1];//??
                        String sql_value = "UPDATE "+sec_student_db+" SET "+selected_date+"=\""+attend+"\" WHERE serial="+i;//???
////                    sql_value.setString();
//                    String sql_value = ps.toString();
//                    System.out.println(sql_value);
                    
                    Statement st1 = conn.createStatement();
                    int nn = st1.executeUpdate(sql_value);
                    System.out.println("Query OK, " + nn + " rows affected");
                }
                        
                  
                    
               }catch(SQLException ex){
                  JOptionPane.showMessageDialog(null, ex.getMessage());
               }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButStudentInfo01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButStudentInfo01ActionPerformed
        // TODO add your handling code here:
        dispose();
        StudentINfo stu_Info = new StudentINfo(sec_student_db, 1);
        stu_Info.setVisible(true);
    }//GEN-LAST:event_jButStudentInfo01ActionPerformed

    private void jButStudentInfo02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButStudentInfo02ActionPerformed
        // TODO add your handling code here:
        dispose();
        StudentINfo stu_Info = new StudentINfo(sec_student_db, 2);
        stu_Info.setVisible(true);
    }//GEN-LAST:event_jButStudentInfo02ActionPerformed

    private void jButStudentInfo03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButStudentInfo03ActionPerformed
        // TODO add your handling code here:
        dispose();
        StudentINfo stu_Info = new StudentINfo(sec_student_db, 3);
        stu_Info.setVisible(true);
    }//GEN-LAST:event_jButStudentInfo03ActionPerformed

    private void jButStudentInfo04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButStudentInfo04ActionPerformed
        // TODO add your handling code here:
        dispose();
        StudentINfo stu_Info = new StudentINfo(sec_student_db, 4);
        stu_Info.setVisible(true);
    }//GEN-LAST:event_jButStudentInfo04ActionPerformed

    private void jButStudentInfo05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButStudentInfo05ActionPerformed
        // TODO add your handling code here:
        dispose();
        StudentINfo stu_Info = new StudentINfo(sec_student_db, 5);
        stu_Info.setVisible(true);
    }//GEN-LAST:event_jButStudentInfo05ActionPerformed

    private void jButStudentInfo06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButStudentInfo06ActionPerformed
        // TODO add your handling code here:
        dispose();
        StudentINfo stu_Info = new StudentINfo(sec_student_db, 6);
        stu_Info.setVisible(true);
    }//GEN-LAST:event_jButStudentInfo06ActionPerformed

    private void jButStudentInfo07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButStudentInfo07ActionPerformed
        // TODO add your handling code here:
        dispose();
        StudentINfo stu_Info = new StudentINfo(sec_student_db, 7);
        stu_Info.setVisible(true);
    }//GEN-LAST:event_jButStudentInfo07ActionPerformed

    private void jButStudentInfo08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButStudentInfo08ActionPerformed
        // TODO add your handling code here:
        dispose();
        StudentINfo stu_Info = new StudentINfo(sec_student_db, 8);
        stu_Info.setVisible(true);
    }//GEN-LAST:event_jButStudentInfo08ActionPerformed

    private void jButStudentInfo09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButStudentInfo09ActionPerformed
        // TODO add your handling code here:
        dispose();
        StudentINfo stu_Info = new StudentINfo(sec_student_db, 9);
        stu_Info.setVisible(true);
    }//GEN-LAST:event_jButStudentInfo09ActionPerformed

    private void jButStudentInfo10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButStudentInfo10ActionPerformed
        // TODO add your handling code here:
        dispose();
        StudentINfo stu_Info = new StudentINfo(sec_student_db, 10);
        stu_Info.setVisible(true);
    }//GEN-LAST:event_jButStudentInfo10ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
        Sections Sec = new Sections(sec_db);
        Sec.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(ClassAttendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClassAttendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClassAttendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClassAttendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClassAttendence().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private com.toedter.calendar.JDateChooser date_chooser;
    private javax.swing.JButton jButExit;
    private javax.swing.JButton jButStudentInfo01;
    private javax.swing.JButton jButStudentInfo02;
    private javax.swing.JButton jButStudentInfo03;
    private javax.swing.JButton jButStudentInfo04;
    private javax.swing.JButton jButStudentInfo05;
    private javax.swing.JButton jButStudentInfo06;
    private javax.swing.JButton jButStudentInfo07;
    private javax.swing.JButton jButStudentInfo08;
    private javax.swing.JButton jButStudentInfo09;
    private javax.swing.JButton jButStudentInfo10;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioGro10But1;
    private javax.swing.JRadioButton jRadioGro10But2;
    private javax.swing.JRadioButton jRadioGro10But3;
    private javax.swing.JRadioButton jRadioGro1But1;
    private javax.swing.JRadioButton jRadioGro1But2;
    private javax.swing.JRadioButton jRadioGro1But3;
    private javax.swing.JRadioButton jRadioGro2But1;
    private javax.swing.JRadioButton jRadioGro2But2;
    private javax.swing.JRadioButton jRadioGro2But3;
    private javax.swing.JRadioButton jRadioGro3But1;
    private javax.swing.JRadioButton jRadioGro3But2;
    private javax.swing.JRadioButton jRadioGro3But3;
    private javax.swing.JRadioButton jRadioGro4But1;
    private javax.swing.JRadioButton jRadioGro4But2;
    private javax.swing.JRadioButton jRadioGro4But3;
    private javax.swing.JRadioButton jRadioGro5But1;
    private javax.swing.JRadioButton jRadioGro5But2;
    private javax.swing.JRadioButton jRadioGro5But3;
    private javax.swing.JRadioButton jRadioGro6But1;
    private javax.swing.JRadioButton jRadioGro6But2;
    private javax.swing.JRadioButton jRadioGro6But3;
    private javax.swing.JRadioButton jRadioGro7But1;
    private javax.swing.JRadioButton jRadioGro7But2;
    private javax.swing.JRadioButton jRadioGro7But3;
    private javax.swing.JRadioButton jRadioGro8But1;
    private javax.swing.JRadioButton jRadioGro8But2;
    private javax.swing.JRadioButton jRadioGro8But3;
    private javax.swing.JRadioButton jRadioGro9But1;
    private javax.swing.JRadioButton jRadioGro9But2;
    private javax.swing.JRadioButton jRadioGro9But3;
    private javax.swing.JTextField jTextStudentID01;
    private javax.swing.JTextField jTextStudentID02;
    private javax.swing.JTextField jTextStudentID03;
    private javax.swing.JTextField jTextStudentID04;
    private javax.swing.JTextField jTextStudentID05;
    private javax.swing.JTextField jTextStudentID06;
    private javax.swing.JTextField jTextStudentID07;
    private javax.swing.JTextField jTextStudentID08;
    private javax.swing.JTextField jTextStudentID09;
    private javax.swing.JTextField jTextStudentID10;
    private javax.swing.JTextField jTextStudentName01;
    private javax.swing.JTextField jTextStudentName02;
    private javax.swing.JTextField jTextStudentName03;
    private javax.swing.JTextField jTextStudentName04;
    private javax.swing.JTextField jTextStudentName05;
    private javax.swing.JTextField jTextStudentName06;
    private javax.swing.JTextField jTextStudentName07;
    private javax.swing.JTextField jTextStudentName08;
    private javax.swing.JTextField jTextStudentName09;
    private javax.swing.JTextField jTextStudentName10;
    // End of variables declaration//GEN-END:variables
}

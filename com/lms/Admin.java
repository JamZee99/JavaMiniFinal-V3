package com.lms;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class Admin extends JFrame {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    private JPanel tecMainPane;
    private JButton contactButton;
    private JButton courseDetailsButton;
    private JButton gradesAndGPAButton;
    private JPanel jMain;
    private JPanel contactDtl;
    private JPanel Maintain_Courses;
    private JPanel Admin_Profile;
    private JPanel courseDtls;
    private JPanel Maintain_Users;
    private JPanel Maintain_Notice;
    private JButton logoutButton;
    private JLabel uNametxt;
    private JButton Btn_Maintain_timetable;
    private JButton Btn_View_notice;
    private JButton Btn_Maintain_user;
    private JButton profileButton;
    private JButton Btn_Maintain_courses;
    private JTextField txtadmid;
    private JTextField txtfnameA;
    private JRadioButton maleRadioButton =null;
    private JRadioButton femaleRadioButton;
    private JTextField txtlnameA;
    private JLabel txtFname;
    private JLabel txtLname;
    private JPanel Maintain_Time_table;
    private JTextField txtAdid;
    private JTextField txtLecid;
    private JTextField txtCC;
    private JButton Btn_Maintain_notice;
    private JTextField txtphnA;
    private JButton btngdetailsA;
    private JButton btnupdateA;
    private JButton btnAddCourse;
    private JButton btnUpdateCourse;
    private JButton btnDeleteCourse;
    private JTextField txtCName;
    private JTable table1;
    private JPanel View_Notice;
    private JTabbedPane tabbedPane1;
    private JComboBox txtgenderstd;
    private JTable table2;
    private JPasswordField txtpwStd;
    private JTable table3;
    private JTable table4;
    private JTable table5;
    private JLabel lblNoticeno;
    private JLabel lbladmNOT;
    private JLabel lblnoticedate;
    private JLabel lblnoticedetails;
    private JLabel lblNoticeDescription;
    private JTextField txtnoticeno;
    private JTextField txtadmNOT;
    private JTextField txtnoticedate;
    private JTextField txtNoticeTitle;
    private JTextArea txtAreaNotice;
    private JButton btnaddnotice;
    private JButton btnupdatenotice;
    private JButton btndeletenotice;
    private JButton getInfoButton;
    private JTable table6;
    private JTable tbl_Notice;
    private JTextField txtStdid;
    private JTextField txtfnStd;
    private JTextField txtlnStd;
    private JTextField txtdobstd;
    private JTextField txtphnstd;
    private JTextField txtemailstd;
    private JButton btnRegStd;
    private JButton btnupdateStd;
    private JButton btndelete;
    private JButton btngetdetailsStd;
    private JTextField txtlecid;
    private JTextField txtUnameL;
    private JButton btnregisterL;
    private JButton btnupdateL;
    private JButton btndeleteL;
    private JButton btngetdetailsL;
    private JTextField txtfnameL;
    private JTextField txtlnameL;
    private JTextField txtdobL;
    private JTextField txtphnL;
    private JTextField txtemailL;
    private JComboBox txtgenderL;
    private JPasswordField txtpwL;
    private JTextField txtadmID;
    private JTextField txtfnameAdm;
    private JTextField txtlnameAdm;
    private JTextField txtphnAdm;
    private JTextField txtemAdm;
    private JComboBox txtgenderAdm;
    private JButton btnregistreA;
    private JButton btndeleteA;
    private JButton btngdetailsT;
    private JButton btndelT;
    private JButton btnupdT;
    private JButton btnregT;
    private JTextField txttoid;
    private JTextField txtfnT;
    private JTextField txtlnT;
    private JTextField txtdobT;
    private JTextField txtphnT;
    private JTextField txtemT;
    private JComboBox txtgenT;
    private JPasswordField txtpwT;
    private JComboBox txtLevel;
    private JTable table8;
    private JTextField txt_tm;
    private JComboBox txtSem;
    private JComboBox txtDept;
    private JTextField txtMon;
    private JTextField txtTue;
    private JTextField txtWed;
    private JTextField txtThu;
    private JTextField txtFri;
    private JButton btn_search_TT;
    private JButton btn_add_TT;
    private JButton btn_update_TT;
    private JButton btn_delete_TT;
    private JTextField txtadmdob;
    private JButton btnSearchCourse;
    private JButton btngdetailsAdm;
    private JButton btnupdateAdm;
    private JTextField txtAddstd;
    private JTextField txtDepstd;
    private JPasswordField txtpwAdm;
    private JLabel lblgenderL;
    public int countPresent=0;
    public String gender;
    public String StdID;
    public String Status;
    public Admin(String title) {
        super(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(tecMainPane);
        this.pack();
        setVisible(true);
        conn = LMSdb_siyam.java_db();

        Notice();

        Btn_Maintain_user.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jMain.removeAll();
                jMain.repaint();
                jMain.revalidate();

                jMain.add(Maintain_Time_table);
                //j3.removeAll();
                jMain.repaint();
                jMain.revalidate();
                Btn_View_notice.setBackground(new Color(174, 196, 255));
                Btn_Maintain_timetable.setBackground(new Color(174, 196, 255));
                profileButton.setBackground(new Color(174, 196, 255));
                Btn_Maintain_user.setBackground(new Color(25, 118, 250));
                Btn_Maintain_courses.setBackground(new Color(174, 196, 255));

                Btn_View_notice.setForeground(Color.black);
                Btn_Maintain_timetable.setForeground(Color.black);
                profileButton.setForeground(Color.black);
                Btn_Maintain_user.setForeground(Color.white);
                Btn_Maintain_courses.setForeground(Color.black);
            }
        });
        profileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jMain.removeAll();
                jMain.repaint();
                jMain.revalidate();

                jMain.add(Admin_Profile);
                //j3.removeAll();
                jMain.repaint();
                jMain.revalidate();
                Btn_View_notice.setBackground(new Color(174, 196, 255));
                Btn_Maintain_timetable.setBackground(new Color(174, 196, 255));
                profileButton.setBackground(new Color(25, 118, 250));
                Btn_Maintain_user.setBackground(new Color(174, 196, 255));
                Btn_Maintain_courses.setBackground(new Color(174, 196, 255));

                Btn_View_notice.setForeground(Color.black);
                Btn_Maintain_timetable.setForeground(Color.black);
                profileButton.setForeground(Color.white);
                Btn_Maintain_user.setForeground(Color.black);
                Btn_Maintain_courses.setForeground(Color.black);
            }
        });
        Btn_Maintain_timetable.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jMain.removeAll();
                jMain.repaint();
                jMain.revalidate();

                jMain.add(Maintain_Users);
                //j3.removeAll();
                jMain.repaint();
                jMain.revalidate();
                Btn_View_notice.setBackground(new Color(174, 196, 255));
                Btn_Maintain_timetable.setBackground(new Color(25, 118, 250));
                profileButton.setBackground(new Color(174, 196, 255));
                Btn_Maintain_user.setBackground(new Color(174, 196, 255));
                Btn_Maintain_courses.setBackground(new Color(174, 196, 255));

                Btn_View_notice.setForeground(Color.black);
                Btn_Maintain_timetable.setForeground(Color.white);
                profileButton.setForeground(Color.black);
                Btn_Maintain_user.setForeground(Color.black);
                Btn_Maintain_courses.setForeground(Color.black);
            }
        });
        Btn_Maintain_courses.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jMain.removeAll();
                jMain.repaint();
                jMain.revalidate();

                jMain.add(Maintain_Courses);
                //j3.removeAll();
                jMain.repaint();
                jMain.revalidate();
                Btn_View_notice.setBackground(new Color(174, 196, 255));
                Btn_Maintain_timetable.setBackground(new Color(174, 196, 255));
                profileButton.setBackground(new Color(174, 196, 255));
                Btn_Maintain_user.setBackground(new Color(174, 196, 255));
                Btn_Maintain_courses.setBackground(new Color(25, 118, 250));

                Btn_View_notice.setForeground(Color.black);
                Btn_Maintain_timetable.setForeground(Color.black);
                profileButton.setForeground(Color.black);
                Btn_Maintain_user.setForeground(Color.black);
                Btn_Maintain_courses.setForeground(Color.white);
            }
        });
        Btn_View_notice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jMain.removeAll();
                jMain.repaint();
                jMain.revalidate();

                jMain.add(View_Notice);
                //j3.removeAll();
                jMain.repaint();
                jMain.revalidate();
                Btn_View_notice.setBackground(new Color(174, 196, 255));
                Btn_Maintain_timetable.setBackground(new Color(174, 196, 255));
                profileButton.setBackground(new Color(174, 196, 255));
                Btn_Maintain_user.setBackground(new Color(174, 196, 255));
                Btn_View_notice.setBackground(new Color(25, 118, 250));
                Btn_Maintain_notice.setBackground(new Color(174, 196, 255));

                Btn_View_notice.setForeground(Color.white);
                Btn_Maintain_timetable.setForeground(Color.black);
                profileButton.setForeground(Color.black);
                Btn_Maintain_user.setForeground(Color.black);
                Btn_Maintain_courses.setForeground(Color.black);
                Btn_Maintain_notice.setForeground(Color.black);
            }
        });
        Btn_Maintain_notice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jMain.removeAll();
                jMain.repaint();
                jMain.revalidate();

                jMain.add(Maintain_Notice);
                //j3.removeAll();
                jMain.repaint();
                jMain.revalidate();
                Btn_View_notice.setBackground(new Color(174, 196, 255));
                Btn_Maintain_timetable.setBackground(new Color(174, 196, 255));
                profileButton.setBackground(new Color(174, 196, 255));
                Btn_Maintain_user.setBackground(new Color(174, 196, 255));
                Btn_View_notice.setBackground(new Color(174, 196, 255));
                Btn_Maintain_notice.setBackground(new Color(25, 118, 250));

                Btn_View_notice.setForeground(Color.black);
                Btn_Maintain_timetable.setForeground(Color.black);
                profileButton.setForeground(Color.black);
                Btn_Maintain_user.setForeground(Color.black);
                Btn_Maintain_courses.setForeground(Color.black);
                Btn_Maintain_notice.setForeground(Color.white);
            }
        });

        /* -----------------------------STRTNG USER PROFLE------------------------------------- */

        //SEARCH AND ASSGN DETALS TO THE FEILDS of ADMN
        btngdetailsA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String id = txtadmid.getText();
                    pst = conn.prepareStatement("SELECT ad_id,fname,lname,pno from admin where ad_id = ?");
                    pst.setString(1, id);
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {
                        //String ad_id;
                        String fname = rs.getString(2);
                        String lname = rs.getString(3);
                        String pno = rs.getString(4);

                        txtadmid.setText(id);
                        txtphnA.setText(pno);
                        txtfnameA.setText(fname);
                        txtlnameA.setText(lname);


                    } else {
                        txtadmid.setText("");
                        txtphnA.setText("");
                        txtfnameA.setText("");
                        txtlnameA.setText("");
                        JOptionPane.showMessageDialog(null, "Invalid Admin ID");
                    }

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        //UPDATE ADMIN DETAILS
        btnupdateA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    String ad_id, pno, fname, lname;

                    ad_id = txtadmid.getText();
                    pno = txtphnA.getText();
                    fname = txtfnameA.getText();
                    lname = txtlnameA.getText();

                    pst = conn.prepareStatement("UPDATE admin SET fname = ?,lname = ?,pno = ? where ad_id = ?");

                    pst.setString(1, fname);
                    pst.setString(2, lname);
                    pst.setString(3, pno);
                    pst.setString(4, ad_id);

                    if(ad_id.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Record Not Updated");
                    }else{
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Record Updated");
                    }

                    txtadmid.setText("");
                    txtphnA.setText("");
                    txtfnameA.setText("");
                    txtlnameA.setText("");

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        /* -----------------------------ENDING USER PROFILE------------------------------------- */

        /* -----------------------------Starting Maintain Course------------------------------------- */
        //BTN ADD NEW COURSE
        btnAddCourse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String lec_id,subject_code, course_name, ad_id;

                lec_id = txtLecid.getText();
                subject_code = txtCC.getText();
                course_name = txtCName.getText();
                ad_id = txtAdid.getText();

                try {
                    String sql;
                    sql = "INSERT INTO course(lec_id, subject_code, course_name, ad_id)" +
                            "VALUES(?,?,?,?)";
                    pst = conn.prepareStatement(sql);

                    pst.setString(1, lec_id);
                    pst.setString(2, subject_code);
                    pst.setString(3, course_name);
                    pst.setString(4, ad_id);
                    if(subject_code.isEmpty()){
                        JOptionPane.showMessageDialog(null, "New Course Cannot be Added!!!");
                    }else{
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "New Course Added!!!");
                        table1_load();
                    }
                    txtLecid.setText("");
                    txtCC.setText("");
                    txtCName.setText("");
                    txtAdid.setText("");

                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        //BTN SEARCH COURSE
        btnSearchCourse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    //lec_id,subject_code, course_name, ad_id;
                    //txtLecid  txtCC  txtCName  txtAdid
                    String Cid = txtCC.getText();
                    pst = conn.prepareStatement("SELECT lec_id, course_name, ad_id from course where subject_code = ?");
                    pst.setString(1, Cid);
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {

                        String lec_id = rs.getString(1);
                        String course_name = rs.getString(2);
                        String ad_id = rs.getString(3);

                        txtLecid.setText(lec_id);
                        txtCName.setText(course_name);
                        txtAdid.setText(ad_id);

                    } else {
                        txtLecid.setText("");
                        txtCName.setText("");
                        txtAdid.setText("");
                        txtCC.setText("");
                        JOptionPane.showMessageDialog(null, "Invalid course code");
                    }

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        //BTN DELETE COURSE
        btnDeleteCourse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String subject_code;
                subject_code = txtCC.getText();

                try {
                    pst = conn.prepareStatement("DELETE FROM course WHERE subject_code = ?");
                    pst.setString(1, subject_code);

                    if(subject_code.isEmpty()){
                        JOptionPane.showMessageDialog(null, "--Record NOT Deleted--Enter valid Details");
                    }else{
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Record Deleted");
                        table1_load();
                    }
                    txtLecid.setText("");
                    txtCName.setText("");
                    txtAdid.setText("");
                    txtCC.setText("");
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        //BTN UPDATE COURSE DETALS
        btnUpdateCourse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //lec_id,subject_code, course_name, ad_id;
                //txtLecid  txtCC  txtCName  txtAdid
                try {
                    String subject_code, lec_id,course_name,ad_id ;

                    subject_code = txtCC.getText();
                    lec_id = txtLecid.getText();
                    course_name = txtCName.getText();
                    ad_id = txtAdid.getText();

                    pst = conn.prepareStatement("UPDATE course SET lec_id = ?,course_name = ?,ad_id = ? where subject_code = ?");

                    pst.setString(1, lec_id);
                    pst.setString(2, course_name);
                    pst.setString(3, ad_id);
                    pst.setString(4,subject_code);

                    if(pst.executeUpdate()== 1){
                        JOptionPane.showMessageDialog(null, "--Course Details Updated--");
                    }else{
                        JOptionPane.showMessageDialog(null, "!!!--Course Details Not Updated--!!!");
                    }
                    table1_load();

                    txtLecid.setText("");
                    txtCName.setText("");
                    txtAdid.setText("");
                    txtCC.setText("");

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        /* -----------------------------ENDING Maintain Course------------------------------------- */

        /* -----------------------------STARTING USER MAINTAIN------------------------------------- */
        //GET DETAILS OF ADMIN (SEARCH)
        btngdetailsAdm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    String id = txtadmID.getText();
                    pst = conn.prepareStatement("SELECT fname,lname,dob,pno,email,sex,password from admin where ad_id = ?");
                    pst.setString(1, id);
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {
                        //String ad_id;
                        String fname = rs.getString(1);
                        String lname = rs.getString(2);
                        String dob = rs.getString(3);
                        String pno = rs.getString(4);
                        String email = rs.getString(5);
                        String sex = rs.getString(6);
                        String password = rs.getString(7);

                        txtadmID.setText(id);
                        txtphnAdm.setText(pno);
                        txtpwAdm.setText(password);
                        txtfnameAdm.setText(fname);
                        txtlnameAdm.setText(lname);
                        txtgenderAdm.setSelectedItem(sex);
                        txtadmdob.setText(dob);
                        txtemAdm.setText(email);

                    } else {
                        txtadmID.setText("");
                        txtphnAdm.setText("");
                        txtpwAdm.setText("");
                        txtfnameAdm.setText("");
                        txtlnameAdm.setText("");
                        txtgenderAdm.setSelectedItem("");
                        txtadmdob.setText("");
                        txtemAdm.setText("");
                        JOptionPane.showMessageDialog(null, "Invalid Admin ID");
                    }

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        //UPDATE BUTTON OF ADMIN
        btnupdateAdm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    String ad_id, pno, password, fname, lname, sex, dob, email;

                    ad_id = txtadmID.getText();
                    pno = txtphnAdm.getText();
                    password = txtpwAdm.getText();
                    fname = txtfnameAdm.getText();
                    lname = txtlnameAdm.getText();
                    sex = (String) txtgenderAdm.getSelectedItem();
                    dob = txtadmdob.getText();
                    email = txtemAdm.getText();

                    pst = conn.prepareStatement("UPDATE admin SET fname = ?,lname = ?,dob = ?,pno = ?,email = ?,sex = ?,password = ? where ad_id = ?");

                    pst.setString(1, fname);
                    pst.setString(2, lname);
                    pst.setString(3, dob);
                    pst.setString(4, pno);
                    pst.setString(5, email);
                    pst.setString(6, sex);
                    pst.setString(7, password);
                    pst.setString(8, ad_id);
                    if(ad_id.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Record NOT UPDATED");
                    }else{
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Record UPDATED");
                        table4_load();
                    }

                    txtadmID.setText("");
                    txtphnAdm.setText("");
                    txtpwAdm.setText("");
                    txtfnameAdm.setText("");
                    txtlnameAdm.setText("");
                    txtgenderAdm.setSelectedItem("");
                    txtadmdob.setText("");
                    txtemAdm.setText("");

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }

            }
        });
        //DELETE BUTTON OF ADMIN
        btndeleteA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ad_id;
                ad_id = txtadmID.getText();

                try {
                    pst = conn.prepareStatement("DELETE FROM admin WHERE ad_id = ?");
                    pst.setString(1, ad_id);
                    if(ad_id.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Record NOT DELETED");
                    }else{
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Record DELETED");
                        table4_load();
                    }

                    txtadmID.setText("");
                    txtphnAdm.setText("");
                    txtpwAdm.setText("");
                    txtfnameAdm.setText("");
                    txtlnameAdm.setText("");
                    txtgenderAdm.setSelectedItem("");
                    txtadmdob.setText("");
                    txtemAdm.setText("");

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        //REGISTER BUTTON FOR ADMN
        btnregistreA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ad_id, fname, lname,sex,pno, email, password, dob,username;

                ad_id = txtadmID.getText();
                pno = txtphnAdm.getText();
                password = txtpwAdm.getText();
                fname = txtfnameAdm.getText();
                lname = txtlnameAdm.getText();
                sex = (String) txtgenderAdm.getSelectedItem();
                dob = txtadmdob.getText();
                email = txtemAdm.getText();

                try {
                    String sql;
                    sql = "INSERT INTO Admin(Ad_id,Pno,Password,Fname,Lname,Sex,DOB,Email)" +
                            "VALUES(?,?,?,?,?,?,?,?)";
                    pst = conn.prepareStatement(sql);

                    //PreparedStatement pst = con.prepareStatement(sql);
                    pst.setString(1, ad_id);
                    pst.setString(2, pno);
                    pst.setString(3, password);
                    pst.setString(4, fname);
                    pst.setString(5, lname);
                    pst.setString(6, sex);
                    pst.setString(7, dob);
                    pst.setString(8, email);

                    if(ad_id.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Record NOT ADDED");
                    }else{
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Record ADDED");
                        table4_load();
                    }

                    txtadmID.setText("");
                    txtphnAdm.setText("");
                    txtpwAdm.setText("");
                    txtfnameAdm.setText("");
                    txtlnameAdm.setText("");
                    txtgenderAdm.setSelectedItem("");
                    txtadmdob.setText("");
                    txtemAdm.setText("");
                    txtadmID.requestFocus();

                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        //REGISTER BUTTON FOR LECTURER
        btnregisterL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String lec_id, fname, lname,sex,pno, email, password, dob,username;

                lec_id = txtlecid.getText();
                pno = txtphnL.getText();
                password = txtpwL.getText();
                fname = txtfnameL.getText();
                lname = txtlnameL.getText();
                sex = (String) txtgenderL.getSelectedItem();
                dob = txtdobL.getText();
                email = txtemailL.getText();
                username = txtUnameL.getText();

                try {
                    String sql;
                    sql = "INSERT INTO Lecturer(lec_id,pno,password,fname,lname,sex,dob,email,username)" +
                            "VALUES(?,?,?,?,?,?,?,?,?)";
                    pst = conn.prepareStatement(sql);

                    //PreparedStatement pst = con.prepareStatement(sql);
                    pst.setString(1, lec_id);
                    pst.setString(2, pno);
                    pst.setString(3, password);
                    pst.setString(4, fname);
                    pst.setString(5, lname);
                    pst.setString(6, sex);
                    pst.setString(7, dob);
                    pst.setString(8, email);
                    pst.setString(9, username);

                    if(lec_id.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Record NOT Added");
                    }else{
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Record Added");
                        table3_load();
                    }
                    pst.executeUpdate();

                    txtlecid.setText("");
                    txtphnL.setText("");
                    txtpwL.setText("");
                    txtfnameL.setText("");
                    txtlnameL.setText("");
                    txtgenderL.setSelectedItem("");
                    txtdobL.setText("");
                    txtemailL.setText("");
                    txtUnameL.setText("");
                    txtlecid.requestFocus();

                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        //GET DETALS OF LECTURER
        btngetdetailsL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String Lid = txtlecid.getText();
                    pst = conn.prepareStatement("SELECT fname,lname,dob,pno,email,sex,password,username from lecturer where lec_id = ?");
                    pst.setString(1, Lid);
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {

                        String fname = rs.getString(1);
                        String lname = rs.getString(2);
                        String dob = rs.getString(3);
                        String pno = rs.getString(4);
                        String email = rs.getString(5);
                        String sex = rs.getString(6);
                        String password = rs.getString(7);
                        String username = rs.getString(8);

                        txtlecid.setText(Lid);
                        txtphnL.setText(pno);
                        txtpwL.setText(password);
                        txtfnameL.setText(fname);
                        txtlnameL.setText(lname);
                        txtgenderL.setSelectedItem(sex);
                        txtdobL.setText(dob);
                        txtemailL.setText(email);
                        txtUnameL.setText(username);

                    } else {
                        txtlecid.setText("");
                        txtphnL.setText("");
                        txtpwL.setText("");
                        txtfnameL.setText("");
                        txtlnameL.setText("");
                        txtgenderL.setSelectedItem("");
                        txtdobL.setText("");
                        txtemailL.setText("");
                        txtUnameL.setText("");
                        JOptionPane.showMessageDialog(null, "Invalid Lecturer ID");
                    }

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        //UPDATE LECTURER DETAILS
        btnupdateL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String lec_id, pno, fname, lname, sex, dob, email,username,password;

                    lec_id = txtlecid.getText();
                    pno = txtphnL.getText();
                    password = txtpwL.getText();
                    fname = txtfnameL.getText();
                    lname = txtlnameL.getText();
                    sex = (String) txtgenderL.getSelectedItem();
                    dob = txtdobL.getText();
                    email = txtemailL.getText();
                    username = txtUnameL.getText();

                    pst = conn.prepareStatement("UPDATE lecturer SET fname = ?,lname = ?,sex = ?,pno = ?,email = ?,password = ?,dob = ?,username = ? where lec_id = ?");

                    pst.setString(1, fname);
                    pst.setString(2, lname);
                    pst.setString(3, sex);
                    pst.setString(4, pno);
                    pst.setString(5, email);
                    pst.setString(6, password);
                    pst.setString(7, dob);
                    pst.setString(8,username);
                    pst.setString(9,lec_id);

                    if(lec_id.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Record NOT Updated");
                    }else{
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Record Updated");
                        table3_load();
                    }

                    txtlecid.setText("");
                    txtphnL.setText("");
                    txtpwL.setText("");
                    txtfnameL.setText("");
                    txtlnameL.setText("");
                    txtgenderL.setSelectedItem("");
                    txtdobL.setText("");
                    txtemailL.setText("");
                    txtUnameL.setText("");

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        //DELETE BTN FOR LECTURER
        btndeleteL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String lec_id;
                lec_id = txtlecid.getText();

                try {
                    pst = conn.prepareStatement("DELETE FROM lecturer WHERE lec_id = ?");
                    pst.setString(1, lec_id);
                    if(lec_id.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Record NOT Deleted");
                    }else{
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Record Deleted");
                        table3_load();
                    }

                    txtlecid.setText("");
                    txtphnL.setText("");
                    txtpwL.setText("");
                    txtfnameL.setText("");
                    txtlnameL.setText("");
                    txtgenderL.setSelectedItem("");
                    txtdobL.setText("");
                    txtemailL.setText("");
                    txtUnameL.setText("");

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        //REGISTER BTN FOR STUDENT
        btnRegStd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String std_id, pno, fname, lname, sex, email, password, dob, address, department;

                std_id = txtStdid.getText();
                pno = txtphnstd.getText();
                password = txtpwStd.getText();
                fname = txtfnStd.getText();
                lname = txtlnStd.getText();
                sex = (String) txtgenderstd.getSelectedItem();
                dob = txtdobstd.getText();
                email = txtemailstd.getText();
                address = txtAddstd.getText();
                department = txtDepstd.getText();

                try {
                    String sql;
                    sql = "INSERT INTO Student(std_id,pno,password,fname,lname,sex,dob,email,address,department)" +
                            "VALUES(?,?,?,?,?,?,?,?,?,?)";
                    pst = conn.prepareStatement(sql);

                    pst.setString(1, std_id);
                    pst.setString(2, pno);
                    pst.setString(3, password);
                    pst.setString(4, fname);
                    pst.setString(5, lname);
                    pst.setString(6, sex);
                    pst.setString(7, dob);
                    pst.setString(8, email);
                    pst.setString(9, address);
                    pst.setString(10, department);

                    if(std_id.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Record NOT Added");
                    }else{
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Record Added");
                        table2_load();
                    }
                    pst.executeUpdate();

                    txtStdid.setText("");
                    txtphnstd.setText("");
                    txtpwStd.setText("");
                    txtfnStd.setText("");
                    txtlnStd.setText("");
                    txtgenderstd.setSelectedItem("");
                    txtdobstd.setText("");
                    txtemailstd.setText("");
                    txtAddstd.setText("");
                    txtDepstd.setText("");

                    txtStdid.requestFocus();

                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        //UPDATE BTN FOR STUDENT
        btnupdateStd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    String std_id, pno, password, fname, lname, dob, email, sex, address,department ;

                    std_id = txtStdid.getText();
                    pno = txtphnstd.getText();
                    password = txtpwStd.getText();
                    fname = txtfnStd.getText();
                    lname = txtlnStd.getText();
                    sex = (String) txtgenderstd.getSelectedItem();
                    dob = txtdobstd.getText();
                    email = txtemailstd.getText();
                    address = txtAddstd.getText();
                    department = txtDepstd.getText();

                    pst = conn.prepareStatement("UPDATE student SET fname = ?,lname = ?,dob = ?,pno = ?,email = ?,sex = ?,password = ?, address = ?, department = ?  where std_id = ?");

                    pst.setString(1, fname);
                    pst.setString(2, lname);
                    pst.setString(3, dob);
                    pst.setString(4, pno);
                    pst.setString(5, email);
                    pst.setString(6, sex);
                    pst.setString(7, password);
                    pst.setString(8,address );
                    pst.setString(9, department);
                    pst.setString(10, std_id);

                    if(std_id.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Record NOT Updated");
                    }else{
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Record Updated");
                        table2_load();
                    }
                    txtStdid.setText("");
                    txtphnstd.setText("");
                    txtpwStd.setText("");
                    txtfnStd.setText("");
                    txtlnStd.setText("");
                    txtgenderstd.setSelectedItem("");
                    txtdobstd.setText("");
                    txtemailstd.setText("");
                    txtAddstd.setText("");
                    txtDepstd.setText("");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        //GET DETAILS OF STUDENT
        btngetdetailsStd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String Sid = txtStdid.getText();
                    pst = conn.prepareStatement("SELECT fname,lname,dob,pno,email,sex,password,address,department from student where std_id = ?");
                    pst.setString(1, Sid);
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {

                        String fname = rs.getString(1);
                        String lname = rs.getString(2);
                        String dob = rs.getString(3);
                        String pno = rs.getString(4);
                        String email = rs.getString(5);
                        String sex = rs.getString(6);
                        String password = rs.getString(7);
                        String address = rs.getString(8);
                        String department = rs.getString(9);

                        txtStdid.setText(Sid);
                        txtphnstd.setText(pno);
                        txtpwStd.setText(password);
                        txtfnStd.setText(fname);
                        txtlnStd.setText(lname);
                        txtgenderstd.setSelectedItem(sex);
                        txtdobstd.setText(dob);
                        txtemailstd.setText(email);
                        txtAddstd.setText(address);
                        txtDepstd.setText(department);

                    } else {
                        txtStdid.setText("");
                        txtphnstd.setText("");
                        txtpwStd.setText("");
                        txtfnStd.setText("");
                        txtlnStd.setText("");
                        txtgenderstd.setSelectedItem("");
                        txtdobstd.setText("");
                        txtemailstd.setText("");
                        txtAddstd.setText("");
                        txtDepstd.setText("");
                        JOptionPane.showMessageDialog(null, "Invalid Student ID");
                    }
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        //DELETE FROM STUDENT BUTTON
        btndelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String std_id;
                std_id = txtStdid.getText();

                try {
                    pst = conn.prepareStatement("DELETE FROM student WHERE std_id = ?");
                    pst.setString(1, std_id);

                    if(std_id.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Record NOT DELETED");
                    }else{
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Record DELETED");
                        table2_load();
                    }

                    txtStdid.setText("");
                    txtphnstd.setText("");
                    txtpwStd.setText("");
                    txtfnStd.setText("");
                    txtlnStd.setText("");
                    txtgenderstd.setSelectedItem("");
                    txtdobstd.setText("");
                    txtemailstd.setText("");
                    txtAddstd.setText("");
                    txtDepstd.setText("");

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        //REGSTER BTN NEW TECHNICAL OFFICER
        btnregT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tec_id, pno, password, fname, lname, sex, dob, email;

                tec_id = txttoid.getText(   );
                pno = txtphnT.getText();
                password = txtpwT.getText();
                fname = txtfnT.getText();
                lname = txtlnT.getText();
                sex = (String) txtgenT.getSelectedItem();
                dob = txtdobT.getText();
                email = txtemT.getText();

                try {
                    String sql;
                    sql = "INSERT INTO tecofficer(tec_id,fname,lname,sex,pno,email,password,dob)" +
                            "VALUES(?,?,?,?,?,?,?,?)";
                    pst = conn.prepareStatement(sql);

                    //PreparedStatement pst = con.prepareStatement(sql);
                    pst.setString(1, tec_id);
                    pst.setString(2, fname);
                    pst.setString(3, lname);
                    pst.setString(4, sex);
                    pst.setString(5, pno);
                    pst.setString(6, email);
                    pst.setString(7, password);
                    pst.setString(8, dob);
                    if(tec_id.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Record NOT Added");
                    }else{
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Record Added");
                        table5_load();
                    }

                    txttoid.setText("");
                    txtphnT.setText("");
                    txtpwT.setText("");
                    txtfnT.setText("");
                    txtlnT.setText("");
                    txtgenT.setSelectedItem("");
                    txtdobT.setText("");
                    txtemT.setText("");
                    txttoid.requestFocus();

                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        //GET DETALS BUTTON FOR TECHNCAL OFFCER
        btngdetailsT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String tec_id = txttoid.getText();
                    pst = conn.prepareStatement("SELECT fname,lname,dob,pno,email,sex,password from tecofficer where tec_id = ?");
                    pst.setString(1, tec_id);
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {

                        String fname = rs.getString(1);
                        String lname = rs.getString(2);
                        String dob = rs.getString(3);
                        String pno = rs.getString(4);
                        String email = rs.getString(5);
                        String sex = rs.getString(6);
                        String password = rs.getString(7);

                        txttoid.setText(tec_id);
                        txtphnT.setText(pno);
                        txtpwT.setText(password);
                        txtfnT.setText(fname);
                        txtlnT.setText(lname);
                        txtgenT.setSelectedItem(sex);
                        txtdobT.setText(dob);
                        txtemT.setText(email);

                    } else {
                        txttoid.setText("");
                        txtphnT.setText("");
                        txtpwT.setText("");
                        txtfnT.setText("");
                        txtlnT.setText("");
                        txtgenT.setSelectedItem("");
                        txtdobT.setText("");
                        txtemT.setText("");
                        JOptionPane.showMessageDialog(null, "Invalid technical_officer ID");
                    }
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        //DELETE BTN FOR TO
        btndelT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tec_id;
                tec_id = txttoid.getText();

                try {
                    pst = conn.prepareStatement("DELETE FROM tecofficer WHERE tec_id = ?");
                    pst.setString(1, tec_id);
                    if(tec_id.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Record NOT Deleted");
                    }else{
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Record Deleted");
                        table5_load();
                    }

                    txttoid.setText("");
                    txtphnT.setText("");
                    txtpwT.setText("");
                    txtfnT.setText("");
                    txtlnT.setText("");
                    txtgenT.setSelectedItem("");
                    txtdobT.setText("");
                    txtemT.setText("");

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        //UPDATE BTN FOR TECHNCAL OFFCER
        btnupdT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String tec_id, pno, password, fname, lname, sex, dob, email;

                    tec_id = txttoid.getText();
                    pno = txtphnT.getText();
                    password = txtpwT.getText();
                    fname = txtfnT.getText();
                    lname = txtlnT.getText();
                    sex = (String) txtgenT.getSelectedItem();
                    dob = txtdobT.getText();
                    email = txtemT.getText();

                    pst = conn.prepareStatement("UPDATE tecofficer SET fname = ?,lname = ?,sex = ?,pno = ?,email = ?,password = ?,dob = ? where tec_id = ?");

                    pst.setString(1, fname);
                    pst.setString(2, lname);
                    pst.setString(3, sex);
                    pst.setString(4, pno);
                    pst.setString(5, email);
                    pst.setString(6, password);
                    pst.setString(7, dob);
                    pst.setString(8,tec_id);

                    if(tec_id.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Record NOT UPDATED");
                    }else{
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Record UPDATED");
                        table5_load();
                    }

                    txttoid.setText("");
                    txtphnT.setText("");
                    txtpwT.setText("");
                    txtfnT.setText("");
                    txtlnT.setText("");
                    txtgenT.setSelectedItem("");
                    txtdobT.setText("");
                    txtemT.setText("");

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        /* -----------------------------ENDING USER MAINTAIN------------------------------------- */

        /* -----------------------------Starting Maintan NOTICE------------------------------------- */
        //BTN ADD NEW NOTICE
        btnaddnotice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String notice_no, headline, ndate, ad_id, message;

                notice_no = txtnoticeno.getText();
                headline = txtNoticeTitle.getText();
                ndate = txtnoticedate.getText();
                ad_id = txtadmNOT.getText();
                message = txtAreaNotice.getText();

                try {
                    String sql;
                    sql = "INSERT INTO notice(notice_no, headline, date, ad_id, message)" +
                            "VALUES(?,?,?,?,?)";
                    pst = conn.prepareStatement(sql);

                    //PreparedStatement pst = con.prepareStatement(sql);
                    pst.setString(1, notice_no);
                    pst.setString(2, headline);
                    pst.setString(3, ndate);
                    pst.setString(4, ad_id);
                    pst.setString(5, message);
                    if(notice_no.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Notice NOT ADDED");
                    }else{
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "New Notice Added!!!");
                        table6_load();
                    }

                    txtnoticeno.setText("");
                    txtNoticeTitle.setText("");
                    txtnoticedate.setText("");
                    txtadmNOT.setText("");
                    txtAreaNotice.setText("");
                    txtnoticeno.requestFocus();

                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        //GET NFO BTN NOTCE
        getInfoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String Nid = txtnoticeno.getText();
                    pst = conn.prepareStatement("SELECT headline, date, ad_id, message from notice where notice_no = ?");
                    pst.setString(1, Nid);
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {

                        String headline = rs.getString(1);
                        String ndate = rs.getString(2);
                        String ad_id = rs.getString(3);
                        String message = rs.getString(4);

                        txtNoticeTitle.setText(headline);
                        txtadmNOT.setText(ad_id);
                        txtAreaNotice.setText(message);
                        txtnoticedate.setText(ndate);
                    } else {
                        txtnoticeno.setText("");
                        txtNoticeTitle.setText("");
                        txtadmNOT.setText("");
                        txtAreaNotice.setText("");
                        txtnoticedate.setText("");
                        JOptionPane.showMessageDialog(null, "Invalid Notice_NO");
                    }

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        //DELETE NOTCE BTN
        btndeletenotice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String notice_no;
                notice_no = txtnoticeno.getText();

                try {
                    pst = conn.prepareStatement("DELETE FROM notice WHERE notice_no = ?");
                    pst.setString(1, notice_no);
                    if(notice_no.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Record NOT Deleted");
                    }else{
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Record Deleted!!!");
                        table6_load();
                    }
                    txtnoticeno.setText("");
                    txtNoticeTitle.setText("");
                    txtadmNOT.setText("");
                    txtAreaNotice.setText("");
                    txtnoticedate.setText("");

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        //UPDATE NOTCE DETALS
        btnupdatenotice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String notice_no, headline,ndate,ad_id,message ;

                    notice_no = txtnoticeno.getText();
                    headline = txtNoticeTitle.getText();
                    ndate = txtnoticedate.getText();
                    ad_id = txtadmNOT.getText();
                    message = txtAreaNotice.getText();

                    pst = conn.prepareStatement("UPDATE notice SET headline = ?,date = ?,ad_id = ?, message = ? where notice_no = ?");

                    pst.setString(1, headline);
                    pst.setString(2, ndate);
                    pst.setString(3, ad_id);
                    pst.setString(4,message);
                    pst.setString(5,notice_no);

                    if(notice_no.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Notice NOT Updated");
                    }else{
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Notice Updated!!!");
                        table6_load();
                    }

                    txtnoticeno.setText("");
                    txtNoticeTitle.setText("");
                    txtadmNOT.setText("");
                    txtAreaNotice.setText("");
                    txtnoticedate.setText("");

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        /* -----------------------------Ending Maintain NOTICE------------------------------------- */

        /* -----------------------------STARTING Maintain TIME TABLE------------------------------------- */

        //BTN ADD New // L1 S1 BST TIME TABLE
        btn_add_TT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time,mon, tue, wed, thu, fri,level,sem,dep,sql,temtim = null ;

                time = txt_tm.getText();
                mon = txtMon.getText();
                tue = txtTue.getText();
                wed = txtWed.getText();
                thu = txtThu.getText();
                fri = txtFri.getText();
                level = (String) txtLevel.getSelectedItem();
                sem = (String) txtSem.getSelectedItem();
                dep = (String) txtDept.getSelectedItem();

                try {
                    if(Objects.equals(level, "Level 1") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "BST"))
                    {
                        sql = "INSERT INTO l1s1bst(time,mon, tue, wed, thu, fri,temtim)" + "VALUES(?,?,?,?,?,?,?)";
                        pst = conn.prepareStatement(sql);

                        pst.setString(1, time);
                        pst.setString(2, mon);
                        pst.setString(3, tue);
                        pst.setString(4, wed);
                        pst.setString(5, thu);
                        pst.setString(6, fri);
                        pst.setString(7, temtim);

                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "New data Added To L1 S1 BST !!!");
                        l1s1bst_load();
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);

/*L1 S1 ICT*/        }else if(Objects.equals(level, "Level 1") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "ICT")){
                        sql = "INSERT INTO l1s1ict(time,mon, tue, wed, thu, fri)" + "VALUES(?,?,?,?,?,?)";
                        pst = conn.prepareStatement(sql);

                        pst.setString(1, time);
                        pst.setString(2, mon);
                        pst.setString(3, tue);
                        pst.setString(4, wed);
                        pst.setString(5, thu);
                        pst.setString(6, fri);

                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "New data Added To L1 S1 ICT !!!");
                        l1s1ict_load();
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);

 /*L1 S1 ET*/       }else if(Objects.equals(level, "Level 1") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "ET")){
                        sql = "INSERT INTO l1s1et(time,mon, tue, wed, thu, fri)" + "VALUES(?,?,?,?,?,?)";
                        pst = conn.prepareStatement(sql);

                        pst.setString(1, time);
                        pst.setString(2, mon);
                        pst.setString(3, tue);
                        pst.setString(4, wed);
                        pst.setString(5, thu);
                        pst.setString(6, fri);

                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "New data Added To L1 S1 ET !!!");
                        l1s1et_load();
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);

   /*L1 S2 ET*/    }else if(Objects.equals(level, "Level 1") && Objects.equals(sem, "Sem 2") && Objects.equals(dep, "ET")){
                        sql = "INSERT INTO l1s1et(time,mon, tue, wed, thu, fri)" + "VALUES(?,?,?,?,?,?)";
                        pst = conn.prepareStatement(sql);

                        pst.setString(1, time);
                        pst.setString(2, mon);
                        pst.setString(3, tue);
                        pst.setString(4, wed);
                        pst.setString(5, thu);
                        pst.setString(6, fri);

                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "New data Added To L1 S2 ET !!!");
                        l1s2et_load();
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);

   /*L1 S2 ICT*/    }else if(Objects.equals(level, "Level 1") && Objects.equals(sem, "Sem 2") && Objects.equals(dep, "ICT")){
                        sql = "INSERT INTO l1s1et(time,mon, tue, wed, thu, fri)" + "VALUES(?,?,?,?,?,?)";
                        pst = conn.prepareStatement(sql);

                        pst.setString(1, time);
                        pst.setString(2, mon);
                        pst.setString(3, tue);
                        pst.setString(4, wed);
                        pst.setString(5, thu);
                        pst.setString(6, fri);

                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "New data Added To L1 S2 ICT !!!");
                        l1s2ict_load();
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);

/*L1 S2 BST*/       }else if(Objects.equals(level, "Level 1") && Objects.equals(sem, "Sem 2") && Objects.equals(dep, "BST")){
                        sql = "INSERT INTO l1s1et(time,mon, tue, wed, thu, fri)" + "VALUES(?,?,?,?,?,?)";
                        pst = conn.prepareStatement(sql);

                        pst.setString(1, time);
                        pst.setString(2, mon);
                        pst.setString(3, tue);
                        pst.setString(4, wed);
                        pst.setString(5, thu);
                        pst.setString(6, fri);

                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "New data Added To L1 S2 BST !!!");
                        l1s2bst_load();
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);

     /*L2 S1 BST*/  }else if(Objects.equals(level, "Level 2") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "BST")){
                        sql = "INSERT INTO l1s1et(time,mon, tue, wed, thu, fri)" + "VALUES(?,?,?,?,?,?)";
                        pst = conn.prepareStatement(sql);

                        pst.setString(1, time);
                        pst.setString(2, mon);
                        pst.setString(3, tue);
                        pst.setString(4, wed);
                        pst.setString(5, thu);
                        pst.setString(6, fri);

                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "New data Added To L2 S1 BST !!!");
                        l2s1bst_load();
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);

   /*L2 S1 ET*/    }else if(Objects.equals(level, "Level 2") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "ET")){
                        sql = "INSERT INTO l1s1et(time,mon, tue, wed, thu, fri)" + "VALUES(?,?,?,?,?,?)";
                        pst = conn.prepareStatement(sql);

                        pst.setString(1, time);
                        pst.setString(2, mon);
                        pst.setString(3, tue);
                        pst.setString(4, wed);
                        pst.setString(5, thu);
                        pst.setString(6, fri);

                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "New data Added To L2 S1 ET !!!");
                        l2s1et_load();
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);

       /*L2 S1 ICT*/ }else if(Objects.equals(level, "Level 2") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "ICT")){
                        sql = "INSERT INTO l1s1et(time,mon, tue, wed, thu, fri)" + "VALUES(?,?,?,?,?,?)";
                        pst = conn.prepareStatement(sql);

                        pst.setString(1, time);
                        pst.setString(2, mon);
                        pst.setString(3, tue);
                        pst.setString(4, wed);
                        pst.setString(5, thu);
                        pst.setString(6, fri);

                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "New data Added To L2 S1 ET !!!");
                        l2s1ict_load();
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);

   /*L2 S2 BST*/    }else if(Objects.equals(level, "Level 2") && Objects.equals(sem, "Sem 2") && Objects.equals(dep, "BST")){
                        sql = "INSERT INTO l1s1et(time,mon, tue, wed, thu, fri)" + "VALUES(?,?,?,?,?,?)";
                        pst = conn.prepareStatement(sql);

                        pst.setString(1, time);
                        pst.setString(2, mon);
                        pst.setString(3, tue);
                        pst.setString(4, wed);
                        pst.setString(5, thu);
                        pst.setString(6, fri);

                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "New data Added To L2 S2 BST !!!");
                        l2s2bst_load();
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);

    /*L2 S2 ET*/   }else if(Objects.equals(level, "Level 2") && Objects.equals(sem, "Sem 2") && Objects.equals(dep, "ET")){
                        sql = "INSERT INTO l1s1et(time,mon, tue, wed, thu, fri)" + "VALUES(?,?,?,?,?,?)";
                        pst = conn.prepareStatement(sql);

                        pst.setString(1, time);
                        pst.setString(2, mon);
                        pst.setString(3, tue);
                        pst.setString(4, wed);
                        pst.setString(5, thu);
                        pst.setString(6, fri);

                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "New data Added To L2 S2 ET !!!");
                        l2s2et_load();
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);

    /*L2 S2 ICT*/   }else if(Objects.equals(level, "Level 2") && Objects.equals(sem, "Sem 2") && Objects.equals(dep, "ICT")){
                        sql = "INSERT INTO l1s1et(time,mon, tue, wed, thu, fri)" + "VALUES(?,?,?,?,?,?)";
                        pst = conn.prepareStatement(sql);
                        pst.setString(1, time);
                        pst.setString(2, mon);
                        pst.setString(3, tue);
                        pst.setString(4, wed);
                        pst.setString(5, thu);
                        pst.setString(6, fri);

                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "New data Added To L2 S2 ICT !!!");
                        l2s2ict_load();
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);

  /*L3 S1 ICT*/     }else if(Objects.equals(level, "Level 3") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "ICT")) {
                        sql = "INSERT INTO l1s1et(time,mon, tue, wed, thu, fri)" + "VALUES(?,?,?,?,?,?)";
                        pst = conn.prepareStatement(sql);

                        pst.setString(1, time);
                        pst.setString(2, mon);
                        pst.setString(3, tue);
                        pst.setString(4, wed);
                        pst.setString(5, thu);
                        pst.setString(6, fri);

                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "New data Added To L3 S1 ICT !!!");
                        l3s1ict_load();
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);

    /*L3 S1 ET*/    }else if(Objects.equals(level, "Level 3") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "ET")) {
                        sql = "INSERT INTO l1s1et(time,mon, tue, wed, thu, fri)" + "VALUES(?,?,?,?,?,?)";
                        pst = conn.prepareStatement(sql);

                        pst.setString(1, time);
                        pst.setString(2, mon);
                        pst.setString(3, tue);
                        pst.setString(4, wed);
                        pst.setString(5, thu);
                        pst.setString(6, fri);

                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "New data Added To L3 S1 ET !!!");
                        l3s1et_load();
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);

    /*L3 S1 BST*/    }else if(Objects.equals(level, "Level 3") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "BST")) {
                        sql = "INSERT INTO l1s1et(time,mon, tue, wed, thu, fri)" + "VALUES(?,?,?,?,?,?)";
                        pst = conn.prepareStatement(sql);

                        pst.setString(1, time);
                        pst.setString(2, mon);
                        pst.setString(3, tue);
                        pst.setString(4, wed);
                        pst.setString(5, thu);
                        pst.setString(6, fri);

                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "New data Added To L3 S1 BST !!!");
                        l3s1bst_load();
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);

  /*L3 S2 BST*/     }else if(Objects.equals(level, "Level 3") && Objects.equals(sem, "Sem 2") && Objects.equals(dep, "BST")) {
                        sql = "INSERT INTO l1s1et(time,mon, tue, wed, thu, fri)" + "VALUES(?,?,?,?,?,?)";
                        pst = conn.prepareStatement(sql);

                        pst.setString(1, time);
                        pst.setString(2, mon);
                        pst.setString(3, tue);
                        pst.setString(4, wed);
                        pst.setString(5, thu);
                        pst.setString(6, fri);

                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "New data Added To L3 S2 BST !!!");
                        l3s2bst_load();
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);

   /*L3 S2 ET*/    }else if(Objects.equals(level, "Level 3") && Objects.equals(sem, "Sem 2") && Objects.equals(dep, "ET")) {
                        sql = "INSERT INTO l1s1et(time,mon, tue, wed, thu, fri)" + "VALUES(?,?,?,?,?,?)";
                        pst = conn.prepareStatement(sql);

                        pst.setString(1, time);
                        pst.setString(2, mon);
                        pst.setString(3, tue);
                        pst.setString(4, wed);
                        pst.setString(5, thu);
                        pst.setString(6, fri);

                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "New data Added To L3 S2 ET !!!");
                        l3s2et_load();
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);

    /*L3 S2 ICT*/    }else if(Objects.equals(level, "Level 3") && Objects.equals(sem, "Sem 2") && Objects.equals(dep, "ICT")) {
                        sql = "INSERT INTO l1s1et(time,mon, tue, wed, thu, fri)" + "VALUES(?,?,?,?,?,?)";
                        pst = conn.prepareStatement(sql);

                        pst.setString(1, time);
                        pst.setString(2, mon);
                        pst.setString(3, tue);
                        pst.setString(4, wed);
                        pst.setString(5, thu);
                        pst.setString(6, fri);

                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "New data Added To L3 S2 ICT !!!");
                        l3s2ict_load();

                        txt_tm.setText("");
                        txtMon.setText("");
                        txtTue.setText("");
                        txtWed.setText("");
                        txtThu.setText("");
                        txtFri.setText("");
   /*L4 S1 ICT*/    }else if(Objects.equals(level, "Level 4") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "ICT")) {
                        sql = "INSERT INTO l1s1et(time,mon, tue, wed, thu, fri)" + "VALUES(?,?,?,?,?,?)";
                        pst = conn.prepareStatement(sql);

                        pst.setString(1, time);
                        pst.setString(2, mon);
                        pst.setString(3, tue);
                        pst.setString(4, wed);
                        pst.setString(5, thu);
                        pst.setString(6, fri);

                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "New data Added To L4 S1 ICT !!!");
                        l4s1ict_load();
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);

   /*L4 S1 ET*/    }else if(Objects.equals(level, "Level 4") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "ET")) {
                        sql = "INSERT INTO l1s1et(time,mon, tue, wed, thu, fri)" + "VALUES(?,?,?,?,?,?)";
                        pst = conn.prepareStatement(sql);

                        pst.setString(1, time);
                        pst.setString(2, mon);
                        pst.setString(3, tue);
                        pst.setString(4, wed);
                        pst.setString(5, thu);
                        pst.setString(6, fri);

                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "New data Added To L4 S1 ET !!!");
                        l4s1et_load();
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);

    /*L4 S1 BST*/    }else if(Objects.equals(level, "Level 4") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "BST")) {
                        sql = "INSERT INTO l1s1et(time,mon, tue, wed, thu, fri)" + "VALUES(?,?,?,?,?,?)";
                        pst = conn.prepareStatement(sql);

                        pst.setString(1, time);
                        pst.setString(2, mon);
                        pst.setString(3, tue);
                        pst.setString(4, wed);
                        pst.setString(5, thu);
                        pst.setString(6, fri);

                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "New data Added To L4 S1 BST !!!");
                        l4s1bst_load();
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);

    /*L4 S2 BST*/   }else if(Objects.equals(level, "Level 4") && Objects.equals(sem, "Sem 2") && Objects.equals(dep, "BST")) {
                        sql = "INSERT INTO l1s1et(time,mon, tue, wed, thu, fri)" + "VALUES(?,?,?,?,?,?)";
                        pst = conn.prepareStatement(sql);

                        pst.setString(1, time);
                        pst.setString(2, mon);
                        pst.setString(3, tue);
                        pst.setString(4, wed);
                        pst.setString(5, thu);
                        pst.setString(6, fri);

                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "New data Added To L4 S2 BST !!!");
                        l4s2bst_load();
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);

    /*L4 S2 ET*/    }else if(Objects.equals(level, "Level 4") && Objects.equals(sem, "Sem 2") && Objects.equals(dep, "ET")) {
                        sql = "INSERT INTO l1s1et(time,mon, tue, wed, thu, fri)" + "VALUES(?,?,?,?,?,?)";
                        pst = conn.prepareStatement(sql);

                        pst.setString(1, time);
                        pst.setString(2, mon);
                        pst.setString(3, tue);
                        pst.setString(4, wed);
                        pst.setString(5, thu);
                        pst.setString(6, fri);

                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "New data Added To L4 S2 ET !!!");
                        l4s2et_load();

                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);

  /*L4 S2 ICT*/     }else if(Objects.equals(level, "Level 4") && Objects.equals(sem, "Sem 2") && Objects.equals(dep, "ICT")) {
                        sql = "INSERT INTO l1s1et(time,mon, tue, wed, thu, fri)" + "VALUES(?,?,?,?,?,?)";
                        pst = conn.prepareStatement(sql);

                        pst.setString(1, time);
                        pst.setString(2, mon);
                        pst.setString(3, tue);
                        pst.setString(4, wed);
                        pst.setString(5, thu);
                        pst.setString(6, fri);

                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "New data Added To L4 S2 ICT !!!");
                        l4s2ict_load();

                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                        }
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        //BTN SEARCH
        btn_search_TT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String tm = txt_tm.getText();
                    String level = (String) txtLevel.getSelectedItem();
                    String sem = (String) txtSem.getSelectedItem();
                    String dep = (String) txtDept.getSelectedItem();

    /* L1 S1 BST*/  if(Objects.equals(level, "Level 1") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "BST")){
                        pst = conn.prepareStatement("SELECT mon, tue, wed, thu, fri from l1s1bst where time = ?");
                        pst.setString(1, tm);
                        ResultSet rs = pst.executeQuery();

                        if (rs.next()) {

                            String mon = rs.getString(1);
                            String tue = rs.getString(2);
                            String wed = rs.getString(3);
                            String thu = rs.getString(4);
                            String fri = rs.getString(5);

                            Days_set( mon,tue, wed,thu,fri);

                        } else {
                            Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                            JOptionPane.showMessageDialog(null, "Invalid Time code");
                        }
  /* L1 S1 ET*/     }else if(Objects.equals(level, "Level 1") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "ET")){
                        pst = conn.prepareStatement("SELECT mon, tue, wed, thu, fri from l1s1et where time = ?");
                        pst.setString(1, tm);
                        ResultSet rs = pst.executeQuery();

                        if (rs.next()) {

                            String mon = rs.getString(1);
                            String tue = rs.getString(2);
                            String wed = rs.getString(3);
                            String thu = rs.getString(4);
                            String fri = rs.getString(5);

                            Days_set( mon,tue, wed,thu,fri);

                        } else {
                            Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                            JOptionPane.showMessageDialog(null, "Invalid Time code");
                        }
   /* L1 S1 ICT*/   }else if(Objects.equals(level, "Level 1") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "ICT")){
                        pst = conn.prepareStatement("SELECT mon, tue, wed, thu, fri from l1s1ict where time = ?");
                        pst.setString(1, tm);
                        ResultSet rs = pst.executeQuery();

                        if (rs.next()) {

                            String mon = rs.getString(1);
                            String tue = rs.getString(2);
                            String wed = rs.getString(3);
                            String thu = rs.getString(4);
                            String fri = rs.getString(5);

                            Days_set( mon,tue, wed,thu,fri);

                        } else {
                            Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                            JOptionPane.showMessageDialog(null, "Invalid Time code");
                        }
  /* L2 S1 ICT*/    }else if(Objects.equals(level, "Level 2") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "ICT")){
                        pst = conn.prepareStatement("SELECT mon, tue, wed, thu, fri from l2s1ict where time = ?");
                        pst.setString(1, tm);
                        ResultSet rs = pst.executeQuery();

                        if (rs.next()) {

                            String mon = rs.getString(1);
                            String tue = rs.getString(2);
                            String wed = rs.getString(3);
                            String thu = rs.getString(4);
                            String fri = rs.getString(5);

                            Days_set( mon,tue, wed,thu,fri);

                        } else {
                            Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                            JOptionPane.showMessageDialog(null, "Invalid Time code");
                        }
  /* L2 S1 ET*/    }else if(Objects.equals(level, "Level 2") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "ET")){
                        pst = conn.prepareStatement("SELECT mon, tue, wed, thu, fri from l2s1et where time = ?");
                        pst.setString(1, tm);
                        ResultSet rs = pst.executeQuery();

                        if (rs.next()) {

                            String mon = rs.getString(1);
                            String tue = rs.getString(2);
                            String wed = rs.getString(3);
                            String thu = rs.getString(4);
                            String fri = rs.getString(5);

                            Days_set( mon,tue, wed,thu,fri);

                        } else {
                            Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                            JOptionPane.showMessageDialog(null, "Invalid Time code");
                        }
  /* L2 S1 BST*/    }else if(Objects.equals(level, "Level 2") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "BST")){
                        pst = conn.prepareStatement("SELECT mon, tue, wed, thu, fri from l2s1bst where time = ?");
                        pst.setString(1, tm);
                        ResultSet rs = pst.executeQuery();

                        if (rs.next()) {

                            String mon = rs.getString(1);
                            String tue = rs.getString(2);
                            String wed = rs.getString(3);
                            String thu = rs.getString(4);
                            String fri = rs.getString(5);

                            Days_set( mon,tue, wed,thu,fri);

                        } else {
                            Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                            JOptionPane.showMessageDialog(null, "Invalid Time code");
                        }
                    }else if(Objects.equals(level, "Level 2") && Objects.equals(sem, "Sem 2") && Objects.equals(dep, "BST")){
                        pst = conn.prepareStatement("SELECT mon, tue, wed, thu, fri from l2s2bst where time = ?");
                        pst.setString(1, tm);
                        ResultSet rs = pst.executeQuery();

                        if (rs.next()) {

                            String mon = rs.getString(1);
                            String tue = rs.getString(2);
                            String wed = rs.getString(3);
                            String thu = rs.getString(4);
                            String fri = rs.getString(5);

                            Days_set( mon,tue, wed,thu,fri);

                        } else {
                            Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                            JOptionPane.showMessageDialog(null, "Invalid Time code");
                        }
                    }else if(Objects.equals(level, "Level 2") && Objects.equals(sem, "Sem 2") && Objects.equals(dep, "ICT")){
                        pst = conn.prepareStatement("SELECT mon, tue, wed, thu, fri from l2s2ict where time = ?");
                        pst.setString(1, tm);
                        ResultSet rs = pst.executeQuery();

                        if (rs.next()) {

                            String mon = rs.getString(1);
                            String tue = rs.getString(2);
                            String wed = rs.getString(3);
                            String thu = rs.getString(4);
                            String fri = rs.getString(5);

                            Days_set( mon,tue, wed,thu,fri);

                        } else {
                            Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                            JOptionPane.showMessageDialog(null, "Invalid Time code");
                        }
                    }else if(Objects.equals(level, "Level 2") && Objects.equals(sem, "Sem 2") && Objects.equals(dep, "ET")){
                        pst = conn.prepareStatement("SELECT mon, tue, wed, thu, fri from l2s2et where time = ?");
                        pst.setString(1, tm);
                        ResultSet rs = pst.executeQuery();

                        if (rs.next()) {

                            String mon = rs.getString(1);
                            String tue = rs.getString(2);
                            String wed = rs.getString(3);
                            String thu = rs.getString(4);
                            String fri = rs.getString(5);

                            Days_set( mon,tue, wed,thu,fri);

                        } else {
                            Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                            JOptionPane.showMessageDialog(null, "Invalid Time code");
                        }
                    }else if(Objects.equals(level, "Level 3") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "ET")){
                        pst = conn.prepareStatement("SELECT mon, tue, wed, thu, fri from l3s1et where time = ?");
                        pst.setString(1, tm);
                        ResultSet rs = pst.executeQuery();

                        if (rs.next()) {

                            String mon = rs.getString(1);
                            String tue = rs.getString(2);
                            String wed = rs.getString(3);
                            String thu = rs.getString(4);
                            String fri = rs.getString(5);

                            Days_set( mon,tue, wed,thu,fri);

                        } else {
                            Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                            JOptionPane.showMessageDialog(null, "Invalid Time code");
                        }
                    }else if(Objects.equals(level, "Level 3") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "BST")){
                        pst = conn.prepareStatement("SELECT mon, tue, wed, thu, fri from l3s1bst where time = ?");
                        pst.setString(1, tm);
                        ResultSet rs = pst.executeQuery();

                        if (rs.next()) {

                            String mon = rs.getString(1);
                            String tue = rs.getString(2);
                            String wed = rs.getString(3);
                            String thu = rs.getString(4);
                            String fri = rs.getString(5);

                            Days_set( mon,tue, wed,thu,fri);

                        } else {
                            Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                            JOptionPane.showMessageDialog(null, "Invalid Time code");
                        }
                    }else if(Objects.equals(level, "Level 3") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "ICT")){
                        pst = conn.prepareStatement("SELECT mon, tue, wed, thu, fri from l3s1ict where time = ?");
                        pst.setString(1, tm);
                        ResultSet rs = pst.executeQuery();

                        if (rs.next()) {

                            String mon = rs.getString(1);
                            String tue = rs.getString(2);
                            String wed = rs.getString(3);
                            String thu = rs.getString(4);
                            String fri = rs.getString(5);

                            Days_set( mon,tue, wed,thu,fri);

                        } else {
                            Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                            JOptionPane.showMessageDialog(null, "Invalid Time code");
                        }
                    }else if(Objects.equals(level, "Level 3") && Objects.equals(sem, "Sem 2") && Objects.equals(dep, "ICT")){
                        pst = conn.prepareStatement("SELECT mon, tue, wed, thu, fri from l3s2ict where time = ?");
                        pst.setString(1, tm);
                        ResultSet rs = pst.executeQuery();

                        if (rs.next()) {

                            String mon = rs.getString(1);
                            String tue = rs.getString(2);
                            String wed = rs.getString(3);
                            String thu = rs.getString(4);
                            String fri = rs.getString(5);

                            Days_set( mon,tue, wed,thu,fri);

                        } else {
                            Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                            JOptionPane.showMessageDialog(null, "Invalid Time code");
                        }
                    }else if(Objects.equals(level, "Level 3") && Objects.equals(sem, "Sem 2") && Objects.equals(dep, "ET")){
                        pst = conn.prepareStatement("SELECT mon, tue, wed, thu, fri from l3s2et where time = ?");
                        pst.setString(1, tm);
                        ResultSet rs = pst.executeQuery();

                        if (rs.next()) {

                            String mon = rs.getString(1);
                            String tue = rs.getString(2);
                            String wed = rs.getString(3);
                            String thu = rs.getString(4);
                            String fri = rs.getString(5);

                            Days_set( mon,tue, wed,thu,fri);

                        } else {
                            Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                            JOptionPane.showMessageDialog(null, "Invalid Time code");
                        }
                    }else if(Objects.equals(level, "Level 3") && Objects.equals(sem, "Sem 2") && Objects.equals(dep, "BST")){
                        pst = conn.prepareStatement("SELECT mon, tue, wed, thu, fri from l3s2bst where time = ?");
                        pst.setString(1, tm);
                        ResultSet rs = pst.executeQuery();

                        if (rs.next()) {

                            String mon = rs.getString(1);
                            String tue = rs.getString(2);
                            String wed = rs.getString(3);
                            String thu = rs.getString(4);
                            String fri = rs.getString(5);

                            Days_set( mon,tue, wed,thu,fri);

                        } else {
                            Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                            JOptionPane.showMessageDialog(null, "Invalid Time code");
                        }
                    }else if(Objects.equals(level, "Level 4") && Objects.equals(sem, "Sem 2") && Objects.equals(dep, "ICT")){
                        pst = conn.prepareStatement("SELECT mon, tue, wed, thu, fri from l4s2ict where time = ?");
                        pst.setString(1, tm);
                        ResultSet rs = pst.executeQuery();

                        if (rs.next()) {

                            String mon = rs.getString(1);
                            String tue = rs.getString(2);
                            String wed = rs.getString(3);
                            String thu = rs.getString(4);
                            String fri = rs.getString(5);

                            Days_set( mon,tue, wed,thu,fri);

                        } else {
                            Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                            JOptionPane.showMessageDialog(null, "Invalid Time code");
                        }
                    }else if(Objects.equals(level, "Level 4") && Objects.equals(sem, "Sem 2") && Objects.equals(dep, "ET")){
                        pst = conn.prepareStatement("SELECT mon, tue, wed, thu, fri from l4s2et where time = ?");
                        pst.setString(1, tm);
                        ResultSet rs = pst.executeQuery();

                        if (rs.next()) {

                            String mon = rs.getString(1);
                            String tue = rs.getString(2);
                            String wed = rs.getString(3);
                            String thu = rs.getString(4);
                            String fri = rs.getString(5);

                            Days_set( mon,tue, wed,thu,fri);

                        } else {
                            Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                            JOptionPane.showMessageDialog(null, "Invalid Time code");
                        }
                    }else if(Objects.equals(level, "Level 4") && Objects.equals(sem, "Sem 2") && Objects.equals(dep, "BST")){
                        pst = conn.prepareStatement("SELECT mon, tue, wed, thu, fri from l4s2bst where time = ?");
                        pst.setString(1, tm);
                        ResultSet rs = pst.executeQuery();

                        if (rs.next()) {

                            String mon = rs.getString(1);
                            String tue = rs.getString(2);
                            String wed = rs.getString(3);
                            String thu = rs.getString(4);
                            String fri = rs.getString(5);

                            Days_set( mon,tue, wed,thu,fri);

                        } else {
                            Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                            JOptionPane.showMessageDialog(null, "Invalid Time code");
                        }
                    }else if(Objects.equals(level, "Level 4") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "ICT")){
                        pst = conn.prepareStatement("SELECT mon, tue, wed, thu, fri from l4s1ict where time = ?");
                        pst.setString(1, tm);
                        ResultSet rs = pst.executeQuery();

                        if (rs.next()) {

                            String mon = rs.getString(1);
                            String tue = rs.getString(2);
                            String wed = rs.getString(3);
                            String thu = rs.getString(4);
                            String fri = rs.getString(5);

                            Days_set( mon,tue, wed,thu,fri);

                        } else {
                            Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                            JOptionPane.showMessageDialog(null, "Invalid Time code");
                        }
                    }else if(Objects.equals(level, "Level 4") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "ET")){
                        pst = conn.prepareStatement("SELECT mon, tue, wed, thu, fri from l4s1et where time = ?");
                        pst.setString(1, tm);
                        ResultSet rs = pst.executeQuery();

                        if (rs.next()) {

                            String mon = rs.getString(1);
                            String tue = rs.getString(2);
                            String wed = rs.getString(3);
                            String thu = rs.getString(4);
                            String fri = rs.getString(5);

                            Days_set( mon,tue, wed,thu,fri);

                        } else {
                            Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                            JOptionPane.showMessageDialog(null, "Invalid Time code");
                        }
                    }else if(Objects.equals(level, "Level 4") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "BST")){
                        pst = conn.prepareStatement("SELECT mon, tue, wed, thu, fri from l4s1bst where time = ?");
                        pst.setString(1, tm);
                        ResultSet rs = pst.executeQuery();

                        if (rs.next()) {

                            String mon = rs.getString(1);
                            String tue = rs.getString(2);
                            String wed = rs.getString(3);
                            String thu = rs.getString(4);
                            String fri = rs.getString(5);

                            Days_set( mon,tue, wed,thu,fri);

                        } else {
                            Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                            JOptionPane.showMessageDialog(null, "Invalid Time code");
                        }
                    }

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        //UPDATE BTN
        btn_update_TT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String time, mon, tue, wed, thu, fri, level, sem, dep;

                    time = txt_tm.getText();
                    mon = txtMon.getText();
                    tue = txtTue.getText();
                    wed = txtWed.getText();
                    thu = txtThu.getText();
                    fri = txtFri.getText();
                    level = (String) txtLevel.getSelectedItem();
                    sem = (String) txtSem.getSelectedItem();
                    dep = (String) txtDept.getSelectedItem();

                    //L1 S1 BST
                    boolean b = time.isEmpty() || mon.isEmpty() || tue.isEmpty() || wed.isEmpty() || thu.isEmpty() || fri.isEmpty();
                    if(Objects.equals(level, "Level 1") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "BST")){

                        pst = conn.prepareStatement("UPDATE l1s1bst SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                        pst.setString(1, mon);
                        pst.setString(2, tue);
                        pst.setString(3, wed);
                        pst.setString(4, thu);
                        pst.setString(5, fri);
                        pst.setString(6, time);

                        if(b){
                            JOptionPane.showMessageDialog(null, "---Time Table Record Not Updated---");
                        }else if(pst.executeUpdate()==1){
                            JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                            l1s1bst_load();
                        }
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }else if(Objects.equals(level, "Level 1") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "ICT")){

                        pst = conn.prepareStatement("UPDATE l1s1ict SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                        pst.setString(1, mon);
                        pst.setString(2, tue);
                        pst.setString(3, wed);
                        pst.setString(4, thu);
                        pst.setString(5, fri);
                        pst.setString(6, time);

                        if(b){
                            JOptionPane.showMessageDialog(null, "---Time Table Record Not Updated---");
                        }else if(pst.executeUpdate()==1){
                            JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                            l1s1ict_load();
                        }

                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }else if(Objects.equals(level, "Level 1") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "ET")){

                        pst = conn.prepareStatement("UPDATE l1s1et SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                        pst.setString(1, mon);
                        pst.setString(2, tue);
                        pst.setString(3, wed);
                        pst.setString(4, thu);
                        pst.setString(5, fri);
                        pst.setString(6, time);

                        if(b){
                            JOptionPane.showMessageDialog(null, "---Time Table Record Not Updated---");
                        }else if(pst.executeUpdate()==1){
                            JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                            l1s1et_load();
                        }

                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }else if(Objects.equals(level, "Level 1") && Objects.equals(sem, "Sem 2") && Objects.equals(dep, "ICT")){

                        pst = conn.prepareStatement("UPDATE l1s2ict SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                        pst.setString(1, mon);
                        pst.setString(2, tue);
                        pst.setString(3, wed);
                        pst.setString(4, thu);
                        pst.setString(5, fri);
                        pst.setString(6, time);

                        if(b){
                            JOptionPane.showMessageDialog(null, "---Time Table Record Not Updated---");
                        }else if(pst.executeUpdate()==1){
                            JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                            l1s2ict_load();
                        }
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }else if(Objects.equals(level, "Level 1") && Objects.equals(sem, "Sem 2") && Objects.equals(dep, "BST")){

                        pst = conn.prepareStatement("UPDATE l1s2bst SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                        pst.setString(1, mon);
                        pst.setString(2, tue);
                        pst.setString(3, wed);
                        pst.setString(4, thu);
                        pst.setString(5, fri);
                        pst.setString(6, time);

                        if(b){
                            JOptionPane.showMessageDialog(null, "---Time Table Record Not Updated---");
                        }else if(pst.executeUpdate()==1){
                            JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                            l1s2bst_load();
                        }
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }else if(Objects.equals(level, "Level 1") && Objects.equals(sem, "Sem 2") && Objects.equals(dep, "ET")){

                        pst = conn.prepareStatement("UPDATE l1s2et SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                        pst.setString(1, mon);
                        pst.setString(2, tue);
                        pst.setString(3, wed);
                        pst.setString(4, thu);
                        pst.setString(5, fri);
                        pst.setString(6, time);

                        if(b){
                            JOptionPane.showMessageDialog(null, "---Time Table Record Not Updated---");
                        }else if(pst.executeUpdate()==1){
                            JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                            l1s2et_load();
                        }
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }else if(Objects.equals(level, "Level 2") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "ICT")){

                        pst = conn.prepareStatement("UPDATE l2s1ict SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                        pst.setString(1, mon);
                        pst.setString(2, tue);
                        pst.setString(3, wed);
                        pst.setString(4, thu);
                        pst.setString(5, fri);
                        pst.setString(6, time);

                        if(b){
                            JOptionPane.showMessageDialog(null, "---Time Table Record Not Updated---");
                        }else if(pst.executeUpdate()==1){
                            JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                            l2s1ict_load();
                        }
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }else if(Objects.equals(level, "Level 2") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "ET")){

                        pst = conn.prepareStatement("UPDATE l2s1et SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                        pst.setString(1, mon);
                        pst.setString(2, tue);
                        pst.setString(3, wed);
                        pst.setString(4, thu);
                        pst.setString(5, fri);
                        pst.setString(6, time);

                        if(b){
                            JOptionPane.showMessageDialog(null, "---Time Table Record Not Updated---");
                        }else if(pst.executeUpdate()==1){
                            JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                            l2s1et_load();
                        }
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }else if(Objects.equals(level, "Level 2") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "BST")){

                        pst = conn.prepareStatement("UPDATE l2s1bst SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                        pst.setString(1, mon);
                        pst.setString(2, tue);
                        pst.setString(3, wed);
                        pst.setString(4, thu);
                        pst.setString(5, fri);
                        pst.setString(6, time);

                        if(b){
                            JOptionPane.showMessageDialog(null, "---Time Table Record Not Updated---");
                        }else if(pst.executeUpdate()==1){
                            JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                            l2s1bst_load();
                        }
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }else if(Objects.equals(level, "Level 2") && Objects.equals(sem, "Sem 2") && Objects.equals(dep, "ICT")){

                        pst = conn.prepareStatement("UPDATE l2s2ict SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                        pst.setString(1, mon);
                        pst.setString(2, tue);
                        pst.setString(3, wed);
                        pst.setString(4, thu);
                        pst.setString(5, fri);
                        pst.setString(6, time);

                        if(b){
                            JOptionPane.showMessageDialog(null, "---Time Table Record Not Updated---");
                        }else if(pst.executeUpdate()==1){
                            JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                            l2s2ict_load();
                        }
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }else if(Objects.equals(level, "Level 2") && Objects.equals(sem, "Sem 2") && Objects.equals(dep, "ET")){

                        pst = conn.prepareStatement("UPDATE l2s2et SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                        pst.setString(1, mon);
                        pst.setString(2, tue);
                        pst.setString(3, wed);
                        pst.setString(4, thu);
                        pst.setString(5, fri);
                        pst.setString(6, time);

                        if(b){
                            JOptionPane.showMessageDialog(null, "---Time Table Record Not Updated---");
                        }else if(pst.executeUpdate()==1){
                            JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                            l2s2et_load();
                        }
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }else if(Objects.equals(level, "Level 2") && Objects.equals(sem, "Sem 2") && Objects.equals(dep, "BST")){

                        pst = conn.prepareStatement("UPDATE l2s2bst SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                        pst.setString(1, mon);
                        pst.setString(2, tue);
                        pst.setString(3, wed);
                        pst.setString(4, thu);
                        pst.setString(5, fri);
                        pst.setString(6, time);

                        if(b){
                            JOptionPane.showMessageDialog(null, "---Time Table Record Not Updated---");
                        }else if(pst.executeUpdate()==1){
                            JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                            l2s2bst_load();
                        }
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }else if(Objects.equals(level, "Level 3") && Objects.equals(sem, "Sem 2") && Objects.equals(dep, "BST")){

                        pst = conn.prepareStatement("UPDATE l3s2bst SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                        pst.setString(1, mon);
                        pst.setString(2, tue);
                        pst.setString(3, wed);
                        pst.setString(4, thu);
                        pst.setString(5, fri);
                        pst.setString(6, time);

                        if(b){
                            JOptionPane.showMessageDialog(null, "---Time Table Record Not Updated---");
                        }else if(pst.executeUpdate()==1){
                            JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                            l3s2bst_load();
                        }
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }else if(Objects.equals(level, "Level 3") && Objects.equals(sem, "Sem 2") && Objects.equals(dep, "ICT")){

                        pst = conn.prepareStatement("UPDATE l3s2ict SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                        pst.setString(1, mon);
                        pst.setString(2, tue);
                        pst.setString(3, wed);
                        pst.setString(4, thu);
                        pst.setString(5, fri);
                        pst.setString(6, time);

                        if(b){
                            JOptionPane.showMessageDialog(null, "---Time Table Record Not Updated---");
                        }else if(pst.executeUpdate()==1){
                            JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                            l3s2ict_load();
                        }
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }else if(Objects.equals(level, "Level 3") && Objects.equals(sem, "Sem 2") && Objects.equals(dep, "ET")){

                        pst = conn.prepareStatement("UPDATE l3s2et SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                        pst.setString(1, mon);
                        pst.setString(2, tue);
                        pst.setString(3, wed);
                        pst.setString(4, thu);
                        pst.setString(5, fri);
                        pst.setString(6, time);

                        if(b){
                            JOptionPane.showMessageDialog(null, "---Time Table Record Not Updated---");
                        }else if(pst.executeUpdate()==1){
                            JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                            l3s2et_load();
                        }
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }else if(Objects.equals(level, "Level 3") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "BST")){

                        pst = conn.prepareStatement("UPDATE l3s1bst SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                        pst.setString(1, mon);
                        pst.setString(2, tue);
                        pst.setString(3, wed);
                        pst.setString(4, thu);
                        pst.setString(5, fri);
                        pst.setString(6, time);

                        if(b){
                            JOptionPane.showMessageDialog(null, "---Time Table Record Not Updated---");
                        }else if(pst.executeUpdate()==1){
                            JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                            l3s1bst_load();
                        }
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }else if(Objects.equals(level, "Level 3") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "ICT")){

                        pst = conn.prepareStatement("UPDATE l3s1ict SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                        pst.setString(1, mon);
                        pst.setString(2, tue);
                        pst.setString(3, wed);
                        pst.setString(4, thu);
                        pst.setString(5, fri);
                        pst.setString(6, time);

                        if(b){
                            JOptionPane.showMessageDialog(null, "---Time Table Record Not Updated---");
                        }else if(pst.executeUpdate()==1){
                            JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                            l3s1ict_load();
                        }
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }else if(Objects.equals(level, "Level 3") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "ET")){

                        pst = conn.prepareStatement("UPDATE l3s1et SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                        pst.setString(1, mon);
                        pst.setString(2, tue);
                        pst.setString(3, wed);
                        pst.setString(4, thu);
                        pst.setString(5, fri);
                        pst.setString(6, time);

                        if(b){
                            JOptionPane.showMessageDialog(null, "---Time Table Record Not Updated---");
                        }else if(pst.executeUpdate()==1){
                            JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                            l3s1et_load();
                        }
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }else if(Objects.equals(level, "Level 4") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "ICT")){

                        pst = conn.prepareStatement("UPDATE l4s1ict SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                        pst.setString(1, mon);
                        pst.setString(2, tue);
                        pst.setString(3, wed);
                        pst.setString(4, thu);
                        pst.setString(5, fri);
                        pst.setString(6, time);

                        if(b){
                            JOptionPane.showMessageDialog(null, "---Time Table Record Not Updated---");
                        }else if(pst.executeUpdate()==1){
                            JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                            l4s1ict_load();
                        }
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }else if(Objects.equals(level, "Level 4") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "BST")){

                        pst = conn.prepareStatement("UPDATE l4s1bst SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                        pst.setString(1, mon);
                        pst.setString(2, tue);
                        pst.setString(3, wed);
                        pst.setString(4, thu);
                        pst.setString(5, fri);
                        pst.setString(6, time);

                        if(b){
                            JOptionPane.showMessageDialog(null, "---Time Table Record Not Updated---");
                        }else if(pst.executeUpdate()==1){
                            JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                            l4s1bst_load();
                        }
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }else if(Objects.equals(level, "Level 4") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "ET")){

                        pst = conn.prepareStatement("UPDATE l4s1et SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                        pst.setString(1, mon);
                        pst.setString(2, tue);
                        pst.setString(3, wed);
                        pst.setString(4, thu);
                        pst.setString(5, fri);
                        pst.setString(6, time);

                        if(b){
                            JOptionPane.showMessageDialog(null, "---Time Table Record Not Updated---");
                        }else if(pst.executeUpdate()==1){
                            JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                            l4s1et_load();
                        }
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }else if(Objects.equals(level, "Level 4") && Objects.equals(sem, "Sem 2") && Objects.equals(dep, "ET")){

                        pst = conn.prepareStatement("UPDATE l4s2et SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                        pst.setString(1, mon);
                        pst.setString(2, tue);
                        pst.setString(3, wed);
                        pst.setString(4, thu);
                        pst.setString(5, fri);
                        pst.setString(6, time);

                        if(b){
                            JOptionPane.showMessageDialog(null, "---Time Table Record Not Updated---");
                        }else if(pst.executeUpdate()==1){
                            JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                            l4s2et_load();
                        }
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }else if(Objects.equals(level, "Level 4") && Objects.equals(sem, "Sem 2") && Objects.equals(dep, "ICT")){

                        pst = conn.prepareStatement("UPDATE l4s2ict SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                        pst.setString(1, mon);
                        pst.setString(2, tue);
                        pst.setString(3, wed);
                        pst.setString(4, thu);
                        pst.setString(5, fri);
                        pst.setString(6, time);

                        if(b){
                            JOptionPane.showMessageDialog(null, "---Time Table Record Not Updated---");
                        }else if(pst.executeUpdate()==1){
                            JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                            l4s2ict_load();
                        }
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }else if(Objects.equals(level, "Level 4") && Objects.equals(sem, "Sem 2") && Objects.equals(dep, "BST")){

                        pst = conn.prepareStatement("UPDATE l4s2bst SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                        pst.setString(1, mon);
                        pst.setString(2, tue);
                        pst.setString(3, wed);
                        pst.setString(4, thu);
                        pst.setString(5, fri);
                        pst.setString(6, time);

                        if(b){
                            JOptionPane.showMessageDialog(null, "---Time Table Record Not Updated---");
                        }else if(pst.executeUpdate()==1){
                            JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                            l4s2bst_load();
                        }
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        //DELETE ROW DATA // L1 S1 BST
        btn_delete_TT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time,level,sem,dep,mon,tue,wed,thu,fri;
                mon=txtMon.getText();
                tue=txtTue.getText();
                wed= txtWed.getText();
                thu=txtThu.getText();
                fri=txtFri.getText();
                time = txt_tm.getText();
                level = (String) txtLevel.getSelectedItem();
                sem = (String) txtSem.getSelectedItem();
                dep = (String) txtDept.getSelectedItem();

                try {
                    boolean b = time.isEmpty() || mon.isEmpty() || tue.isEmpty() || wed.isEmpty() || thu.isEmpty() || fri.isEmpty();
                    if(Objects.equals(level, "Level 1") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "BST")) {
                        pst = conn.prepareStatement("DELETE FROM l1s1bst WHERE time = ?");
                        pst.setString(1, time);
                        if(b){
                            JOptionPane.showMessageDialog(null, "---Record NOT Deleted From L1 S1 BST Time table---");
                        }else if(pst.executeUpdate()==1){
                            JOptionPane.showMessageDialog(null, "Record Deleted From L1 S1 BST Time table");
                            l1s1bst_load();
                        }
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }else if(Objects.equals(level, "Level 1") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "ICT")) {
                        pst = conn.prepareStatement("DELETE FROM l1s1ict WHERE time = ?");
                        pst.setString(1, time);
                        if(b){
                            JOptionPane.showMessageDialog(null, "---Record NOT Deleted From L1 S1 ICT Time table---");
                        }else if(pst.executeUpdate()==1){
                            JOptionPane.showMessageDialog(null, "Record Deleted From L1 S1 ICT Time table");
                            l1s1ict_load();
                        }
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }else if(Objects.equals(level, "Level 1") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "ET")) {
                        pst = conn.prepareStatement("DELETE FROM l1s1et WHERE time = ?");
                        pst.setString(1, time);
                        if(b){
                            JOptionPane.showMessageDialog(null, "---Record NOT Deleted From L1 S1 ET Time table---");
                        }else if(pst.executeUpdate()==1){
                            JOptionPane.showMessageDialog(null, "Record Deleted From L1 S1 ET Time table");
                            l1s1et_load();
                        }
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }else if(Objects.equals(level, "Level 1") && Objects.equals(sem, "Sem 2") && Objects.equals(dep, "ICT")) {
                        pst = conn.prepareStatement("DELETE FROM l121ict WHERE time = ?");
                        pst.setString(1, time);
                        if(b){
                            JOptionPane.showMessageDialog(null, "---Record NOT Deleted From L1 S2 ICT Time table---");
                        }else if(pst.executeUpdate()==1){
                            JOptionPane.showMessageDialog(null, "Record Deleted From L1 S2 ICT Time table");
                            l1s2ict_load();
                        }
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }else if(Objects.equals(level, "Level 1") && Objects.equals(sem, "Sem 2") && Objects.equals(dep, "BST")) {
                        pst = conn.prepareStatement("DELETE FROM l1s2bst WHERE time = ?");
                        pst.setString(1, time);
                        if(b){
                            JOptionPane.showMessageDialog(null, "---Record NOT Deleted From L1 S2 BST Time table---");
                        }else if(pst.executeUpdate()==1){
                            JOptionPane.showMessageDialog(null, "Record Deleted From L1 S2 BST Time table");
                            l1s2bst_load();
                        }
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }else if(Objects.equals(level, "Level 1") && Objects.equals(sem, "Sem 2") && Objects.equals(dep, "ET")) {
                        pst = conn.prepareStatement("DELETE FROM l1s2et WHERE time = ?");
                        pst.setString(1, time);
                        if(b){
                            JOptionPane.showMessageDialog(null, "---Record NOT Deleted From L1 S2 ET Time table---");
                        }else if(pst.executeUpdate()==1){
                            JOptionPane.showMessageDialog(null, "Record Deleted From L1 S2 ET Time table");
                            l1s2et_load();
                        }
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }else if(Objects.equals(level, "Level 2") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "ET")) {
                        pst = conn.prepareStatement("DELETE FROM l2s1et WHERE time = ?");
                        pst.setString(1, time);
                        if(b){
                            JOptionPane.showMessageDialog(null, "---Record NOT Deleted From L2 S1 ET Time table---");
                        }else if(pst.executeUpdate()==1){
                            JOptionPane.showMessageDialog(null, "Record Deleted From L2 S1 ET Time table");
                            l2s1et_load();
                        }
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }else if(Objects.equals(level, "Level 2") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "BST")) {
                        pst = conn.prepareStatement("DELETE FROM l2s1bst WHERE time = ?");
                        pst.setString(1, time);
                        if(b){
                            JOptionPane.showMessageDialog(null, "---Record NOT Deleted From L2 S1 BST Time table---");
                        }else if(pst.executeUpdate()==1){
                            JOptionPane.showMessageDialog(null, "Record Deleted From L2 S1 BST Time table");
                            l2s1bst_load();
                        }
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }else if(Objects.equals(level, "Level 2") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "ICT")) {
                        pst = conn.prepareStatement("DELETE FROM l2s1ict WHERE time = ?");
                        pst.setString(1, time);
                        if(b){
                            JOptionPane.showMessageDialog(null, "---Record NOT Deleted From L2 S1 ICT Time table---");
                        }else if(pst.executeUpdate()==1){
                            JOptionPane.showMessageDialog(null, "Record Deleted From L2 S1 ICT Time table");
                            l2s1ict_load();
                        }
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }else if(Objects.equals(level, "Level 2") && Objects.equals(sem, "Sem 2") && Objects.equals(dep, "ICT")) {
                        pst = conn.prepareStatement("DELETE FROM l2s2ict WHERE time = ?");
                        pst.setString(1, time);
                        if(b){
                            JOptionPane.showMessageDialog(null, "---Record NOT Deleted From L2 S2 ICT Time table---");
                        }else if(pst.executeUpdate()==1){
                            JOptionPane.showMessageDialog(null, "Record Deleted From L2 S2 ICT Time table");
                            l2s2ict_load();
                        }
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }else if(Objects.equals(level, "Level 2") && Objects.equals(sem, "Sem 2") && Objects.equals(dep, "BST")) {
                        pst = conn.prepareStatement("DELETE FROM l2s2bst WHERE time = ?");
                        pst.setString(1, time);
                        if(b){
                            JOptionPane.showMessageDialog(null, "---Record NOT Deleted From L2 S2 BST Time table---");
                        }else if(pst.executeUpdate()==1){
                            JOptionPane.showMessageDialog(null, "Record Deleted From L2 S2 BST Time table");
                            l2s2bst_load();
                        }
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }else if(Objects.equals(level, "Level 2") && Objects.equals(sem, "Sem 2") && Objects.equals(dep, "ET")) {
                        pst = conn.prepareStatement("DELETE FROM l2s2et WHERE time = ?");
                        pst.setString(1, time);
                        if(b){
                            JOptionPane.showMessageDialog(null, "---Record NOT Deleted From L2 S2 ET Time table---");
                        }else if(pst.executeUpdate()==1){
                            JOptionPane.showMessageDialog(null, "Record Deleted From L2 S2 ET Time table");
                            l2s2et_load();
                        }
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }else if(Objects.equals(level, "Level 3") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "ICT")) {
                        pst = conn.prepareStatement("DELETE FROM l3s1ict WHERE time = ?");
                        pst.setString(1, time);
                        if(b){
                            JOptionPane.showMessageDialog(null, "---Record NOT Deleted From L3 S1 ICT Time table---");
                        }else if(pst.executeUpdate()==1){
                            JOptionPane.showMessageDialog(null, "Record Deleted From L3 S1 ICT Time table");
                            l3s1ict_load();
                        }
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }else if(Objects.equals(level, "Level 3") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "BST")) {
                        pst = conn.prepareStatement("DELETE FROM l3s1bst WHERE time = ?");
                        pst.setString(1, time);
                        if(b){
                            JOptionPane.showMessageDialog(null, "---Record NOT Deleted From L3 S1 BST Time table---");
                        }else if(pst.executeUpdate()==1){
                            JOptionPane.showMessageDialog(null, "Record Deleted From L3 S1 BST Time table");
                            l3s1bst_load();
                        }
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }else if(Objects.equals(level, "Level 3") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "ET")) {
                        pst = conn.prepareStatement("DELETE FROM l3s1et WHERE time = ?");
                        pst.setString(1, time);
                        if(b){
                            JOptionPane.showMessageDialog(null, "---Record NOT Deleted From L3 S1 ET Time table---");
                        }else if(pst.executeUpdate()==1){
                            JOptionPane.showMessageDialog(null, "Record Deleted From L3 S1 ET Time table");
                            l3s1et_load();
                        }
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }else if(Objects.equals(level, "Level 3") && Objects.equals(sem, "Sem 2") && Objects.equals(dep, "ICT")) {
                        pst = conn.prepareStatement("DELETE FROM l3s2ict WHERE time = ?");
                        pst.setString(1, time);
                        if(b){
                            JOptionPane.showMessageDialog(null, "---Record NOT Deleted From L3 S2 ICT Time table---");
                        }else if(pst.executeUpdate()==1){
                            JOptionPane.showMessageDialog(null, "Record Deleted From L3 S2 ICT Time table");
                            l3s2ict_load();
                        }
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }else if(Objects.equals(level, "Level 3") && Objects.equals(sem, "Sem 2") && Objects.equals(dep, "BST")) {
                        pst = conn.prepareStatement("DELETE FROM l3s2bst WHERE time = ?");
                        pst.setString(1, time);
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Record Deleted From L3 S2 BST Time table");
                        l3s2bst_load();

                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }else if(Objects.equals(level, "Level 3") && Objects.equals(sem, "Sem 2") && Objects.equals(dep, "ET")) {
                        pst = conn.prepareStatement("DELETE FROM l3s2et WHERE time = ?");
                        pst.setString(1, time);
                        if(b){
                            JOptionPane.showMessageDialog(null, "---Record NOT Deleted From L3 S2 ET Time table---");
                        }else if(pst.executeUpdate()==1){
                            JOptionPane.showMessageDialog(null, "Record Deleted From L3 S2 ET Time table");
                            l3s2et_load();
                        }
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }else if(Objects.equals(level, "Level 4") && Objects.equals(sem, "Sem 2") && Objects.equals(dep, "ICT")) {
                        pst = conn.prepareStatement("DELETE FROM l4s2ict WHERE time = ?");
                        pst.setString(1, time);
                        if(b){
                            JOptionPane.showMessageDialog(null, "---Record NOT Deleted From L4 S2 ICT Time table---");
                        }else if(pst.executeUpdate()==1){
                            JOptionPane.showMessageDialog(null, "Record Deleted From L4 S2 ICT Time table");
                            l4s2ict_load();
                        }
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }else if(Objects.equals(level, "Level 4") && Objects.equals(sem, "Sem 2") && Objects.equals(dep, "BST")) {
                        pst = conn.prepareStatement("DELETE FROM l4s2bst WHERE time = ?");
                        pst.setString(1, time);
                        if(b){
                            JOptionPane.showMessageDialog(null, "---Record NOT Deleted From L4 S2 BST Time table---");
                        }else if(pst.executeUpdate()==1){
                            JOptionPane.showMessageDialog(null, "Record Deleted From L4 S2 BST Time table");
                            l4s2bst_load();
                        }
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }else if(Objects.equals(level, "Level 4") && Objects.equals(sem, "Sem 2") && Objects.equals(dep, "ET")) {
                        pst = conn.prepareStatement("DELETE FROM l4s2et WHERE time = ?");
                        pst.setString(1, time);
                        if(b){
                            JOptionPane.showMessageDialog(null, "---Record NOT Deleted From L4 S2 ET Time table---");
                        }else if(pst.executeUpdate()==1){
                            JOptionPane.showMessageDialog(null, "Record Deleted From L4 S2 ET Time table");
                            l4s2et_load();
                        }
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }else if(Objects.equals(level, "Level 4") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "ICT")) {
                        pst = conn.prepareStatement("DELETE FROM l4s1ict WHERE time = ?");
                        pst.setString(1, time);
                        if(b){
                            JOptionPane.showMessageDialog(null, "---Record NOT Deleted From L4 S1 ICT Time table---");
                        }else if(pst.executeUpdate()==1){
                            JOptionPane.showMessageDialog(null, "Record Deleted From L4 S1 ICT Time table");
                            l4s1ict_load();
                        }
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }else if(Objects.equals(level, "Level 4") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "BST")) {
                        pst = conn.prepareStatement("DELETE FROM l4s1bst WHERE time = ?");
                        pst.setString(1, time);
                        if(b){
                            JOptionPane.showMessageDialog(null, "---Record NOT Deleted From L4 S1 BST Time table---");
                        }else if(pst.executeUpdate()==1){
                            JOptionPane.showMessageDialog(null, "Record Deleted From L4 S1 BST Time table");
                            l4s1bst_load();
                        }
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }else if(Objects.equals(level, "Level 4") && Objects.equals(sem, "Sem 1") && Objects.equals(dep, "ET")) {
                        pst = conn.prepareStatement("DELETE FROM l4s1et WHERE time = ?");
                        pst.setString(1, time);
                        if(b){
                            JOptionPane.showMessageDialog(null, "---Record NOT Deleted From L4 S1 ET Time table---");
                        }else if(pst.executeUpdate()==1){
                            JOptionPane.showMessageDialog(null, "Record Deleted From L4 S1 ET Time table");
                            l4s1et_load();
                        }
                        Empty_set(txt_tm,txtMon,txtTue,txtWed,txtThu,txtFri);
                    }
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        /* ---------------------------------------- TIME TABLES END ----------------------------------------  */
        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LoginPage("Siyam");
                dispose();
            }
        });
    }
    private void Empty_set(JTextField txtTm, JTextField txtMon, JTextField txtTue, JTextField txtWed, JTextField txtThu, JTextField txtFri) {
        txt_tm.setText("");
        txtMon.setText("");
        txtTue.setText("");
        txtWed.setText("");
        txtThu.setText("");
        txtFri.setText("");
    }
    private void Days_set(String mon, String tue, String wed, String thu, String fri) {
        txtMon.setText(mon);
        txtTue.setText(tue);
        txtWed.setText(wed);
        txtThu.setText(thu);
        txtFri.setText(fri);
    }
    //tm tbl loads
    private void l4s2et_load() {   //L4 S2 ET Table
        try {
            pst = conn.prepareStatement("SELECT * FROM l4s2et");
            ResultSet rs = pst.executeQuery();
            table8.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void l4s2ict_load() {   //L4 S2 ICT Table
        try {
            pst = conn.prepareStatement("SELECT * FROM l4s2ict");
            ResultSet rs = pst.executeQuery();
            table8.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void l4s2bst_load() {    //L4 S2 BST Table
        try {
            pst = conn.prepareStatement("SELECT * FROM l4s2bst");
            ResultSet rs = pst.executeQuery();
            table8.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void l4s1et_load() {   //L4 S1 ET Table
        try {
            pst = conn.prepareStatement("SELECT * FROM l4s1et");
            ResultSet rs = pst.executeQuery();
            table8.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void l4s1ict_load() {   //L4 S1 ICT Table
        try {
            pst = conn.prepareStatement("SELECT * FROM l4s1ict");
            ResultSet rs = pst.executeQuery();
            table8.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void l4s1bst_load() {    //L4 S1 BST Table
        try {
            pst = conn.prepareStatement("SELECT * FROM l4s1bst");
            ResultSet rs = pst.executeQuery();
            table8.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void l3s2et_load() {   //L3 S2 ET Table
        try {
            pst = conn.prepareStatement("SELECT * FROM l3s2et");
            ResultSet rs = pst.executeQuery();
            table8.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void l3s2ict_load() {   //L3 S2 ICT Table
        try {
            pst = conn.prepareStatement("SELECT * FROM l3s2ict");
            ResultSet rs = pst.executeQuery();
            table8.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void l3s2bst_load() {    //L3 S2 BST Table
        try {
            pst = conn.prepareStatement("SELECT * FROM l3s2bst");
            ResultSet rs = pst.executeQuery();
            table8.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void l3s1et_load() {   //L3 S1 ET Table
        try {
            pst = conn.prepareStatement("SELECT * FROM l3s1et");
            ResultSet rs = pst.executeQuery();
            table8.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void l3s1ict_load() {   //L3 S1 ICT Table
        try {
            pst = conn.prepareStatement("SELECT * FROM l3s1ict");
            ResultSet rs = pst.executeQuery();
            table8.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void l3s1bst_load() {    //L3 S1 BST Table
        try {
            pst = conn.prepareStatement("SELECT * FROM l3s1bst");
            ResultSet rs = pst.executeQuery();
            table8.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void l2s2et_load() {   //L2 S2 ET Table
        try {
            pst = conn.prepareStatement("SELECT * FROM l2s2et");
            ResultSet rs = pst.executeQuery();
            table8.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void l2s2ict_load() {   //L2 S2 ICT Table
        try {
            pst = conn.prepareStatement("SELECT * FROM l2s2ict");
            ResultSet rs = pst.executeQuery();
            table8.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void l2s2bst_load() {    //L2 S2 BST Table
        try {
            pst = conn.prepareStatement("SELECT * FROM l2s2bst");
            ResultSet rs = pst.executeQuery();
            table8.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void l2s1et_load() {   //L2 S1 ET Table
        try {
            pst = conn.prepareStatement("SELECT * FROM l2s1et");
            ResultSet rs = pst.executeQuery();
            table8.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void l2s1ict_load() {   //L2 S1 ICT Table
        try {
            pst = conn.prepareStatement("SELECT * FROM l2s1ict");
            ResultSet rs = pst.executeQuery();
            table8.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void l2s1bst_load() {    //L2 S1 BST Table
        try {
            pst = conn.prepareStatement("SELECT * FROM l2s1bst");
            ResultSet rs = pst.executeQuery();
            table8.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void l1s2et_load() {   //L1 S2 ICT Table
        try {
            pst = conn.prepareStatement("SELECT * FROM l1s2et");
            ResultSet rs = pst.executeQuery();
            table8.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void l1s2ict_load() {   //L1 S2 ICT Table
        try {
            pst = conn.prepareStatement("SELECT * FROM l1s2ict");
            ResultSet rs = pst.executeQuery();
            table8.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void l1s2bst_load() {    //L1 S2 BST Table
        try {
            pst = conn.prepareStatement("SELECT * FROM l1s2bst");
            ResultSet rs = pst.executeQuery();
            table8.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void l1s1et_load() {   //L1 S1 ET Table
        try {
            pst = conn.prepareStatement("SELECT * FROM l1s1et");
            ResultSet rs = pst.executeQuery();
            table8.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void l1s1ict_load() {   //L1 S1 ICT Table
        try {
            pst = conn.prepareStatement("SELECT * FROM l1s1ict");
            ResultSet rs = pst.executeQuery();
            table8.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void l1s1bst_load() {    //L1 S1 BST Table
        try {
            pst = conn.prepareStatement("SELECT * FROM l1s1bst");
            ResultSet rs = pst.executeQuery();
            table8.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //TABLE UPDATE METHODS
    private void table2_load() {    //STUDENT table
        try {
            pst = conn.prepareStatement("SELECT Std_id,Fname,Lname,Sex,Pno,Email,DOB,Address,Department FROM student");
            ResultSet rs = pst.executeQuery();
            table2.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void table3_load() {    //lecturer table
        try {
            pst = conn.prepareStatement("SELECT Lec_id,Fname,Lname,Sex,Pno,Email,DOB,username FROM lecturer");
            ResultSet rs = pst.executeQuery();
            table3.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void table4_load() {    //ADMIN TABLE
        try {
            pst = conn.prepareStatement("SELECT Ad_id,Fname,Lname,Sex,Pno,Email,DOB FROM admin");
            ResultSet rs = pst.executeQuery();
            table4.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void table5_load() {    //TECH OFFICER TABLE
        try {
            pst = conn.prepareStatement("SELECT * FROM tecofficer");
            ResultSet rs = pst.executeQuery();
            table5.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void table6_load() {    //NOTICE TABLE
        try {
            pst = conn.prepareStatement("SELECT * FROM notice");
            ResultSet rs = pst.executeQuery();
            table6.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void Notice(){
        try {
            pst = conn.prepareStatement("SELECT Notice_no,date,headline,message FROM notice");
            ResultSet rs = pst.executeQuery();
            tbl_Notice.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void table1_load() {
        try {
            pst = conn.prepareStatement("SELECT * FROM course");
            ResultSet rs = pst.executeQuery();
            table1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Admin an =new Admin("siyam");
        LMSdb_siyam db = new LMSdb_siyam();
    }
}
package com.lms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


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
    private JComboBox txtgender;
    private JTable table2;
    private JPasswordField txtpw;
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
    private JTextField txtnoticedetrails;
    private JTextArea txtAreaNotice;
    private JButton btnaddnotice;
    private JButton btnupdatenotice;
    private JButton btndeletenotice;
    private JButton getInfoButton;
    private JTable table6;
    private JTable table7;
    private JTextField txtstdid;
    private JTextField txtfname;
    private JTextField txtlname;
    private JTextField txtdob;
    private JTextField txtphn;
    private JTextField txtemail;
    private JButton btnregister;
    private JButton btnupdate;
    private JButton btndelete;
    private JButton btngetdetails;
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
    private JPasswordField txtpwAdm;
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

//        maleRadioButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                gender = "M";
//                maleRadioButton.setSelected(true);
//                femaleRadioButton.setSelected(false);
//            }
//        });
//        femaleRadioButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                gender = "F";
//                femaleRadioButton.setSelected(true);
//                maleRadioButton.setSelected(false);
//            }
//        });


        /* -----------------------------STRTNG USER PROFLE------------------------------------- */

        //SEARCH AND ASSGN DETALS TO THE FEILDS
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
//        try{
//            ResultSet rs1 = null;
//            String sql = "select * from admin where Ad_id= " + Ad_id;
//            PreparedStatement pst = conn.prepareStatement(sql);
//            rs1 = pst.executeQuery(sql);
//            while (rs1.next()) {
//                //pst.setString(1,txt_search.getText());
//                String add1 = rs1.getString("Fname");
//                String add2 = rs1.getString("Lname");
//               // txtShowName.setText(add1+" "+add2);
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }

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

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Updated");
                    //table_load();

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

        /* -----------------------------STARTING USER MAINTAIN------------------------------------- */

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




    }

    public static void main(String[] args) {
        Admin an =new Admin("siyam");

    }
}

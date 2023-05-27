package com.lms;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static net.proteanit.sql.DbUtils.resultSetToTableModel;


public class Lecturer extends JFrame {

    Connection conn = null;
    ResultSet rs = null;
    String s;
    PreparedStatement pst = null;
    private JPanel tecMainPane;
    private JButton contactButton;
    private JButton courseDetailsButton;
    private JButton gradesAndGPAButton;
    private JPanel jMain;
    private JPanel contactDtl;
    private JPanel medDtls;
    private JPanel profileEdit;
    private JPanel courseDtls;
    private JPanel uploadMarks;
    private JPanel Notice;
    private JButton logoutButton;
    private JLabel uNametxt;
    private JButton btn_Upload_marks;
    private JButton btn_Notices;
    private JButton btn_Add_materials;
    private JButton btn_Profile;
    private JButton mediButt;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JPanel mangeAtt;
    private JTextField textStdID;
    private JButton searchButton;
    private JTable tableAtt;
    private JTable tblMedi;
    private JButton btn_Show_marks;
    private JButton btn_Attendance;
    private JButton btn_Medical;
    private JButton btn_Check_eligibilty;
    private JButton btn_Student_details;
    private JPanel showMarks;
    private JPanel checkEligibilty;
    private JPanel studentDetails;
    private JPanel addMaterials;
    private JTabbedPane tabbedPane1;
    private JTextField lastname;
    private JTextField firstname;
    private JTextField emBox;
    private JTextField Date_of_Birth;
    private JTextField textLecPho;
    private JLabel detLecId;
    private JLabel ffName;
    private JLabel llName;
    private JLabel lecDOB;
    private JLabel eMail;
    private JLabel pNumber;
    private JComboBox comboCourseCod;
    private JTextField txtLectureId;
    private JTextArea textDesArea;
    private JTextField textAddMat;
    private JButton browserButton;
    private JButton addButton;
    private JComboBox comboBox3;
    private JTabbedPane tabbedPane2;
    private JComboBox subCod;
    private JTextField stuId;
    private JTextField mak;
    private JButton quizMarks;
    private JButton clearButton4;
    private JComboBox subjCod;
    private JTextField textStudId;
    private JComboBox assSelect;
    private JTextField textAssesMarks;
    private JButton assessmentsMarks;
    private JButton clearButton1;
    private JTextField textMidMaark;
    private JComboBox subjCode;
    private JTextField txtStuId;
    private JButton midMarks;
    private JButton clearButton2;
    private JTextField theStudId;
    private JTextField therMarks;
    private JButton finTheMark;
    private JButton clearButton3;
    private JComboBox finTheo;
    private JButton updateButton;
    private JButton finalPracticalMarks;
    private JComboBox qui;
    private JComboBox finPracSubCod;
    private JTextField finalStudId;
    private JTextField finalMarks;
    private JTextField idStu;
    private JButton searchButton2;
    private JTable table1;
    private JTabbedPane tabbedPane3;
    private JTable table2;
    private JScrollPane tablee1;
    private JLabel fName1;
    private JLabel lName1;
    private JLabel pNum;
    private JLabel eeMail;
    private JLabel adde;
    private JLabel dob2;
    private JLabel depe;
    private JScrollPane notTab;
    private JTextField fNametxt;
    private JTextField lNameTxt;
    private JTextField pNoTxt;
    private JTextField eMailTxt;
    private JTextField addTxt;
    private JTextField dobTxt;
    private JTextField depTxt;
    private JButton finalClear;
    private JScrollPane atteTabl;

    public int countPresent = 0;
    public String gender;
    public String StdID;

    public String Status;

    public Lecturer(String title) {
        super(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(tecMainPane);
        this.pack();
        setVisible(true);
        conn = LMSdb_siyam.java_db();
        lacture_details();
        lactureShowDetailsShows();
        tableStudent();
        tableNotice();
        tableAtten();
        tableMedi();
        //table_load();

        btn_Student_details.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jMain.removeAll();
                jMain.repaint();
                jMain.revalidate();

                jMain.add(studentDetails);
                //j3.removeAll();
                jMain.repaint();
                jMain.revalidate();
                btn_Notices.setBackground(new Color(174, 196, 255));
                btn_Upload_marks.setBackground(new Color(174, 196, 255));
                btn_Profile.setBackground(new Color(174, 196, 255));
                btn_Add_materials.setBackground(new Color(174, 196, 255));
                btn_Student_details.setBackground(new Color(25, 118, 250));
                btn_Medical.setBackground(new Color(174, 196, 255));
                btn_Show_marks.setBackground(new Color(174, 196, 255));
                btn_Check_eligibilty.setBackground(new Color(174, 196, 255));
                btn_Attendance.setBackground(new Color(174, 196, 255));

                btn_Student_details.setForeground(Color.white);
                btn_Notices.setForeground(Color.black);
                btn_Upload_marks.setForeground(Color.black);
                btn_Profile.setForeground(Color.black);
                btn_Add_materials.setForeground(Color.black);
                btn_Medical.setForeground(Color.black);
                btn_Show_marks.setForeground(Color.black);
                btn_Attendance.setForeground(Color.black);
                btn_Check_eligibilty.setForeground(Color.black);
            }

        });



        btn_Add_materials.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jMain.removeAll();
                jMain.repaint();
                jMain.revalidate();

                jMain.add(addMaterials);
                //j3.removeAll();
                jMain.repaint();
                jMain.revalidate();
                btn_Notices.setBackground(new Color(174, 196, 255));
                btn_Upload_marks.setBackground(new Color(174, 196, 255));
                btn_Profile.setBackground(new Color(174, 196, 255));
                btn_Add_materials.setBackground(new Color(25, 118, 250));
                btn_Student_details.setBackground(new Color(174, 196, 255));
                btn_Medical.setBackground(new Color(174, 196, 255));
                btn_Show_marks.setBackground(new Color(174, 196, 255));
                btn_Check_eligibilty.setBackground(new Color(174, 196, 255));
                btn_Attendance.setBackground(new Color(174, 196, 255));

                btn_Student_details.setForeground(Color.black);
                btn_Notices.setForeground(Color.black);
                btn_Upload_marks.setForeground(Color.black);
                btn_Profile.setForeground(Color.black);
                btn_Add_materials.setForeground(Color.white);
                btn_Medical.setForeground(Color.black);
                btn_Show_marks.setForeground(Color.black);
                btn_Attendance.setForeground(Color.black);
                btn_Check_eligibilty.setForeground(Color.black);
            }
        });
        btn_Upload_marks.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jMain.removeAll();
                jMain.repaint();
                jMain.revalidate();

                jMain.add(uploadMarks);
                //j3.removeAll();
                jMain.repaint();
                jMain.revalidate();
                btn_Notices.setBackground(new Color(174, 196, 255));
                btn_Upload_marks.setBackground(new Color(25, 118, 250));
                btn_Profile.setBackground(new Color(174, 196, 255));
                btn_Add_materials.setBackground(new Color(174, 196, 255));
                btn_Student_details.setBackground(new Color(174, 196, 255));
                btn_Medical.setBackground(new Color(174, 196, 255));
                btn_Show_marks.setBackground(new Color(174, 196, 255));
                btn_Check_eligibilty.setBackground(new Color(174, 196, 255));
                btn_Attendance.setBackground(new Color(174, 196, 255));

                btn_Student_details.setForeground(Color.black);
                btn_Notices.setForeground(Color.black);
                btn_Upload_marks.setForeground(Color.white);
                btn_Profile.setForeground(Color.black);
                btn_Add_materials.setForeground(Color.black);
                btn_Medical.setForeground(Color.black);
                btn_Show_marks.setForeground(Color.black);
                btn_Attendance.setForeground(Color.black);
                btn_Check_eligibilty.setForeground(Color.black);
            }
        });
        btn_Show_marks.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jMain.removeAll();
                jMain.repaint();
                jMain.revalidate();

                jMain.add(showMarks);
                //j3.removeAll();
                jMain.repaint();
                jMain.revalidate();
                btn_Notices.setBackground(new Color(174, 196, 255));
                btn_Upload_marks.setBackground(new Color(174, 196, 255));
                btn_Profile.setBackground(new Color(174, 196, 255));
                btn_Add_materials.setBackground(new Color(174, 196, 255));
                btn_Student_details.setBackground(new Color(174, 196, 255));
                btn_Medical.setBackground(new Color(174, 196, 255));
                btn_Show_marks.setBackground(new Color(25, 118, 250));
                btn_Check_eligibilty.setBackground(new Color(174, 196, 255));
                btn_Attendance.setBackground(new Color(174, 196, 255));

                btn_Student_details.setForeground(Color.black);
                btn_Notices.setForeground(Color.black);
                btn_Upload_marks.setForeground(Color.black);
                btn_Profile.setForeground(Color.black);
                btn_Add_materials.setForeground(Color.black);
                btn_Medical.setForeground(Color.black);
                btn_Show_marks.setForeground(Color.white);
                btn_Attendance.setForeground(Color.black);
                btn_Check_eligibilty.setForeground(Color.black);
            }
        });
        btn_Attendance.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jMain.removeAll();
                jMain.repaint();
                jMain.revalidate();

                jMain.add(mangeAtt);
                //j3.removeAll();
                jMain.repaint();
                jMain.revalidate();
                btn_Notices.setBackground(new Color(174, 196, 255));
                btn_Upload_marks.setBackground(new Color(174, 196, 255));
                btn_Profile.setBackground(new Color(174, 196, 255));
                btn_Add_materials.setBackground(new Color(174, 196, 255));
                btn_Student_details.setBackground(new Color(174, 196, 255));
                btn_Medical.setBackground(new Color(174, 196, 255));
                btn_Show_marks.setBackground(new Color(174, 196, 255));
                btn_Check_eligibilty.setBackground(new Color(174, 196, 255));
                btn_Attendance.setBackground(new Color(25, 118, 250));

                btn_Student_details.setForeground(Color.black);
                btn_Notices.setForeground(Color.black);
                btn_Upload_marks.setForeground(Color.black);
                btn_Profile.setForeground(Color.black);
                btn_Add_materials.setForeground(Color.black);
                btn_Medical.setForeground(Color.black);
                btn_Show_marks.setForeground(Color.black);
                btn_Attendance.setForeground(Color.white);
                btn_Check_eligibilty.setForeground(Color.black);
            }
        });
        btn_Medical.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jMain.removeAll();
                jMain.repaint();
                jMain.revalidate();

                jMain.add(medDtls);
                //j3.removeAll();
                jMain.repaint();
                jMain.revalidate();
                btn_Notices.setBackground(new Color(174, 196, 255));
                btn_Upload_marks.setBackground(new Color(174, 196, 255));
                btn_Profile.setBackground(new Color(174, 196, 255));
                btn_Add_materials.setBackground(new Color(174, 196, 255));
                btn_Student_details.setBackground(new Color(174, 196, 255));
                btn_Medical.setBackground(new Color(25, 118, 250));
                btn_Show_marks.setBackground(new Color(174, 196, 255));
                btn_Check_eligibilty.setBackground(new Color(174, 196, 255));
                btn_Attendance.setBackground(new Color(174, 196, 255));

                btn_Student_details.setForeground(Color.black);
                btn_Notices.setForeground(Color.black);
                btn_Upload_marks.setForeground(Color.black);
                btn_Profile.setForeground(Color.black);
                btn_Add_materials.setForeground(Color.black);
                btn_Medical.setForeground(Color.white);
                btn_Show_marks.setForeground(Color.black);
                btn_Attendance.setForeground(Color.black);
                btn_Check_eligibilty.setForeground(Color.black);
            }
        });
        btn_Check_eligibilty.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jMain.removeAll();
                jMain.repaint();
                jMain.revalidate();

                jMain.add(checkEligibilty);
                //j3.removeAll();
                jMain.repaint();
                jMain.revalidate();
                btn_Notices.setBackground(new Color(174, 196, 255));
                btn_Upload_marks.setBackground(new Color(174, 196, 255));
                btn_Profile.setBackground(new Color(174, 196, 255));
                btn_Add_materials.setBackground(new Color(174, 196, 255));
                btn_Student_details.setBackground(new Color(174, 196, 255));
                btn_Medical.setBackground(new Color(174, 196, 255));
                btn_Show_marks.setBackground(new Color(174, 196, 255));
                btn_Check_eligibilty.setBackground(new Color(25, 118, 250));
                btn_Attendance.setForeground(new Color(174, 196, 255));

                btn_Student_details.setForeground(Color.black);
                btn_Notices.setForeground(Color.black);
                btn_Upload_marks.setForeground(Color.black);
                btn_Profile.setForeground(Color.black);
                btn_Add_materials.setForeground(Color.black);
                btn_Medical.setForeground(Color.black);
                btn_Show_marks.setForeground(Color.black);
                btn_Attendance.setForeground(Color.black);
                btn_Check_eligibilty.setForeground(Color.white);
            }
        });
        btn_Notices.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jMain.removeAll();
                jMain.repaint();
                jMain.revalidate();

                jMain.add(Notice);
                //j3.removeAll();
                jMain.repaint();
                jMain.revalidate();
                btn_Notices.setBackground(new Color(25, 118, 250));
                btn_Upload_marks.setBackground(new Color(174, 196, 255));
                btn_Profile.setBackground(new Color(174, 196, 255));
                btn_Add_materials.setBackground(new Color(174, 196, 255));
                btn_Student_details.setBackground(new Color(174, 196, 255));
                btn_Medical.setBackground(new Color(174, 196, 255));
                btn_Show_marks.setBackground(new Color(174, 196, 255));
                btn_Check_eligibilty.setBackground(new Color(174, 196, 255));
                btn_Attendance.setForeground(new Color(174, 196, 255));

                btn_Student_details.setForeground(Color.black);
                btn_Notices.setForeground(Color.white);
                btn_Upload_marks.setForeground(Color.black);
                btn_Profile.setForeground(Color.black);
                btn_Add_materials.setForeground(Color.black);
                btn_Medical.setForeground(Color.black);
                btn_Show_marks.setForeground(Color.black);
                btn_Attendance.setForeground(Color.black);
                btn_Check_eligibilty.setForeground(Color.black);
            }
        });
        btn_Profile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jMain.removeAll();
                jMain.repaint();
                jMain.revalidate();

                jMain.add(profileEdit);
                //j3.removeAll();
                jMain.repaint();
                jMain.revalidate();
                btn_Notices.setBackground(new Color(174, 196, 255));
                btn_Upload_marks.setBackground(new Color(174, 196, 255));
                btn_Profile.setBackground(new Color(25, 118, 250));
                btn_Add_materials.setBackground(new Color(174, 196, 255));
                btn_Student_details.setBackground(new Color(174, 196, 255));
                btn_Medical.setBackground(new Color(174, 196, 255));
                btn_Show_marks.setBackground(new Color(174, 196, 255));
                btn_Check_eligibilty.setBackground(new Color(174, 196, 255));
                btn_Attendance.setForeground(new Color(174, 196, 255));

                btn_Student_details.setForeground(Color.black);
                btn_Notices.setForeground(Color.black);
                btn_Upload_marks.setForeground(Color.black);
                btn_Profile.setForeground(Color.white);
                btn_Add_materials.setForeground(Color.black);
                btn_Medical.setForeground(Color.black);
                btn_Show_marks.setForeground(Color.black);
                btn_Attendance.setForeground(Color.black);
                btn_Check_eligibilty.setForeground(Color.black);
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

        //add materials

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String LecId = txtLectureId.getText();
                    String subCode = (String) comboCourseCod.getSelectedItem();
                    String des = textDesArea.getText();


                    pst = conn.prepareStatement("INSERT INTO addmetrialsdetails(Lec_id,Course_Code,Description,Matrial)"+ "Value(?,?,?,?)");
                    InputStream is = new FileInputStream(new File(s));
                    pst.setString(1,LecId);
                    pst.setString(2,subCode);
                    pst.setString(3,des);
                    pst.setBlob(4,is);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Data Insert....");
                }

                catch(Exception ex){
                    ex.printStackTrace();
                }
            }
        });

        //Browser Search
        browserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    JFileChooser fileChooser = new JFileChooser();
                    fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
                    FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE,*.PDF","jpg","gif","png","txt","pdf");
                    fileChooser.addChoosableFileFilter(filter);
                    int result = fileChooser.showSaveDialog(null);

                    if(result == JFileChooser.APPROVE_OPTION){

                        File selectedFile;
                        selectedFile = fileChooser.getSelectedFile();
                        String path = selectedFile.getAbsolutePath();
                        s=path;
                        textAddMat.setText(s);
                    }

                    else if (result == JFileChooser.CANCEL_OPTION){
                        JOptionPane.showMessageDialog(null,"No Data");
                    }
                }catch (Exception f){
                    System.out.println(f.getMessage());
                }

            }
        });

        // Quiz Marks Update..
        quizMarks.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String subCode = (String) subCod.getSelectedItem();
                String studentID = stuId.getText();
                String quizMarks = (String) qui.getSelectedItem();
                String qMarks = mak.getText();
                //System.out.println("You select " + quizMarks);

                if(quizMarks == "Quiz01"){
                    try {

                        pst = conn.prepareStatement("UPDATE marks set Quiz01= ? where Std_id = ? && Course_code = ? ");
                        pst.setString(1,qMarks);
                        pst.setString(2,studentID);
                        pst.setString(3,subCode);


                        pst.executeUpdate();

                        JOptionPane.showMessageDialog(null,"Quiz01 Marks Uploaded..!!!");
                        //show_CAmarks();
                        stuId.setText("");
                        mak.setText("");
                        stuId.requestFocus();

                    }

                    catch(SQLException e1){
                        e1.printStackTrace();

                    }



                }
                else if (quizMarks == "Quiz02") {

                    try {

                        pst = conn.prepareStatement("UPDATE marks set Quiz02= ? where Std_id = ? && Course_code = ? ");
                        pst.setString(1,qMarks);
                        pst.setString(2,studentID);
                        pst.setString(3,subCode);


                        pst.executeUpdate();

                        JOptionPane.showMessageDialog(null,"Quiz02 Marks Uploaded..!!!");
                        //show_CAmarks();
                        stuId.setText("");
                        mak.setText("");
                        stuId.requestFocus();

                    }

                    catch(SQLException e1){
                        e1.printStackTrace();

                    }



                } else if (quizMarks == "Quiz03") {

                    try {

                        pst = conn.prepareStatement("UPDATE marks set Quiz03= ? where Std_id = ? && Course_code = ? ");
                        pst.setString(1,qMarks);
                        pst.setString(2,studentID);
                        pst.setString(3,subCode);


                        pst.executeUpdate();

                        JOptionPane.showMessageDialog(null,"Quiz03 Marks Uploaded..!!!");
                        //show_CAmarks();
                        stuId.setText("");
                        mak.setText("");
                        stuId.requestFocus();

                    }

                    catch(SQLException e1){
                        e1.printStackTrace();

                    }

                }

                else {
                    if(subCode == "ICT02"){
                        try {

                            pst = conn.prepareStatement("UPDATE marks set Quiz04= ? where Std_id = ? && Course_code = ? ");
                            pst.setString(1,qMarks);
                            pst.setString(2,studentID);
                            pst.setString(3,subCode);


                            pst.executeUpdate();

                            JOptionPane.showMessageDialog(null,"Quiz04 Marks Uploaded..!!!");
                            //show_CAmarks();
                            //table_load();
                            stuId.setText("");
                            mak.setText("");
                            stuId.requestFocus();

                        }

                        catch(SQLException e1){
                            e1.printStackTrace();

                        }
                    }
                }
            }
        });
        assessmentsMarks.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String subCode = (String) subjCod.getSelectedItem();
                String stuId = textStudId.getText();
                String asseSele = (String) assSelect.getSelectedItem();
                String assesMarks = textAssesMarks.getText();

                if(subCode != "ICT01"){
                    if(asseSele == "Assessments01"){
                        try {
                            /*
                            String sql;
                            sql = "INSERT INTO marks(Course_code,Std_id,Assesment01)" +
                                    "VALUES(?,?,?)";
                            pst = con.prepareStatement(sql);

                             */
                            pst = conn.prepareStatement("UPDATE marks set Assesment01= ? where Std_id = ? && Course_code = ? ");
                            pst.setString(1,assesMarks);
                            pst.setString(2, subCode);
                            pst.setString(3,stuId);



                            pst.executeUpdate();

                            JOptionPane.showMessageDialog(null,"Assessment01 Marks Uploaded..!!!");
                           // show_CAmarks();
                            textStudId.setText("");
                            textAssesMarks.setText("");
                            textStudId.requestFocus();

                        }

                        catch(SQLException e1){
                            e1.printStackTrace();

                        }



                    } else if (asseSele == "Assessments02") {
                        try {
                            pst = conn.prepareStatement("UPDATE marks set Assesment02= ? where Std_id = ? && Course_code = ? ");
                            pst.setString(1,assesMarks);
                            pst.setString(2, subCode);
                            pst.setString(3,stuId);

                            pst.executeUpdate();

                            JOptionPane.showMessageDialog(null,"Assessment02 Marks Uploaded..!!!");
                            //show_CAmarks();
                            textStudId.setText("");
                            textAssesMarks.setText("");
                            textStudId.requestFocus();

                        }

                        catch(SQLException e1){
                            e1.printStackTrace();

                        }
                    }

                    else {
                        JOptionPane.showMessageDialog(null,"Please select the assessment box...!!");
                    }

                }

                else {
                    JOptionPane.showMessageDialog(null,"ICT 01 Don't have Assessments...!11");
                }
            }
        });

        //Mid marks Add
        midMarks.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String subCode = (String) subjCode.getSelectedItem();
                String studId = txtStuId.getText();
                String midMark = textMidMaark.getText();

                if(subCode != "ICT03"){
                    try{
                       /* String sql ;
                        sql = "INSERT INTO marks(Course_code,Std_id,Mid_term)" +
                                "VALUES(?,?,?)";
                        pst = con.prepareStatement(sql);

                        */

                        pst = conn.prepareStatement("UPDATE marks set Mid_term= ? where Std_id = ? && Course_code = ? ");
                        pst.setString(1,midMark);
                        pst.setString(2, subCode);
                        pst.setString(3,studId);

                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null,"Mid_term Marks Uploaded..!!!");
                        txtStuId.setText("");
                        textMidMaark.setText("");
                        txtStuId.requestFocus();
                    }

                    catch (SQLException e1){
                        e1.printStackTrace();

                    }
                }

                else {
                    JOptionPane.showMessageDialog(null,"ICT 03, ICT 04 Don't have Mid term MArks....!!! ");
                }
            }
        });

        //Final Theory Marks Add
        finTheMark.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String subCode = (String) finTheo.getSelectedItem();
                String studId = theStudId.getText();
                String finMark = therMarks.getText();

                try{
                    pst = conn.prepareStatement("UPDATE marks set Final_theory= ? where Std_id = ? && Course_code = ? ");
                    pst.setString(1,finMark);
                    pst.setString(2, subCode);
                    pst.setString(3,studId);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Final  Marks Uploaded..!!!");
                    theStudId.setText("");
                    textMidMaark.setText("");
                    therMarks.requestFocus();
                }

                catch (SQLException e1){
                    e1.printStackTrace();

                }
            }
        });

        //Final Practical Marks Add
        finalPracticalMarks.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String subCode = (String) finPracSubCod.getSelectedItem();
                String studId = finalStudId.getText();
                String finMark = finalMarks.getText();

                if (subCode != "ICT02"){
                    try{
                        pst = conn.prepareStatement("UPDATE marks set Final_practical= ? where Std_id = ? && Course_code = ? ");
                        pst.setString(1,finMark);
                        pst.setString(2, subCode);
                        pst.setString(3,studId);


                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null,"Final Practical Marks Uploaded..!!!");
                        finalStudId.setText("");
                        finalMarks.setText("");
                        finalStudId.requestFocus();
                    }

                    catch (SQLException e1){
                        e1.printStackTrace();

                    }
                }
                else {
                    JOptionPane.showMessageDialog(null,"ICT02 Don't have Final Practical Exam");
                }
            }
        });

        //Profile Details Update
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fName = firstname.getText();
                String lName = lastname.getText();
                String e_mail = emBox.getText();
                String DOB = Date_of_Birth.getText();

                //String lecId = String.valueOf(2);

                try {
                    pst = conn.prepareStatement("UPDATE lecturer set Fname = ?,Lname= ? ,Email= ?,DOB= ? where Lec_id = 2 ");
                    pst.setString(1,fName);
                    pst.setString(2,lName);
                    pst.setString(3,e_mail);
                    pst.setString(4,DOB);


                    // pst.setString(5,lecId);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Recoard Updated..!!!");
                   // table_load();
                    firstname.setText("");
                    lastname.setText("");
                    emBox.setText("");
                    Date_of_Birth.setText("");
                    firstname.requestFocus();

                }

                catch(SQLException e1){
                    e1.printStackTrace();

                }
            }
        });


        //Student Details Search button ...

        searchButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = idStu.getText();
                try{
                    pst = conn.prepareStatement("Select Fname,Lname,Email,Address,DOB,Department,Pno FROM student WHERE Std_id = ? ");
                    pst.setString(1,id);
                    ResultSet StuDetails = pst.executeQuery();

                    if(StuDetails.next() == true){
                        String fName = StuDetails.getString(1);
                        String lName = StuDetails.getString(2);
                        String eMail = StuDetails.getString(3);
                        String adder = StuDetails.getString(4);
                        String dob = StuDetails.getString(5);
                        String dep = StuDetails.getString(6);
                        String pNumber = StuDetails.getString(7);


                        fNametxt.setText(fName);
                        lNameTxt.setText(lName);
                        pNoTxt.setText(pNumber);
                        eMailTxt.setText(eMail);
                        addTxt.setText(adder);
                        dobTxt.setText(dob);
                        depTxt.setText( dep);
                    }




                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        // Quiz marks clear..
        clearButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stuId.setText("");
                mak.setText("");
                stuId.requestFocus();
            }
        });


        //Assessment clear ..
        clearButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textStudId.setText("");
                textAssesMarks.setText("");
                textStudId.requestFocus();
            }
        });

        //mid term clear ..
        clearButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtStuId.setText("");
                textMidMaark.setText("");
                txtStuId.requestFocus();
            }
        });

        //final theory clear ..
        clearButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theStudId.setText("");
                therMarks.setText("");
                theStudId.requestFocus();
            }
        });

        //final practical clear
        finalClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                finalStudId.setText("");
                finalMarks.setText("");
                finalStudId.requestFocus();
            }
        });
        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LoginPage("Lecture Form");
                dispose();
            }
        });

        //Search Student attendence...
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id;
                id = textStdID.getText();
                if(id.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please enter the Student Id..!");
                }
                else {
                    try {
                        pst = conn.prepareStatement("SELECT * FROM att_summ WHERE Std_id = ?");
                        pst.setString(1,id);
                        ResultSet atendenceDetails = pst.executeQuery();
                        tableAtt.setModel(DbUtils.resultSetToTableModel(atendenceDetails));


                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }

                }
            }
        });
    }


    // Lecture Details Shows...
    public void lacture_details(){
        try{
            pst = conn.prepareStatement("SELECT Lec_id,Fname,Lname,DOB,Email,Pno FROM lecturer WHERE Lec_id = 1");
            ResultSet lectDetails = pst.executeQuery();

            if(lectDetails.next() == true){
                String lecId = lectDetails.getString(1);
                String fName = lectDetails.getString(2);
                String lName = lectDetails.getString(3);
                String dob = lectDetails.getString(4);
                String email = lectDetails.getString(5);
                String no = lectDetails.getString(6);

                detLecId.setText("Lecture ID : " + lecId);
                ffName.setText("First Name : " +fName);
                llName.setText("Last Name : " + lName);
                lecDOB.setText("Date of Birth : " + dob);
                eMail.setText("E-Mail Address : " + email);
                pNumber.setText("Phone No : "+ no);

            }


        }

        catch(SQLException e){
            e.printStackTrace();

        }


    }

    //Lecture Details Update Shows

    public void lactureShowDetailsShows(){
        // String userName = String.valueOf(2);

        try {
            pst = conn.prepareStatement("SELECT Fname,Lname,Email,DOB,Pno FROM lecturer WHERE Lec_id = 1");
            // pst.setString(1, userName);
            ResultSet leDetails = pst.executeQuery();

            if (leDetails.next() == true) {
                String fName = leDetails.getString(1);
                String lName = leDetails.getString(2);
                String email = leDetails.getString(3);
                String dob = leDetails.getString(4);
                String pNo = leDetails.getString(5);

                firstname.setText(fName);
                lastname.setText(lName);
                emBox.setText(email);
                Date_of_Birth.setText(dob);
                textLecPho.setText(pNo);
                lacture_details();



            } else {
                firstname.setText("");
                lastname.setText("");
                emBox.setText("");
                Date_of_Birth.setText("");
                textLecPho.setText("");
                firstname.requestFocus();

            }
            lacture_details();
        }

        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void table_load(){
        try{
            pst = conn.prepareStatement("SELECT * FROM student");
            ResultSet stud_tab = pst.executeQuery();
            tablee1.setBorder((Border) resultSetToTableModel(stud_tab));
        }

        catch (SQLException e){
            JOptionPane.showMessageDialog(null,e);
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Lecturer lNew = new Lecturer("lNew");


    }

    //Student Details...
    public void tableStudent(){
        try{
            pst = conn.prepareStatement("SELECT Std_id,Pno,Fname,Lname,Email,DOB,Address,Department FROM student");
            ResultSet stud_tab = pst.executeQuery();
            table1.setModel(DbUtils.resultSetToTableModel(stud_tab));
        }

        catch (SQLException e){
            JOptionPane.showMessageDialog(null,e);
            e.printStackTrace();
        }
    }

    public void tableNotice(){
        try{
            pst = conn.prepareStatement("SELECT * FROM notice");
            ResultSet stud_tab = pst.executeQuery();
            table2.setModel(DbUtils.resultSetToTableModel(stud_tab));
        }

        catch (SQLException e){
            JOptionPane.showMessageDialog(null,e);
            e.printStackTrace();
        }
    }

    public void tableAtten(){
        try{
            pst = conn.prepareStatement("SELECT * FROM attendance");
            ResultSet stud_tab = pst.executeQuery();
            tableAtt.setModel(DbUtils.resultSetToTableModel(stud_tab));
        }

        catch (SQLException e){
            JOptionPane.showMessageDialog(null,e);
            e.printStackTrace();
        }
    }

    //Medical Details data...
    public void tableMedi(){
        try{
            pst = conn.prepareStatement("SELECT * FROM medical");
            ResultSet mediTable = pst.executeQuery();
            tblMedi.setModel(DbUtils.resultSetToTableModel(mediTable));
        }

        catch (SQLException e){
            JOptionPane.showMessageDialog(null,e);
            e.printStackTrace();
        }
    }





}



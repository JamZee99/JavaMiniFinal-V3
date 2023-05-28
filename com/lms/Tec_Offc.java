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


public class Tec_Offc extends JFrame {

    Connection conn = null;
    ResultSet rs = null;
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
    private JPanel time;
    private JPanel Notice;
    private JButton logoutButton;
    private JLabel uNametxt;
    private JButton timetablesButton;
    private JButton noticesButton;
    private JButton manageAttBut;
    private JButton profileButton;
    private JButton mediButt;
    private JTextField textFname;
    private JTextField textLname;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JTextField textDOB;
    private JTextField textPno;
    private JTextField textEmail;
    private JLabel txtFname;
    private JLabel txtLname;
    private JPanel mangeAtt;
    private JTextField textstdID;
    private JTextField textDate;
    private JTextField textLevel;
    private JTextField textCode;
    private JTextField textType;
    private JTextField textStdID;
    private JButton searchButton;
    private JTable tableAtt;
    private JComboBox comboBox1;
    private JTextField searchDate;
    private JTextField searchCode;
    private JButton DELETEButton;
    private JButton ADDButton;
    private JButton MODIFYButton;
    private JTextField searchAtt;
    private JTextField txtStartDate;
    private JTextField txtEndDate;
    private JTextField txtStdID;
    private JTextField txtCourseID;
    private JTextField searchMedi_ID;
    private JTextField searchStudent_ID;
    private JButton btnAdd;
    private JButton btnDelete;
    private JTable tblMedi;
    private JComboBox comboBox2;
    private JButton btnModify;
    private JButton btnSearch;
    private JButton searchMed;
    private JTable tblNotice;
    private JButton searchButton1;
    private JTextField textNotID;
    private JComboBox lvl;
    private JComboBox sem;
    private JTable table1;
    private JButton scr;
    private JComboBox dep;
    private JButton btn;
    private JTextField tecid;
    private JButton sbtn;
    private JTextField textAdd;

    public int countPresent = 0;
    public JComboBox gender;
    private JTextField attID;
    private JButton CLEARButton;
    private JTextField txtSeeachAttID;
    private JTextField txtSearchStdID;
    public String StdID;

    public String fname,lname;

    public String Status;
    public int check;

    private int sid;


    public Tec_Offc(String title,String tecID) {
        super(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(tecMainPane);
        this.pack();
        setVisible(true);
        conn = LMSdb.java_db();
        attTable();
        medTable();
        notTable();
        attSum(sid);

        try {
            pst = conn.prepareStatement("SELECT Fname,Lname FROM tecofficer where Tec_id =?");
            pst.setString(1,tecID);
            ResultSet rs = pst.executeQuery();
            String fnameT = null;
            String lnameT = null;
            while (rs.next())
            {
                fnameT=rs.getString("Fname");
                lnameT=rs.getString("Lname");
            }

            uNametxt.setText(fnameT+" "+lnameT);

        }catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        manageAttBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jMain.removeAll();
                jMain.repaint();
                jMain.revalidate();

                jMain.add(mangeAtt);
                //j3.removeAll();
                jMain.repaint();
                jMain.revalidate();
                noticesButton.setBackground(new Color(174, 196, 255));
                timetablesButton.setBackground(new Color(174, 196, 255));
                profileButton.setBackground(new Color(174, 196, 255));
                manageAttBut.setBackground(new Color(25, 118, 250));
                mediButt.setBackground(new Color(174, 196, 255));

                noticesButton.setForeground(Color.black);
                timetablesButton.setForeground(Color.black);
                profileButton.setForeground(Color.black);
                manageAttBut.setForeground(Color.white);
                mediButt.setForeground(Color.black);
            }
        });
        profileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jMain.removeAll();
                jMain.repaint();
                jMain.revalidate();

                jMain.add(profileEdit);
                //j3.removeAll();
                jMain.repaint();
                jMain.revalidate();
                noticesButton.setBackground(new Color(174, 196, 255));
                timetablesButton.setBackground(new Color(174, 196, 255));
                profileButton.setBackground(new Color(25, 118, 250));
                manageAttBut.setBackground(new Color(174, 196, 255));
                mediButt.setBackground(new Color(174, 196, 255));

                noticesButton.setForeground(Color.black);
                timetablesButton.setForeground(Color.black);
                profileButton.setForeground(Color.white);
                manageAttBut.setForeground(Color.black);
                mediButt.setForeground(Color.black);
            }
        });
        timetablesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jMain.removeAll();
                jMain.repaint();
                jMain.revalidate();

                jMain.add(time);
                //j3.removeAll();
                jMain.repaint();
                jMain.revalidate();
                noticesButton.setBackground(new Color(174, 196, 255));
                timetablesButton.setBackground(new Color(25, 118, 250));
                profileButton.setBackground(new Color(174, 196, 255));
                manageAttBut.setBackground(new Color(174, 196, 255));
                mediButt.setBackground(new Color(174, 196, 255));

                noticesButton.setForeground(Color.black);
                timetablesButton.setForeground(Color.white);
                profileButton.setForeground(Color.black);
                manageAttBut.setForeground(Color.black);
                mediButt.setForeground(Color.black);
            }
        });
        noticesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jMain.removeAll();
                jMain.repaint();
                jMain.revalidate();

                jMain.add(Notice);
                //j3.removeAll();
                jMain.repaint();
                jMain.revalidate();
                noticesButton.setBackground(new Color(25, 118, 250));
                timetablesButton.setBackground(new Color(174, 196, 255));
                profileButton.setBackground(new Color(174, 196, 255));
                manageAttBut.setBackground(new Color(174, 196, 255));
                mediButt.setBackground(new Color(174, 196, 255));

                noticesButton.setForeground(Color.white);
                timetablesButton.setForeground(Color.black);
                profileButton.setForeground(Color.black);
                manageAttBut.setForeground(Color.black);
                mediButt.setForeground(Color.black);
            }
        });


        mediButt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jMain.removeAll();
                jMain.repaint();
                jMain.revalidate();

                jMain.add(medDtls);
                //j3.removeAll();
                jMain.repaint();
                jMain.revalidate();
                noticesButton.setBackground(new Color(174, 196, 255));
                timetablesButton.setBackground(new Color(174, 196, 255));
                profileButton.setBackground(new Color(174, 196, 255));
                manageAttBut.setBackground(new Color(174, 196, 255));
                mediButt.setBackground(new Color(25, 118, 250));

                noticesButton.setForeground(Color.black);
                timetablesButton.setForeground(Color.black);
                profileButton.setForeground(Color.black);
                manageAttBut.setForeground(Color.black);
                mediButt.setForeground(Color.white);
            }
        });


        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                String AttID = txtSeeachAttID.getText();
                String sID = txtSearchStdID.getText();
                String sDate = textDate.getText();
                String Level = textLevel.getText();
                String sCode = textCode.getText();
                Status = Objects.requireNonNull(comboBox1.getSelectedItem()).toString();
                if (!(AttID.equals("")) && sID.equals("")) {
                    try {
                        pst = conn.prepareStatement("SELECT * FROM attendance WHERE Att_id=?");
                        pst.setString(1, AttID);
                        rs = pst.executeQuery();
                        while (rs.next()) {
                            String add1 = rs.getString("Std_id");
                            textstdID.setText(add1);
                            String add2 = rs.getString("Dates");
                            textDate.setText(add2);
                            String add3 = rs.getString("Level");
                            textLevel.setText(add3);
                            String add4 = rs.getString("Status");

                            if (Objects.equals(add4, "Present")) {
                                //comboBox1.setEnabled(true);
                                comboBox1.setSelectedIndex(1);
                            } else if (Objects.equals(add4, "Absent")) {
                                //comboBox1.setEnabled(true);
                                comboBox1.setSelectedIndex(2);
                            } else {
                                // comboBox1.setEnabled(true);
                                comboBox1.setSelectedIndex(3);
                            }

                            String add5 = rs.getString("Course_type");
                            textType.setText(add5);
                            String add6 = rs.getString("Course_code");
                            textCode.setText(add6);

                            //textStdID.setText(add1);
                            //searchDate.setText(add2);
                            //searchCode.setText(add6);
                            JOptionPane.showMessageDialog(null, "Founded");
                        }

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    } finally {

                        try {

                            rs.close();
                            pst.close();

                        } catch (Exception e) {

                        }
                    }
                    try {
                        pst = conn.prepareStatement("SELECT * FROM attendance WHERE Att_id=?");
                        pst.setString(1,AttID);
                        ResultSet rs = pst.executeQuery();
                        tableAtt.setModel(DbUtils.resultSetToTableModel(rs));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }else if (!(sID.equals("")) &&AttID.equals("") ) {

                    try {
                        pst = conn.prepareStatement("SELECT * FROM attendance WHERE Std_id=?");
                        pst.setString(1,sID);
                        ResultSet rs = pst.executeQuery();
                        tableAtt.setModel(DbUtils.resultSetToTableModel(rs));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Fill attendance id field only for edit or Student id field only for view");
                }
            }
        });

        ADDButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {

                String sID;

                //String aID;
                String adate;
                String alevel;
                String acc;
                String astatus;
                String atype;
                //aID = attID.getText();
                sID = textstdID.getText();
                adate = textDate.getText();
                alevel = textLevel.getText();
                acc = textCode.getText();
                atype = textType.getText();
                astatus = (String) comboBox1.getSelectedItem();

                try {
                    pst = conn.prepareStatement("SELECT Std_id,Dates,Course_code FROM attendance WHERE Std_id=? ");
                    pst.setString(1, sID);
                    rs = pst.executeQuery();

                    while (rs.next()) {
                        String Get1 = rs.getString("Dates");
                        String Get3 = rs.getString("Std_id");
                        String Get4 = rs.getString("Course_code");

                        boolean b = Objects.equals(Get1, adate) && Objects.equals(Get3, sID) && Objects.equals(Get4, acc);
                        if(b)
                        {
                            check = 1;
                        }
                        if(!(b)) {
                            check = 0;
                        }

                    }
                    if(check==0)
                    {
                        pst = conn.prepareStatement("INSERT INTO attendance(Std_id,Dates,Level,Course_code,Course_type,Status) VALUES (?,?,?,?,?,?)");

                        //pst.setString(1,aID);
                        pst.setString(1, sID);
                        pst.setString(2, adate);
                        pst.setString(3, alevel);
                        pst.setString(4, acc);
                        pst.setString(5, atype);
                        pst.setString(6, astatus);
                        if (sID.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Record NOT Updated");
                        } else {
                            pst.executeUpdate();
                            JOptionPane.showMessageDialog(null, "Record Updated successful");
                        }
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"Duplicate data");
                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                } finally {

                    try {

                        rs.close();
                        pst.close();

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);

                    }
                }


                attTable();



                /*String aID = textstdID.getText();
                String aDate = textDate.getText();
                String aCode = textCode.getText();
                String aLevel = textLevel.getText();
                String aType = textType.getText();
                Status = Objects.requireNonNull(comboBox1.getSelectedItem()).toString();
                if (!(aID.equals("") || aCode.equals("") || aDate.equals("") || aLevel.equals("") || aType.equals("") || Status.equals(""))) {
                    try {
                        pst = conn.prepareStatement("INSERT INTO attendance(Std_id,Dates,Level,Course_code,Course_type,Status) VALUES(?,?,?,?,?,?)");
                        pst.setString(1, aID);
                        pst.setString(2, aDate);
                        pst.setString(3, aLevel);
                        pst.setString(4, aCode);
                        pst.setString(5, aType);
                        pst.setString(6, Status);
                        pst.executeUpdate();
                        attTable();
                        JOptionPane.showMessageDialog(null, "Successfully inserted");
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                    finally {

                        try {

                            rs.close();
                            pst.close();

                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);

                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please fill all the fields");
                }*/
                sid = Integer.parseInt(sID);
                attSum(sid);
            }

        });

        DELETEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {


                //pst.setString(1,aID);
                String sID;
                try {
                    String aID;
                    String adate;
                    String alevel;
                    String acc;
                    String astatus;
                    String atype;
                    aID = txtSeeachAttID.getText();
                    sID = textstdID.getText();
                    adate = textDate.getText();
                    alevel = textLevel.getText();
                    acc = textCode.getText();
                    atype = textType.getText();
                    astatus = (String) comboBox1.getSelectedItem();

                    pst = conn.prepareStatement("DELETE FROM attendance WHERE Att_id=? AND Std_id=? AND Dates=? AND Level=? AND Course_code=? AND Course_type=? AND Status=? ");

                    pst.setString(1, aID);
                    pst.setString(2, sID);
                    pst.setString(3, adate);
                    pst.setString(4, alevel);
                    pst.setString(5, acc);
                    pst.setString(6, atype);
                    pst.setString(7, astatus);

                    if (sID.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Record NOT Deleted");
                    } else {
                        pst.executeUpdate();
                        attTable();
                        JOptionPane.showMessageDialog(null, "Record Deleted successful");
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                attTable();




                /*String aAtt_ID = searchAtt.getText();
                String aID = textstdID.getText();
                String aDate = textDate.getText();
                String aCode = textCode.getText();
                String aLevel = textLevel.getText();
                String aType = textType.getText();
                Status = Objects.requireNonNull(comboBox1.getSelectedItem()).toString();
                if (!(aID.equals("") || aCode.equals("") || aDate.equals("") || aLevel.equals("") || aType.equals("") || Status.equals(""))) {
                    try {
                        pst = conn.prepareStatement("DELETE FROM attendance WHERE Std_id=? AND Dates=? AND Level=? AND Course_code=? AND Course_type=? AND Status=? AND Att_id=?");
                        pst.setString(1, aID);
                        pst.setString(2, aDate);
                        pst.setString(3, aLevel);
                        pst.setString(4, aCode);
                        pst.setString(5, aType);
                        pst.setString(6, Status);
                        pst.setString(7,aAtt_ID);
                        pst.executeUpdate();
                        attTable();
                        textstdID.setText("");
                        textDate.setText("");
                        textCode.setText("");
                        textLevel.setText("");
                        textType.setText("");
                        comboBox1.setSelectedIndex(0);
                        JOptionPane.showMessageDialog(null, "Successfully Deleted ");
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                    finally {

                        try {

                            rs.close();
                            pst.close();

                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);

                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please fill all the fields");
                }*/
                sid = Integer.parseInt(sID);
                attSum(sid);
            }

        });

        MODIFYButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                try {
                    String  sID,aDate, aCode, aLevel, aType, aStatus;

                    //Att_ID = attID.getText();
                    sID = textstdID.getText();
                    aDate = textDate.getText();
                    aCode = textCode.getText();
                    aLevel = textLevel.getText();
                    aType = textType.getText();
                    aStatus = (String) comboBox1.getSelectedItem();

                    pst = conn.prepareStatement("UPDATE attendance SET Dates=?,Level=?,Course_type=?,Status=?,Course_code=? Where Std_id=?");

                    pst.setString(1, aDate);
                    pst.setString(2, aLevel);
                    pst.setString(3, aType);
                    pst.setString(4, aStatus);
                    pst.setString(6, sID);
                    pst.setString(5,aCode);


                    if (sID.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Record NOT Updated");
                    } else {
                        pst.executeUpdate();
                        attTable();
                        JOptionPane.showMessageDialog(null, "Record Updated successful");

                    }
                    sid = Integer.parseInt(sID);
                    attSum(sid);
                    attTable();

                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }













                /*Status = Objects.requireNonNull(comboBox1.getSelectedItem()).toString();
                if (!(aID.equals("") || aCode.equals("") || aDate.equals("") || aLevel.equals("") || aType.equals("") || Status.equals(""))) {
                    try {
                        pst = conn.prepareStatement("UPDATE attendance SET Std_id=?, Dates=?, Level=?, Course_code=?, Course_type=?, Status=? WHERE Att_id=" + Att_ID);
                        pst.setString(1, aID);
                        pst.setString(2, aDate);
                        pst.setString(3, aLevel);
                        pst.setString(4, aCode);
                        pst.setString(5, aType);
                        pst.setString(6, Status);
                        pst.executeUpdate();
                        attTable();
                        JOptionPane.showMessageDialog(null, "Successfully Modified ");

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                    finally {

                        try {

                            rs.close();
                            pst.close();

                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);

                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please fill all the fields");
                }*/

            }
        });
        btnSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {

                //String startDate = searchStartDate.getText();
                String stdID = searchStudent_ID.getText();


                if (!(stdID.equals(""))) {

                    try {
                        pst = conn.prepareStatement("SELECT * FROM medical WHERE Std_id=?");
                        pst.setString(1, stdID);
                        //pst.setString(2,startDate);
                        ResultSet rs = pst.executeQuery();
                        tblMedi.setModel(DbUtils.resultSetToTableModel(rs));
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    } finally {

                        try {

                            rs.close();
                            pst.close();

                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);

                        }
                    }
                } else {
                    medTable();
                    JOptionPane.showMessageDialog(null, "Fill the Student ID field");
                }
            }
        });
        searchMed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                String medID = searchMedi_ID.getText();
                if (!(medID.equals(""))) {
                    try {
                        pst = conn.prepareStatement("SELECT * FROM medical WHERE Med_id=? ");
                        pst.setString(1, medID);
                        rs = pst.executeQuery();

                        while (rs.next()) {
                            String Get1 = rs.getString("S_date");
                            txtStartDate.setText(Get1);
                            String Get2 = rs.getString("E_date");
                            txtEndDate.setText(Get2);
                            String Get3 = rs.getString("Std_id");
                            txtStdID.setText(Get3);
                            String Get4 = rs.getString("Course_id");
                            txtCourseID.setText(Get4);
                            String Get5 = rs.getString("Status");

                            if (Objects.equals(Get5, "Approved")) {
                                //comboBox1.setEnabled(true);
                                comboBox2.setSelectedIndex(1);
                            } else if (Objects.equals(Get5, "Cancelled")) {
                                //comboBox1.setEnabled(true);
                                comboBox2.setSelectedIndex(2);
                            } else {
                                // comboBox1.setEnabled(true);
                                comboBox2.setSelectedIndex(3);
                            }


                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    } finally {

                        try {

                            rs.close();
                            pst.close();

                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);

                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Fill the Medical ID field");
                }
            }
        });
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                String get1 = txtStartDate.getText();
                String get2 = txtEndDate.getText();
                String get3 = txtStdID.getText();
                String get4 = txtCourseID.getText();
                String status = (String) comboBox2.getSelectedItem();

                try {
                    pst = conn.prepareStatement("INSERT INTO medical(S_date,E_date,Std_id,Course_id,Status) VALUES (?,?,?,?,?)");
                    pst.setString(1, get1);
                    pst.setString(2, get2);
                    pst.setString(3, get3);
                    pst.setString(4, get4);
                    pst.setString(5, status);

                    pst.executeUpdate();
                    medTable();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                } finally {

                    try {

                        rs.close();
                        pst.close();

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);

                    }
                }
            }
        });
        btnModify.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {

                String get1 = txtStartDate.getText();
                String get2 = txtEndDate.getText();
                String get3 = txtStdID.getText();
                String get4 = txtCourseID.getText();
                String status = (String) comboBox2.getSelectedItem();
                String get5 = searchMedi_ID.getText();

                if (!(get5.equals(""))) {
                    try {
                        pst = conn.prepareStatement("UPDATE medical SET S_date= ?, E_date = ?, Std_id = ?,Course_id =? ,Status =? WHERE Med_id=?");
                        pst.setString(1, get1);
                        pst.setString(2, get2);
                        pst.setString(3, get3);
                        pst.setString(4, get4);
                        pst.setString(5, status);
                        pst.setString(6, get5);

                        pst.execute();
                        medTable();

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    } finally {

                        try {

                            rs.close();
                            pst.close();

                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);

                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please give medical ID");
                }
            }
        });
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {

                String get5 = searchMedi_ID.getText();

                if (!(get5.equals(""))) {
                    try {
                        pst = conn.prepareStatement("DELETE FROM medical WHERE Med_id=?");
                        pst.setString(1, get5);
                        pst.execute();
                        medTable();
                        txtStartDate.setText("");
                        txtEndDate.setText("");
                        txtStdID.setText("");
                        txtCourseID.setText("");
                        comboBox2.setSelectedIndex(0);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    } finally {

                        try {

                            rs.close();
                            pst.close();

                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);

                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please give medical ID before delete");
                }
            }
        });
        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginPage loginPage = new LoginPage("Login page");
                dispose();
            }
        });
        searchButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                String notID = textNotID.getText();
                if (notID.equals("")) {
                    try {
                        pst = conn.prepareStatement("SELECT * FROM notice");
                        ResultSet rs = pst.executeQuery();
                        tblNotice.setModel(DbUtils.resultSetToTableModel(rs));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        pst = conn.prepareStatement("SELECT * FROM notice WHERE notice_no=?");
                        pst.setString(1, notID);
                        ResultSet rs = pst.executeQuery();
                        tblNotice.setModel(DbUtils.resultSetToTableModel(rs));

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }

                }
            }

        });
        scr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String level, deprt, semester;

                level = (String) lvl.getSelectedItem();
                deprt = (String) dep.getSelectedItem();
                semester = (String) sem.getSelectedItem();

                try {
                    if (level == "Level 1" && deprt == "ICT" && semester == "1") {
                        pst = conn.prepareStatement("SELECT * FROM l1s1ict");
                        ResultSet rs = pst.executeQuery();
                        table1.setModel(DbUtils.resultSetToTableModel(rs));
                    } else if (level == "Level 1" && deprt == "ET" && semester == "1") {
                        pst = conn.prepareStatement("SELECT * FROM l1s1et");
                        ResultSet rs = pst.executeQuery();
                        table1.setModel(DbUtils.resultSetToTableModel(rs));
                    } else if (level == "Level 1" && deprt == "BST" && semester == "1") {
                        pst = conn.prepareStatement("SELECT * FROM l1s1bst");
                        ResultSet rs = pst.executeQuery();
                        table1.setModel(DbUtils.resultSetToTableModel(rs));
                    } else if (level == "Level 1" && deprt == "ICT" && semester == "2") {
                        pst = conn.prepareStatement("SELECT * FROM l1s2ict");
                        ResultSet rs = pst.executeQuery();
                        table1.setModel(DbUtils.resultSetToTableModel(rs));
                    } else if (level == "Level 1" && deprt == "ET" && semester == "2") {
                        pst = conn.prepareStatement("SELECT * FROM l1s2et");
                        ResultSet rs = pst.executeQuery();
                        table1.setModel(DbUtils.resultSetToTableModel(rs));
                    } else if (level == "Level 1" && deprt == "BST" && semester == "2") {
                        pst = conn.prepareStatement("SELECT * FROM l1s2bst");
                        ResultSet rs = pst.executeQuery();
                        table1.setModel(DbUtils.resultSetToTableModel(rs));
                    } else if (level == "Level 2" && deprt == "ICT" && semester == "1") {
                        pst = conn.prepareStatement("SELECT * FROM l2s1ict");
                        ResultSet rs = pst.executeQuery();
                        table1.setModel(DbUtils.resultSetToTableModel(rs));
                    } else if (level == "Level 2" && deprt == "ET" && semester == "1") {
                        pst = conn.prepareStatement("SELECT * FROM l2s1et");
                        ResultSet rs = pst.executeQuery();
                        table1.setModel(DbUtils.resultSetToTableModel(rs));
                    } else if (level == "Level 2" && deprt == "BST" && semester == "1") {
                        pst = conn.prepareStatement("SELECT * FROM l2s1bst");
                        ResultSet rs = pst.executeQuery();
                        table1.setModel(DbUtils.resultSetToTableModel(rs));
                    } else if (level == "Level 2" && deprt == "ICT" && semester == "2") {
                        pst = conn.prepareStatement("SELECT * FROM l2s2ict");
                        ResultSet rs = pst.executeQuery();
                        table1.setModel(DbUtils.resultSetToTableModel(rs));
                    } else if (level == "Level 2" && deprt == "ET" && semester == "2") {
                        pst = conn.prepareStatement("SELECT * FROM l2s2et");
                        ResultSet rs = pst.executeQuery();
                        table1.setModel(DbUtils.resultSetToTableModel(rs));
                    } else if (level == "Level 2" && deprt == "BST" && semester == "2") {
                        pst = conn.prepareStatement("SELECT * FROM l2s2bst");
                        ResultSet rs = pst.executeQuery();
                        table1.setModel(DbUtils.resultSetToTableModel(rs));
                    } else if (level == "Level 3" && deprt == "ICT" && semester == "1") {
                        pst = conn.prepareStatement("SELECT * FROM l3s1ict");
                        ResultSet rs = pst.executeQuery();
                        table1.setModel(DbUtils.resultSetToTableModel(rs));
                    } else if (level == "Level 3" && deprt == "ET" && semester == "1") {
                        pst = conn.prepareStatement("SELECT * FROM l3s1et");
                        ResultSet rs = pst.executeQuery();
                        table1.setModel(DbUtils.resultSetToTableModel(rs));
                    } else if (level == "Level 3" && deprt == "BST" && semester == "1") {
                        pst = conn.prepareStatement("SELECT * FROM l3s1bst");
                        ResultSet rs = pst.executeQuery();
                        table1.setModel(DbUtils.resultSetToTableModel(rs));
                    } else if (level == "Level 3" && deprt == "ICT" && semester == "2") {
                        pst = conn.prepareStatement("SELECT * FROM l3s2ict");
                        ResultSet rs = pst.executeQuery();
                        table1.setModel(DbUtils.resultSetToTableModel(rs));
                    } else if (level == "Level 3" && deprt == "ET" && semester == "2") {
                        pst = conn.prepareStatement("SELECT * FROM l3s2et");
                        ResultSet rs = pst.executeQuery();
                        table1.setModel(DbUtils.resultSetToTableModel(rs));
                    } else if (level == "Level 3" && deprt == "BST" && semester == "2") {
                        pst = conn.prepareStatement("SELECT * FROM l3s2bst");
                        ResultSet rs = pst.executeQuery();
                        table1.setModel(DbUtils.resultSetToTableModel(rs));
                    } else if (level == "Level 4" && deprt == "ICT" && semester == "1") {
                        pst = conn.prepareStatement("SELECT * FROM l4s1ict");
                        ResultSet rs = pst.executeQuery();
                        table1.setModel(DbUtils.resultSetToTableModel(rs));
                    } else if (level == "Level 4" && deprt == "ET" && semester == "1") {
                        pst = conn.prepareStatement("SELECT * FROM l4s1et");
                        ResultSet rs = pst.executeQuery();
                        table1.setModel(DbUtils.resultSetToTableModel(rs));
                    } else if (level == "Level 4" && deprt == "BST" && semester == "1") {
                        pst = conn.prepareStatement("SELECT * FROM l4s1bst");
                        ResultSet rs = pst.executeQuery();
                        table1.setModel(DbUtils.resultSetToTableModel(rs));
                    } else if (level == "Level 4" && deprt == "ICT" && semester == "2") {
                        pst = conn.prepareStatement("SELECT * FROM l4s2ict");
                        ResultSet rs = pst.executeQuery();
                        table1.setModel(DbUtils.resultSetToTableModel(rs));
                    } else if (level == "Level 4" && deprt == "ET" && semester == "2") {
                        pst = conn.prepareStatement("SELECT * FROM l4s2et");
                        ResultSet rs = pst.executeQuery();
                        table1.setModel(DbUtils.resultSetToTableModel(rs));
                    } else if (level == "Level 4" && deprt == "BST" && semester == "2") {
                        pst = conn.prepareStatement("SELECT * FROM l4s2bst");
                        ResultSet rs = pst.executeQuery();
                        table1.setModel(DbUtils.resultSetToTableModel(rs));
                    }
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }


            }
        });
        sbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String id = tecid.getText();
                    pst = conn.prepareStatement("SELECT Tec_id,Fname,Lname,Sex,Address,Pno,Email,DOB FROM tecofficer WHERE Tec_id=? ");
                    pst.setString(1, id);
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {
                        String fn = rs.getString(2);
                        String ln = rs.getString(3);
                        String sex = rs.getString(4);
                        String addr = rs.getString(5);
                        String pno = rs.getString(6);
                        String mail = rs.getString(7);
                        String dob = rs.getString(8);

                        textFname.setText(fn);
                        textLname.setText(ln);
                        textDOB.setText(dob);
                        textPno.setText(pno);
                        textEmail.setText(mail);
                        textAdd.setText(addr);
                        gender.setSelectedItem(sex);


                    } else {
                        textFname.setText("");
                        textLname.setText("");
                        textDOB.setText("");
                        textPno.setText("");
                        textEmail.setText("");
                        textAdd.setText("");
                        JOptionPane.showMessageDialog(null, "Invalid Admin ID");
                    }
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String fna, lna, add, gen, tid, dob, pno, mail;

                    fna = textFname.getText();
                    lna = textLname.getText();
                    add = textAdd.getText();
                    gen = (String) gender.getSelectedItem();
                    dob = textDOB.getText();
                    pno = textPno.getText();
                    mail = textEmail.getText();
                    tid = tecid.getText();


                    pst = conn.prepareStatement("UPDATE tecofficer SET Fname=?,Lname=?,Sex=?,Address=?,Pno=?,Email=?,DOB=? WHERE Tec_id=?");

                    pst.setString(1, fna);
                    pst.setString(2, lna);
                    pst.setString(3, gen);
                    pst.setString(4, add);
                    pst.setString(5, pno);
                    pst.setString(6, mail);
                    pst.setString(7, dob);
                    pst.setString(8, tid);

                    if (tid.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Record NOT Updated");
                    } else {
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Record Updated successful");
                    }


                    textFname.setText("");
                    textLname.setText("");
                    textAdd.setText("");
                    gender.setSelectedItem("");
                    textDOB.setText("");
                    textPno.setText("");
                    textEmail.setText("");
                    tecid.setText("");

                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        CLEARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textstdID.setText("");
                textDate.setText("");
                textLevel.setText("");
                comboBox1.setSelectedIndex(0);
                textType.setText("");
                textCode.setText("");
            }
        });
    }

    void attTable() {
        try {
            pst = conn.prepareStatement("SELECT * FROM attendance");
            ResultSet rs = pst.executeQuery();
            tableAtt.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void attTable2(int Std_id) {
        try {
            pst = conn.prepareStatement("SELECT * FROM attendance WHERE Std_id =? ");
            pst.setInt(1, Std_id);
            ResultSet rs = pst.executeQuery();
            tableAtt.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void attSum(int index) {
        int countAbsent = 0;
        double attPercentage = 1;
        try {
            pst = conn.prepareStatement("select * from attendance");
            rs = pst.executeQuery();
            while (Student.studentCount > 0) {
                pst = conn.prepareStatement("select * from attendance");
                rs = pst.executeQuery();
                countPresent = 0;
                while (rs.next()) {
                    //pst.setString(1,txt_search.getText());
                    String add1 = rs.getString("Status");
                    String add2 = rs.getNString("Std_id");
                    if (Objects.equals(add2, String.valueOf(index))) {
                        if (Objects.equals(add1, "Present")) {
                            countPresent++;


                        }

                    }
                    ;
                    double dPresent = countPresent;
                    countAbsent = 15 - countPresent;
                    attPercentage = (dPresent / 15) * 100;
                }

                //rs.beforeFirst();
                try {
                    //pst = conn.prepareStatement("INSERT INTO att_summ(att_summ) VALUES (?) WHERE Std_id=?");
                    pst = conn.prepareStatement("UPDATE att_summ SET Present_days=?, Absent_days=?, Att_percentage=? WHERE Std_id=?");
                    pst.setString(1, String.valueOf(countPresent));
                    pst.setString(3, String.valueOf(attPercentage));
                    pst.setString(2, String.valueOf(countAbsent));
                    pst.setString(4, String.valueOf(index));
                    pst.executeUpdate();
                    //JOptionPane.showMessageDialog(null,index);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
                index++;
                Student.studentCount--;
            }
            //JOptionPane.showMessageDialog(null, countPresent);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
        try {

        } catch (Exception e) {

        } finally {

            try {

                rs.close();
                pst.close();

            } catch (Exception e) {

            }

        }
    }

    void medTable() {
        try {
            pst = conn.prepareStatement("SELECT * FROM medical");
            ResultSet rs = pst.executeQuery();
            tblMedi.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void notTable() {
        try {
            pst = conn.prepareStatement("SELECT * FROM notice");
            ResultSet rs = pst.executeQuery();
            tblNotice.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}


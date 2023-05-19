package com.lms;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class LMSdb_siyam {

    static Connection conn = null;

    public static Connection java_db()
    {
        final String DB_URL = "jdbc:mysql://localhost:3306/lms-java-1";
        final String USERNAME = "root";
        final String PASSWord = "1234";
        try{

            conn = DriverManager.getConnection(DB_URL,USERNAME,PASSWord);
            return conn;

        }catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}

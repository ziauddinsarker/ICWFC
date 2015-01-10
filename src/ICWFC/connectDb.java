package ICWFC;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author THAMINA PRITY
 */
import java.sql.*;
import javax.swing.*;
public class connectDb {
    
    Connection conn = null;
    public static Connection ConnercrDB(){
        try{
            //Class.forName("org.sqlite.JDBC");
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\THAMINA PRITY\\Documents\\NetBeansProjects\\IndustrialComputerWaterFlowController\\industrial.sqlite");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}

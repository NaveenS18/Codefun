/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codefun1;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author naveen
 */

public class Codefun1 {

    Connection con = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Login log = new Login();
        log.setVisible(true);
    }

    public Connection connector() {
        // Register Driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Codefun","root","mysterybee");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Cannot Connect to Database");
        }
        return null;
    }

}

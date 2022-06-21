/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muslimpro;

import java.sql.*;
import javax.swing.JOptionPane;

public class koneksi {
   public static Connection con;
    
    public static Connection koneksiDB() throws SQLException{
        if (con == null) {
            try {
            String url = "jdbc:mysql://localhost/tahwilSana";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            con = DriverManager.getConnection(url,user,pass);
                System.out.println("Assalamualaikum");
        } catch (Exception e) {
             e.printStackTrace();
             JOptionPane.showMessageDialog(null,e);
        }
        }
        return con;
    }  public static void main(String[] args) throws SQLException {
        koneksi a = new koneksi();
        koneksiDB();
    }
}

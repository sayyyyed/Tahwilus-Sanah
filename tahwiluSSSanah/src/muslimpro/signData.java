/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muslimpro;

import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Sayyed
 */
public class signData {
    private String namaDepan;
    private String namaBelakang;
    private String email;
    private String id;
    static String [] earlyAccess = {"HESOYAM","KJKSZPJ","UZUMYMW","LXGIWYL"
            ,"AEZAKMI","RIPAZHA","ROCKETMAN","JUMPJET"};

    public String getNamaDepan() {
        return namaDepan;
    }

    public void setNamaDepan(String namaDepan) {
        this.namaDepan = namaDepan;
    }

    public String getNamaBelakang() {
        return namaBelakang;
    }

    public void setNamaBelakang(String namaBelakang) {
        this.namaBelakang = namaBelakang;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String generateId(){
    
    int k = earlyAccess.length;
    String j = Integer.toString((int)(Math.random()*100));
    String m = Integer.toString((int)(Math.random()*100));
    id = m + earlyAccess[(int)(Math.random()*k)]+ j;
    signUpPage x = new signUpPage();
    x.setId(id);
    return id;
    }
    
    public void saveData(){
        String lengkap = getNamaDepan() + " " + getNamaBelakang();
    try {
            
            if(getNamaDepan().equals("") || getNamaBelakang().equals("")  || getEmail().equals("")){
                JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
                System.out.println("b");
                return;
            }
           
             try {
               
                    String sqlregister = "INSERT INTO `perloginan`(`depan`,  `belakang`, `lengkap`,`email`,`id` ) "
                            + "VALUES ('"+getNamaDepan()+"','"+getNamaBelakang()+"','"+lengkap+"','"+getEmail()+"','"+generateId()+"')";
                    
                    java.sql.Connection con = (Connection)koneksi.koneksiDB();
                    java.sql.PreparedStatement pstm = con.prepareStatement(sqlregister);
                    pstm.execute();
                   JOptionPane.showMessageDialog(null, "Berhasil mendaftarkan akun\nID ANDA : "+ id);
                    login ase = new login();
                    ase.show();
                    
                
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.toString()) ;
            }
            
           
        } catch (Exception e) {
        }
    }
//    public static void main(String[] args) {
//        signData n = new signData();
//        System.out.println(n.generateId());
//    }
}

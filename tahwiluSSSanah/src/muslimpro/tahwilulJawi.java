/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muslimpro;

/**
 *
 * @author Sayyed
 */
public class tahwilulJawi extends falaks{
    String jawi = "Jawi";
    public tahwilulJawi(int tanggal, String bulan, int tahun,String jawi) {
        super(tanggal, bulan, tahun, jawi);
    }
   
    String keJawa(){
    falaks ase = new tahwilulJawi( tanggal,  bulan,  tahun, jawi);
    return  ase.tahwil();
    
    
    
    
    }
    public static void main(String[] args) {
       tahwilulJawi ke = new tahwilulJawi(12, "Januari", 1945, "Jawi");
       
        String a = ke.keJawa();
         System.out.println(a);
       
    }
}

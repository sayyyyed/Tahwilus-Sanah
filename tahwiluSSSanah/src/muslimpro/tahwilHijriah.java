/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muslimpro;


public class tahwilHijriah extends tahwiller{
    int tanggal;
    String bulan;
    int tahun;
    
    
    public tahwilHijriah() {
    }
    public tahwilHijriah(int tanggal, String bulan, int tahun) {
        this.tanggal = tanggal;
        this.bulan = bulan;
        this.tahun = tahun;
    }

    
    
    String tahwil(){
        
    falaktester1 cek = new falaktester1( tanggal, bulan, tahun);
    
    int ubah;
        if ("Muharrom".equals(bulan)) {
               ubah = tanggal + 0;
               System.out.println(" as");
               return cek.cetak(ubah);

       } 
       else if ("Shofar".equals(bulan)) {
                ubah = tanggal + 30;
                cek.cetak(ubah);
                return cek.cetak(ubah);

       } 
       else if ("Robiul Awwal".equals(bulan)) {
                ubah = tanggal + 59;

                cek.cetak(ubah);
                return cek.cetak(ubah);

       }
       else if ("Robius Sani".equals(bulan)) {
                ubah = tanggal + 89;


                cek.cetak(ubah);
                return cek.cetak(ubah);

       } 
       else if ("Jumadil Ula".equals(bulan)) {
                ubah = tanggal + 118;

                cek.cetak(ubah);
                return cek.cetak(ubah);

       } 
       else if ("Jumadil Tsaniyah".equals(bulan)) {
                ubah = tanggal + 148;

                cek.cetak(ubah);
                return cek.cetak(ubah);

       } 
       else if ("Rojab".equals(bulan)) {
                ubah = tanggal + 177;

                cek.cetak(ubah);
                return cek.cetak(ubah);

       } 
       else if ("Sya'ban".equals(bulan)) {
                ubah = tanggal + 207;

                cek.cetak(ubah);
                return cek.cetak(ubah);

       } else if ("Ramadhan".equals(bulan)) {
                ubah = tanggal + 236;

                cek.cetak(ubah);
                return cek.cetak(ubah);

       }
       else if ("Syawwal".equals(bulan)) {
                ubah = tanggal + 266;

                return cek.cetak(ubah);

       }
       else if ("Dzul Qo'dah".equals(bulan)) {
                ubah = tanggal + 295;

                cek.cetak(ubah);
                return cek.cetak(ubah);

       } 
       else if ("Dzul Hijjah".equals(bulan)) {
                ubah = tanggal + 325;

                cek.cetak(ubah);
                return cek.cetak(ubah);

       } else 
           return " ";

   } 
   
    public static void main(String[] args) {
        tahwilHijriah s = new tahwilHijriah(1, "Syawwal", 1443);
        System.out.println(s.tahwil());
    }
    
//   
}
  


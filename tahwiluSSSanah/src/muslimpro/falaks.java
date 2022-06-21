/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muslimpro;


public class falaks extends tahwiller{
    public int tanggal;
    public String bulan;
    public int tahun;
    private String jawi;
    static int jumlahTanggal;
    static int tahunFix;
    

    public void setJawi(String jawi) {
        this.jawi = jawi;
    }

    public String getJawi() {
        return jawi;
    }
    public falaks(int tanggal, String bulan, int tahun) {
        this.tanggal = tanggal;
        this.bulan = bulan;
        this.tahun = tahun;
    }
     public falaks(int tanggal, String bulan,int tahun, String jawi) {
        this.tanggal = tanggal;
        this.bulan = bulan;
        this.tahun = tahun;
        this.jawi = jawi;
        
    }
    public falaks() {
       
    }
    
    @Override
    String tahwil(){
    falaktester cek = new falaktester( tanggal, bulan, tahun,jawi);
    
    int ubah;
    // MENENTUKAN JUMLAH HARI DALAM SETAHUN
   if ("Januari".equals(bulan)) {
       ubah = tanggal + 0;
       return cek.cetak(ubah);
       
   } 
   else if ("Februari".equals(bulan)) {
       ubah = tanggal + 31;
       cek.cetak(ubah);
       return cek.cetak(ubah);
       
   } 
   else if ("Maret".equals(bulan)) {
     if ("kabisat".equals(cek.cekKabisatMasehi(tahun))){
        ubah = tanggal + 60;}
        else{ubah = tanggal + 59;}
  
       cek.cetak(ubah);
       return cek.cetak(ubah);
       
   }
   else if ("April".equals(bulan)) {
       if ("kabisat".equals(cek.cekKabisatMasehi(tahun))){
        ubah = tanggal + 91;}
       else{
        ubah = tanggal + 90;}
    
       cek.cetak(ubah);
       return cek.cetak(ubah);
       
   } 
   else if ("Mei".equals(bulan)) {
      if ("kabisat".equals(cek.cekKabisatMasehi(tahun))){
        ubah = tanggal + 121;}
        else{ubah = tanggal + 120;}
       cek.cetak(ubah);
       return cek.cetak(ubah);
       
   } 
   else if ("Juni".equals(bulan)) {
       if ("kabisat".equals(cek.cekKabisatMasehi(tahun))){
         ubah = tanggal + 152;}
         else{ubah = tanggal + 151;}
       cek.cetak(ubah);
       return cek.cetak(ubah);
       
   } 
   else if ("Juli".equals(bulan)) {
      if ("kabisat".equals(cek.cekKabisatMasehi(tahun))){
        ubah = tanggal + 182;}
        else{ubah = tanggal + 181;}
       cek.cetak(ubah);
       return cek.cetak(ubah);
       
   } 
   else if ("Agustus".equals(bulan)) {
       if ("kabisat".equals(cek.cekKabisatMasehi(tahun))){
    ubah = tanggal + 213;}
    else{ubah = tanggal + 212;}
       cek.cetak(ubah);
       return cek.cetak(ubah);
       
   } else if ("September".equals(bulan)) {
      if ("kabisat".equals(cek.cekKabisatMasehi(tahun))){
    ubah = tanggal + 244;}
    else{ubah = tanggal + 243;}
       cek.cetak(ubah);
       return cek.cetak(ubah);
       
   }
   else if ("Oktober".equals(bulan)) {
       if ("kabisat".equals(cek.cekKabisatMasehi(tahun))){
            ubah = tanggal + 274;}
         else{ubah = tanggal + 273;}
       cek.cetak(ubah);
       return cek.cetak(ubah);
       
   }
   else if ("November".equals(bulan)) {
        if ("kabisat".equals(cek.cekKabisatMasehi(tahun))){
         ubah = tanggal + 305;}
         else{ubah = tanggal + 304;}
       cek.cetak(ubah);
       return cek.cetak(ubah);
       
   } 
   else if ("Desember".equals(bulan)) {
      if ("kabisat".equals(cek.cekKabisatMasehi(tahun))){
        ubah = tanggal + 335;}
        else{ubah = tanggal + 334;}
       cek.cetak(ubah);
       
      
       return cek.cetak(ubah);
       
   } else 
       return " ";
       
   } 

//UNTUK TEST CODE----------------------------
//    
//public static void main(String[] args) {
//        falaks a = new falaks (10, "Mei", 2003);
//        System.out.println(a.tahwil());
//    }
}
  


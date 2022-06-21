/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muslimpro;

public class falaktester extends falaks{
       
    double oper1;
    double oper2;
    private int jumlahTanggal;
    private int tahunFix;
   
    int tamm;
    int tanggalhijri;
    String sanah = " H";
    String [] bulanTanggal = { " Muharrom ", " Shofar ", " Robiul Awwal ", " Robius Sani ", " Jumadil Ula ", " Jumadil Tsaniyah ", " Rojab ", " Sya'ban ", " Ramadhan ", " Syawwal ", " Dzul Qo'dah ", " Dzul Hijjah "};
    
   
    public falaktester(int tanggal, String bulan, int tahun) {
        super( tanggal, bulan, tahun);
    }
    public falaktester(int tanggal, String bulan, int tahun, String jawi) {
        super( tanggal, bulan, tahun, jawi);//CONSTRUCTOR KHUSUS KONVERSI KE TAHUN JAWA
    }
        
    String cetak(int ubah){
      //MENCETAK NILAI KONVERSI UNTUK DIKEMBALIKAN KE METHOD TAHWIL DI SUPERCLASS
      String jawir = getJawi();
      int tam = tahun-1;
      int hijriAkhir = 355;
      System.out.println(ubah);
      oper1 = ubah/365.0+tam;
      oper2 = oper1*1.030712-640.659273;
      tamm = (int) (oper1*1.030712-640.659273);
      System.out.println(oper1);
      System.out.println(oper2);
      tanggalhijri = (int) ((oper2-tamm)*354);
      System.out.println(oper2-tamm);
      System.out.println(tanggalhijri);
      if (tanggalhijri == 0){
          tanggalhijri = (int) ((1 + oper2-tamm)*354);
      }
      else{ tamm++;
      }
      
      
      if ("kabisat".equals(cekKabisat(tamm))){
         hijriAkhir = 356;
      }
      if ("Jawi".equals(jawir)){
          tamm = tamm + 512;
          sanah = " Saka";
           String [] bulanTanggal2 = { "Suro ", "Sapar ", " Mulud", "Bakdo Mulud ", "Jumadil Awal ", "Jumadil Akhir ", "Rejeb ", "Ruwah ", "Poso ", "Sawal ", "Dulqongidah ", "Besar "};
           bulanTanggal = bulanTanggal2;
      }
      hitungWeton a = new hitungWeton(tamm,tanggalhijri);
        a.tahwil();
        falaks.jumlahTanggal= tanggalhijri;
        falaks.tahunFix= tamm-1;     
        System.out.println(jawir);
            if(tanggalhijri<31){
            int jadi = tanggalhijri;
                return jadi + ", " + bulanTanggal[0] +tamm+ sanah;}
            
            else if(tanggalhijri>30 && tanggalhijri<60){
            int jadi = tanggalhijri-30;
                return jadi + ", " + bulanTanggal[1]+tamm+ sanah;}
            
            else if(tanggalhijri>59 && tanggalhijri<90){
            int jadi = tanggalhijri-59;
               return jadi + ", " + bulanTanggal[2]+tamm+ sanah;}
            
            else if(tanggalhijri>89 && tanggalhijri<119){
            int jadi = tanggalhijri-89;
                return jadi + ", " + bulanTanggal[3]+tamm+ sanah ;}
            
            else if(tanggalhijri>118 && tanggalhijri<149){
            int jadi = tanggalhijri-118;
               return jadi + ", " + bulanTanggal[4]+tamm+ sanah;}
            
            else if(tanggalhijri>148 && tanggalhijri<178){
            int jadi = tanggalhijri-148;
               return jadi + ", " + bulanTanggal[5]+tamm+ sanah;}
            
            else if(tanggalhijri>177 && tanggalhijri<208){
            int jadi = tanggalhijri-177;
                return jadi + ", " +bulanTanggal[6]+tamm+ sanah;}
            
            else if(tanggalhijri>207 && tanggalhijri<237){
            int jadi = tanggalhijri-207;
              return jadi + ", " + bulanTanggal[7]+tamm+ sanah;}
            
            else if(tanggalhijri>236 && tanggalhijri<267){
            int jadi = tanggalhijri-236;
                return jadi + ", " +bulanTanggal[8]+tamm+ sanah;}
            
            else if(tanggalhijri>266 && tanggalhijri<296){
            int jadi = tanggalhijri-266;
                return jadi + ", " + bulanTanggal[9]+tamm+ sanah;}
            
            else if(tanggalhijri>295 && tanggalhijri<326){
            int jadi = tanggalhijri-295;
                 return jadi + ", " +bulanTanggal[10]+tamm+ sanah;}
            
            else if(tanggalhijri>325 && tanggalhijri<hijriAkhir){ 
            int jadi = tanggalhijri-325;
               return jadi + ", " + bulanTanggal[11]+tamm+ sanah;}
            else
                return "invalid";
    
    }
    
   public String cekKabisat(int a){
    //UNTUK MENGECEK TAHUN KABISAT PADA TAHUN HIJRIYAH
    int [] kabisat = {2,10,13,15,18,21,24,26,29};
    int q = a % 30;
             if (q == 2 ||q == 7 ||  q ==10 || q == 13 || q ==15 || q == 18 || q ==21 || q == 24 || q == 26 || q == 29){
                 return "kabisat";}
             else {
                return "tidak kabisat";}
                
    }
         
         
    public String cekKabisatMasehi(int i){
 //UNTUK MENGECEK TAHUN KABISAT PADA TAHUN MASEHI
      if ((i % 100 == 0)&&(i % 400==0))
          return "kabisat";
      else if ((i % 100 != 0)&&(i % 4 == 0))
          return "kabisat";
      else return "bukan kabisat";  
      }

    

    
    
}
    

    
    






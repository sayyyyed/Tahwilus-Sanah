/*
 * To change this licenseMeader, choose LicenseMeaders in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muslimpro;

public class falaktester1 extends tahwilHijriah{
   
    double oper1;
    double oper2;
    private int tamm;
    int tanggalmasehi;

    

    public int getTamm() {
        return tamm;
    }

    public void setTamm(int tamm) {
        this.tamm = tamm;
    }
    
    

    public falaktester1(int tanggal, String bulan, int tahun) {
        super( tanggal, bulan, tahun);
    }
    
        
    String cetak(int ubah){
      //MENCETAK NILAI KONVERSI UNTUK DI-RETURN KE SUPERCLASS  
      int tambahHari = 0;
      int tam = tahun-1;
      
      
      int tahunAkhir = 365;
      System.out.println(ubah);
      oper1 = ubah/354.0+tam;
      oper2 = oper1*0.9702031 + 621.56962;
      tamm = (int) (oper1*0.9702031 + 621.56962);
        
      System.out.println(oper1);
      double C = (oper1*0.9702031 + 621.56962) - tamm;
      System.out.println(oper2);
      tanggalmasehi = (int) ((oper2-tamm)*365);
      double D = (((oper2-tamm)*365.0)-tanggalmasehi);
      System.out.println(D);
      System.out.println(oper2-tamm);
      System.out.println(tanggalmasehi);
      if (C > 0.5){
          tamm++;
      }
      if (D > 0.5){
          tanggalmasehi++;
      }
      if (tanggalmasehi == 0){
          tanggalmasehi = (int) ((1 + oper2-tamm)*354);
      }
      else{ tamm++;
      }
//      
//      
      if ("kabisat".equals(cekKabisatMasehi(tamm))){
         tahunAkhir = 366;
         tambahHari = 1;
      }
        setTamm(tamm);
//       
            if(tanggalmasehi<=31){
                return tanggalmasehi + ", " + "Januari "+tamm+ " M";}
            
            else if(tanggalmasehi>=32 && tanggalmasehi<=59+tambahHari){
            int jadi = tanggalmasehi-31;
                return jadi + ", " + "Februari "+tamm+ " M";}
//            
            else if(tanggalmasehi>=60 +tambahHari&& tanggalmasehi<=89+tambahHari){
            int jadi = tanggalmasehi-59-tambahHari;
               return jadi + ", " + "Maret "+tamm+ " M";}
//            
            else if(tanggalmasehi>=90+tambahHari && tanggalmasehi<=119+tambahHari){
            int jadi = tanggalmasehi-89-tambahHari;
                return jadi + ", " + "April "+tamm+ " M" ;}
//            
            else if(tanggalmasehi>=120+tambahHari && tanggalmasehi<=150+tambahHari){
            int jadi = +tanggalmasehi-119-tambahHari;
               return jadi + ", " + "Mei "+tamm+ " M";}
//            
            else if(tanggalmasehi>=151+tambahHari && tanggalmasehi<=181+tambahHari){
            int jadi = tanggalmasehi-150-tambahHari;
               return jadi + ", " + "Juni "+tamm+ " M";}
//            
            else if(tanggalmasehi>=181+tambahHari && tanggalmasehi<=211+tambahHari){
            int jadi = tanggalmasehi-180-tambahHari;
                return jadi + ", " + "Juli "+tamm+ " M";}
            
            else if(tanggalmasehi>=212+tambahHari && tanggalmasehi<=242+tambahHari){
            int jadi = tanggalmasehi-211-tambahHari;
              return jadi + ", " + "Agustus "+tamm+ " M";}
            
            else if(tanggalmasehi>=243+tambahHari && tanggalmasehi<=272+tambahHari){
            int jadi = tanggalmasehi-242-tambahHari;
                return jadi + ", " + "September "+tamm+ " M";}
            
            else if(tanggalmasehi>=273+tambahHari && tanggalmasehi<=303+tambahHari){
            int jadi = tanggalmasehi-272-tambahHari;
                return jadi + ", " + "Oktober "+tamm+ " M";}
            
            else if(tanggalmasehi>=304+tambahHari && tanggalmasehi<=333+tambahHari){
            int jadi = tanggalmasehi-303-tambahHari;
                 return jadi + ", " + "November "+tamm+ " M";}
            
            else if(tanggalmasehi>=334+tambahHari && tanggalmasehi<=tahunAkhir){ 
            int jadi = tanggalmasehi-333-tambahHari;
               return jadi + ", " + "Desember "+tamm+ " M";}
            else
                return "invalid";
     }
//    
   public String cekKabisat(int a){
    //CEK KABISAT HIJRIAH
   
    int q = a % 30;
             if (q == 2 ||q == 7 ||  q ==10 || q == 13 || q ==15 || q == 18 || q ==21 || q == 24 || q == 26 || q == 29){
                 return "kabisat";}
             else {
                return "tidak kabisat";}
                
    }
         
         
    public String cekKabisatMasehi(int i){
      //CEK KABISAT MASEHI
      if ((i % 100 == 0)&&(i % 400==0))
          return "kabisat";
      else if ((i % 100 != 0)&&(i % 4 == 0))
          return "kabisat";
      else return "bukan kabisat";  
      }
    
}
    
//   






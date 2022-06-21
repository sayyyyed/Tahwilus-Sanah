package muslimpro;



import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class hitungUmur extends tahwiller{

    public hitungUmur(int tanggal,String bulan, int tahun) {
        this.tanggal = tanggal;
        this.bulan=bulan;
        this.tahun = tahun;
    }
    int tanggal;
    String bulan;
    int tahun;
    private int umurTahun;
    private int umurBulan;
    private int umurHari;
    String tahwil(){
        
        LocalDate now = LocalDate.now();
        
        if ("Januari".equals(bulan)) {
       LocalDate born = LocalDate.of(tahun, Month.JANUARY,tanggal);
            Period period = Period.between(born,now);
            setUmurTahun(period.getYears());
            setUmurBulan(period.getMonths());
            setUmurHari(period.getDays());
        
       
   } 
   else if ("Februari".equals(bulan)) {
    LocalDate born = LocalDate.of(tahun, Month.FEBRUARY,tanggal);  
          Period period = Period.between(born,now);
            setUmurTahun(period.getYears());
            setUmurBulan(period.getMonths());
            setUmurHari(period.getDays());   
   } 
   else if ("Maret".equals(bulan)) {
     LocalDate born = LocalDate.of(tahun, Month.MARCH,tanggal);  
           Period period = Period.between(born,now);
            setUmurTahun(period.getYears());
            setUmurBulan(period.getMonths());
            setUmurHari(period.getDays());  
   }
   else if ("April".equals(bulan)) {
     LocalDate born = LocalDate.of(tahun, Month.APRIL,tanggal);    
            Period period = Period.between(born,now);
            setUmurTahun(period.getYears());
            setUmurBulan(period.getMonths());
            setUmurHari(period.getDays());  
       
   } 
   else if ("Mei".equals(bulan)) {
     LocalDate born = LocalDate.of(tahun, Month.MAY,tanggal);    
           Period period = Period.between(born,now);
            setUmurTahun(period.getYears());
            setUmurBulan(period.getMonths());
            setUmurHari(period.getDays());  
   } 
   else if ("Juni".equals(bulan)) {
     LocalDate born = LocalDate.of(tahun, Month.JUNE,tanggal);     
            Period period = Period.between(born,now);
            setUmurTahun(period.getYears());
            setUmurBulan(period.getMonths());
            setUmurHari(period.getDays()); 
   } 
   else if ("Juli".equals(bulan)) {
     LocalDate born = LocalDate.of(tahun, Month.JULY,tanggal);     
           Period period = Period.between(born,now);
            setUmurTahun(period.getYears());
            setUmurBulan(period.getMonths());
            setUmurHari(period.getDays());  
   } 
   else if ("Agustus".equals(bulan)) {
      LocalDate born = LocalDate.of(tahun, Month.AUGUST,tanggal);    
            Period period = Period.between(born,now);
            setUmurTahun(period.getYears());
            setUmurBulan(period.getMonths());
            setUmurHari(period.getDays()); 
   } else if ("September".equals(bulan)) {
      LocalDate born = LocalDate.of(tahun, Month.SEPTEMBER,tanggal);   
             Period period = Period.between(born,now);
            setUmurTahun(period.getYears());
            setUmurBulan(period.getMonths());
            setUmurHari(period.getDays());
   }
   else if ("Oktober".equals(bulan)) {
     LocalDate born = LocalDate.of(tahun, Month.OCTOBER,tanggal);     
           Period period = Period.between(born,now);
            setUmurTahun(period.getYears());
            setUmurBulan(period.getMonths());
            setUmurHari(period.getDays());  
   }
   else if ("November".equals(bulan)) {
       LocalDate born = LocalDate.of(tahun, Month.NOVEMBER,tanggal);    
             Period period = Period.between(born,now);
            setUmurTahun(period.getYears());
            setUmurBulan(period.getMonths());
            setUmurHari(period.getDays());
   } 
   else if ("Desember".equals(bulan)) {
      LocalDate born = LocalDate.of(tahun, 12,tanggal);   
             Period period = Period.between(born,now);
            setUmurTahun(period.getYears());
            setUmurBulan(period.getMonths());
            setUmurHari(period.getDays());
   } else 
       return " ";
       
        
        return " ";
        }
//    int tanggal;
//    String bulan;
//    int tahun;
//    private String jawi;
//
//    public void setJawi(String jawi) {
//        this.jawi = jawi;
//    }
//
//    public String getJawi() {
//        return jawi;
//    }
//    public hitungUmur(int tanggal, String bulan, int tahun) {
//        this.tanggal = tanggal;
//        this.bulan = bulan;
//        this.tahun = tahun;
//    }
//     public hitungUmur(int tanggal, String bulan,int tahun, String jawi) {
//        this.tanggal = tanggal;
//        this.bulan = bulan;
//        this.tahun = tahun;
//        this.jawi = jawi;
//        
//    }
//    public hitungUmur() {
//       
//    }
//    
//    String tahwil(){
//    falaktester cek = new falaktester( tanggal, bulan, tahun,jawi);
//    int bulan = -1;
//    for (int x = tahun; x<2022; tahun++){
//          if ("kabisat".equals(cek.cekKabisatMasehi(tahun))){
//        tahun = tahun + 1;}
//        
//    } 
//    int ubah;
//    

    public int getUmurTahun() {
        return umurTahun;
    }

    public void setUmurTahun(int umurTahun) {
        this.umurTahun = umurTahun;
    }

    public int getUmurBulan() {
        return umurBulan;
    }

    public void setUmurBulan(int umurBulan) {
        this.umurBulan = umurBulan;
    }

    public int getUmurHari() {
        return umurHari;
    }

    public void setUmurHari(int umurHari) {
        this.umurHari = umurHari;
    }
   
    
    
   } 
   
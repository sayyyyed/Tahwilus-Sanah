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
public class hitungWeton extends cariWeton{

    
    int tanggal;
    String bulan;
    int tahun;
    private int neptu;
    private String weton;
    int jumlahTanggal;
    int tahunFix;
    int  z = 0;

    
    String [] hari = {"Kemis","Jemuah","Sebtu","Ahad","Senen","Seloso","Rebo","Kemis"};
    int neptuHari [] = {8,6,9,5,4,3,7,8};
    int neptuPasaran [] = {8,5,9,7,4,8};
    String [] pasaran = {"Kliwon","Legi","Pahing","Pon","Wage"};
    
    public hitungWeton(int tanggal, String bulan, int tahun) {
        this.tanggal = tanggal;
        this.bulan = bulan;
        this.tahun = tahun;
    }
    public hitungWeton(int tamm,int tanggalhijri) {
        
        tamm=jumlahTanggal;
        tanggalhijri=tahunFix;
    }
    public int getJumlahTanggal() {
        return jumlahTanggal;
    }

    public void setJumlahTanggal(int jumlahTanggal) {
        this.jumlahTanggal = jumlahTanggal;
    }

    public int getTahunFix() {
        return tahunFix;
    }

    public void setTahunFix(int tahunFix) {
        this.tahunFix = tahunFix;
    }
    public String tahwil(){
      
      falaks take = new falaks(tanggal, bulan, tahun);
      System.out.println(take.tahwil());
    
      int tanggalan = falaks.tahunFix;
      int tahunFix = falaks.jumlahTanggal;
      System.out.println("t" + tanggalan);
      System.out.println("y" + tahunFix);
      int tahunnan = tanggalan / 30;
      System.out.println(tahunnan);
      int siklus = tahunnan*10631;
      System.out.println(siklus);
        
      
      int sisa = tanggalan % 30;
      System.out.println("tfm" + sisa + " " + tanggalan);
      if (sisa % 8 == 0){
          z = (sisa/9)*3;
      }
      else if (sisa % 8 != 0){
          if (sisa % 8 ==2 || sisa % 8 ==3 ){
          z = 0;}
          else if (sisa % 8 >=4 && sisa % 8 <7 ){
          z = 1;}
          else if (sisa % 8 == 7 ){
          z = 2;}
      }
        int nyar = ((sisa / 8)*3)+z;
        
        System.out.println(nyar);
        System.out.println((sisa * 354) + nyar);
        
        int akumulasiTahun = ((sisa * 354) + nyar)+siklus+tahunFix;
        System.out.println(akumulasiTahun);
        
        String dino = hari[akumulasiTahun % 7];
        setNeptu(neptuHari[akumulasiTahun % 7]+neptuPasaran[akumulasiTahun % 5]);
        
        System.out.println(neptuHari[akumulasiTahun % 7]+neptuPasaran[akumulasiTahun % 5]);
        
        String pasarAn = pasaran[akumulasiTahun % 5];
        setWeton(dino + " " + pasarAn);
      return " weton searched";
   
    }

  

    public String getWeton() {
        return weton;
    }

    public void setWeton(String weton) {
        this.weton = weton;
    }
      public int getNeptu() {
        return neptu;
    }

    public void setNeptu(int neptu) {
        this.neptu = neptu;
    }
    public static void main(String[] args) {
        hitungWeton ce = new hitungWeton(10, "Mei", 2003);
        System.out.println(ce.tahwil());
    }
}

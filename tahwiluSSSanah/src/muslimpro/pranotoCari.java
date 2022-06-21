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
public class pranotoCari extends tahwiller{
    private int tanggal;
    private String mangsa;
    private String deskripsi;
    String bulan;

    public String getMangsa() {
        return mangsa;
    }

    public void setMangsa(String mangsa) {
        this.mangsa = mangsa;
    }
    

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int gettanggal() {
        return tanggal;
    }

    public void settanggal(int tanggal) {
        this.tanggal = tanggal;
    }

    public pranotoCari(int tanggal, String bulan) {
        this.tanggal = tanggal;
        this.bulan = bulan;
    }
    
    public String tahwil(){
        
        if ("Juni".equals(bulan) || "Juli".equals(bulan)||"Agustus".equals(bulan)) {
            if ("Juni".equals(bulan) && tanggal >= 22){
                 setMangsa("Kasa");
                 setDeskripsi("Petani membakar sawah dan menanam tanaman palawija");
       
      }
            else if ("Juli".equals(bulan)){
                 setMangsa("Kasa");
                 setDeskripsi("Petani membakar sawah dan menanam tanaman palawija");

      }
            else if ("Agustus".equals(bulan) && tanggal == 1){
                 setMangsa("Kasa");
                 setDeskripsi("Petani membakar sawah dan menanam tanaman palawija");
       
      }
       
   } 
        
        else if ("Agustus".equals(bulan) && tanggal >= 2 && tanggal<= 25 ){
        setMangsa("Karo");
        setDeskripsi("Palawija mulai tumbuh tetapi terjadi kekeringan");
        
        }
        else if (("Agustus".equals(bulan) && tanggal >= 25)||("September".equals(bulan) && tanggal <=17)){
        setMangsa("Katiga");
        setDeskripsi("Mulai panen palawija dan sumur kekeringan");
        
        }
        
        else if (("September".equals(bulan) && tanggal >= 18)||("Oktober".equals(bulan) && tanggal <=12)){
        setMangsa("Kapat");
        setDeskripsi("Masa tanam padi gogo, kekeringan mereda");
        
        }
        
        else if (("Oktober".equals(bulan) && tanggal >= 23)||("November".equals(bulan) && tanggal <=8)){
        setMangsa("Kalima");
        setDeskripsi("Hujan mulai turun, waktu untuk menyiapkan irigasi");
        
        }
        
        else if (("November".equals(bulan) && tanggal >= 9)||("Desember".equals(bulan) && tanggal <=21)){
        setMangsa("Kanem");
        setDeskripsi("Curah hujan tinggi, petani mulai membajak sawah");
        
        }
        
        else if (("Desember".equals(bulan) && tanggal >= 22)||("Februari".equals(bulan) && tanggal <=2)||("Januari".equals(bulan))){
        setMangsa("Kapitu/Rendeng");
        setDeskripsi("Petani mulai menanam padi, curah hujan sangat tinggi");
        
        }
        
        else if (("Februari".equals(bulan) && tanggal >= 3)||("Februari".equals(bulan) && tanggal <=28)){
        setMangsa("Kawolu");
        //4 tahun sekali + 1
        setDeskripsi("Tanaman padi sudah tinggi, curah hujan turun");
        
        }
        
        else if (("Maret".equals(bulan) && tanggal >= 1)||("Maret".equals(bulan) && tanggal <=25)){
        setMangsa("Kasanga");
        setDeskripsi("Musim padi berbuah, musim kawin hewan dan curah hujan turun");
        
        }
        
        else if (("Maret".equals(bulan) && tanggal >= 26)||("April".equals(bulan) && tanggal <=24)){
        setMangsa("Kasapuluh");
        setDeskripsi("Padi menguning, padi gogo mulai panen. Waspada perubahan musim");
        
        }
        
        else if (("April".equals(bulan) && tanggal >= 19)||("Mei".equals(bulan) && tanggal <=11)){
        setMangsa("Dhesta");
        setDeskripsi("Panen raya, hujan mulai habis");
        
        }
        
         if  (("Mei".equals(bulan) && tanggal >= 12)||("Juni".equals(bulan) && tanggal <=21)){
        setMangsa("Saddha");
        setDeskripsi("Awal musim kemarau, petani menjemur padi");
        
        }
         
          return "successfull ";
       
    }
    public static void main(String[] args) {
        
        pranotoCari cari = new pranotoCari(10, "Mei");
        cari.tahwil();
        System.out.println(cari.getMangsa());
    }
}

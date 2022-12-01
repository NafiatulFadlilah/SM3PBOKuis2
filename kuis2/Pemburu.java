package kuis2;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah
 * Kuis 2 - Teori & Praktikum PBO
 */
public class Pemburu {
    String namaPemburu, genderPemburu;
    
    Pemburu(String namaPemburu, String genderPemburu){
        if(genderPemburu.equalsIgnoreCase("M") || genderPemburu.equalsIgnoreCase("F")){
            this.namaPemburu = namaPemburu;
            this.genderPemburu = genderPemburu;
        }else{
            System.out.println("Kesalahan input jenis kelamin. Masukkan inputan 'M' untuk pria atau 'F' untuk wanita.");
        }        
    }
    
    public void berburu(TyrannosaurusRex trex){
        if(genderPemburu.equalsIgnoreCase("M")){
            System.out.println("Mr. " + this.namaPemburu + " memburu: TyrannosaurusRex");
        }else if(genderPemburu.equalsIgnoreCase("F")){
            System.out.println("Mrs. " + this.namaPemburu + " memburu: TyrannosaurusRex");
        }
        System.out.println("Berikut makanan TyrannosaurusRex:");
        trex.makan();
        System.out.println("Berikut cara berjalan TyrannosaurusRex:");
        trex.berjalan();
    }
}
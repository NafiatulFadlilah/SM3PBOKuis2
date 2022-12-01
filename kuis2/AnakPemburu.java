package kuis2;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah
 * Kuis 2 - Teori & Praktikum PBO
 */
public class AnakPemburu extends Pemburu implements IMengambilTelur{
    String namaAnak;
    
    AnakPemburu(String namaAnak, String namaOrtu, String genderOrtu){
        super(namaOrtu, genderOrtu);
        this.namaAnak = namaAnak;
    }
    
    @Override
    public void mengambilTelur(Dinosaurus dino){
        if(super.genderPemburu.equalsIgnoreCase("M")){
            System.out.println(this.namaAnak + " adalah anak dari pemburu Mr. " + super.namaPemburu);
        }else if(super.genderPemburu.equalsIgnoreCase("F")){
            System.out.println(this.namaAnak + " adalah anak dari pemburu Mrs. " + super.namaPemburu);
        }
        System.out.println("Dia mengambil telur salah satu spesies Dinosaurus");
        System.out.println("Berikut makanan spesies tersebut: ");
        dino.makan();
        System.out.println("Berikut cara spesies tersebut berjalan: ");
        dino.berjalan();
    }
}
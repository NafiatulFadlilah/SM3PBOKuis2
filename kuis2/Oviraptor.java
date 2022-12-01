package kuis2;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah
 * Kuis 2 - Teori & Praktikum PBO
 */
public class Oviraptor extends Dinosaurus implements IBertelur{

    @Override
    public void makan() {
        System.out.println("Oviraptor diperkirakan memiliki makanan utama "
                            + "berupa crustacea dan molusca.");
    }   

    @Override
    public void berjalan() {
        System.out.println("Oviraptor memiliki 2 kaki belakang yang panjang "
                            + "sehingga disebut pelari yang baik.");
    }

    @Override
    public void bertelur() {
        System.out.println("Kaki belakang berjongkok secara simetris di setiap "
                            + "sisi sarang dan kaki depan menutupi batas \nsarang "
                            + "merupakan postur Oviraptor bertelur dan mengerami "
                            + "telurnya hingga menetas.");
    }   
}
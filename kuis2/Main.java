package kuis2;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah
 * Kuis 2 - Teori & Praktikum PBO
 */
public class Main {
    public static void main(String[] args){
        TyrannosaurusRex trex = new TyrannosaurusRex();
        Triceratops tricera = new Triceratops();
        Oviraptor ovi = new Oviraptor();
        
        System.out.println("=====||PROGRAM SPESIES DINOSAURUS||=====");
        System.out.println("---------------------------------------------------");
        AnakPemburu hunterSon = new AnakPemburu("Peter Jay", "Peter James", "M");
        hunterSon.berburu(trex);
        System.out.println();
        hunterSon.mengambilTelur(ovi);
        System.out.println("Berikut proses bertelur dan mengerami Oviraptor: ");
        ovi.bertelur();
        System.out.println();
        System.out.println("---------------------------------------------------");
        AnakPemburu hunterDaughter = new AnakPemburu("Shasha", "Shaine", "F");
        hunterDaughter.berburu(trex);
        System.out.println();
        hunterDaughter.mengambilTelur(tricera);
    }
}
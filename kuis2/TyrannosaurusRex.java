package kuis2;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah
 * Kuis 2 - Teori & Praktikum PBO
 */
public class TyrannosaurusRex extends Dinosaurus{

    @Override
    public void makan(){
        System.out.println("Tyrannosaurus Rex adalah seekor predator pemakan bangkai.");
    }

    @Override
    public void berjalan() {
        System.out.println("Menurut hasil riset University of Manchester menggunakan rekayasa "
                            + "\nMultibody Dynamic Analysis yang dikombinasikan dengan Machine "
                            + "Learning, \ndisimpulkan bahwa Tyrannosaurus Rex berjalan "
                            + "dengan kecepatan terbatas sekitar 18 km / jam.");
    }
}
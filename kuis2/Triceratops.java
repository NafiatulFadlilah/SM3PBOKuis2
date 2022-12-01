package kuis2;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah
 * Kuis 2 - Teori & Praktikum PBO
 */
public class Triceratops extends Dinosaurus{

    @Override
    public void makan() {
        System.out.println("Triceratops adalah dinosaurus herbivora yang memakan "
                            + "\ntumbuh-tumbuhan seperti daun palem, pakis, dan sikas.");
    }

    @Override
    public void berjalan() {
        System.out.println("Triceratops berjalan dengan jari kaki yang mengarah "
                            + "ke luar, \npostur primitif yang sering ditemukan "
                            + "pada mayoritas dinosaurus.");
    }
}
package com.pbo;

import java.util.Scanner;

/*
 * #Author
 * Nama  : Agung Sepruloh
 * NIM   : 10118902
 * Kelas : IF-11K
 * Deskripsi Program : program ini berguna untuk melakukan perhitungan terhadap sebuah lingkaran
 *
 */

public class Latihan38PerhitunganLingkaran {

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
	    Lingkaran lingkaran = new Lingkaran();
        System.out.println("===== Perhitungan Lingkaran =====");
        System.out.print("Masukan nilai diameter lingkaran: ");
        Scanner scanner = new Scanner(System.in);
        String diameter = scanner.nextLine();

        while (!isInteger(diameter)) {
            System.out.println("Nilai diameter tidak sesuai!");
            System.out.print("\nMasukan nilai diameter lingkaran: ");
            diameter = scanner.nextLine();
        }

        lingkaran.diameter = Float.valueOf(diameter);
        System.out.println("===== Hasil Perhitungan Lingkaran =====");
        System.out.println(String.format("Jari-jari Lingkaran\t: %.2f cm", lingkaran.hitungJariJari()));
        System.out.println(String.format("Luas Lingkaran\t\t: %.2f cm", lingkaran.hitungLuas()));
        System.out.println(String.format("Keliling Lingkaran\t: %.2f cm", lingkaran.hitungKeliling()));
    }
}

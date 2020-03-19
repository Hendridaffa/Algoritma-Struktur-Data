/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestSearching;

/**
 *
 * @author ASUS ROG
 */
public class TestSearchingMain {

    public static void main(String[] args) {
        int data[] = {10, 30, 40, 50, 60, 70, 80, 90};

        TestSearching pencarian = new TestSearching(data, 8);
        System.out.println("Isi ARRAY :");
        pencarian.TampilData();

        int cari = 30;

        System.out.println("Menggunakan Sequential Search");
        int posisi = pencarian.FindSeqSearch(cari);
        if (posisi != -1) {
            System.out.println("Data : " + cari + " ditemukan pada indeks " + posisi);

        } else {
            System.out.println("Data " + cari + "tidak ditemukan");
        }
    }
}

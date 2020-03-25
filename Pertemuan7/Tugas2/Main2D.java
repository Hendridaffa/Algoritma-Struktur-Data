/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

import java.util.Scanner;

/**
 *
 * @author ASUS ROG
 */
public class Main2D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data[][] = {
            {45, 78, 7, 200, 80},
            {90, 1, 17, 100, 50},
            {21, 2, 40, 18, 65}
        };
        Cari2D pencarian = new Cari2D(data, 3, 5);

        System.out.println("Isi Array : ");
        pencarian.TampilData();

        System.out.print("Masukkan data yang ingin dicari : ");
        int cari = sc.nextInt();

        System.out.println("Menggunakan Sequential Search");
        pencarian.FindSeqSearch(cari);
        if (Cari2D.brs != -1 && Cari2D.klm != -1) {
            System.out.println("Data : " + cari + " Ditemukan pada indeks baris : " + Cari2D.brs + " dan kolom : " + Cari2D.klm);
        } else {
            System.out.println("Data " + cari + " Tidak ditemukan");
        }
    }
}

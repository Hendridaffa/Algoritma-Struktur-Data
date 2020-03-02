/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu3.Jobsheet3;

import java.util.Scanner;

/**
 *
 * @author ASUS ROG
 */
public class MainTugas2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jumlah = sc.nextInt();

        NilaiAlgoritma[] na = new NilaiAlgoritma[jumlah];

        for (int i = 0; i < jumlah; i++) {
            sc.nextLine();
            na[i] = new NilaiAlgoritma();
            System.out.print("Mahasiswa ke-" + (i + 1) + " : ");
            na[i].namaMhs = sc.nextLine();
            System.out.print("Masukkan Nilai Tugas ");
            na[i].nilaiTugas = sc.nextInt();
            System.out.print("Masukkan Nilai Kuis ");
            na[i].nilaiKuis = sc.nextInt();
            System.out.print("Masukkan Nilai UTS ");
            na[i].nilaiUTS = sc.nextInt();
            System.out.print("Masukkan Nilai UAS ");
            na[i].nilaiUAS = sc.nextInt();
            System.out.println("");
        }

        for (int i = 0; i < jumlah; i++) {
            System.out.println("total Nilai " + na[i].namaMhs + " adalah "+ na[i].hitungTotalNilai());
        }
    }
}

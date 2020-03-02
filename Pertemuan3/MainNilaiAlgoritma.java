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
public class MainNilaiAlgoritma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
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

        System.out.println("");
        System.out.println("================================================================");
        System.out.println("Total Nilai Mahasiswa Mata Kuliah Algoritma dan Struktur Data");
        System.out.println("================================================================");

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Mahasiswa Ke-" + (i + 1) + " : " + na[i].namaMhs);
            System.out.println("Nilai Tugas\t: " + na[i].nilaiTugas + ", Nilai Kuis\t\t: " + na[i].nilaiKuis);
            System.out.println("Nilai UTS\t: " + na[i].nilaiUTS + ", Nilai UAS\t\t: " + na[i].nilaiUAS);
            System.out.println("Total Nilai Mahasiswa : " + na[i].hitungTotalNilai(na[i].nilaiTugas, na[i].nilaiKuis, na[i].nilaiUTS, na[i].nilaiUAS));
            System.out.println("");
        }
        System.out.println("================================================================");
        System.out.println("");

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Nilai Total Mahasiswa : " + na[i].hitungTotalNilai(na[i].nilaiTugas, na[i].nilaiKuis, na[i].nilaiUTS, na[i].nilaiUAS / 4));
        }
    }
}

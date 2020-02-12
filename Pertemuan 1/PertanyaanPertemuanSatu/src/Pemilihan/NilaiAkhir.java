/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pemilihan;

import java.util.Scanner;

/**
 *
 * @author ASUS ROG
 */
public class NilaiAkhir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Tugas, UTS, UAS;
        String nama;
        double na;

        System.out.println("Menghitung nilai akhir");
        System.out.println("--------------------------------------------");
        System.out.print("Nama Mahasiswa \t: ");
        nama = sc.nextLine();
        System.out.print("Nilai Tugas \t: ");
        Tugas = sc.nextInt();
        if (Tugas > 100 || Tugas < 0) {
            System.out.println("Nilai yang dimasukkan salah");
        } else {
            System.out.print("Nilai UTS \t: ");
            UTS = sc.nextInt();
            if (UTS > 100 || UTS < 0) {
                System.out.println("Nilai yang dimasukkan salah");
            } else {
                System.out.print("Nilai UAS \t: ");
                UAS = sc.nextInt();
                if (UAS > 100 || UAS < 0) {
                    System.out.println("Nilai yang dimasukkan salah");
                } else {
                    na = (Tugas * 0.2) + (UTS * 0.35) + (UAS * 0.45);
                    System.out.printf("Nilai Akhir \t: %.2f", na);
                    System.out.println();
                    System.out.println("--------------------------------------------");
                }
            }
        }

    }
}
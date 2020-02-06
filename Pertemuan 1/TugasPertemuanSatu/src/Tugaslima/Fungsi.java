/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugaslima;
import java.util.Scanner;
/**
 *
 * @author ASUS ROG
 */
public class Fungsi {
    static Scanner sc = new Scanner(System.in);
    static void menu() {
        System.out.println("Daftar Menu");
        System.out.println("1. Luas Segitiga");
        System.out.println("2. Luas Segiempat");
        System.out.println("3. Luas Lingkaran");
        System.out.println("4. Exit");
    }

    static void memilih() {
        int menu;
        System.out.print("Pilih menu: ");
        menu = sc.nextInt();
        switch (menu) {

            case 1:
                Segitiga();
                System.out.println("-----------------------");
                menu();
                memilih();
                break;

            case 2:
                Segiempat();
                System.out.println("-----------------------");
                menu();
                memilih();
                break;

            case 3:
                Lingkaran();
                System.out.println("-----------------------");
                menu();
                memilih();
                break;

            case 4:
                System.exit(0);

            default:
                System.out.println("Menu yang anda masukkan tidak ada!");
        }
    }

    static void Segitiga() {
        int alas, tinggi;
        float luas;
        System.out.print("Masukkan Alas: ");
        alas = sc.nextInt();
        System.out.print("Masukkan Tinggi: ");
        tinggi = sc.nextInt();
        luas = alas * tinggi / 2;
        System.out.println("Luas Segitiga = " + luas);
        System.out.println();
    }

    static void Segiempat() {
        int sisi, luas;
        System.out.print("Masukkan Sisi: ");
        sisi = sc.nextInt();
        luas = sisi * sisi;
        System.out.println("Luas Segiempat = " + luas);
        System.out.println();
    }

    static void Lingkaran() {
        float phi = 3.14F, jari2, luas;
        System.out.print("Masukkan jari-jari : ");
        jari2 = sc.nextInt();
        luas = phi * jari2 * jari2;
        System.out.print("luas = " + luas);
        System.out.println();
    }

    public static void main(String[] args) {
        menu();
        memilih();
    }
}

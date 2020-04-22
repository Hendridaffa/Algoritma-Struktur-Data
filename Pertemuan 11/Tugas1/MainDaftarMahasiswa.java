/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;
import java.util.Scanner;

/**
 *
 * @author ASUS ROG
 */
public class MainDaftarMahasiswa {

    public static void main(String[] args) {
        DaftarMahasiswa data = new DaftarMahasiswa();
        Scanner sc = new Scanner(System.in);
        try {
            data.addFirst(1941720097, "Naufal Mahardika", "Perum. kalianyar Kav.17");
            data.print();
            data.add(1941720086, "Andika Syahputra", "Jl. Pahlawan No.876", 1);
            data.print();
            data.addFirst(1941720123, "Farrel Zidan", "Kembang Turi No. 46 B");
            data.print();
            data.addByValue(1941720097, 1941720076, "ABCD123", "ABC123");
            data.print();
            data.removeByValue(1941720076);
            data.print();
            data.clear();
            int pilih = 0, pilih1, idx, Nim;
            String Nama, Alamat;
            do {
                try {
                    System.out.println("Menu");
                    System.out.println("1. Tambah");
                    System.out.println("2. Hapus");
                    System.out.println("3. Cari");
                    System.out.println("4. Keluar");
                    System.out.print("Masukkan pilihan : ");
                    pilih = sc.nextInt();
                    switch (pilih) {
                        case 1:
                            System.out.println("Submenu Tambah");
                            System.out.println("1. Tambah (First)");
                            System.out.println("2. Tambah (Index)");
                            System.out.println("3. Tambah (Last)");
                            System.out.print("Masukkan pilihan : ");
                            pilih1 = sc.nextInt();
                            switch (pilih1) {
                                case 1:
                                    System.out.println("Tambah (First)");
                                    System.out.print("Masukkan NIM\t: ");
                                    Nim = sc.nextInt();
                                    sc.nextLine();
                                    System.out.print("Masukkan Nama\t: ");
                                    Nama = sc.nextLine();
                                    System.out.print("Masukkan Alamat\t: ");
                                    Alamat = sc.nextLine();
                                    data.addFirst(Nim, Nama, Alamat);
                                    break;
                                case 2:
                                    System.out.println("Tambah (Index)");
                                    System.out.print("Masukkan NIM\t: ");
                                    Nim = sc.nextInt();
                                    sc.nextLine();
                                    System.out.print("Masukkan Nama\t: ");
                                    Nama = sc.nextLine();
                                    System.out.print("Masukkan Alamat\t: ");
                                    Alamat = sc.nextLine();
                                    data.addFirst(Nim, Nama, Alamat);
                                    System.out.print("Masukkan index\t: ");
                                    idx = sc.nextInt();
                                    data.add(Nim, Nama, Alamat, idx);
                                    break;
                                case 3:
                                    System.out.print("Masukkan NIM\t: ");
                                    Nim = sc.nextInt();
                                    sc.nextLine();
                                    System.out.print("Masukkan Nama\t: ");
                                    Nama = sc.nextLine();
                                    System.out.print("Masukkan Alamat\t: ");
                                    Alamat = sc.nextLine();
                                    data.addLast(Nim, Nama, Alamat);
                                    break;
                            }
                            data.print();
                            break;
                        case 2:
                            System.out.println("Submenu Hapus");
                            System.out.println("1. Hapus (Index)");
                            System.out.println("2. Hapus (Key)");
                            System.out.println("3. Clear");
                            System.out.print("Masukkan pilihan : ");
                            pilih1 = sc.nextInt();
                            switch (pilih1) {
                                case 1:
                                    System.out.println("Hapus (Index)");
                                    System.out.print("Masukkan Index : ");
                                    idx = sc.nextInt();
                                    data.remove(idx);
                                    break;
                                case 2:
                                    System.out.println("Hapus (Key)");
                                    System.out.print("Masukkan NIM : ");
                                    Nim = sc.nextInt();
                                    data.removeByValue(Nim);
                                    break;
                                case 3:
                                    data.clear();
                                    break;
                            }
                            data.print();
                            break;
                        case 3:
                            System.out.println("Submenu Cari");
                            System.out.println("1. Cari (Index)");
                            System.out.println("2. Cari (Key)");
                            System.out.print("Masukkan pilihan : ");
                            pilih1 = sc.nextInt();
                            switch (pilih1) {
                                case 1:
                                    System.out.println("Mencari (Index)");
                                    System.out.print("Masukkan Index : ");
                                    idx = sc.nextInt();
                                    data.cari(idx);
                                    break;
                                case 2:
                                    System.out.println("Mencari (Key)");
                                    System.out.print("Masukkan NIM : ");
                                    Nim = sc.nextInt();
                                    data.cariKey(Nim);
                                    break;
                            }
                            break;
                        case 4:
                            System.out.println("Keluar Program");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Pilihan Salah!");
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                System.out.println();
            } while (pilih != 4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

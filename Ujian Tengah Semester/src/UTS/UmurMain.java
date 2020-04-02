package UTS;

import java.util.Scanner;

/**
 *
 * @author ASUS ROG
 */
public class UmurMain {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        Umur uts = new Umur();
        System.out.print("Masukkan jumlah anggota keluarga\t: ");
        int jumlahData = sc.nextInt();
        uts.Umur(jumlahData);
        sc.nextLine();

        for (int i = 0; i < jumlahData; i++) {
            System.out.printf("Input Data Anggota Keluarga %d ", (i + 1));
            System.out.println("Data anggota keluarga ke-" + (i + 1));
            System.out.print("Masukkan Nama: ");
            String nama = s1.nextLine();
            System.out.print("Masukkan Status: ");
            String status = s1.nextLine();
            System.out.print("Masukkan Umur: ");
            int umur = sc.nextInt();
            System.out.println();
            
            DataKeluarga dk = new DataKeluarga(nama, status, umur);
            uts.tambah(dk);
        }
        System.out.println("Pengurutan Berdasarkan Umur termuda-tertua");
        uts.selectionSortAsc();
        uts.tampil();
        System.out.print("Cari anggota keluarga berdasarkan umur\t: ");
        int cari = sc.nextInt();
        int posisi = uts.FindBinarySearch(cari, 0, jumlahData);
        uts.Tampilpoisisi(cari, posisi);
    }
}

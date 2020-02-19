
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ASUS ROG
 */
public class ProgramNilai {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Nilai nl = new Nilai();
        System.out.print("Masukkan jumlah mahasiswa : ");
        nl.jumlah = input.nextInt();
        Nilai[] nilai = new Nilai[nl.jumlah];

        for (int i = 0; i < nilai.length; i++) {
            nilai[i] = new Nilai();

            System.out.println("Mahasiswa ke-" + (i + 1) + " : ");
            System.out.print("Masukkan Nilai ke 1 : ");
            nilai[i].nilai1 = input.nextInt();
            System.out.print("Masukkan Nilai ke 2 : ");
            nilai[i].nilai2 = input.nextInt();
        }

        System.out.println();

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai Mahasiswa Terbaik ke-" + (i + 1) + " : " + nl.max(nilai[i].nilai1, nilai[i].nilai2));
        }

    }
}
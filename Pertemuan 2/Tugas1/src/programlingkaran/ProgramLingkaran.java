/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programlingkaran;

import java.util.Scanner;

/**
 *
 * @author ASUS ROG
 */
public class ProgramLingkaran {

    public static void main(String[] args) {
        Lingkaran L1 = new Lingkaran();
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Jari-jari : ");
        L1.r = sc.nextInt();
        System.out.println("Luas Lingkaran  : " + L1.hitungLuas());
        System.out.println("Keliling Lingkaran :" + L1.hitungKeliling());
    }
}

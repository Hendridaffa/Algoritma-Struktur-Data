/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perulangan;

import java.util.Scanner;

/**
 *
 * @author ASUS ROG
 */
public class Saldo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Saldo;
        double Bunga;

        System.out.println("Saldo bank selama 12 bulan dengan bunga 2%");
        System.out.print("Masukkan saldo awal: Rp ");
        Saldo = sc.nextInt();
        System.out.println("Saldo bulan ke-1: Rp" + Saldo);
        for (int i = 2; i <= 12; i++) {
            Bunga = Saldo * 0.02;
            Saldo += Bunga;
            System.out.println("Saldo bulan ke-" + (i) + ": Rp" + Saldo);
        }
    }
}

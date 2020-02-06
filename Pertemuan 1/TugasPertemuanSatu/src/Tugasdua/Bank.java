/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugasdua;
import java.util.Scanner;

/**
 *
 * @author ASUS ROG
 */
public class Bank {
    public static void main(String[] args) {
        int Bulan = 0;
        double uang = 1000000, bunga = 0.02;
        System.out.printf("Uang Anda : Rp%,.2f\n", uang);
        for (Bulan = 0; uang < 1500000; Bulan++){
            uang += uang * bunga;
        }
        System.out.printf("Dalam waktu : %d Bulan\nUang anda : Rp%,.2f", Bulan, uang);
    }
}

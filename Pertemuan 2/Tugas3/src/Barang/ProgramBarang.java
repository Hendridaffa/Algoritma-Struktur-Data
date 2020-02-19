/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Barang;

import java.util.Scanner;

/**
 *
 * @author ASUS ROG
 */
public class ProgramBarang {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Barang br = new Barang();

        System.out.print("Harga Barang : Rp. ");
        Barang.hargaSatuan = input.nextInt();
        System.out.print("Jumlah barang : ");
        Barang.jumlah = input.nextInt();

        System.out.println("Harga Satuan\t\t = " + Barang.hargaSatuan);
        System.out.println("Harga Total \t\t = " + Barang.hitungHargaBayar());
    }
}

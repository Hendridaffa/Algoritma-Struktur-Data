/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 *
 * @author ASUS ROG
 */
public class MainTugas3 {

    public static void main(String[] args) {
        int data[] = {12, 17, 2, 1, 70, 50, 90, 17, 2, 90}, pos = -1;
        System.out.println("Sorting menggunakan Merge sort");
        Tugas3 mSort = new Tugas3();
        System.out.println("Data Awal");
        mSort.printArray(data);
        mSort.mergeSort(data);
        System.out.println("Setelah Diurutkan");
        mSort.printArray(data);

        int cari = data[data.length - 1];

        System.out.println("Data Terbesar adalah " + cari);

        System.out.println("================================");
        System.out.println("Menggunakan Binary Search");
        Tugas3 pencarian = new Tugas3(data, 10);
        for (int i = 0; i < data.length; i++) {
            int posisi = pencarian.FindBinarySearch(cari, i, data.length - 1);
            if (pos == posisi) {
                continue;
            }
            pos = posisi;
            pencarian.Tampilpoisisi(cari, posisi);
        }

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan1;

/**
 *
 * @author ASUS ROG
 */
public class ContohBigO {

    public static void ContohBig0(int[] angka) {
        System.out.println("Pairs : ");
        int n = angka.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(angka[i] + "-" + angka[j]);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(angka[i] + "-" + angka[j]);
            }
        }
    }

    public static void main(String[] args) {
    }

}

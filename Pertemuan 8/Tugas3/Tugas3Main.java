/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

import java.util.Scanner;

/**
 *
 * @author ASUS ROG
 */
public class Tugas3Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P, Q, eksp = "";
        System.out.println("Masukkan ekspresi Matematika: ");
        Q = sc.nextLine();
        for (int i = (Q.length() - 1); i >= 0; i--) {
            eksp = eksp + Q.charAt(i);
        }
        eksp = eksp.trim();
        eksp = eksp + "(";

        int total = eksp.length();

        Tugas3 pref = new Tugas3(total);
        P = pref.konversi(eksp);
        System.out.println("Prefix: " + new StringBuffer(P).reverse());
    }
}

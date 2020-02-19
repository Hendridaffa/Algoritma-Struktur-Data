/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programjajargenjang;

import java.util.Scanner;

/**
 *
 * @author ASUS ROG
 */
public class ProgramJajarGenjang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JajarGenjang[] jg = new JajarGenjang[5];

        for (int i = 0; i < 4; i++) {
            jg[i] = new JajarGenjang();

            System.out.println("Jajar genjang ke- " + i);
            System.out.println("Masukkan panjang alas : ");
            jg[i].alas = sc.nextInt();
            System.out.print("Masukkan tinggi : ");
            jg[i].tinggi = sc.nextInt();
            System.out.println("Masukkan sisi miring : ");
            jg[i].sisiMiring = sc.nextInt();

            System.out.println("Luas Jajar Genjang ke-" + (i + 1) + "    : " + jg[i].luas());
            System.out.println("Keliling Jajar Genjang ke-" + (i + 1) + "    : " + jg[i].keliling());
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

import java.util.Scanner;

/**
 *
 * @author ASUS ROG
 */
public class ProgramDiagram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Toko Persewaan Video Game ");

        Diagram dg = new Diagram();

        Diagram[] sewa = new Diagram[3];
        sewa[0] = new Diagram();
        sewa[0].id = 2527;
        sewa[0].game = "Watch Dog 2";
        sewa[0].harga = 15000;

        sewa[1] = new Diagram();
        sewa[1].id = 2528;
        sewa[1].game = "GTA V";
        sewa[1].harga = 17000;

        sewa[2] = new Diagram();
        sewa[2].id = 2529;
        sewa[2].game = "COD 4";
        sewa[2].harga = 14000;
        
        System.out.println("Game");
        for (int i = 0; i < sewa.length; i++) {
            System.out.println((i + 1) + ".) " + sewa[i].game);
        }

        System.out.print("Masukkan pilihan : ");
        dg.select = input.nextInt();

        if (dg.select > 0 && dg.select <= (sewa.length)) {

            System.out.print("Lama waktu sewa : ");
            dg.hari = input.nextInt();

            System.out.println("\tStruk PEMINJAMAN");
            System.out.println("ID\t\t = " + sewa[(dg.select - 1)].id);
            System.out.println("Game\t\t = " + sewa[(dg.select - 1)].game);
            System.out.println("Lama Waktu Sewa = " + dg.hari + " Hari ");
            System.out.println("Harga Total\t = " + (sewa[(dg.select - 1)].harga * dg.hari));

        } else {
            System.exit(0);
        }
    }
}

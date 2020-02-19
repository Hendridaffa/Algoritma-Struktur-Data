/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacMan;

import java.util.Scanner;

/**
 *
 * @author ASUS ROG
 */
public class ProgramPacMan {

    static Scanner input = new Scanner(System.in);

    public static void setting() {
        System.out.println("Game PacMan : ");
        System.out.println("w = bergerak ke atas");
        System.out.println("s = bergerak ke bawah");
        System.out.println("a = bergerak ke kiri");
        System.out.println("d = bergerak ke kanan");

    }

    public static void warning() {
        System.out.println("\n\nMohon masukkan input yang tepat !!!\n\n");
        input();

    }

    public static void over() {
        System.out.println("\n\nKoordinat tidak boleh kurang dari 0 !!!\n\n");
        input();
    }

    public static void input() {
        PacMan pc = new PacMan();
        PacMan.width = 5;
        PacMan.height = 5;

        setting();
        System.out.print("\nMasukkan kontrol : ");
        PacMan.select = input.nextLine().toLowerCase();

        switch (PacMan.select) {
            case "w":
                if ((PacMan.y - 1) < 0) {
                    over();
                }
                break;
            case "s":
                if ((PacMan.y + 1) >= PacMan.width) {
                    over();
                }

                break;
            case "a":
                if ((PacMan.x - 1) < 0) {
                    over();
                }
                break;
            case "d":
                if ((PacMan.x + 1) >= PacMan.height) {
                    over();
                }
                break;
            default:
        }

        switch (PacMan.select) {
            case "w":
                PacMan.moveUp();
                break;
            case "s":
                PacMan.moveDown();
                break;
            case "a":
                PacMan.moveLeft();
                break;
            case "d":
                PacMan.moveRight();
                break;
            default:
                warning();
        }

        PacMan.printPosition();
        System.out.println("Titik Koordinat adalah (" + PacMan.x + " , " + PacMan.y + ")");
        input();
    }

    public static void main(String[] args) {
        input();
    }
}

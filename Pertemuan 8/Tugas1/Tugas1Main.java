package Tugas1;

import java.util.Scanner;

/**
 *
 * @author ASUS ROG
 */
public class Tugas1Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kalimat\t : ");
        String kalimat = sc.nextLine();
        String kata[] = kalimat.split("\\s+");
        Tugas1 tumpukan = new Tugas1(kata.length);

        for (int i = 0; i < kata.length; i++) {
            tumpukan.push(kata[i]);
        }

        tumpukan.print();
        
        tumpukan.pop();
        tumpukan.peek();
        tumpukan.print();
    }
}

package Tugassatu;
import java.util.Scanner;

/**
 *
 * @author ASUS ROG
 */
public class waralaba {
    public static void main(String[] args) {
            int belanjaan = 0, bayar, total = 0,jumlah;
        String barang;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("          TOKO WARALABA        ");
        System.out.println("PAKET CHIKEN");
        System.out.println("Chiken A\t\t\t: Rp.12000 ");
        System.out.println("Chiken B\t\t\t: Rp.15000");
        System.out.println("Chiken C\t\t\t: Rp.20000");
        
        System.out.println("PAKET OKE");
        System.out.println("Oke A\t\t\t\t: Rp.10000 ");
        System.out.println("Oke B\t\t\t\t: Rp.12000");
        System.out.println("Oke C\t\t\t\t: Rp.15000");
        System.out.print("Jenis barang yang di beli\t: ");
        barang = scan.nextLine();
        System.out.print("Jumlah barang yang dibeli\t: ");
        jumlah = scan.nextInt();
        switch(barang){
            case "Chiken A":
                belanjaan = 12000;
            break;
            case "Chiken B":
                belanjaan = 15000;
            break;
            case "Chiken C":
                belanjaan = 20000;
            break;
             case "Oke A":
                belanjaan = 10000;
            break;
            case "Oke B":
                belanjaan = 12000;
            break;
            case "Oke C":
                belanjaan = 15000;
            break;
        }
         total = jumlah * belanjaan;
        System.out.println("==================================================");
        System.out.println("Total Bayar\t\t\t: Rp." + total);
        System.out.println("==================================================");
        
    }
}

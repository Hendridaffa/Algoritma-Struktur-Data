/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugastiga;
import java.util.Scanner;
/**
 *
 * @author ASUS ROG
 */
public class Fibonaci {
    public static void main(String[] args) {
        
        String kalimat;
        int PanjangKalimat, JumlahHuruf = 1;
         Scanner scan = new Scanner(System.in);
         System.out.println("Masukkan kalimat : ");
         kalimat = scan.nextLine();
         char [] arrHuruf = kalimat.toCharArray();
         PanjangKalimat = arrHuruf.length;
         
         for(int i = 0; i < PanjangKalimat; i++) {
             for(int j=0; j < PanjangKalimat; j++){
                 if(arrHuruf[i]!=' '){
                     if(i!=j&&(arrHuruf[i]==arrHuruf[j])){
                         JumlahHuruf++;
                         arrHuruf[j]=' ';
                     }
                     if(j==PanjangKalimat-1){
                         System.out.println("Jumlah huruf  '"+arrHuruf[i]+"' = "+JumlahHuruf);
                         JumlahHuruf=1;
                     }
                 }
             }
         }
    }
}

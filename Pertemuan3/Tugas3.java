/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu3.Jobsheet3;

/**
 *
 * @author ASUS ROG
 */
public class Tugas3 {
  String namaMhs;
    int nilaiTugas;
    int nilaiKuis;
    int nilaiUAS;
    int nilaiUTS;
    int jumlah;
    double total;
    
    double hitungTotalNilai(){
        total= (nilaiTugas*30/100) + (nilaiKuis*20/100)+ 
                (nilaiUTS*20/100)+ (nilaiUAS*30/100);
        return total;
    }  
}

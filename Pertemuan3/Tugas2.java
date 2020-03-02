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
public class Tugas2 {
    public String namaMhs;
    public int nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;
    public int total, jumlah;

    public double hitungTotalNilai(int nt, int nk, int nu, int na) {
        return ((nt * 30 / 100) + (nk * 20 / 100) + (nu * 20 / 100) + (na * 30 / 100));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author ASUS ROG
 */
public class Fibonacci {

    static int fibo(int angka) {
        if (angka == 0 || angka == 1) {
            return angka;
        } else {
            return (fibo(angka - 1) + fibo(angka - 2));
        }
    }
}

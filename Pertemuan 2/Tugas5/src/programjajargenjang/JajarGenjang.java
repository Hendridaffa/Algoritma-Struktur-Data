/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programjajargenjang;

/**
 *
 * @author ASUS ROG
 */
public class JajarGenjang {

    public int alas;
    public int tinggi;
    public int sisiMiring;

    public int luas() {
        return alas * tinggi;
    }

    public int keliling() {
        return 2 * alas + 2 * sisiMiring;
    }
}

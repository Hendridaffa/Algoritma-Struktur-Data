package UTS;

/**
 *
 * @author ASUS ROG
 */
public class DataKeluarga {
    String nama, posisi;
    int umur;

    DataKeluarga(String nm, String pos, int um) {
        nama = nm;
        posisi = pos;
        umur = um;
    }

    void tampil() {
        System.out.println("Nama: " + nama);
        System.out.println("Posisi: " + posisi);
        System.out.println("Umur: " + umur);
    }
}

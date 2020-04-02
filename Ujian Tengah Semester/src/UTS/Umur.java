/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

/**
 *
 * @author ASUS ROG
 */
public class Umur {

    DataKeluarga DataKlg[];
    int idx;

    void UTS(int array) {
        DataKlg = new DataKeluarga[array];
    }

    void tambah(DataKeluarga t) {
        if (idx < DataKlg.length) {
            DataKlg[idx] = t;
            idx++;
        } else {
            System.out.println("Data Penuh!");
        }
    }

    void tampil() {
        for (DataKeluarga t : DataKlg) {
            t.tampil();
        }
    }

    void selectionSortAsc() {
        for (int i = 0; i < DataKlg.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < DataKlg.length; j++) {
                if (DataKlg[j].umur < DataKlg[idxMin].umur) {
                    idxMin = j;
                }
            }
            DataKeluarga tmp = DataKlg[idxMin];
            DataKlg[idxMin] = DataKlg[i];
            DataKlg[i] = tmp;
        }
    }

    public int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == DataKlg[mid].umur) {
                return (mid);
            } else if (DataKlg[mid].umur > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    public void Tampilpoisisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("Ada anggota keluarga yang berumur "+x+" tahun");
        } else {
            System.out.println("Tidak ada anggota keluarga yang berumur "+x+" tahun");
        }
    }

    public void TampilCari(int x) {
        DataKlg[x].tampil();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author ASUS ROG
 */
public class DaftarMahasiswa {

    Mahasiswa head;
    int size;

    public DaftarMahasiswa() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int Nim, String Nama, String Alamat) {
        head = new Mahasiswa(Nim, Nama, Alamat, head);
        size++;
    }

    public void add(int Nim, String Nama, String Alamat, int idx) throws Exception {
        if (idx < 0 || idx > size) {
            throw new Exception("Nilai Index di Luar Batas!");
        }
        if (isEmpty() || idx == 0) {
            addFirst(Nim, Nama, Alamat);
        } else {
            Mahasiswa tmp = head;
            for (int i = 1; i < idx; i++) {
                tmp = tmp.next;
            }
            Mahasiswa next = (tmp == null) ? null : tmp.next;
            tmp.next = new Mahasiswa(Nim, Nama, Alamat, next);
            size++;
        }
    }

    public void addLast(int Nim, String Nama, String Alamat) {
        if (isEmpty()) {
            addFirst(Nim, Nama, Alamat);
        } else {
            Mahasiswa tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Mahasiswa(Nim, Nama, Alamat, null);
            size++;
        }
    }

    public Object getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Kosong!");
        }
        return head.nim;
    }

    public Object getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Kosong!");
        }
        Mahasiswa tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.nim;
    }

    public Object get(int idx) throws Exception {
        if (isEmpty() || idx >= size) {
            throw new Exception("Nilai index diluar batas!");
        }
        Mahasiswa tmp = head;
        for (int i = 0; i < idx; i++) {
            tmp = tmp.next;
        }
        return tmp.nim;
    }

    public void remove(int idx) throws Exception {
        if (isEmpty() || idx >= size) {
            throw new Exception("Nilai Index di luar batas!");
        } else if (isEmpty() || idx == 0) {
            removeFirst();
        } else {
            Mahasiswa prev = head;
            Mahasiswa cur = head.next;
            for (int i = 1; i < idx; i++) {
                prev = cur;
                cur = prev.next;
            }
            prev.next = cur.next;
            size--;
        }
    }

    public void removeFirst() throws Exception {
        head = head.next;
        size--;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Mahasiswa tmp = head;
            System.out.println("Data Mahasiswa: ");
            while (tmp != null) {
                System.out.println("NIM\t: " + tmp.nim);
                System.out.println("Nama\t: " + tmp.nama);
                System.out.println("Alamat\t: " + tmp.alamat);
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked List Kosong!");
        }
    }

    public void addByValue(int cari, int Nim, String Nama, String Alamat) throws Exception {
        Mahasiswa tmp = head;
        int idx = 0;
        boolean ditemukan = false;
        while (tmp.next != null) {
            tmp = tmp.next;
            idx++;
            if ((int) head.nim == cari) {
                ditemukan = true;
                break;
            } else if ((int) tmp.nim == cari) {
                ditemukan = true;
                idx++;
                break;
            }
        }
        if (ditemukan) {
            add(Nim, Nama, Alamat, idx);
        } else {
            throw new Exception("Data tidak ditemukan!");
        }
    }

    public void removeByValue(int cari) throws Exception {
        Mahasiswa tmp = head;
        int idx = 0;
        boolean ditemukan = false;
        while (tmp.next != null) {
            tmp = tmp.next;
            idx++;
            if ((int) head.nim == cari) {
                removeFirst();
                break;
            } else if ((int) tmp.nim == cari) {
                ditemukan = true;
                break;
            }
        }
        if (ditemukan) {
            remove(idx);
        } else {
            throw new Exception("Data tidak ditemukan!");
        }
    }

    public void cari(int idx) throws Exception {
        if (idx < 0 || idx > size) {
            throw new Exception("Nilai index diluar batas");
        } else {
            Mahasiswa tmp = head;
            for (int i = 0; i < idx; i++) {
                tmp = tmp.next;
            }
            System.out.println("Data pada indeks ke-" + idx + " adalah : ");
            System.out.println("NIM\t: " + tmp.nim);
            System.out.println("Nama\t: " + tmp.nama);
            System.out.println("Alamat\t: " + tmp.alamat);
        }
    }

    public void cariKey(int cari) throws Exception {
        Mahasiswa tmp = head;
        int idx = 0;
        boolean ditemukan = false;
        if (isEmpty()) {
            System.out.println("LinkedLists kosong");
        } else {
            while (tmp.next != null) {
                tmp = tmp.next;
                if ((int) head.nim == cari) {
                    ditemukan = true;
                    break;
                } else if ((int) tmp.nim == cari) {
                    ditemukan = true;
                    idx++;
                    break;
                }
                idx++;
            }
        }
        if (ditemukan) {
            System.out.println("NIM " + cari + " ditemukan pada indeks ke-" + idx);
        } else {
            throw new Exception("Data tidak ditemukan!");
        }
    }
}

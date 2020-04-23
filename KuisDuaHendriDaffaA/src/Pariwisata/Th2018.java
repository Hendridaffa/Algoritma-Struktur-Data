package Pariwisata;

/**
 *
 * @author ASUS ROG
 */
public class Th2018<T> {

    T data;
    Th2018<T> next;

    public Th2018(T data, Th2018<T> next) {
        this.data = data;
        this.next = next;
    }
}

package DivideConquer;

/**
 *
 * @author ASUS ROG
 */
public class GelangTower {

    static void towerofHanoi(int numDics, char source, char destination, char spare) {
        if (numDics == 1) {
            System.out.println("Pindah 1 gelang dari tower " + source + " ke Tower " + destination);
            return;
        }
        towerofHanoi(numDics - 1, source, spare, destination);
        System.out.println("Pindah Gelang " + numDics + " dari Tower " + source + " ke Tower " + destination);
        towerofHanoi(numDics - 1, spare, destination, source);
    }
    // Destintion = Tujuan
    // Source = Sumber

    public static void main(String args[]) {
        int n = 4; // Jumlah Gelang 
        towerofHanoi(n, 'A', 'C', 'B'); // A,B,C adalah nama Tower
    }
}

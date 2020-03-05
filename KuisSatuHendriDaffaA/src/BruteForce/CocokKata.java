package BruteForce;

/**
 *
 * @author ASUS ROG
 */
public class CocokKata {
    private static void match(char[] kata, char[] pattern) {
     int j;
     int pola = 0;
     for (int i = 0; i <= kata.length - pattern.length; i++) {
        j = 0;
        while (j < pattern.length && kata[i + j] == pattern[j]){
           j++;
        }
        if (j >= pattern.length) {
           pola++;
        }
     }
     if (pola > 0) {
        System.out.println("DATA COCOK");
     } else {
        System.out.println("DATA TIDAK COCOK");
     }
   }
   public static void main(String[] args) {
      char[] x = {'P', 'C', 'U', 'L', 'I'};
      char[] y = {'P', 'O', 'P', 'C', 'U', 'L', 'I', 'N', 'E'};
      match (y, x);
   }
}
package Tugas2;

/**
 *
 * @author ASUS ROG
 */
public class Node {
  int data;
    Node prev;
    Node next;
    
    Node (Node prev, int data, Node next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
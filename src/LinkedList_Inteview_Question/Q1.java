package LinkedList_Inteview_Question;
import java.util.Stack;
import java.util.TreeSet;
// print the middle of a given LinkedList
public class Q1 {
    Node head;
    Node tail;
    int size = 0;

    void insBeg(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    void insMid(int value,int index){
        Node node = head;
        if(node == null){
            return;
        }
        for(int i = 1; i<index;i++){
            node = node.next;
        }

        Node node1 = new Node(value);
            node1.next = node.next;
            node.next = node1;

            size++;
        }



    void insEnd(int value) {
        Node node = head;
        while (node.next != null) {
            node = node.next;
        }
        Node node1 = new Node(value);
        node1.next = node.next;
        node.next = node1;
        size++;
    }

    void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.value + "-->");
            node = node.next;
        }
        System.out.println("End");
    }
    void reverse(){
        Stack<Integer> s1 = new Stack<>();
        Node node = head;
        while(node!=null){
            s1.push(node.value);
            node = node.next;
        }
        while(!s1.isEmpty()){
            System.out.print(s1.pop()+"-->");
        }
        System.out.println("End");

    }
    void dupRem() {
        TreeSet<Integer> ts = new TreeSet<>();
        Node node = head;
        while(node != null){
            ts.add(node.value);
            node = node.next;
        }
        while(!ts.isEmpty()) {
            System.out.print(ts.pollFirst()+"-->");
        }
        System.out.println("End" + " Duplicate Removed and get sorted");
    }

    void delAny(int index){
        Node node = head;
        for(int i = 0;i<index;i++){
            System.out.print(node.value + "-->");
            node = node.next;
        }
        System.out.println("END");
        node.next = null;

    }
    void delLast(){
        Node node= head;
        while(node.next.next != null){
            System.out.print(node.value+"-->");
            node = node.next;
        }
        System.out.println(node.value);
        node.next = null;

    }
    boolean  palindrome(){
        Stack<Integer> s2 = new  Stack<>();
        Node node = head;
        while(node != null){
            s2.add(node.value);
        }
        int size1 = size/2;
        Node  node1 = head;
        for(int i=0;i<size1;i++){
            if(node1.value != s2.pop()){
                return false;
            }
        }
        return true;

    }
    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }



    public static void main(String[] args) {
        Q1 SL = new Q1();
        SL.insBeg(23);
        SL.insBeg(34);
        SL.insBeg(56);
        SL.insBeg(76);
        SL.insBeg(31);
        SL.insBeg(65);
        SL.insBeg(87);
        SL.insBeg(90);
        SL.insBeg(31);
        SL.insEnd(12);
        SL.insEnd(99);
        SL.insMid(67,4);
        SL.display();
        SL.reverse();
        SL.dupRem();
        boolean s = SL.palindrome();
        System.out.println("is palindrome"+s);
        SL.delLast();
        SL.delAny(4);
    }
}

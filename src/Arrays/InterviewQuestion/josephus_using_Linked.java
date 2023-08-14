package Arrays.InterviewQuestion;

public class josephus_using_Linked {
   static Node head;
    static Node tail;
   static class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

  static  void insBeg(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
    }
   static void display() {
        while (head != null) {
            System.out.print(head.value + "-->");
            head = head.next;
        }
        System.out.println("End");
    }

    public static void main(String[] args) {
        insBeg(3);
        insBeg(4);
        insBeg(7);
        insBeg(12);
        insBeg(98);
        insBeg(23);
        insBeg(78);
        insBeg(56);
          display();



        }
    }


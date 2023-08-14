package Arrays.InterviewQuestion;
import java.util.Scanner;
import java.util.TreeMap;

public class Test {
    public static class Address{
        String plotNo;
        String post;
        String state;

    Address(String plotNo,String post,String state) {
        this.plotNo = plotNo;
        this.post = post;
        this.state = state;
      }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, Address> tm = new TreeMap<>();
        System.out.print("Enter the number of people you want to enter: ");
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("Enter the Name:");
            String Name = sc.nextLine();
            System.out.println("plotNo:");
            String plotNo = sc.nextLine();
            System.out.println("post:");
            String post = sc.nextLine();
            System.out.println("Enter the state:");
            String state = sc.nextLine();
            Address temp = new Address(plotNo, post, state);
            tm.put(Name, temp);
        }
        System.out.println("Enter the person name you want to search: ");
        String name = sc.nextLine();
        Address temp = tm.get(name);
        if (tm.containsKey(name)) {
            System.out.println("plotNo: " + temp.plotNo);
            System.out.println("post: " + temp.post);
            System.out.println("state: " + temp.state);
        } else {
            System.out.println("The details for this person does not exist.");
        }
    }
}

package Arrays.InterviewQuestion;
import java.util.Scanner;
import java.util.TreeMap;
public class Method_Overiding {
    public static class Address{
        String plotNo;
        String post;
        String state;

        public Address(String plotNo, String post, String state) {
            this.plotNo = plotNo;
            this.post = post;
            this.state = state;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String,Address> nameAddress = new TreeMap<>();
        System.out.print("Enter the number of people: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details for person number: "+(i+1));
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter plotNo: ");
            String plotNo = sc.nextLine();
            System.out.print("Enter post: ");
            String post = sc.nextLine();
            System.out.print("Enter state: ");
            String state = sc.nextLine();
            Address temp = new Address(plotNo,post,state);
            nameAddress.put(name,temp);
        }

        System.out.print("Enter the name of the person to be searched: ");
        String X = sc.nextLine();

        if(nameAddress.containsKey(X)){
            System.out.println("Match found! Printing details: ");
            Address temp = nameAddress.get(X);
            System.out.println("plotNo: "+temp.plotNo);
            System.out.println("post: "+temp.post);
            System.out.println("state: "+temp.state);
          //  nameAddress.get(X);
        } else System.out.println("The details for this person does not exist.");
    }
}

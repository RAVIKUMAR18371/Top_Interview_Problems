package College_allsem_revise;
import java.util.Scanner;
public class Palindrome_integer {
    static String palindrome(String A,int n){
        for(int i = 0;i < n/2;i++){
            if(A.charAt(i) != A.charAt(n - i-1)){
                return "No";
            }
        }
        return "Yes";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer:");
        int number = sc.nextInt();
        String s = Integer.toString(number);
        String P = palindrome(s,s.length());
        System.out.println(P);

    }
}

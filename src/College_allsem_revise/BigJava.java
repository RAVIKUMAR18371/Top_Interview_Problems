package College_allsem_revise;
import java.util.Scanner;
public class BigJava {
    static int factorial(int n){
        int fact = n;
        for(int i = 1;i<n;i++){
            fact = fact * (n-i);
          System.out.print(fact+"\t");
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Factorial
        System.out.println("Enter the element you want factorial: ");
        int n = sc.nextInt();
        int P =  factorial(n);
        System.out.println();
        System.out.println("Total value get returned: " + P);
    }
}

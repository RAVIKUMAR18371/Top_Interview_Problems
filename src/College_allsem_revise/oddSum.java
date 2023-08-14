package College_allsem_revise;
import java.util.Scanner;
public class oddSum {
    static int oddSum(int n, int sum1){
        for(int i=1;i<=n;i++){
            if(n < 1){ // base case
                return -1;
            }
            else if(n % 2 != 0){
                if(i % 2 != 0){
                    sum1 = i + sum1;
                }

            }

        }
        return sum1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Odd value of N: ");
        int n = sc.nextInt();
        int sum1 = 0;
         int sum = oddSum(n,sum1);
        System.out.println("Sum of all odd numbers: " + sum);
    }
}

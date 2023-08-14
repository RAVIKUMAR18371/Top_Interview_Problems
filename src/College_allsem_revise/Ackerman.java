package College_allsem_revise;
import java.util.Scanner;
public class Ackerman {
    static int ack(int m , int n) {

        return m * n;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of M: ");
        int m = sc.nextInt();
        System.out.println("Enter the value of N: ");
        int n = sc.nextInt();

        if(m == 0){
            int j = ack(m,n+1);
            System.out.println("Condition satisfying with the sum of m+n: "+ j);
        }
        if(m > 0 && n == 0){
           int T = ack(m-1,1);
            System.out.println("Condition satisfying with the sum of m+n: "+ T);

        }
        if(m > 0 && n > 0){
            int  p = ack(m,n-1);
            int s = ack(m-1,p);

            System.out.println("Condition satisfying with the sum of m+n: "+ s);
        }
    }
}

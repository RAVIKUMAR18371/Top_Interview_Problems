package College_allsem_revise;

import java.util.Scanner;

public class encryptalgo_pow {
    public static int pow(int x,int n){
        if(n == 0){
            return 1;
        }
        //Find x to the n/2 recursively
        int t = pow(x , n/2);

        // if n is even, the result is equipped
        //if n is odd, the result is t squared times x

        if(n % 2==0){
            return t*t;
        }
        else{
            return t*t*x;

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        pow(x,n);
    }
}

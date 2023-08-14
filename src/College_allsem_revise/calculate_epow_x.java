package College_allsem_revise;

import java.util.Scanner;

public class calculate_epow_x {
    static void infiniteExp(int x,int n){
        System.out.print("sum of e^x = ");
        int fact = 1;
        double sum = 0;
        sum = sum + fact;
        double Totalsum = 0;
        for(int i = 1;i<=n;i++){
            sum = Math.pow(x,i);
            for(int p = i;p>=1;p--){
                fact = fact * (p);
                //System.out.print(fact+"\t");
            }
            sum = sum/fact;
            Totalsum = sum + Totalsum;
        }
        System.out.println(Totalsum);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        infiniteExp(x,n);

    }
}

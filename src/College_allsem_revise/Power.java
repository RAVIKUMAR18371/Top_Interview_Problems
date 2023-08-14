package College_allsem_revise;
import java.util.Scanner;
public class Power {
    static Double power(double x,int n){
        double v = Math.pow(x, 1) * Math.pow(x, n-1);
        return v;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        double x = sc.nextDouble();
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        Double p = power(x , n);
        System.out.print("the value of x^"+n+"-->");
        System.out.println(p);


    }
}

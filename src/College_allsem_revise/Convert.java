package College_allsem_revise;
import java.util.Scanner;
public class Convert {
    public static void main(String[] args) {
        double cm;
        int feet,inches,remainder;
        final double CM_PER_INCH = 2.54;
        final int IN_PER_FOOT = 12;
        Scanner sc = new Scanner(System.in);

        System.out.println("Exactly how many cm? ");
        cm = sc.nextDouble();

        inches = (int)(cm / CM_PER_INCH );
        feet = inches / IN_PER_FOOT;
        remainder = inches % IN_PER_FOOT;
     //  System.out.println("% 2f cm = %d ft, %d sc\n", cm , feet, remainder);
    }

}

package College_allsem_revise;
import java.util.Scanner;
public class mathmethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Find the area of the circle: ");
        System.out.print("radius: ");
        double radius = sc.nextDouble();

        System.out.println("Area of circle will be: "+(Math.PI * (radius * radius)));


    }
}

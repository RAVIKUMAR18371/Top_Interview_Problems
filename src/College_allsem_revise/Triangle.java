package College_allsem_revise;
import java.util.Scanner;
public class Triangle {
    static void triangleCheck(int x, int y,int z){

        if(x<0 | y<0 | z<0 | x==0 | y==0 | z==0){
            System.out.println("Error");
        }
        else if(x > y+z){
            System.out.println("Cannot form a triangle");
        }
        else if(y > x+z){
            System.out.println("Cannot form a triangle");
        }
        else if(z > x+y){
            System.out.println("Cannot form a triangle");
        }
        else{
            System.out.println("Triangle can be formed");
        }
    }
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Check that the length can form the triangle or not");
        Scanner sc = new Scanner(System.in);
        System.out.print("X: ");
        int x = sc.nextInt();
        System.out.print("Y: ");
        int y = sc.nextInt();
        System.out.print("Z: ");
        int z = sc.nextInt();

        triangleCheck(x,y,z);
    }
}

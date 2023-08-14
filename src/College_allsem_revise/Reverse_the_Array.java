package College_allsem_revise;
import java.util.Arrays;
import java.util.Scanner;
public class Reverse_the_Array {
    static void swap(int x, int y){
        int temp = x;
        x = y;
        y = temp;
}
    static void Reverse(int[] arr,int n){
        Double mid = Math.floor(n/2);
        for(int i = 0; i<mid; i++){
            swap(arr[i],arr[n]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements in the array: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Reverse(arr,n);

        System.out.println(Arrays.toString(arr));

    }
}

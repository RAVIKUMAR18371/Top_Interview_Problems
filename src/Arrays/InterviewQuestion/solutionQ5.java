package Arrays.InterviewQuestion;
import java.util.ArrayList;
import java.util.Scanner;

public class solutionQ5 {
    static ArrayList removeElement(ArrayList<Integer> nums, int val) {
        for(int i =0;i<nums.size();i++){
            if(nums.get(i) == val){
                nums.remove(nums.get(i));
            }
        }
        return nums;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        ArrayList<Integer> num = new ArrayList<>();
        System.out.println("Enter the value: ");
        int val = sc.nextInt();
        System.out.println("enter the elements in the array: ");
        for(int i=0;i<n;i++){
            num.set(i,sc.nextInt());
        }
        ArrayList<Integer> M = removeElement(num , val);
        System.out.println(M);
    }
}

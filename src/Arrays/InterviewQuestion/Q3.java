package Arrays.InterviewQuestion;
import java.util.ArrayList;
import java.util.Arrays;
public class Q3 {
    //Median of the two sorted arrays
    public static void main(String[] args) {
        int[] arr1 = {4,3,2,1};
        int[] arr2 = {10,9,8,7};

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        ArrayList<Integer> al = new ArrayList<>();

        for(int i =0;i<arr1.length;i++) {
            al.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            al.add(arr2[j]);
        }
        int mid = al.size()/2;
        ArrayList<Integer> al1 = new ArrayList<>();
        if(al.size()%2==0){
            al1.add(al.get(mid-1));
            al1.add(al.get(mid));
        }
        else{
            al1.add(al.get(mid));
        }

        System.out.println("The median of the sored array: "+al1);


    }
}

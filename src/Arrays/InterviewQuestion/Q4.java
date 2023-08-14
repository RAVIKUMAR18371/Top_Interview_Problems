package Arrays.InterviewQuestion;
import java.util.ArrayList;
public class Q4 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        int[] arr = {0,1,1,0,2,1,0,2,2,1,0,2};
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for(int i = 0;i<arr.length;i++){
            if(arr[i]==0){
                ++count1;
            }
            if(arr[i]==1){
                count2 = count1 + count2;
            }
            if(arr[i]==2){
                count3 = count2 + count3;
            }
        }
        for(int i = 0;i<count1;i++){
            al.add(0);
        }
        for(int i = count1;i<count2;i++){
            al.add(1);
        }
        for(int i = count2;i< arr.length;i++){
            al.add(2);
        }

        System.out.println(al);

    }
}

package Arrays.InterviewQuestion;
import java.util.ArrayList;
public class Q1 {
    // given an array of integer NUMS and an integer target return the indices
    //  the two such that they add up to target.
    public static void main(String[] args) {
        int target = 9;
        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(11);
        al.add(7);
        al.add(15);

        ArrayList<Integer> al2 = new ArrayList<>();

        for(int i=0;i<al.size()-1;i++){
            for(int j = i+1;j<al.size();j++){
                if(al.get(i) + al.get(j) == target){
                    al2.add(al.indexOf(al.get(i)));
                    al2.add(al.indexOf(al.get(j)));
                }
            }
        }

        System.out.println("The index of summation of target"+al2);
    }

    
}

package Arrays.InterviewQuestion;

import java.util.TreeSet;

public class Q2 {
    public static void main(String[] args) {
        // longest substring without repeating character

        String exp = "abcabcbb";
        TreeSet<Character> ts = new TreeSet<>();
        for(int i = 0;i<exp.length();i++){
            ts.add(exp.charAt(i));
        }
        System.out.print("The Longest subsequence of String without repeating: ");
        System.out.println(ts.size());
    }
}

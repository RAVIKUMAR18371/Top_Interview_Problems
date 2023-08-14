package String_Q;
import java.util.Scanner;
public class mixstring {
    static StringBuffer addStr(String word1, String word2){
        StringBuffer s = new StringBuffer();
        for(int i = 0;i< word1.length() || i < word2.length();i++){
            if(i<word1.length()){
                s.append(word1.charAt(i));
            }
            if(i < word2.length()){
                s.append(word2.charAt(i));
            }
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st string: ");
        String exp = sc.next();
        System.out.println("Enter the 2nd string: ");
        String exp1 = sc.next();

       StringBuffer m = addStr(exp,exp1);
        System.out.println(m);
    }
}

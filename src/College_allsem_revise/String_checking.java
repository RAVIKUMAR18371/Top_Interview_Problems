package College_allsem_revise;
import java.util.Scanner;
public class String_checking {
    static boolean isAbecedarian(String word2){
        for(int i = 1; i < word2.length(); i++){
            if(word2.charAt(i) < word2.charAt(i-1)){
                System.out.println( word2 + "-->Not abecedarian");
                return false;
            }
        }
        System.out.println(word2 + "--> abecedarian");
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String word2 = sc.next();


       boolean correct = isAbecedarian(word2);
        System.out.println(correct);
    }
}

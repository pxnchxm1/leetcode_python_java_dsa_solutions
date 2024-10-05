
import java.util.Scanner;

public class Movehyphens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String res ="";
        String res2="";
        String s = sc.next();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='-'){
                res+=s.charAt(i);
            }
            else{
                res2+=s.charAt(i);
            }
        }
        System.out.println(res+res2);
    }
}

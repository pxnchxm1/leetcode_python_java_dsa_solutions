
// 2696. Minimum String Length After Removing Substrings
//............................................................................................
// Solved
// Easy
// Topics
// Companies
// Hint
// You are given a string s consisting only of uppercase English letters.

// You can apply some operations to this string where, in one operation, you can remove any occurrence of one of the substrings "AB" or "CD" from s.

// Return the minimum possible length of the resulting string that you can obtain.

// Note that the string concatenates after removing the substring and could produce new "AB" or "CD" substrings.
// .................................................................................................
import java.util.Stack;
public class MinSubstringlen {

    public static int minLength(String s){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
                continue;
            }
            if( (s.charAt(i)=='B' && stack.peek()=='A') ||  (s.charAt(i)=='D' && stack.peek()=='C')){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
      
        return stack.size();
    }
    public static void main(String[] args) {
        String s = "ABFCACDB";
        System.out.println(minLength(s));

    }

}

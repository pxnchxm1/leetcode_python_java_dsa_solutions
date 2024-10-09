// 921. Minimum Add to Make Parentheses Valid

// Medium

// A parentheses string is valid if and only if:

// It is the empty string,
// It can be written as AB (A concatenated with B), where A and B are valid strings, or
// It can be written as (A), where A is a valid string.
// You are given a parentheses string s. In one move, you can insert a parenthesis at any position of the string.

// For example, if s = "()))", you can insert an opening parenthesis to be "(()))" or a closing parenthesis to be "())))".
// Return the minimum number of moves required to make s valid.
// ..................................................................................................................

import java.util.Stack;

public class ValidParenthesis {
    public static int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')' && !(stack.isEmpty()) && stack.peek().equals('(')){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        System.out.println(stack);
        return stack.size();
        
    }
    public static void main(String[] args) {
        String s = "()";
        System.out.println(minAddToMakeValid(s));
    }

}

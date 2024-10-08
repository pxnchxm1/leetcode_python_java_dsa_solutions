// 1963. Minimum Number of Swaps to Make the String Balanced
// Solved
// Medium
// Topics
// Companies
// Hint
// You are given a 0-indexed string s of even length n. The string consists of exactly n / 2 opening brackets '[' and n / 2 closing brackets ']'.

// A string is called balanced if and only if:

// It is the empty string, or
// It can be written as AB, where both A and B are balanced strings, or
// It can be written as [C], where C is a balanced string.
// You may swap the brackets at any two indices any number of times.

// Return the minimum number of swaps to make s balanced.


// APPROACH : 
// * FIND POSSIBLE NUMBER OF UNBALANCED CHARS USING STACK. PUSH ELEMENT INTO STACK
//  IF CHAR IS [ OR CHAR IS ] AND STACK IS EMPTY. IF CHAR IS ] AND STACK LAST ELEMENT IS [ POP(COZ ITS BALANCED). 
//  * UNBALANCED STRING SIZE IS ALWAYS STACK SIZE /2 
//  * MIN POSSIBLE WAYS IS ALWAYS (UNBALANCED COUNT +1)/2 
//  * ------------------------------------------------------------------------------------------------------------

import java.util.Stack;

public class Balancestring {
    public static int minSwaps(String s) {
        Stack<Character> stack = new Stack<>();
        for(char i :s.toCharArray()){
            if(i==']' &&  !stack.isEmpty() && stack.peek()=='['){
                stack.pop();
            }
            else{
               stack.push(i);
            }
        }
        return ((stack.size()/2)+1)/2;
    }
    public static void main(String[] args) {
        String s = "[]";
        System.out.println(minSwaps(s));
    }
}

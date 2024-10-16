1405. Longest Happy String
Solved
Medium
Topics
Companies
Hint
A string s is called happy if it satisfies the following conditions:

s only contains the letters 'a', 'b', and 'c'.
s does not contain any of "aaa", "bbb", or "ccc" as a substring.
s contains at most a occurrences of the letter 'a'.
s contains at most b occurrences of the letter 'b'.
s contains at most c occurrences of the letter 'c'.
Given three integers a, b, and c, return the longest possible happy string. If there are multiple longest happy strings, return any of them. If there is no such string, return the empty string "".

A substring is a contiguous sequence of characters within a string.
................................................................................................................................................................................
class Solution {
    public String longestDiverseString(int a, int b, int c) {
        int A=0,B=0,C=0;
        int tot = a+b+c;
        String ans = "";
        while(tot-- > 0){
            if((a>=b && a>=c && A!=2)||(a>0 && (B==2 || C==2))){
                ans+="a";
                a--;
                A++;
                B=C=0;
            }
            else if((b>=a && b>=c && B!=2)||(b>0 && (A==2 || C==2))){
                ans+="b";
                b--;
                B++;
                A=C=0;
            }
            else if((c>=a && c>=b && C!=2)||(c>0 && (B==2 || A==2))){
                ans+="c";
                c--;
                C++;
                A=B=0;
            }

        }
        return ans;
    }
}

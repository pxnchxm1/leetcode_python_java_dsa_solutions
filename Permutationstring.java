// 567. Permutation in String
// Solved
// Medium
// Topics
// Companies
// Hint
// Given two strings s1 and s2, return true if s2 contains a 
// permutation
//  of s1, or false otherwise.

// In other words, return true if one of s1's permutations is the substring of s2.

 

// Example 1:

// Input: s1 = "ab", s2 = "eidbaooo"
// Output: true
// Explanation: s2 contains one permutation of s1 ("ba").
public class Permutationstring{
    public static void main(String[] args){
       checkInclusion("ab","eidbaftr");
    }
    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2.length() - s1.length(); i++) {
            if (matches(s1Count, s2Count)) return true;
            s2Count[s2.charAt(i) - 'a']--;
            s2Count[s2.charAt(i + s1.length()) - 'a']++;
        }
        return matches(s1Count, s2Count);
    }

    public static boolean matches(int[] s1Count, int[] s2Count) {
        for (int i = 0; i < 26; i++) {
            if (s1Count[i] != s2Count[i]) return false;
        }
        return true;
    }
}
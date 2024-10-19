// 1545. Find Kth Bit in Nth Binary String
// Solved
// Medium
// Topics
// Companies
// Hint
// Given two positive integers n and k, the binary string Sn is formed as follows:

// S1 = "0"
// Si = Si - 1 + "1" + reverse(invert(Si - 1)) for i > 1
// Where + denotes the concatenation operation, reverse(x) returns the reversed string x, and invert(x) inverts all the bits in x (0 changes to 1 and 1 changes to 0).

// For example, the first four strings in the above sequence are:

// S1 = "0"
// S2 = "011"
// S3 = "0111001"
// S4 = "011100110110001"
// Return the kth bit in Sn. It is guaranteed that k is valid for the given n.
public class Kthbit {
    private static StringBuilder invert(String s){
        StringBuilder invert = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            invert.append((s.charAt(i)=='0'?"1":"0"));
        }
        return invert;
    }
    public static char findKthBit(int n, int k) {
        String[] strings = new String[n];
        strings[0] = "0";
        for (int i = 1; i < n; i++) {
            strings[i] = (strings[i-1]+"1") + new StringBuilder(invert(strings[i-1]).toString()).reverse().toString();;
        }
        return strings[n-1].charAt(k-1);
    }
    public static void main(String[] args) {
        int n =4;
        int k=11;
        System.out.println(findKthBit(n,k));

    }

    
}

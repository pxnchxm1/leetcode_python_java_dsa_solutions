//3258. Count Substrings That Satisfy K-Constraint I
class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int ans=0;
        int l=0;
        int c1=0,c0=0;
        for(int r=0;r<s.length();r++){
            if(s.charAt(r)=='0') c0++;
            else c1++;
            
            while(c1 > k && c0>k){
                if(s.charAt(l)=='0')c0--;
                else c1--;
                l++;
            }
            ans+=(r-l+1);

        }
        return ans;
        
    }
}

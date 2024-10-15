  class Solution {
    public long minimumSteps(String s) {
        long count=0;
        int r = s.length()-1;
        long k=0;
        while(r>=0){
            if(s.charAt(r)=='0'){
                k+=1;
            }
            if(s.charAt(r)=='1'){
                count+=k;
            }
            r--;
        }
        return count;
        
    }
}

class Solution {
    public int maximumSwap(int num) {
        char[] nums =Integer.toString(num).toCharArray();
        int[] last = new int[10];
        for(int i=0;i<nums.length;i++){
            last[nums[i]-'0']=i;
        }
        for(int i=0;i<nums.length;i++){
            for(int d=9;d>nums[i]-'0';d--){
                if(last[d]>i){
                    char temp = nums[i];
                    nums[i]=nums[last[d]];
                    nums[last[d]] = temp;
                    return Integer.parseInt(new String(nums));
                }
            }
        }
        return num;
        
    }
}

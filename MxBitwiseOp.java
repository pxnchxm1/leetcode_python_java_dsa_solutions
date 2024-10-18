class Solution {
    public void helper(int[] nums,int idx,int curr,int max,int[] count){
        if(curr==max){
            count[0]++;
        }
        for(int i=idx;i<nums.length;i++){
            helper(nums,i+1,curr|nums[i],max,count);
        }
    }
    public int countMaxOrSubsets(int[] nums) {
        int max=0;
        for(int i:nums){
            max |= i;
        }
        int[] count = new int[1];
        helper(nums,0,0,max,count);
        return count[0];
    }
}

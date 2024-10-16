class Solution {
    public boolean search(int[] nums, int target){
        
        Arrays.sort(nums);
        int l=0,r=nums.length-1;
        int mid=0;
        while(l<=r){
            mid = (l+r)/2;
            if(nums[mid]==target) {
                return true;
            }
            else if(nums[mid]<target)
            {
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return nums[mid]==target;

    }
}

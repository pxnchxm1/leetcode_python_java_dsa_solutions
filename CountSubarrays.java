
// 2962. Count Subarrays Where Max Element Appears at Least K Times
// Solved

// Companies
// You are given an integer array nums and a positive integer k.

// Return the number of subarrays where the maximum element of nums appears at least k times in that subarray.

// A subarray is a contiguous sequence of elements within an array.
// ............................................................................


public class CountSubarrays {
        public static long countSubarrays(int[] nums, int k) {
            int max = Integer.MIN_VALUE;
            for(int i : nums){
                if(i>max) max= i;
            }
            int l=0,r=0,kmin=0;
            long count=0;
            while(r<nums.length){
                if(nums[r]==max){
                    kmin++;
                }
                while(kmin>=k){
                    count+= (nums.length-r);
                    if(nums[l]==max) kmin--;
                    l++;
                }
                r++;
            }
            return count;
        }
    
    public static void main(String[] args) {
        int[] nums={1,3,2,3,3};
        int k=2;
        System.out.println(countSubarrays(nums,k));
    }
}

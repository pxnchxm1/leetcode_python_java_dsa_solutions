// 15. 3Sum

// ...............................................................................
// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

// Notice that the solution set must not contain duplicate triplets.
//.....................................................................................


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if(i==0 || (i>0 && nums[i]!=nums[i-1])){
                int target = 0-nums[i];
                int l = i+1;
                int r= nums.length-1;

                while(l<r){
                    if(nums[l]+nums[r] == target){
                        ans.add(Arrays.asList(nums[i],nums[l],nums[r]));
                        while(l<r && nums[l]==nums[l+1])l++;
                        while(l<r && nums[r]==nums[r-1])r--;
                        l++;
                        r--;
                    }else if(nums[l]+nums[r] > target){
                        r--;
                    }else{
                        l++;
                    }
                    

                }

            }
            

        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
    
}

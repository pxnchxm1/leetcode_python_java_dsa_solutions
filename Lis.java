

// 300. Longest Increasing Subsequence
// ................................................................
// Companies
// Given an integer array nums, return the length of the longest strictly increasing 
// subsequence
// ...............................................................

 

// Example 1:
// Input: nums = [10,9,2,5,3,7,101,18]
// Output: 4
// Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
//.........................................................................
import java.util.ArrayList;

public class Lis{
    static int returnidx(int l,int h,int e,ArrayList<Integer> arr){
        int mid=0;
        while(l<h){
            mid=(h+l)/2;
            if(arr.get(mid)>=e){
                h=mid;
            }else{
                l=mid+1;
                }
            }
        return l;
        
    }
    public static int lengthOfLIS(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(nums[i]>arr.getLast()){
                arr.add(nums[i]);
            }else{
                System.out.println(arr);
                int idx = returnidx(0, arr.size()-1, nums[i], arr);
                arr.set(idx, nums[i]);
            }
        }
        return arr.size();
    }
    public static void main(String[] args) {
        int[] nums = {7,7,7,7,7,7,7};
        System.out.println(lengthOfLIS(nums));
    }
}
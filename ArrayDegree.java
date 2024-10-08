// 697. Degree of an Array
// Solved
// Easy
// Topics
// Companies
// Hint
// Given a non-empty array of non-negative integers nums, the degree of this array is defined as the maximum frequency of any one of its elements.

// Your task is to find the smallest possible length of a (contiguous) subarray of nums, that has the same degree as nums.
// ..............................................................................................................


import java.util.HashMap;

public class ArrayDegree {
    public static int findShortestSubArray(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        HashMap<Integer,Integer> freq = new HashMap<>();
        HashMap<Integer,Integer> first = new HashMap<>();
        HashMap<Integer,Integer> last = new HashMap<>();
        for(int i=0;i< nums.length;i++){
            if(!freq.containsKey(nums[i])){
               freq.put(nums[i],1);
               first.put(nums[i],i);
            }
            else{
                freq.put(nums[i],freq.get(nums[i])+1);
                last.put(nums[i],i);
            }
        }
        int deg =Integer.MIN_VALUE;
        int ans = Integer.MAX_VALUE;
        for(int i :freq.values()){
            deg =  Math.max(deg,i);
        }
    
        if(deg==1){
            return 1;
        }
        for(int i : freq.keySet()){
            if ((freq.get(i) != null) && freq.get(i) == deg) {
                ans = Math.min(last.get(i) - first.get(i) + 1, ans);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,1};
        System.out.println(findShortestSubArray(arr));
    }
}

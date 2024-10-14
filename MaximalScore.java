// 2530. Maximal Score After Applying K Operations
// Solved
// Medium
// Topics
// Companies
// Hint
// You are given a 0-indexed integer array nums and an integer k. You have a starting score of 0.

// In one operation:

// choose an index i such that 0 <= i < nums.length,
// increase your score by nums[i], and
// replace nums[i] with ceil(nums[i] / 3).
// Return the maximum possible score you can attain after applying exactly k operations.

// The ceiling function ceil(val) is the least integer greater than or equal to val.
//.............................................................................................. 
import java.util.Comparator;
import java.util.PriorityQueue;

public class MaximalScore{
    public static long maxKelements(int[] nums, int k) {
        long score = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i:nums){
            pq.add(i);
        }
        while(!pq.isEmpty() && k!=0){
           int n = pq.poll();
           score+=  n;
           pq.add((n + 2)/3);  //math.ceil without function and type conversions..
           k--;
        } 
        return score;
        
    }
    public static void main(String[] args) {
        int[] nums={10,10,10,10,10};
        int k =5;
        System.out.println(maxKelements(nums,k));
    }
}
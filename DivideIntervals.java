// 2406. Divide Intervals Into Minimum Number of Groups
// Solved
// Medium
// Topics
// Companies
// Hint
// You are given a 2D integer array intervals where intervals[i] = [lefti, righti] represents the inclusive interval [lefti, righti].

// You have to divide the intervals into one or more groups such that each interval is in exactly one group, and no two intervals that are in the same group intersect each other.

// Return the minimum number of groups you need to make.

// Two intervals intersect if there is at least one common number between them. For example, the intervals [1, 5] and [5, 8] intersect.
//.............................................................................

import java.util.Arrays;
public class DivideIntervals {
    public static int minGroups(int[][] intervals) {
        int[] start = new int[intervals.length];
        int[] end = new int[intervals.length];
        for(int i =0 ;i<intervals.length;i++){
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int l=0, r=0;
        int res=0,group=0;
        while(l < intervals.length){
            if(start[l]<=end[r]){
                group++;
                l++;
            }
            else{
                group--;
                r++;
            }
            res=Math.max(res,group);
        }
        return res; 
    }
    public static void main(String[] args) {
        int[][] intervals = { {5,10},{6,8},{1,5},{2,3},{1,10}};
        System.out.println(minGroups(intervals));

    }
    
}

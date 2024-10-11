// 1942. The Number of the Smallest Unoccupied Chair
// Solved
// Medium
// Topics
// Companies
// Hint
// There is a party where n friends numbered from 0 to n - 1 are attending. There is an infinite number of chairs in this party that are numbered from 0 to infinity. When a friend arrives at the party, they sit on the unoccupied chair with the smallest number.

// For example, if chairs 0, 1, and 5 are occupied when a friend comes, they will sit on chair number 2.
// When a friend leaves the party, their chair becomes unoccupied at the moment they leave. If another friend arrives at that same moment, they can sit in that chair.

// You are given a 0-indexed 2D integer array times where times[i] = [arrivali, leavingi], indicating the arrival and leaving times of the ith friend respectively, and an integer targetFriend. All arrival times are distinct.

// Return the chair number that the friend numbered targetFriend will sit on.

 

// Example 1:

// Input: times = [[1,4],[2,3],[4,6]], targetFriend = 1
// Output: 1
// Explanation: 
// - Friend 0 arrives at time 1 and sits on chair 0.
// - Friend 1 arrives at time 2 and sits on chair 1.
// - Friend 1 leaves at time 3 and chair 1 becomes empty.
// - Friend 0 leaves at time 4 and chair 0 becomes empty.
// - Friend 2 arrives at time 4 and sits on chair 0.
// Since friend 1 sat on chair 1, we return 1.

//............................................................................................................... 
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;



public class UnoccupiedChair {
    public static int smallestChair(int[][] times, int targetFriend){
        //target friend arrival time
        int targetarrival = times[targetFriend][0];
        //sorting array based on arrival time
        Arrays.sort(times,(a,b)->Integer.compare(a[0],b[0]));

        //available chair of length of times size(0-n-1)
        Queue<Integer> availablechairs = new PriorityQueue<>();
        for(int i=0;i<times.length;i++) availablechairs.add(i);

        //leaving priority queue(leaving time,chair)
        Queue<int[]> leaving = new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));

        for(int i=0;i<times.length;i++){

            //if already leaving is filled and last element leaving time is less than curr element arrival time..then-> remove last element from leaving and add to availablechairs
            while(!leaving.isEmpty() && leaving.peek()[0]<=times[i][0]){
                availablechairs.add(leaving.remove()[1]);
            }
            //if target is met break
            if(times[i][0]==targetarrival) break;
            //assigning leaving time and occupied chair to leaving
            leaving.add(new int[]{times[i][1],availablechairs.remove()});

        }

    return availablechairs.peek();
    }
    public static void main(String[] args) {
        int[][] times ={{1,4},{2,3},{4,6}};
        int targetFrient = 1;
        System.out.println(smallestChair(times, targetFrient));

    }
}

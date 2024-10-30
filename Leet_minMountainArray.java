//1671. Minimum Number of Removals to Make Mountain Array
//.........................................................


class Solution {
    static int returnidx(int l, int h, int e, ArrayList<Integer> arr) {
        int mid = 0;
        while (l < h) {
            mid = (h + l) / 2;
            if (arr.get(mid) >= e) {
                h = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    public static int lengthOfLIS(int[] nums, int eidx) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(nums[0]);
        for (int i = 1; i <= eidx; i++) {
            if (nums[i] > arr.get(arr.size() - 1)) {
                arr.add(nums[i]);
            } else {
                int idx = returnidx(0, arr.size() - 1, nums[i], arr);
                arr.set(idx, nums[i]);
            }
        }
        return arr.size();
    }
    public int minimumMountainRemovals(int[] nums) {
        int n = nums.length;
        int[] left_lis = new int[n];
        int[] right_lis = new int[n];

        // Creating left LIS
        for (int i = 0; i < n; i++) {
            left_lis[i] = lengthOfLIS(nums, i);
        }

        // Creating right LIS using a reversed array
        int[] revnum = new int[n];
        for (int i = 0; i < n; i++) {
            revnum[i] = nums[n - 1 - i];
        }

        for (int i = 0; i < n; i++) {
            right_lis[n - 1 - i] = lengthOfLIS(revnum, i);
        }

        // Counting max length of valid mountain
        int mx = 0;
        for (int i = 0; i < n; i++) {
            if (left_lis[i] > 1 && right_lis[i] > 1) {
                mx = Math.max(mx, left_lis[i] + right_lis[i] - 1);
            }
        }

        return n - mx; 
    }
}

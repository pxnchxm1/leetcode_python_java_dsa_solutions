'''
1508. Range Sum of Sorted Subarray Sums
...............................................................

You are given the array nums consisting of n positive integers. You computed the sum of all non-empty continuous subarrays from the array and then sorted them in non-decreasing order, creating a new array of n * (n + 1) / 2 numbers.
Return the sum of the numbers from index left to index right (indexed from 1), inclusive, in the new array. Since the answer can be a huge number return it modulo 10^9 + 7.

 

Example 1:

Input: nums = [1,2,3,4], n = 4, left = 1, right = 5
Output: 13 
Explanation: All subarray sums are 1, 3, 6, 10, 2, 5, 9, 3, 7, 4. After sorting them in non-decreasing order we have the new array [1, 2, 3, 3, 4, 5, 6, 7, 9, 10]. The sum of the numbers from index le = 1 to ri = 5 is 1 + 2 + 3 + 3 + 4 = 13. 
Example 2:

Input: nums = [1,2,3,4], n = 4, left = 3, right = 4
Output: 6
Explanation: The given array is the same as example 1. We have the new array [1, 2, 3, 3, 4, 5, 6, 7, 9, 10]. The sum of the numbers from index le = 3 to ri = 4 is 3 + 3 = 6.
Example 3:

Input: nums = [1,2,3,4], n = 4, left = 1, right = 10
Output: 50
'''

class Solution:
    def rangeSum(self, nums: List[int], n: int, left: int, right: int) -> int:
        new_nums=[]
        l=0
        r=1
        while l!=n-1:
            if r==n+1:
                l+=1
                r=l+1
            new_nums.append(sum(nums[l:r]))
            r+=1

        #sorting
        if new_nums:
            max_val = max(new_nums)
            min_val = min(new_nums)
            range_of_elements = max_val - min_val + 1
            count = [0] * range_of_elements

            for num in new_nums:
                count[num - min_val] += 1
            index = 0
            for i in range(range_of_elements):
                while count[i] > 0:
                    new_nums[index] = i + min_val
                    index += 1
                    count[i] -= 1
        return sum(new_nums[left-1:right]) % (10**9 + 7)
        

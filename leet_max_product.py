
#Given the array of integers nums, you will choose two different indices
# i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).
class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        m1,m2=float('-inf'),float('-inf')
        for i in nums:
            if i>=m1:
                m2=m1
                m1=i
            elif i>m2:
                m2=i
        return (m1-1)*(m2-1)
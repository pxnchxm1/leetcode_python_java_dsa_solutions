# 1422. Maximum Score After Splitting a String
#..............................................................
# Given a string s of zeros and ones, return the maximum
# score after splitting the string into two non-empty substrings 
# (i.e. left substring and right substring).

# The score after splitting a string is the number of zeros in the 
# left substring plus the number of ones in the right substring.
#...........................................................
class Solution:
    def maxScore(s):
        #method1
        arr=[]
        for i in range(1,len(arr)):
            arr.append(s[:i].count('0')+s[i:].count('1'))
        return max(arr)
        #method 2
        # mx=float('-inf')
        # for i in range(1,len(s)):
        #    if s[:i].count('0')+s[i:].count('1')>mx:
        #        mx=s[:i].count('0')+s[i:].count('1')
        # return mx
print( Solution.maxScore(s="011101"))
      

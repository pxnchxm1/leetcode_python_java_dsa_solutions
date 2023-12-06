#1716. Calculate Money in Leetcode Bank
#....................................................................................................................................

# Hercy wants to save money for his first car. He puts money in the Leetcode bank every day.
# He starts by putting in $1 on Monday, the first day. Every day from Tuesday to Sunday, he will put in $1 more than the day before.
#On every subsequent Monday, he will put in $1 more than the previous Monday.
# Given n, return the total amount of money he will have in the Leetcode bank at the end of the nth day.
#....................................................................................................................................
class Solution:
    def totalMoney(self, n: int) -> int:
       arr,j=[1],1
       s=0
       for i in range(1,n):
           s+=arr[-1]
           if (i)%7 ==0:
               arr.append(j+1)
               j+=1
           else: arr.append(arr[-1]+1)
           
       return s+arr[-1]
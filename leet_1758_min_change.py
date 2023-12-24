# 1758. Minimum Changes To Make Alternating Binary String
# ..............................................................................
# You are given a string s consisting only of the characters '0' and '1'.
# In one operation, you can change any '0' to '1' or vice versa.
# The string is called alternating if no two adjacent characters are equal. 
#For example, the string "010" is alternating, while the string "0100" is not.
# Return the minimum number of operations needed to make s alternating.
#..........................................................................
class Solution:
    def minOperations(self, s: str) -> int:
        count1,count2=0,0
        ansz="01"*(len(s)//2) if len(s)%2==0 else "01"*(len(s)//2)+"0"   
        anso="10"*(len(s)//2) if len(s)%2==0 else "10"*(len(s)//2)+"1"
        for i,l in zip(s,ansz):
            if i!=l:count1+=1
        for i,l in zip(s,anso):
            if i!=l:count2+=1 
        return min(count1,count2)
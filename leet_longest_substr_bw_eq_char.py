'''
1624. Largest Substring Between Two Equal Characters
.........................................................................
Given a string s, return the length of the longest substring between
two equal characters, excluding the two characters. If there is no such 
substring return -1.
A substring is a contiguous sequence of characters within a string.
..........................................................................
'''
class Solution:
    def maxLengthBetweenEqualCharacters(self, s: str) -> int:
        first = {}
        last = {}
        for i in range(len(s)):
            if s[i] not in first:
                first[s[i]]=i
        for i in range(len(s)-1,-1,-1):
            if (s[i] in first) and (s[i] not in last):
                last[s[i]]=i
        lst=[]
        for i in last:
            if i in first:
                lst.append(last[i]-first[i]-1)
        if max(lst)>=0: return max(lst)
        return -1
         

        
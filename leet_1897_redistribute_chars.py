# 1897. Redistribute Characters to Make All Strings Equal
# ..............................................................
# You are given an array of strings words (0-indexed).
# In one operation, pick two distinct indices i and j, where words[i] is a non-empty string, and move any character from words[i] to any position in words[j].
# Return true if you can make every string in words equal using any number of operations, and false otherwise.
#.......................................................................
from itertools import Counter 
words = ["abc","aabc","bc"]

class Solution:
    def makeEqual(self, words: List[str]) -> bool:
        n=len(words)
        freq=Counter("".join(words))
        for i,l in freq.items():
            if l%n != 0: return False
        return True




print(Solution.makeEqual(words))
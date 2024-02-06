'''
49. GROUP ANAGRAMS
............................
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]'''
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        ans = []
        dp=[]
        for i in strs:
            x= sorted(i)
            if x not in dp:
                dp.append(x)
                ans.append([i])
            else:
                ans[dp.index(x)].append(i)
        return ans

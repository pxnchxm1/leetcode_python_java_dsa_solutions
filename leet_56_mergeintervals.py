# 56. Merge Intervals
# .....................................................................................................................
# Given an array of intervals where intervals[i] = [starti, endi],
# merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.
# ...............................................................................................................................
class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort()
        ans=[intervals[0]]
        for i in range(1,len(intervals)):
            if intervals[i][0] in range(ans[-1][0],ans[-1][1]+1) or intervals[i][1] in range(ans[-1][0],ans[-1][1]+1):
                x=ans.pop()
                ans.append([min(intervals[i][0],intervals[i][1],x[0],x[1]),max(intervals[i][0],intervals[i][1],x[0],x[1])])
            else:
                ans.append(intervals[i])
        return ans


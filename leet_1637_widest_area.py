
# 1637. Widest Vertical Area Between Two Points Containing No Points
# ............................................................................
# Given n points on a 2D plane where points[i] = [xi, yi], Return the widest vertical 
#area between two points such that no points are inside the area.

# A vertical area is an area of fixed-width extending infinitely along the y-axis 
#(i.e., infinite height). The widest vertical area is the one with the maximum width.

# Note that points on the edge of a vertical area are not considered included in the area.
#.....................................................................................
class Solution:
    def maxWidthOfVerticalArea(self, points: List[List[int]]) -> int:
        x,a=[],[]
        for i in range(len(points)):
            x.append(points[i][0])
        x.sort()
        for i,l in pairwise(x):
            a.append(l-i)
        return max(a)
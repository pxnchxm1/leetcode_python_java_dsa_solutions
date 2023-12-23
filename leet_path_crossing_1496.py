# 1496. Path Crossing
# ..........................................................................................
# Given a string path, where path[i] = 'N', 'S', 'E' or 'W',
# each representing moving one unit north, south, east, or west, respectively.
# You start at the origin (0, 0) on a 2D plane and walk on the path specified by path.

# Return true if the path crosses itself at any point, that is, 
# if at any time you are on a location you have previously visited. Return false otherwise.
#.................................................................................................

class Solution:
    def isPathCrossing(path):
        arr=[[0,0]]
        x=0
        for i in path:
            if i=="N":
                x=[arr[-1][0],arr[-1][1]+1]
            elif i=="S":
                x=[arr[-1][0],arr[-1][1]-1]
            elif i=="E":
                x=[arr[-1][0]+1,arr[-1][1]]
            else:
                x=[arr[-1][0]-1,arr[-1][1]]
            if x in arr:
                return True
            else:
                arr.append(x)
        return False

        

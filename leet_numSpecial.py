# 1582. Special Positions in a Binary Matrix
# ..........................................................................................
# Given an m x n binary matrix mat, return the number of special positions in mat.
# A position (i, j) is called special if mat[i][j] == 1 and all other elements in row i 
# and column j are 0 (rows and columns are 0-indexed).
# ...........................................................................................
class Solution:
    def numSpecial(mat):
        l=list(zip(*mat))
        c=0
        for i in range(len(mat)):
            if mat[i].count(1)==1 and l[mat[i].index(1)].count(1)==1:
                c+=1
        return c
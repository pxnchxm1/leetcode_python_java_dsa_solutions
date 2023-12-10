#867. Transpose Matrix
#..........................................................................................

#Given a 2D integer array matrix, return the transpose of matrix.

#The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
#......................................................................................................

class Solution:
    def transpose(self, matrix):
        t=[]
        for i in zip(*matrix): t.append(list(i))
        return t

          
'''
36. Valid Sudoku
--------------------------------------------------------------
Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
Note:

A Sudoku board (partially filled) could be valid but is not necessarily solvable.
Only the filled cells need to be validated according to the mentioned rules.
 
'''
class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        rows = collections.defaultdict(set)#  key :curr_row,values:(1-9)
        cols = collections.defaultdict(set)
        box = collections.defaultdict(set) #key:(curr_row//3,curr_val//3),values:(1-9)
        for r in range(9):
            for c in range(9):
                if((board[r][c] != ".") and (board[r][c] in rows[r] or board[r][c] in cols[c] or board[r][c] in box[(r//3,c//3)])):
                    return False
                rows[r].add(board[r][c])
                cols[c].add(board[r][c])
                box[(r//3,c//3)].add(board[r][c])
        return True
'''
20. VALID PARANTHESIS 
***********************************************************************************************************************
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
'''

def isValid(self, s: str) -> bool:
        p='{(['
        d={'}':'{',')':'(',']':'['}
        stack = []
        for i in s:
            if i in p:
                stack.append(i)
            else:
                if stack and stack[-1]==d[i]:
                    stack.pop()
                else:
                    return False
        return len(stack)==0

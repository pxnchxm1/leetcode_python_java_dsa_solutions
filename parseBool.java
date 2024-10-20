//1106. Parsing A Boolean Expression
//........................................................................
//A boolean expression is an expression that evaluates to either true or false. It can be in one of the following shapes:
//'t' that evaluates to true.
//'f' that evaluates to false.
//'!(subExpr)' that evaluates to the logical NOT of the inner expression subExpr.
//'&(subExpr1, subExpr2, ..., subExprn)' that evaluates to the logical AND of the inner expressions subExpr1, subExpr2, ..., subExprn where n >= 1.
//'|(subExpr1, subExpr2, ..., subExprn)' that evaluates to the logical OR of the inner expressions subExpr1, subExpr2, ..., subExprn where n >= 1.
//Given a string expression that represents a boolean expression, return the evaluation of that expression.
//................................................................................................................
class Solution {
    public boolean parseBoolExpr(String expression) {
        Stack<Character> stack = new Stack<>();
        for(char i : expression.toCharArray()){
            if(i==','|| i=='(') continue;
            if(i=='t' || i=='f'|| i=='!'|| i=='|' || i=='&'){
                stack.push(i);
            }
            else if(i==')'){
                boolean hastrue = false , hasfalse =false;
                 while (
                    stack.peek() != '!' && stack.peek() != '&' && stack.peek() != '|'
                ) {
                    char top = stack.pop();
                    if(top=='t')hastrue=true;
                    if(top=='f')hasfalse=true;
                }
                char op=stack.pop();
                if(op=='!') stack.push(hastrue?'f':'t');
                else if(op=='&')stack.push(hasfalse?'f':'t');
                else stack.push(hastrue?'t':'f');
            }
        }
        return stack.peek()=='t';
    }
}

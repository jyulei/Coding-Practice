import java.util.Stack;

/**
 * 150. 逆波兰表达式求值
 */
public class Solution0150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for (String s:tokens){
            if (s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")){
                int b=stack.pop();
                int a=stack.pop();
                stack.push(operate(a,b,s));
            } else {
                stack.push(Integer.valueOf(s));
            }
        }
        return stack.pop();
    }

    private Integer operate(int a, int b, String s) {
        if (s.equals("+")){
            return a+b;
        } else if (s.equals("-")){
            return a-b;
        } else if (s.equals("*")){
            return a*b;
        } else {
            return a/b;
        }
    }
}

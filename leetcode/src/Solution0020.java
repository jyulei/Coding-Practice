import java.util.Stack;

/**
 * 20. 有效的括号
 */
public class Solution0020 {
    public boolean isValid(String s) {
        Stack<Character> stack= new Stack();
        Character ch;
        for(int i=0;i<s.length();++i) {
            ch = s.charAt(i);
            if(ch=='('||ch=='{'||ch=='[') {
                stack.push(ch);
            }else {
                if(stack.empty()) {
                    return false;
                }
                if(ch==')'&&stack.pop()!='(') {
                    return false;
                }else if(ch=='}'&&stack.pop()!='{') {
                    return false;
                }else if(ch==']'&&stack.pop()!='[') {
                    return false;
                }
            }
        }
        if(stack.empty()) {
            return true;
        }else {
            return false;
        }
    }
}

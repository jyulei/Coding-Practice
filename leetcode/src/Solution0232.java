import java.util.Stack;

/**
 * 232. 用栈实现队列
 */
public class Solution0232 {
    class MyQueue {

        Stack<Integer> s1;
        Stack<Integer> s2;

        /** Initialize your data structure here. */
        public MyQueue() {
            s1 = new Stack<>();
            s2 = new Stack<>();
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            s1.push(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            if (s2.empty()) {
                while (!s1.empty()) {
                    int tmp = s1.pop();
                    s2.push(tmp);
                }
            }
            return s2.pop();
        }

        /** Get the front element. */
        public int peek() {
            if (s2.empty()) {
                while (!s1.empty()) {
                    int tmp = s1.pop();
                    s2.push(tmp);
                }
            }
            return s2.peek();
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            if (s1.empty() && s2.empty()) {
                return true;
            }
            return false;
        }
    }

}

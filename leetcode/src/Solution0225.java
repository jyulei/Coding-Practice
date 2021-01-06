import java.util.LinkedList;
import java.util.Queue;

/**
 * 225. 用队列实现栈
 */
public class Solution0225 {
    class MyStack {

        Queue<Integer> q1;
        Queue<Integer> q2;

        /** Initialize your data structure here. */
        public MyStack() {
            q1 = new LinkedList<>();
            q2 = new LinkedList<>();
        }

        /** Push element x onto stack. */
        public void push(int x) {
            q1.add(x);
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            while (q1.size() != 1) {
                int tmp = q1.poll();
                q2.add(tmp);
            }
            int result = q1.poll();
            while (!q2.isEmpty()) {
                q1.add(q2.poll());
            }
            return result;
        }

        /** Get the top element. */
        public int top() {
            while (q1.size() != 1) {
                int tmp = q1.poll();
                q2.add(tmp);
            }
            int result = q1.peek();
            q2.add(q1.poll());
            while (!q2.isEmpty()) {
                q1.add(q2.poll());
            }
            return result;
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            if (q1.isEmpty()) {
                return true;
            }
            return false;
        }
    }

}

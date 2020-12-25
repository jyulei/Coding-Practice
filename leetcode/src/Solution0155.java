import java.util.Stack;

/**
 * 155. 最小栈
 *  设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
 *
 *   push(x) —— 将元素 x 推入栈中。
 *   pop()—— 删除栈顶的元素。
 *   top()—— 获取栈顶元素。
 *   getMin() —— 检索栈中的最小元素。
 *   方法一：数据栈和辅助栈同时使用
 *   方法二：自定义栈，用链表实现栈
 */
class MinStack {
//    private Stack<Integer> dataStack;
//    private Stack<Integer> helperStack;
//
//    public MinStack() {
//        dataStack = new Stack();
//        helperStack = new Stack();
//    }
//
//    public void push(int x) {
//        dataStack.push(x);
//        if (helperStack.empty()) {
//            helperStack.push(x);
//        } else {
//            if (x <= helperStack.peek()) {
//                helperStack.push(x);
//            }
//        }
//    }
//
//    public void pop() {
//        int t = dataStack.pop();
//        if (t == helperStack.peek()) {
//            helperStack.pop();
//        }
//    }
//
//    public int top() {
//        return dataStack.peek();
//    }
//
//    public int getMin() {
//        return helperStack.peek();
//    }
    private class Node{
        int min;
        int data;
        Node next;

    public Node() {
    }

    public Node(int data, int min) {
        this.min = min;
        this.data = data;
    }
}


    private Node head;

    public MinStack() {
        head = new Node();
    }

    public void push(int x) {
        if (head.next != null) {
            int min = head.next.min;
            min = min < x ? min : x;
            Node insert = new Node(x,min);
            insert.next = head.next;
            head.next = insert;
        } else{
            Node insert = new Node(x,x);
            head.next = insert;
        }

    }

    public void pop() {
        head.next = head.next.next;
    }

    public int top() {
        return head.next.data;
    }

    public int getMin() {
        return head.next.min;
    }
}

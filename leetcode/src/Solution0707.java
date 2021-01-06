/**
 * 707.设计链表
 */
public class Solution0707 {
    class MyLinkedList {
        Node head;
        int size;

        class Node {
            public int val;
            public Node next;
        }

        /** Initialize your data structure here. */
        public MyLinkedList() {
            head = null;
            size = 0;
        }

        /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
        public int get(int index) {
            if (index < 0 || index > size) {
                return -1;
            }
            int i = 0;
            int result = -1;
            Node p = head;
            while (p != null) {
                if (index == i) {
                    result= p.val;
                    break;
                } else {
                    p = p.next;
                    i++;
                }
            }
            return result;
        }

        /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
        public void addAtHead(int val) {
            Node p = new Node();
            p.val = val;
            p.next = head;
            head = p;
            size++;
        }

        /** Append a node of value val to the last element of the linked list. */
        public void addAtTail(int val) {
            Node p = head;
            Node q = new Node();
            q.val = val;
            q.next=null;
            if (p == null) {
                head=q;
            } else {
                while (p.next != null) {
                    p=p.next;
                }
                p.next = q;
            }
            size++;
        }

        /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
        public void addAtIndex(int index, int val) {
            Node q = new Node();
            q.val = val;
            if (index == 0) {
                q.next = head;
                head = q;
            } else {
                if (index > size) {
                    return;
                }
                Node p = head;
                int i = 1;
                while (p != null) {
                    if (i == index) {
                        q.next = p.next;
                        p.next = q;
                        return;
                    } else{
                        i++;
                        p = p.next;
                    }
                }
            }
        }

        /** Delete the index-th node in the linked list, if the index is valid. */
        public void deleteAtIndex(int index) {
            if (index == 0) {
                if (head != null) {
                    head = head.next;
                }
            } else{
                if (index >= size) {
                    return;
                }
                Node p = head;
                int i = 1;
                while (p != null) {
                    if (i == index) {
                        if (p.next != null) {
                            p.next = p.next.next;
                            return;
                        }
                    } else {
                        i++;
                        p = p.next;
                    }
                }
            }
        }
    }

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
}

package book;

public class MyCircularQueue {

    private int[] data;
    int length;
    int head;
    int tail;
    boolean have;

    public MyCircularQueue(int k) {
        data = new int[k];
        length = k;
        head = tail = 0;
        have = false;
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        } else {
            if (isEmpty()) {
                have = true;
            }
            data[tail] = value;
            tail = (tail+1)%length;
            return true;
        }
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        } else {
            head = (head+1)%length;
            if (head == tail) {
                have=false;
            }
            return true;
        }
    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        } else {
            return data[head];
        }
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        } else {
            int index= (tail+length-1)%length;
            return data[index];
        }
    }

    public boolean isEmpty() {
        if (head == tail && have == false) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (head == tail && have == true) {
            return true;
        } else {
            return false;
        }
    }


/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
}

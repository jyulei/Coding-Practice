import java.util.List;

/**
 * 706.设计哈希映射
 */
public class Solution0706 {
    class MyHashMap {

        private int mod;
        MyNode[] hashMap;
        /** Initialize your data structure here. */
        public MyHashMap() {
            mod = 997;
            hashMap = new MyNode[997];
            for (int i = 0; i<997;i++){
                hashMap[i] = new MyNode();
            }
        }

        private int hash(int key){
            return key % mod;
        }

        /** value will always be non-negative. */
        public void put(int key, int value) {
            int hash = hash(key);
            hashMap[hash].put(key,value);
        }

        /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
        public int get(int key) {
            int hash  = hash(key);
            return hashMap[hash].get(key);
        }

        /** Removes the mapping of the specified value key if this map contains a mapping for the key */
        public void remove(int key) {
            int hash  = hash(key);
            hashMap[hash].remove(key);
        }

        private class MyNode {
            int key;
            int value;
            MyNode next;
            MyNode(){
                next = null;
            }

            MyNode(int key, int value){
                this.key = key;
                this.value = value;
                next = null;
            }

            public void put(int key, int value) {
                MyNode p= next,k = this;
                while (p != null) {
                    if (p.key == key) {
                        p.value = value;
                        break;
                    } else {
                        p = p.next;
                    }
                }
                if (p == null) {
                    MyNode q = new MyNode(key,value);
                    q.next = k.next;
                    k.next = q;
                }
            }

            public int get(int key) {
                MyNode p= next,k = this;
                while (p != null) {
                    if (p.key == key) {
                        return p.value;
                    } else {
                        p = p.next;
                    }
                }
                return -1;
            }


            public void remove(int key) {
                MyNode p= this;
                while (p.next != null) {
                    if (p.next.key == key) {
                        p.next = p.next.next;
                    } else {
                        p = p.next;
                    }
                }
            }
        }
    }

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
}

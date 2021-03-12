import java.util.LinkedList;
import java.util.List;

/**
 * 705.设计哈希集合
 */
public class Solution0705 {
    static class MyHashSet {

        private int mod;
        List[] hashSet;
        /** Initialize your data structure here. */
        public MyHashSet() {
            this.mod = 997;
            hashSet = new List[997];
        }

        public void add(int key) {
            int tmp = key % mod;
            if (hashSet[tmp] == null) {
                List it = new LinkedList();
                hashSet[tmp] = it;
            }
            if (hashSet[tmp].contains(key)){
                return;
            } else {
                hashSet[tmp].add(key);
            }
        }

        public void remove(int key) {
            int tmp = key % mod;
            if (hashSet[tmp] == null) {
                return;
            }
            if (hashSet[tmp].contains(key)) {
                int index = hashSet[tmp].indexOf(key);
                hashSet[tmp].remove(index);
            }
        }

        /** Returns true if this set contains the specified element */
        public boolean contains(int key) {
            int tmp = key % mod;
            if (hashSet[tmp] == null) {
                return false;
            } else {
                if (hashSet[tmp].contains(key)) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }
}

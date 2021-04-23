import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 380. 常数时间插入、删除和获取随机元素
 */
public class Solution0380 {
    class RandomizedSet {

        private Map<Integer,Integer> map;
        private List<Integer> list;
        /** Initialize your data structure here. */
        public RandomizedSet() {
            map=new HashMap<>();
            list=new ArrayList<>();
        }

        /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
        public boolean insert(int val) {
            if (map.keySet().contains(val)){
                return false;
            } else {
                map.put(val,list.size());
                list.add(val);
                return true;
            }
        }

        /** Removes a value from the set. Returns true if the set contained the specified element. */
        public boolean remove(int val) {
            if (!map.keySet().contains(val)){
                return false;
            } else {
                int lastElement=list.get(list.size()-1);
                int index=map.get(val);
                list.set(index,lastElement);
                list.remove(list.size()-1);
                map.put(lastElement,index);
                map.remove(val);
                return true;
            }
        }

        /** Get a random element from the set. */
        public int getRandom() {
            int length=list.size();
            int random=(int)Math.floor(Math.random()*length);
            return list.get(random);
        }
    }

    public static void main(String[] args) {

    }

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
}

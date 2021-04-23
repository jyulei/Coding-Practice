import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 170. 两数之和 III - 数据结构设计
 */
public class Solution0170 {
    class TwoSum {
        private List<Integer> list;
        /** Initialize your data structure here. */
        public TwoSum() {
            list=new ArrayList<>();
        }

        /** Add the number to an internal data structure.. */
        public void add(int number) {
            list.add(number);
        }

        /** Find if there exists any pair of numbers which sum is equal to the value. */
        public boolean find(int value) {
            Set<Integer> set=new HashSet<>();
            for (int i : list){
                if (set.contains(value-i)){
                    return true;
                } else {
                    set.add(i);
                }
            }
            return false;
        }
    }

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */
}

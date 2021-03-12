import java.util.*;

/**
 * 347. 前 K 个高频元素
 */
public class Solution0347 {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int  tmp = nums[i];
            if (hashMap.containsKey(tmp)){
                int count = hashMap.get(tmp)+1;
                hashMap.put(tmp,count);
            } else {
                hashMap.put(tmp,1);
            }
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>(hashMap.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<Integer,Integer>>(){
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue()-o1.getValue();
            }
        });
        List<Integer> list1 = new LinkedList<>();
        Iterator iterator = list.iterator();
        for (int i = 0;i <k; i++){
            Map.Entry<Integer,Integer> m = (Map.Entry<Integer,Integer>)iterator.next();
            list1.add(m.getKey());
        }
        int[] arr=list1.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }
}

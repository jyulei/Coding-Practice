import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * 599. 两个列表的最小索引总和
 */
public class Solution0599 {
    public static String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        List<String> result = new LinkedList<>();
        for (int i = 0; i< list1.length; i++){
            String s = list1[i];
            hashMap.put(s,i);
        }
        int indexSum = -1;
        for (int i = 0; i<list2.length; i++){
            String tmp = list2[i];
            if (hashMap.containsKey(tmp)){
                int sum = i + hashMap.get(list2[i]);
                if (indexSum == -1){
                    indexSum = sum;
                    result.add(tmp);
                } else {
                    if (sum < indexSum){
                        result.clear();
                        result.add(tmp);
                    } else if (indexSum == sum){
                        result.add(tmp);
                    }
                }
            }
        }
        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] a = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] b = {"KFC", "Shogun", "Burger King"};
        String[] c = findRestaurant(a,b);
        for (String s : c){
            System.out.println(s);
        }
    }
}

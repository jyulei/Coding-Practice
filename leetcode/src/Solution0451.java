import java.util.*;

/**
 * 451. 根据字符出现频率排序
 */
public class Solution0451 {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (hashMap.keySet().contains(ch)) {
                int count=hashMap.get(ch);
                hashMap.put(ch,count+1);
            } else {
                hashMap.put(ch,1);
            }
        }
        Set<Map.Entry<Character,Integer>> set=hashMap.entrySet();
        List<Map.Entry<Character,Integer>> list=new LinkedList<>(set);
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue()-o1.getValue();
            }
        });
        StringBuilder stringBuilder =new StringBuilder();
        for (Map.Entry entry : list){
            char ch=(char)entry.getKey();
            int count=(int)entry.getValue();
            while (count--!=0){
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.toString();
    }
}

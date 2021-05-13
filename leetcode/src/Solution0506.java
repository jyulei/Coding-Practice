import java.util.*;

/**
 * 506. 相对名次
 */
public class Solution0506 {
    public static String[] findRelativeRanks(int[] score) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i=0;i<score.length;i++){
            hashMap.put(i,score[i]);
        }
        Set set = hashMap.entrySet();
        List<Map.Entry<Integer,Integer>> list =new LinkedList(set);
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue()-o1.getValue();
            }
        });
        String[] res =new String[score.length];

        for (int i=0;i<list.size();i++){
            System.out.println(""+i+list.get(i).getKey()+list.get(i).getValue());
        }


        for (int i=0;i<list.size();i++){
            switch (i){
                case 0:res[list.get(i).getKey()]="Gold Medal";break;
                case 1:res[list.get(i).getKey()]="Silver Medal";break;
                case 2:res[list.get(i).getKey()]="Bronze Medal";break;
                default: res[list.get(i).getKey()]=i+1+"";break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String[] res=findRelativeRanks(new int[]{5,4,3,2,1});
        for (int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }
}

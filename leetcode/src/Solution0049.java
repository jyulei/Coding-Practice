import java.util.*;

/**
 * 49. 字母异位词分组
 */
public class Solution0049 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List> hashMap = new HashMap<>();
        for (String s : strs){
            String st = sort(s);
            if (hashMap.containsKey(st)){

                    hashMap.get(st).add(s);

            } else {
                List<String> list = new LinkedList<>();
                list.add(s);
                hashMap.put(st,list);
            }
        }
        List result = new LinkedList();
        for (List l : hashMap.values()){
            result.add(l);
        }
        return result;
    }

    public static String sort(String s){
        char[] result = s.toCharArray();
        Arrays.sort(result);
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        String s = "cba";
        String s1 = sort(s);
        System.out.println(s);
        System.out.println(s1);
    }
}

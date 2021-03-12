import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution0003 {
    public static int lengthOfLongestSubstring(String s) {
        if (s.length()==1){
            return 1;
        }
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            int length = 1;
            Map<Character, Boolean> map = new HashMap<>();
            map.put(s.charAt(i), true);
            for (int j = i+1; j < s.length(); j++) {
                if (map.get(s.charAt(j))!=null) {
                    break;
                } else {
                    length++;
                    map.put(s.charAt(j), true);
                }
            }
            if (length > max) {
                max = length;
            }
        }
        return max;
    }

    public static int lengthOfLongestSubstring1(String s) {
        if (s.length()<=1){
            return s.length();
        }
        int max = 0;
        int num = 1;
        int start = 0;
        HashMap<Character,Integer> hashMap = new HashMap<>();
        hashMap.put(s.charAt(0),0);
        for (int i = 1; i< s.length();i++ ){
            char ch = s.charAt(i);
            if (hashMap.containsKey(ch)) {
                int index = hashMap.get(ch);
                if (index > start){
                    num = i - index;
                    start = index + 1;
                } else {
                    num++;
                }
            } else {
                num++;
            }
            hashMap.put(ch,i);
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring1("abba"));
    }
}

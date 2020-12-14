import java.util.HashMap;
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
}

import java.util.HashMap;

/**
 * 205、同构字符串
 */
public class Solution0205 {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character,Character> map = new HashMap<>();
        for (int i = 0; i <s.length();i++){
            char tmp = s.charAt(i);
            if (map.containsKey(tmp)) {
                if (map.get(tmp) != t.charAt(i)) {
                    return false;
                }
            } else {
                if (map.containsValue(t.charAt(i))){
                    return false;
                } else {
                    map.put(tmp,t.charAt(i));
                }
            }
        }
        return true;
    }
}

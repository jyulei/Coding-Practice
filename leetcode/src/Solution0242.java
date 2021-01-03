import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/**
 * 242. 有效的字母异位词
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 */
public class Solution0242 {
    /**
     * 哈希表求解
     * @param s
     * @param t
     * @return
     */
    public static boolean isAnagram(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i < s.length(); i++){
            if (map.get(s.charAt(i)) != null){
                map.put(s.charAt(i),map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i),1);
            }
        }
        for(int i = 0;i < t.length(); i++){
            if (map.get(t.charAt(i)) == null){
                return false;
            } else {
                if (map.get(t.charAt(i)) == 1){
                    map.remove(t.charAt(i));
                } else {
                    map.put(t.charAt(i),map.get(t.charAt(i)) - 1);
                }
            }
        }
        if (map.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 转化为数据排序比较
     * @param s
     * @param t
     * @return
     */
    public static boolean isAnagram1(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        return Arrays.equals(s1,t1);
    }
        public static void main(String[] args) {
        String  s = "anagram", t = "nagaram";
        System.out.println(isAnagram1(s,t));
    }
}

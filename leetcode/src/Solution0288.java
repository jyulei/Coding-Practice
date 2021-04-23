import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 288. 单词的唯一缩写
 */
public class Solution0288 {
    class ValidWordAbbr {

        private Map<String, List<String>> map;

        public ValidWordAbbr(String[] dictionary) {
            map=new HashMap<>();
            for (String s:dictionary){
                String str = build(s);
                List list=map.get(str);
                if (list != null) {
                    list.add(s);
                } else {
                    list=new ArrayList();
                    list.add(s);
                    map.put(str,list);
                }
            }
        }

        private String build(String s) {
            if (s.length() <= 2) {
                return s;
            } else {
                StringBuilder stringBuilder=new StringBuilder();
                stringBuilder.append(s.charAt(0));
                stringBuilder.append(s.length()-2);
                stringBuilder.append(s.charAt(s.length()-1));
                return stringBuilder.toString();
            }
        }

        public boolean isUnique(String word) {
            String str=build(word);
            List<String> list=map.get(str);
            if (list == null) {
                return true;
            } else {
                for (String s1:list){
                    if (!word.equals(s1)){
                        return false;
                    }
                }
                return true;
            }
        }
    }

/**
 * Your ValidWordAbbr object will be instantiated and called as such:
 * ValidWordAbbr obj = new ValidWordAbbr(dictionary);
 * boolean param_1 = obj.isUnique(word);
 */
}

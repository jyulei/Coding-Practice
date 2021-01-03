import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 17. 电话号码的字母组合
 *
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 *
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 */
public class Solution0017 {
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            List<String> list = new ArrayList<>();
            return list;
        }
        Map<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        List<String> list = new ArrayList<>();
        list.add("");
        for (int i = 0; i < digits.length(); i++){
            int size = list.size();
            String s = map.get(digits.charAt(i));
            List result = new ArrayList<>();
            for (int j = 0; j< s.length();j++ ){
                for (int k=0;k<size;k++ ){
                    String str = list.get(k) + s.charAt(j);
                    result.add(str);
                }
            }
            list = result;
        }
        return list;
    }
}

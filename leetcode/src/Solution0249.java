import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 249. 移位字符串分组
 */
public class Solution0249 {
    public List<List<String>> groupStrings(String[] strings) {
        Map<String,List<String>> map=new HashMap<>();
        for (String s:strings){
            String str=build(s);
            if (map.containsKey(str)){
                List<String> list =map.get(str);
                list.add(s);
            } else {
                List<String> list =new ArrayList<>();
                list.add(s);
                map.put(str,list);
            }
        }
        return new ArrayList<>(map.values());
    }

    private static String build(String s) {
        if (s.length() == 0) {
            return s;
        }
        if (s.charAt(0)=='a'){
            return s;
        }
        int op=s.charAt(0)-'a';
        StringBuilder str=new StringBuilder();
        for (int i=0;i<s.length();i++){
            char ch=(char)(s.charAt(i)-op<97?s.charAt(i)-op+26:s.charAt(i)-op);
            str.append(ch);
        }
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(build("ba"));
    }
}

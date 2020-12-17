/**
 * 14. 最长公共前缀
 */
public class Solution0014 {
    public String longestCommonPrefix(String[] strs) {
        if (strs==null||strs.length==0){
            return "";
        }
        if (strs.length==1){
            return strs[0];
        }
        //用s来标记最短的字符串
        String s = strs[0];
        for (int i = 1;i < strs.length; i++){
            if (s.length()>strs[i].length()){
                s = strs[i];
            }
        }
        int c;
        boolean t = true;
        for (c = 0; c < s.length(); c++ ){
            if (t == true){
                for (int i = 0;i < strs.length; i++){
                    if (strs[i].charAt(c)!=s.charAt(c)){
                        t = false;
                        break;
                    }
                }
            }
            if (t==false){
                break;
            }
        }
        if (c==0){
            return "";
        } else {
            return s.substring(0,c);
        }
    }
}

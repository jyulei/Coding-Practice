/**
 * 58. 最后一个单词的长度
 */
public class Solution0058 {
    public int lengthOfLastWord(String s) {
        int len = 0;
        int lastlen = 0;
        for (int i = 0;i < s.length(); i++){
            if (s.charAt(i)!=' '){
                len++;
            } else {
                if (len!=0) lastlen = len;
                len = 0;
            }
        }
        if (len != 0) return len;
        else return lastlen;
    }
}
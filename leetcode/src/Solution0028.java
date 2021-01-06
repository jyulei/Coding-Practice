/**
 * 28. 实现 strStr()
 */
public class Solution0028 {
    /**
     * 直接调用indexOf方法
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr(String haystack,String needle){
        if (haystack!=null&&needle!=null){
            if (haystack.length()<needle.length()){
                return -1;
            } else {
                return haystack.indexOf(needle);
            }
        } else if (needle==null){
            return 0;
        } else {
            return -1;
        }
    }

    /**
     * KMP算法
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr1(String haystack,String needle){
        if (haystack.length() < needle.length()) {
            return -1;
        }
        return 0;
    }
}

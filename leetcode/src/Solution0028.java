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

    /***
     * 暴力
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr2(String haystack,String needle){
        if (haystack.length() < needle.length()) {
            return -1;
        }
        if (needle.length() == 0) {
            return 0;
        }
        int i,j,k;
        for (i = 0; i < haystack.length()-needle.length() +1;i++){
            k=0;
            for (j = i;j<haystack.length();j++){
                if (haystack.charAt(j) == needle.charAt(k)) {
                    k++;
                    if (k == needle.length()) {
                        return i;
                    }
                } else {
                    break;
                }
            }
        }
        return -1;
    }

}

/**
 * 5. 最长回文子串
 */
public class Solution0005 {
    public  String longestPalindrome(String s) {
        if (s.length()<2){
            return s;
        }
        int min=0,max=0;
        int start,end;
        for (start = 0;start<s.length();start++ ){
            for (end=start+1;end<s.length();end++){
                if ((end-start>max-min)&&isPalindrome(s,start,end)){
                    max = end ;
                    min = start;
                }
            }
        }
        return s.substring(min,max+1);
    }

    public  boolean isPalindrome(String s,int start ,int end){
        while(start<end){
            if (s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

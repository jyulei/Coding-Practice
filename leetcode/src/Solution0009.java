/**
 * 9. 回文数
 */
public class Solution0009 {
    public boolean isPalindrome(int x) {
        if(x<0) {
            return false;
        }
        else {
            Integer in=(Integer)x;
            String s = in.toString();
            int i,j;
            for(i=0,j=s.length()-1;i<j;++i,--j) {
                if(s.charAt(i)!=s.charAt(j)) {
                    return false;
                }
            }
            return true;
        }

    }
}

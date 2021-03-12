import java.util.Locale;

/**
 * 125. 验证回文串
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 */
public class Solution0125 {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int begin = 0;
        int end = s.length()-1;
        while (begin < end) {
            char b = s.charAt(begin);
            char e = s.charAt(end);
            if ((b >= '0' && b <= '9') || (b >= 'a' && b <= 'z')){
                if ((e >= '0' && e <= '9') || (e >= 'a' && e <= 'z')){
                    if (b == e) {
                        begin++;
                        end--;
                        continue;
                    } else {
                        return false;
                    }
                } else {
                    end--;
                }
            } else {
                begin++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(s.toLowerCase());
        System.out.println(isPalindrome(s));
    }
}

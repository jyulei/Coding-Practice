import java.util.LinkedList;
import java.util.List;

/**
 * 151. 翻转字符串里的单词
 */
public class Solution0151 {
    public static String reverseWords(String s) {
        char[] result = s.toCharArray();
        reverse(result,0,result.length-1);
        for (int i = 0, j = 0 ;j<result.length;j++){
            if (result[i]==' '){
                i++;
                continue;
            }
            if (result[j] == ' ') {
                reverse(result,i,j-1);
                i = j+1;
            } else if (j == result.length - 1){
                reverse(result,i,j);
                i = j+1;
            }
        }
        boolean b = false;
        int i = 0;
        for (int j = 0;j<result.length;j++ ){
            if (result[j] != ' ') {
                if (b == false) {
                    result[i] = result[j];
                    i++;
                    if (j+1==result.length||result[j+1]==' '){
                        b = true;
                    }
                } else {
                    result[i] = ' ';
                    i++;
                    b = false;
                    result[i] = result[j];
                    i++;
                    if (j+1==result.length||result[j+1]==' '){
                        b = true;
                    }
                }
            }
        }
        return String.valueOf(result,0,i);
    }

    public static void reverse(char[] s,int start,int end){
        while (start < end) {
            char tmp = s[start];
            s[start] = s[end];
            s[end] = tmp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        System.out.println(reverseWords(" the sky is blue "));
    }
}

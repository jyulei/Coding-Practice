/**
 * 8. 字符串转换整数 (atoi)
 */
public class Solution0008 {
    public  int myAtoi(String s) {
        if (s.length()==0){
            return 0;
        }
        //用a来标记字符串中的第一个非空字符,用b来标记字符串中从a开始连续的最后一个数字的位置
        int a = -1 , b = -1 ,c = -1;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) != ' '){
                if (a==-1){
                    a = i;
                }
            }
            if (s.charAt(i) > '0'&& s.charAt(i)<='9') {
                if (b == -1) {
                    b = i;
                }
            }
            if (a != -1 &&b != -1){
                if (s.charAt(i) >= '0'&& s.charAt(i)<='9') {
                    c = i;
                } else {
                    break;
                }
            }
        }
//        System.out.println(a+" "+b+" "+c);
        if (a == -1|| (s.charAt(a) != '-' && s.charAt(a)!='+' &&!(s.charAt(a)>='0'&&s.charAt(a)<='9'))){
            return 0;
        }
        for(int k=a+1;k<b;k++){
            if(s.charAt(k)!='0'){
                return 0;
            }
        }
        if (s.charAt(a)=='-'){
            if (b == -1){
                return 0;
            }
            if (c-b>10){
                return Integer.MIN_VALUE;
            }
            long rs = Long.parseLong(s.substring(b,c+1));
            return longToInt(-1*rs);
        } else if (s.charAt(a)=='+'){
            if (b == -1){
                return 0;
            }
            if (c-b>10){
                return Integer.MAX_VALUE;
            }
            long rs = Long.parseLong(s.substring(b,c+1));
            return longToInt(rs);
        } else {
            if (b == -1){
                return 0;
            }
            if (c-b>10){
                return Integer.MAX_VALUE;
            }
            long rs = Long.parseLong(s.substring(b,c+1));
            return longToInt(rs);
        }
    }

    int longToInt(long rs) {
        if (rs >= Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        } else if (rs <= Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        } else {
            return (int)rs;
        }
    }
}

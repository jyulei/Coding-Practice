/**
 * 7. 整数反转
 */
public class Solution0007 {
    public static int reverse(int x) {
        long l = x;
        int f;
        if (l>=0) f = 1;
        else {
            f = -1;
            l = Math.abs(l);
        }

        String s = String.valueOf(l);
        StringBuilder stringBuilder = new StringBuilder();
        boolean t = false;
        for (int i = s.length()-1;i>=0;i--){
            if (s.charAt(i)>0){
                t = true;
            }
            if (t==true){
                stringBuilder.append(s.charAt(i));
            }
        }
        s = stringBuilder.toString();
        l = Long.parseLong(s);
        l*=f;
        if (l>Integer.MAX_VALUE || l < Integer.MIN_VALUE){
            return 0;
        }
        return (int)l;
    }
}

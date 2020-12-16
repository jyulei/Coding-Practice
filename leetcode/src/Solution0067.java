public class Solution0067 {
    public static String addBinary(String a, String b) {
        StringBuilder stringBuilder = new StringBuilder();
        int la = a.length();
        int lb = b.length();
        int tmp = 0;   //进位标志
        while(la>0&&lb>0){
            int p = tmp+turn(a.charAt(--la))+turn(b.charAt(--lb));
            tmp = p/2;
            stringBuilder.append(p%2);
        }
        while (la>0){
            int p = tmp+turn(a.charAt(--la));
            tmp = p/2;
            stringBuilder.append(p%2);
        }
        while (lb>0){
            int p = tmp+turn(b.charAt(--lb));
            tmp = p/2;
            stringBuilder.append(p%2);
        }
        if (tmp==1){
            stringBuilder.append(1);
        }
        return stringBuilder.reverse().toString();
    }

    private static int turn(char charAt) {
        if (charAt=='0'){
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        String a = "1010", b = "1011";
        System.out.println(addBinary(a,b));
    }
}

public class Solution0069 {
    public static int mySqrt(int x) {
        long i;
        for( i = 1; i*i <= x; i++){
        }
        return (int)i-1;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2147395600));
    }
}

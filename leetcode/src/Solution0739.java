import java.util.HashMap;

/**
 * 739. 每日温度
 */
public class Solution0739 {
    /**
     * 单调站
     * 901
     * 496
     * 42
     * 84等题目类似
     * @param T
     * @return
     */
    public int[] dailyTemperatures(int[] T) {
        if (T.length == 0) {
            return new int[0];
        }
        int[] result = new int[T.length];
        int k = T.length-1;
        result[k--] = 0;
        for (int i = T.length-2;i>=0;i--){
            int j;
            for (j = i+1;j<T.length;j++){
                if (T[j]>T[i]){
                    break;
                }
            }
            if (j != T.length) {
                result[k--] = j-i;
            } else {
                result[k--] = 0;
            }
        }
        return result;
    }
}

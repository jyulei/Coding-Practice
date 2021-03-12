import java.util.HashSet;

/**
 * 771. 宝石与石头
 */
public class Solution0771 {
    public int numJewelsInStones(String jewels, String stones) {
        int result =0;
        HashSet hashSet = new HashSet();
        for (char c : jewels.toCharArray()){
            hashSet.add(c);
        }
        for (char c : stones.toCharArray()){
            if (hashSet.contains(c)){
                result++;
            }
        }
        return result;
    }
}

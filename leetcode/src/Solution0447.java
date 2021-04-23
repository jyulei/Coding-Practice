import java.util.*;

/**
 * 447. 回旋镖的数量
 */
public class Solution0447 {
    public int numberOfBoomerangs(int[][] points) {
        int res = 0;
        for(int i = 0; i < points.length; i++){
            Map<Integer, Integer> hashmap = new HashMap<>();
            for(int j = 0; j < points.length; j++){
                int dx = points[i][0] - points[j][0];
                int dy = points[i][1] - points[j][1];
                int dis = dx * dx + dy * dy;
                hashmap.put(dis, hashmap.getOrDefault(dis, 0) + 1);
            }
            for(int val : hashmap.values()){
                res += val * (val - 1);
            }
        }
        return res;
    }
}

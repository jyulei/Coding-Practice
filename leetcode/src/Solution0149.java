/**
 * 149. 直线上最多的点数
 */
public class Solution0149 {
    public int maxPoints(int[][] points) {
        if (points.length == 0) {
            return 0;
        } else if (points.length == 1) {
            return 1;
        }
        int res=0;
        for (int i=0;i<points.length;i++){
            for (int j=i+1;j<points.length;j++){
                int resNow=2;
                for (int k=0;k<points.length;k++){
                    if (k == i | k == j) {
                        continue;
                    }
                    if (judge(points[i],points[j],points[k])){
                        res++;
                    }
                }
                if (res<resNow){
                    res=resNow;
                }
            }
        }
        return res;
    }

    private boolean judge(int[] point, int[] point1, int[] point2) {
        if (point[0]==point1[0]&&point[0]==point2[0]){
            return true;
        } else if(point[0]==point1[0] || point[0]==point2[0] || point1[0]==point2[0]) {
            return false;
        }
        double k1=(point1[1]-point[1])*1.0/(point1[0]-point[0]);
        double k2=(point2[1]-point[1])*1.0/(point2[0]-point[0]);
        return k1==k2;
    }
}

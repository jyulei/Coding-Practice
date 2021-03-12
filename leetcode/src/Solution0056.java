import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * 56. 合并区间
 */
public class Solution0056 {
    public static int[][] merge(int[][] intervals) {
        //对二维数组的排序
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });

        List<int[]> list = new LinkedList<>();
        for (int[] i : intervals){
            if (list.isEmpty()) {
                list.add(i);
            } else {
                int[] inList = list.get(list.size()-1);
                if (i[0]>inList[1]){
                    list.add(i);
                }else {
                    int max = Math.max(i[1],inList[1]);
                    inList[1] = max;
                }
            }
        }
        return list.toArray(new int[0][0]);
    }

    public static void main(String[] args) {
        int[][] intervals =new int[][]{{7,9},{1,3},{2,6},{8,10},{15,18}};
        for (int i = 0 ; i < intervals.length; i++){
            for (int j = 0 ;j < intervals[i].length; j++){
                System.out.print(intervals[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        int[][] result = merge(intervals);
        System.out.println();
        for (int i = 0 ; i < result.length; i++){
            for (int j = 0 ;j < result[i].length; j++){
                System.out.print(result[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}

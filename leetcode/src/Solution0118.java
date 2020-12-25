import java.util.ArrayList;
import java.util.List;

/**
 * 118. 杨辉三角
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 */
public class Solution0118 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        if (numRows == 0) {
            return lists;
        }
        if (numRows == 1) {
            List list = new ArrayList();
            list.add(1);
            lists.add(list);
            return lists;
        }
        List list = new ArrayList();
        list.add(1);
        lists.add(list);
        List list2 = new ArrayList();
        list2.add(1);
        list2.add(1);
        lists.add(list2);
        for (int i = 2; i < numRows; i++){
            List newList = new ArrayList();
            newList.add(1);
            for (int j = 0; j < lists.get(i-1).size()-1; j++){
                int tmp = lists.get(i-1).get(j)+lists.get(i-1).get(j+1);
                newList.add(tmp);
            }
            newList.add(1);
            lists.add(newList);
        }
        return lists;
    }

    public static void main(String[] args) {
        int num = 5;
        List list = generate(num);
    }
}

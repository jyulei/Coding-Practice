import java.util.ArrayList;
import java.util.LinkedList;
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

    public static List<List<Integer>> generate1(int numRows) {
        if (numRows==0){
            return new LinkedList<>();
        }
        if (numRows==1){
            List<List<Integer>> res =new LinkedList();
            List<Integer> rowList=new LinkedList();
            rowList.add(1);
            res.add(rowList);
            return res;
        }
        List res=generate1(numRows-1);
        List<Integer> lastList = (List<Integer>) res.get(numRows-2);
        List newList = new LinkedList();
        newList.add(1);
        for (int i=0;i<lastList.size()-1;i++){
            newList.add(lastList.get(i)+lastList.get(i+1));
        }
        newList.add(1);
        res.add(newList);
        return res;
    }
    public static void main(String[] args) {
        int num = 5;
        List list = generate1(num);
    }
}

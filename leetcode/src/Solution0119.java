import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 * 119. 杨辉三角
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 *
 * 另一简单方法：第(i+1)项是第i项的倍数=(n-i)/(i+1);
 */
public class Solution0119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        if (rowIndex < 0) {
            return list;
        }
        list.add(1);
        if (rowIndex == 0) {
            return list;
        }
        List<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(1);
        for (int i = 1; i < rowIndex; i++){
            list = result;
            result = new ArrayList<>();
            result.add(1);
            for (int j = 0; j < list.size()-1; j++){
                int tmp = list.get(j)+list.get(j+1);
                result.add(tmp);
            }
            result.add(1);
        }
        return result;
    }

    public List<Integer> getRow1(int rowIndex) {
        if (rowIndex==0){
            List<Integer> res =new LinkedList();
            res.add(1);
            return res;
        }
        List<Integer> last=getRow1(rowIndex-1);
        List<Integer> result = new ArrayList<>();
        result.add(1);
        for (int j = 0; j < last.size()-1; j++){
            int tmp = last.get(j)+last.get(j+1);
            result.add(tmp);
        }
        result.add(1);
        return result;
    }
}


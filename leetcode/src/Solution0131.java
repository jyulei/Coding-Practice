import java.util.LinkedList;
import java.util.List;

/**
 * 131. 分割回文串
 */
public class Solution0131 {
    /**
     * budui
     * @param s
     * @return
     */
    public List<List<String>> partition(String s) {
        List res = new LinkedList();
        for (int size=1;size<=s.length();size++){
            List<String> subList=new LinkedList();
            for (int i=0,j=i+size-1;j<s.length();i++,j++){
                if(judge(s,i,j)){
                    subList.add(s.substring(i,j+1));
                }
            }
            if (subList.size()==0){
                break;
            } else {
                res.add(subList);
            }
        }
        return res;
    }

    private boolean judge(String s, int i, int j) {
        while (i<j){
            if (s.charAt(i)==s.charAt(j)){
                i++;j--;
            } else {
                return false;
            }
        }
        return true;
    }
}

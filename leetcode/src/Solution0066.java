/**
 * 66. 加一
 */
public class Solution0066 {
    public int[] plusOne(int[] digits) {
        int[] rs = new int[digits.length+1];
        for (int  i = 0 ; i < digits.length;i++){
            rs[i] = digits[digits.length-i-1];
        }
        rs[digits.length] = 0;
        boolean tmp = false;
        int j = 0;
        if (rs[j]==9){
            tmp = true;
            rs[j] = 0;
        } else {
            rs[j]++;
        }
        j++;
        while(tmp){
            if (rs[j]==9){
                rs[j] = 0;
            } else {
                tmp = false;
                rs[j] += 1;
            }
            j++;
        }
        int[] re;
        if (rs[rs.length-1]!=0){
            re = new int[rs.length];
            for (int i = 0;i < rs.length;i++){
                re[i] = rs[rs.length-1-i];
            }
        } else {
            re = new int[rs.length-1];
            for (int i = 0;i < re.length;i++){
                re[i] = rs[rs.length-2-i];
            }
        }
        return re;
    }
}

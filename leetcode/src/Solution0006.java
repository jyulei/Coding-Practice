/**
 * 6. Z 字形变换
 */
public class Solution0006 {
    public  String convert(String s, int numRows) {
        if (s == null || s.length() <2 || numRows == 1 ){
            return s;
        }
        StringBuilder[] stringBuilders = new StringBuilder[numRows];
        for (int i=0;i< numRows;i++){
            stringBuilders[i] = new StringBuilder();
        }
        int j=0;
        boolean t = false;
        for (int i = 0;i< s.length();i++){
            if (t==false){
                stringBuilders[j].append(s.charAt(i));
                j++;
                if (j==numRows-1){
                    t=true;
                }
            }else {
                stringBuilders[j].append(s.charAt(i));
                j--;
                if (j==0){
                    t=false;
                }
            }
        }
        for (int i = 1 ;i<numRows;i++){
            stringBuilders[0].append(stringBuilders[i]);
        }
        return stringBuilders[0].toString();
    }
}

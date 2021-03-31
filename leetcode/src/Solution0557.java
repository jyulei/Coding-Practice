/**
 * 557. 反转字符串中的单词 III
 */
public class Solution0557 {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int start = -1;
        for (int i = 0;i<arr.length;i++){
            if (arr[i] != ' ') {
                if (start == -1) {
                    start = i;
                }
            } else {
                if (start != -1) {
                    reverse(arr,start,i-1);
                    start = -1;
                }
            }
            if (i == arr.length - 1) {
                if (start != -1) {
                    reverse(arr,start,i);
                    start = -1;
                }
            }
        }
        return String.valueOf(arr);
    }

    public static void reverse(char[] arr,int start,int end){
        while (start < end) {
            char tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            start++;
            end--;
        }
    }
}

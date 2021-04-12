/**
 * 744. 寻找比目标字母大的最小字母
 */
public class Solution0744 {
    public char nextGreatestLetter(char[] letters, char target) {
        int left=0,right=letters.length-1;
        while (left <= right) {
            int mid = left+(right-left)/2;
            if (letters[mid] <= target) {
                left=mid+1;
            } else {
                right = mid-1;
            }
        }
        if (left == letters.length) {
            return letters[0];
        }else {
            return letters[left];
        }
    }
}

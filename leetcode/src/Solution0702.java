/**
 * 702. 搜索长度未知的有序数组
 */
public class Solution0702 {
    public int search(ArrayReader reader, int target) {
        int left =0,right=1;
        while(true){
            if (reader.get(right) < target) {
                left = right+1;
                right = 2*right+1;
            } else {
                while (left <= right) {
                    int mid = left+(right-left)/2;
                    if (reader.get(mid)==target){
                        return mid;
                    } else if (reader.get(mid) < target) {
                        left = mid+1;
                    } else {
                        right = mid-1;
                    }
                }
                return -1;
            }
        }
    }
}


// This is ArrayReader's API interface.
// You should not implement it, or speculate about its implementation
interface ArrayReader {
    public int get(int index);
}


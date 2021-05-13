/**
 * 面试题 10.01. 合并排序的数组
 */
public class Interview10_01 {

    public void merge(int[] A, int m, int[] B, int n) {
        int p=A.length-1,q=m-1,r=n-1;
        while (q >= 0 && r >= 0) {
            if (A[q]>=B[r]){
                A[p]=A[q];
                q--;
            } else {
                A[p]=B[r];
                r--;
            }
            p--;
        }
        while (q>=0){
            A[p]=A[q];
            q--;
            p--;
        }
        while (r>=0){
            A[p]=B[r];
            r--;
            p--;
        }
    }
}

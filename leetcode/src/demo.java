import java.util.Arrays;

public class demo {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int [] a = {1,2,3,1};
        System.out.println(containsDuplicate(a));
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }

        ListNode p;
        p = reverseList(head.next);
        p.next = head;
        head.next = null;
        return p;


    }

    public int missingNumber(int[] nums) {
        int result = 0;
        for (int i = 1 ; i < nums.length;i++){
            result = result ^ i;
        }
        result = result ^ nums.length;
        for (int i = 0; i< nums.length;i++){
            result = result ^ nums[i];
        }
        return result;
    }
}

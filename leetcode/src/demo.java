import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
    public int firstUniqChar(String s) {
        Map<Character,Boolean> map = new HashMap<>();
        int k = 0;
        for (int i = 0 ;i< s.length();i++){
            char ch = s.charAt(i);
            if (map.containsKey(ch)){
                map.put(ch,false);
            } else {
                map.put(ch,true);
            }
        }
        for (int i = 0 ;i< s.length();i++){
            char ch = s.charAt(i);
            if (map.get(ch) == true) {
                return i;
            }
        }
        return -1;
    }

    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            int last0 = 1;
            int last1 = 2;
            for (int i = 3;i <= n;i++){
                int tmp = last0 + last1;
                last0 = last1;
                last1 = tmp;
            }
            return last1;
        }
    }

    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int min = prices[0];
        int maxProfit = 0;
        for (int i = 0; i < prices.length;i++){
            if (prices[i] - min > maxProfit) {
                maxProfit = prices[i] - min;
            } else {
                if (prices[i] < min) {
                    min = prices[i];
                }
            }
        }
        return maxProfit;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA=0,lengthB = 0;
        ListNode p = headA;
        ListNode q = headB;
        while (p != null) {
            p = p.next;
            lengthA++;
        }
        while (q != null) {
            q = q.next;
            lengthB++;
        }
        p = headA;
        q = headB;
        if (lengthA > lengthB) {
            int tmp = lengthA - lengthB;
            while (tmp-- != 0) {
                p = p.next;
            }
        } else {
            int tmp = lengthB - lengthA;
            while (tmp-- != 0) {
                q = q.next;
            }
        }
        while (q != p) {
            q = q.next;
            p = p.next;
        }
        return q;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (n-- != 0) {
            fast = fast.next;
        }
        if (fast == null) {
            return head.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}

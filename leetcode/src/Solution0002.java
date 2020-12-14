class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) {
         this.val = val;
         this.next = next;
     }
}

public class Solution0002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list1 = new ListNode();
        ListNode p = list1;
        boolean tmp = false;
        while(l1!=null&&l2!=null){
            ListNode list = new ListNode(0);
            if(tmp==true){
                list.val=1;
            }
            tmp=false;
            if( list.val+l1.val+l2.val>=10){
                tmp=true;
            }
            list.val=(list.val+l1.val+l2.val)%10;
            p.next=list;
            p=list;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            ListNode list = new ListNode(0);
            if(tmp==true){
                list.val=1;
            }
            tmp=false;
            if(list.val+l1.val>=10){
                tmp=true;
            }
            list.val=(list.val+l1.val)%10;
            p.next=list;
            p=list;
            l1=l1.next;
        }
        while(l2!=null){
            ListNode list = new ListNode(0);
            if(tmp==true){
                list.val=1;
            }
            tmp=false;
            if(list.val+l2.val>=10){
                tmp=true;
            }
            list.val=(list.val+l2.val)%10;
            p.next=list;
            p=list;
            l2=l2.next;
        }
        if(tmp==true){
            ListNode list = new ListNode(1);
            p.next=list;
            p=list;
        }
        return list1.next;
    }
}

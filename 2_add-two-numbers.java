/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre=new ListNode();
        ListNode cur=pre;
        int tem=0;
        while(l1!=null||l2!=null){
            int x = (l1==null) ? 0: l1.val;
            int y = (l2==null) ? 0: l2.val;
            int sum=x+y+tem;
            tem=sum/10;
            sum%=10;
            cur.next=new ListNode(sum);

            cur=cur.next;
            if(l1!=null)l1=l1.next;
            if(l2!=null)l2=l2.next;
        }
        if(tem==1)
            cur.next=new ListNode(tem);
        return pre.next;
    }
}

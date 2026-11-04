/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        int sum=0;
        ListNode ans = new ListNode(0);
        ListNode temp=ans;
        head=head.next;
        while(head!=null)
        {
            if(head.val!=0)
            {
                sum+=head.val;
            }
            else
            {
                ListNode newnode=new ListNode(sum);
                temp.next = newnode;
                temp = newnode;

                sum = 0;

            }
            head=head.next;
        }
        return ans.next;
    }
}
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
    public ListNode middleNode(ListNode head) {
        
        ListNode curr = head;
        int left = 1;
        int right = 1;

        while(curr.next != null)
        {
            right++;
            curr = curr.next;
        }

        int mid = (left + right + 1) / 2;

        return findMiddle(head, mid);
    }

    public ListNode findMiddle(ListNode head, int mid)
    {
        ListNode curr = head;

        while(mid != 1)
        {
            curr = curr.next;
            mid--;
        }

        return curr;
    }
}
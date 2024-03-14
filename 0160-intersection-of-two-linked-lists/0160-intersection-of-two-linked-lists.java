/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode temp = headA;
        int len1 = 0;
        int len2 = 0;

        while(temp != null)
        {
            len1++;
            temp = temp.next;
        }

        temp = headB;

        while(temp != null)
        {
            len2++;
            temp = temp.next;
        }

        if(len1 > len2)
            return intersectionPoint(headA, headB, len1 - len2);
        else
            return intersectionPoint(headB, headA, len2 - len1);
        
    }

    public ListNode intersectionPoint(ListNode headA, ListNode headB, int step)
    {
        ListNode temp1 = headA;
        ListNode temp2 = headB;

        while(step != 0)
        {
            step--;
            temp1 = temp1.next;
        }

        while(temp1 != null && temp2 != null)
        {
            if(temp1 == temp2)
                return temp1;
            
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return null;
    }
}
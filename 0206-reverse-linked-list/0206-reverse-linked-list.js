/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var reverseList = function(head) {
    
    let stack = new Array();
    let temp = head;

    while(temp != null)
    {
        stack.push(temp.val);
        temp = temp.next;
    }

    temp = head;

    while(temp != null)
    {
        temp.val = stack.pop();
        temp = temp.next;
    }

    return head;
};
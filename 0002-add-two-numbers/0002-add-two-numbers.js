/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var addTwoNumbers = function(l1, l2) {
    
    let temp1 = l1;
    let temp2 = l2;
    let dummyNode = new ListNode(-1);
    let temp3 = dummyNode;
    let carry = 0;

    while(temp1 !== null && temp2 !== null)
    {
        let totVal = temp1.val + temp2.val + carry;
        let val = totVal % 10;
        carry = Math.trunc(totVal / 10);

        temp3.next = new ListNode(val);
        temp3 = temp3.next;
        temp1 = temp1.next;
        temp2 = temp2.next;
    }

    while(temp1 !== null)
    {
        let totVal = temp1.val + carry;
        let val = totVal % 10;
        carry = Math.trunc(totVal / 10);

        temp3.next = new ListNode(val);
        temp3 = temp3.next;
        temp1 = temp1.next;
    }

    while(temp2 !== null)
    {
        let totVal =  temp2.val + carry;
        let val = totVal % 10;
        carry = Math.trunc(totVal / 10);
        
        temp3.next = new ListNode(val);
        temp3 = temp3.next;
        temp2 = temp2.next;
    }

    if(carry != 0)
    {
        temp3.next = new ListNode(carry);
    }

    return dummyNode.next;
};
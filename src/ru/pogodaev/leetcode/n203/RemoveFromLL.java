package ru.pogodaev.leetcode.n203;

import ru.pogodaev.leetcode.ListNode;

/**
 * Given the head of a linked list and an integer val, remove all the nodes of the linked list
 * that has Node.val == val, and return the new head.
 */
public class RemoveFromLL {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        while (pre.next != null) {
            if (pre.next.val == val) pre.next = pre.next.next;
            else pre = pre.next;
        }
        return dummy.next;

    }
}

package ru.pogodaev.leetcode.n19;

import ru.pogodaev.leetcode.ListNode;

/**
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 */
public class RemoveNthNodeFromLL {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null || head.next == null) return null;

        ListNode front = head, back = head;
        while (n-- > 0) {
            front = front.next;
        }
        if (front == null) return head.next;
        while (front.next != null) {
            front = front.next;
            back = back.next;
        }
        back.next = back.next.next;
        return head;
    }
}

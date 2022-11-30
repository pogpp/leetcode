package ru.pogodaev.leetcode.n206;

import ru.pogodaev.leetcode.ListNode;

public class ReverseLL {
    public ListNode reverseList(ListNode head) {
        if (head == null) return head;

        ListNode next = head.next;
        head.next = null;

        while (next != null) {
            ListNode temp = next.next;
            next.next = head;
            head = next;
            next = temp;
        }
        return head;
    }

    public ListNode reverseList2(ListNode head) {
        if (head == null) return head;
        ListNode next = head.next;
        head.next = null;

        return recursive(head, next);
    }

    private ListNode recursive(ListNode head, ListNode next) {
        if (next == null) return head;
        ListNode temp = next.next;
        next.next = head;
        return recursive(next, temp);

    }
}

package ru.pogodaev.leetcode.n141;

import ru.pogodaev.leetcode.ListNode;


public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        if (head == null || head.next == null) {
            return false;
        }
        ListNode fast = head.next;

        while (slow != fast) {
            slow = slow.next;
            if (fast != null && fast.next != null)
                fast = fast.next.next;
            else {
                return false;
            }
        }

        return true;
    }

}

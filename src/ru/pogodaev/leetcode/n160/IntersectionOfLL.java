package ru.pogodaev.leetcode.n160;

import ru.pogodaev.leetcode.ListNode;

/**
 * Given the heads of two singly linked-lists headA and headB,
 * return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null
 **/
public class IntersectionOfLL {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode dupHead1 = headA;
        ListNode dupHead2 = headB;

        while (dupHead1 != null || dupHead2 != null) {
            if (dupHead1 == null) {
                dupHead1 = headB;
            }
            if (dupHead2 == null) {
                dupHead2 = headA;
            }
            if (dupHead1 == dupHead2) return dupHead1;
            dupHead1 = dupHead1.next;
            dupHead2 = dupHead2.next;
        }
        return null;
    }
}

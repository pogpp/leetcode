package ru.pogodaev.leetcode.n61;

import ru.pogodaev.leetcode.ListNode;

/**
 * Given the head of a linked list,rotate the list to the right by k places.
 */

public class RotateList {
    public static void main(String[] args) {
        ListNode one = new ListNode();
        one.val = 1;
        one.next = new ListNode();
        one.next.val = 2;
        one.next.next = new ListNode();
        one.next.next.val = 3;
        one.next.next.next = new ListNode();
        one.next.next.next.val = 4;
        one.next.next.next.next = new ListNode();
        one.next.next.next.next.val = 5;
    }

    public ListNode rotateRight(ListNode head, int k) {
        ListNode dummy = head;
        if (head == null || head.next == null) {
            return head;
        }
        //length starts from 1 to include last element
        int n = 1;
        //goes until last element
        while (dummy.next != null) {
            dummy = dummy.next;
            n++;
        }
        //Set the last node to head to form circular linked list
        dummy.next = head;
        dummy = head;
        // Rotating n*a times would just give the same linked list so remove them
        k = k % n;
        //  Since we rotate right we have to find the (n-k)th element which is the head
        for (int i = 0; i < n - k - 1; i++) {
            dummy = dummy.next;
        }
        //Break the cycle by keeping head as (n-k) and setting (n-k-1)th element as tail
        head = dummy.next;
        dummy.next = null;
        return head;
    }
}

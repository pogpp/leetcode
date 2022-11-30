package ru.pogodaev.leetcode.n2;

import ru.pogodaev.leetcode.ListNode;


/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */

public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode one = new ListNode();
        one.val = 9;
        one.next = new ListNode();
        one.next.val = 9;
        one.next.next = new ListNode();
        one.next.next.val = 9;
        one.next.next.next = new ListNode();
        one.next.next.next.val = 9;

        ListNode two = new ListNode();
        two.val = 9;
        two.next = new ListNode();
        two.next.val = 9;
        two.next.next = new ListNode();
        two.next.next.val = 9;
        two.next.next.next = new ListNode();
        two.next.next.next.val = 9;
        two.next.next.next.next = new ListNode();
        two.next.next.next.next.val = 9;
        two.next.next.next.next.next = new ListNode();
        two.next.next.next.next.next.val = 9;
        addTwoNumbers(one, two);

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode c1 = l1;
        ListNode c2 = l2;
        ListNode sentinel = new ListNode(0);
        ListNode d = sentinel;

        int sum = 0;
        int k = 0;

        while (c1 != null || c2 != null) {

            sum = sum / 10;

            if (c1 != null) {
                sum = sum + c1.val;
                c1 = c1.next;
            }
            if (c2 != null) {
                sum = sum + c2.val;
                c2 = c2.next;
            }

            d.next = new ListNode(sum % 10);
            d = d.next;

            System.out.println(k++);
        }

        if (sum / 10 == 1) {
            d.next = new ListNode(1);
        }
        return sentinel.next;
    }
}

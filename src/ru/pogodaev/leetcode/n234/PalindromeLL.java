package ru.pogodaev.leetcode.n234;

import ru.pogodaev.leetcode.ListNode;

import java.util.Stack;


/**
 * Given the head of a singly linked list, return true if it is a palindrome.
 */
public class PalindromeLL {
    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) return false;

        //find half
        ListNode fast = head;
        ListNode slow = head;

        Stack<ListNode> stack = new Stack<>();

        while (fast != null && fast.next != null) {

            stack.push(slow);

            fast = fast.next.next;
            slow = slow.next;

        }

        //if odd length, move one forward away from middle element
        if (fast != null)
            slow = slow.next;

        //compare second half of the list to stack
        while (slow != null) {
            if (stack.pop().val != slow.val) return false;
            slow = slow.next;

        }

        return true;

    }
}

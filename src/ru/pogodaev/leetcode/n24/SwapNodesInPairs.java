package ru.pogodaev.leetcode.n24;

import ru.pogodaev.leetcode.ListNode;

public class SwapNodesInPairs {

    public static void main(String[] args) {

        ListNode head = new ListNode();
        head.val = 1;

        head.next = new ListNode();
        head.next.val = 2;

        head.next.next = new ListNode();
        head.next.next.val = 3;

        head.next.next.next = new ListNode();
        head.next.next.next.val = 4;


        ListNode newHead = swapPairs(head);

        while (newHead != null) {
            System.out.println(newHead.val);
            newHead = newHead.next;
        }


    }


    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = head;
        System.out.println("temp " + temp.val);

        head = temp.next;
        System.out.println("head " + head.val);

        ListNode next = head.next;
        if (next != null) {
            System.out.println("next " + next.val);
        }
        head.next = temp;
        temp.next = swapPairs(next);
        return head;
    }


}

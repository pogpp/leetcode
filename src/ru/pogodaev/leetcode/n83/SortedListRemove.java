package ru.pogodaev.leetcode.n83;

import ru.pogodaev.leetcode.ListNode;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SortedListRemove {

    public static void main(String[] args) {
        ListNode head = null;
        ListNode node = new ListNode();
        node.val = 1;
        head = node;
        node.next = new ListNode();
        node = node.next;
        node.val = 1;
        node.next = new ListNode();
        node = node.next;
        node.val = 2;
        deleteDuplicates(head);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;
        ListNode par = head;


        ListNode first = null;
        ListNode headFirst = null;

        HashSet<Integer> set = new LinkedHashSet<>();


        while (par != null) {
            set.add(par.val);
            par = par.next;
        }

        for (Integer n : set) {
            ListNode node = new ListNode();
            node.next = null;
            node.val = n;
            if (first == null) {
                first = node;
                headFirst = first;
            } else {
                first.next = node;
                first = first.next;
            }

        }

        return headFirst;
    }

    public ListNode deleteDuplicatess(ListNode head) {
        if (head == null || head.next == null) return head;

        head.next = deleteDuplicatess(head.next);

        return head.val == head.next.val ? head.next : head;
    }


}

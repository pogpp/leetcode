package ru.pogodaev.leetcode;

public class DoublyListNode {
    public int val;
    public DoublyListNode next;
    public DoublyListNode prev;

    public DoublyListNode() {
    }

    public DoublyListNode(int val) {
        this.val = val;
    }

    DoublyListNode(int val, DoublyListNode next, DoublyListNode prev) {
        this.val = val;
        this.next = next;
        this.prev = prev;
    }
}

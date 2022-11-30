package ru.pogodaev.leetcode.n707;

/**
 * Design your implementation of the linked list. You can choose to use a singly or doubly linked list.
 * A node in a singly linked list should have two attributes: val and next. val is the value of the current node,
 * and next is a pointer/reference to the next node.
 * If you want to use the doubly linked list, you will need one more attribute prev to indicate the previous node
 * in the linked list. Assume all nodes in the linked list are 0-indexed.
 * <p>
 * Implement the MyLinkedList class:
 * <p>
 * MyLinkedList() Initializes the MyLinkedList object.
 * int get(int index) Get the value of the indexth node in the linked list. If the index is invalid, return -1.
 * void addAtHead(int val) Add a node of value val before the first element of the linked list. After the insertion,
 * the new node will be the first node of the linked list.
 * void addAtTail(int val) Append a node of value val as the last element of the linked list.
 * void addAtIndex(int index, int val) Add a node of value val before the indexth node in the linked list.
 * If index equals the length of the linked list, the node will be appended to the end of the linked list.
 * If index is greater than the length, the node will not be inserted.
 * void deleteAtIndex(int index) Delete the indexth node in the linked list, if the index is valid.
 */
public class MyLinkedList {

    ListNode head;
    int length;

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public MyLinkedList() {
        this.head = null;
        this.length = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= this.length) {
            return -1;
        } else {
            int count = 0;
            ListNode curr = head;
            while (count < index) {
                curr = curr.next;
                count++;
            }
            return curr.val;
        }
    }

    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = this.head;
        this.head = newNode;
        this.length++;
    }

    public void addAtTail(int val) {
        if (this.length == 0) {
            addAtHead(val);
            return;
        }

        ListNode newNode = new ListNode(val);
        ListNode temp = this.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = null;
        this.length++;
    }

    public void addAtIndex(int index, int val) {
        if (index > this.length) {
            return;
        }

        if (index == 0) {
            addAtHead(val);
            return;
        }

        if (index == this.length) {
            addAtTail(val);
            return;
        }

        ListNode newNode = new ListNode(val);
        ListNode temp = this.head;
        int count = 0;

        while (count < index - 1) {
            temp = temp.next;
            count++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        this.length++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= this.length) {
            return;
        }

        ListNode curr = this.head;
        int count = 0;

        if (index == 0) {
            this.head = curr.next;
        } else {
            ListNode pre = null;
            while (count < index) {
                pre = curr;
                curr = curr.next;
                count++;
            }
            pre.next = curr.next;
        }
        this.length--;
    }
}

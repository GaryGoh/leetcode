package LeetCode;


import LeetCode.util.ListNode;

/**
 * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
 * <p>
 * Given linked list -- head = [4,5,1,9], which looks like following:
 * <p>
 * 4 -> 5 -> 1 -> 9
 * Example 1:
 * <p>
 * Input: head = [4,5,1,9], node = 5
 * Output: [4,1,9]
 * Explanation: You are given the second node with value 5, the linked list
 * should become 4 -> 1 -> 9 after calling your function.
 * Example 2:
 * <p>
 * Input: head = [4,5,1,9], node = 1
 * Output: [4,5,9]
 * Explanation: You are given the third node with value 1, the linked list
 * should become 4 -> 5 -> 9 after calling your function.
 * Note:
 * <p>
 * The linked list will have at least two elements.
 * All of the nodes' values will be unique.
 * The given node will not be the tail and it will always be a valid node of the linked list.
 * Do not return anything from your function.
 *
 *
 * questions:
 *
 * 1. can this linked list be a cycle? if this is the case, how to handle removing the "tail", which is the start node of the cycle.
 * a->b->c->a
 *
 * corner case:
 *
 *
 * algorithm:
 * fin
 */


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class DeleteNodeinaLinkedList {
    /**
     * replace the next node with the node that needs to be removed.
     */
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

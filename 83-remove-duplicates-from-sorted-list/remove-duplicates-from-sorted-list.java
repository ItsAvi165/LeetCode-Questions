/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode trav = head;
        while(trav.next != null){
            if(trav.val == trav.next.val){
                trav.next = trav.next.next;
            }
            else{
                trav = trav.next;
            }
        }
        return head;
    }
}
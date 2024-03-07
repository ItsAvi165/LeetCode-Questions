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
    public ListNode removeElements(ListNode head, int val) {
        // ListNode trav = head;
        // if(head == null) return null;

        // while(trav.next != null){
        //     if(trav.val == val){
        //         trav = trav.next; 
        //     }
        //     else if(trav.next.val == val){
        //         if(trav.next.next == null){
        //             trav.next = null;
        //         }
        //         else{
        //         trav.next = trav.next.next;
        //         trav = trav.next;
        //         }
        //     }
        // }
        // return trav;

        ListNode temp = new ListNode(0);
        ListNode curr = temp;
        temp.next = head;
        while(curr.next != null ){
            if(curr.next.val == val) curr.next = curr.next.next;
            else curr = curr.next;
        }
        return temp.next;
    }
}
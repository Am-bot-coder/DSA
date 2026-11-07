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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        
        else{
            int count = 0;
            ListNode h = head;
            while(h!=null){
                count++;
                h=h.next;
            }
            for(int i = 0;i<k%count;i++){
                ListNode trav = head;
                
                if(trav.next!=null){
                    while(trav.next.next!=null){
                        trav = trav.next;
                    }
                    trav.next.next = head;
                    head = trav.next;
                    trav.next = null;
                }
            }
        }
        return head;
    }
}
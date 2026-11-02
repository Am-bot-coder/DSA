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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null){
            return null;
        }
        else if(head.next == null){
            return head;
        }
        else if(left==right){

        }
        else if(left==1){
            ListNode t1 = head;
            ListNode prev = null;
            ListNode curr = head;
            for(int i =left;i<=right;i++){
                ListNode temp = curr;
                curr = curr.next;
                temp.next = prev;
                prev = temp;
            }
            t1.next = curr;
            head = prev;

        }
        else{
            ListNode trav = head;
            for(int i = 1;i<left-1;i++){
                trav = trav.next;
            }
            ListNode t1 = trav;
            ListNode prev = t1;
            ListNode curr = t1.next;
            for(int i =left;i<=right && curr!=null;i++){
                ListNode temp = curr;
                curr = curr.next;
                temp.next = prev;
                prev = temp;
            }  
            t1.next.next = curr;
            t1.next = prev;    


        }
        return head;
    }
}
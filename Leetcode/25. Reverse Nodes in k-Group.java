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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }        
        else{
            ListNode h;
            ListNode trav = head;
            int ctr = 0;
            for(int i=1;i<k;i++){
                if(trav.next==null){
                    return head;                    
                }
                trav =trav.next;
            }

            h = trav;
            trav = head;

            ListNode curr = head;
            ListNode prev = null;
            ListNode f;
            
            while(curr!=null){        
                
                f = curr;
                for(int i=0;i<k;i++){
                    ListNode temp = curr;
                    curr = curr.next;
                    temp.next  = prev;
                    prev = temp;
                }
                trav = curr;
                for(int i=1;i<k;i++){
                    if(trav==null){
                        f.next = curr;
                    }
                    else if(trav.next==null){
                        f.next = curr;
                        return h;                    
                    }
                    else{
                        trav =trav.next;
                    }
                    
                }
                
                f.next = trav;
                f = curr;
                
            }
            return h;
        }
    }
}
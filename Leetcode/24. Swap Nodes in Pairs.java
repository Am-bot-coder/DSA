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
    public ListNode swapPairs(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        else{
            
            
            ListNode curr = head;
            ListNode h = head.next;

            while(curr!=null &&curr.next!=null){
                ListNode temp = curr;
                curr = curr.next;
                if(curr.next!=null && curr.next.next!=null){
                    temp.next = curr.next.next;
                }
                else{
                    temp.next = curr.next;
                }
                ListNode temp2 = curr;
                curr =curr.next;
                temp2.next = temp;
            }

            return h;
            }
            
        }
    }

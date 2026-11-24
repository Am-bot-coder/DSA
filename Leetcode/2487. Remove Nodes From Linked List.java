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
    public ListNode removeNodes(ListNode head) {
        ArrayDeque<ListNode>stack = new ArrayDeque<>();
        ListNode trav = head;
        while(trav!=null){
            while(!stack.isEmpty() && trav.val>stack.peek().val){
                stack.pop();
            }
            if(stack.isEmpty()){
                head = trav;
            }
            else{
                stack.peek().next = trav;
            }
            stack.push(trav);
            trav = trav.next;
        }
        return head;
    }
}
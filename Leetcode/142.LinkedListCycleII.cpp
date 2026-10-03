#include<iostream>
using namespace std;

struct ListNode {
      int val;
      ListNode *next;
      ListNode(int x) : val(x), next(NULL) {}
 };

class Solution {
public:
    ListNode *detectCycle(ListNode *head) {

        if(head==NULL){
            return NULL;
        }
        if(head->next==NULL){
            return NULL;
        }
       
       ListNode *slow = head;
       ListNode *fast = head;
       int pos=-1;

       while(fast!=NULL && fast->next!=NULL){
        slow->val = INT_MAX;
        fast->val = INT_MAX;
        if(fast->next==NULL || fast->next->next==NULL){
            break;
        }
        if(fast->next->val==INT_MAX || fast->next->next->val==INT_MAX){
            fast->next->val=INT_MIN;
            fast->next->next->val=INT_MIN;
            pos = 1;
            break;
        }
        slow=slow->next;
        fast=fast->next->next;        

       }

       if(pos==1){
            while(head->val!=INT_MIN){
            head = head->next;            
            }
            return head;
       }
       return NULL;

    

       
    }
};
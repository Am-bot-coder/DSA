#include<iostream>
using namespace std;

struct ListNode {
      int val;
      ListNode *next;
      ListNode(int x) : val(x), next(NULL) {}
 };

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    bool isPalindrome(ListNode* head) {
        if(head==NULL || head->next == NULL){
            return true;
        }

        ListNode* slow = head;
        ListNode* fast = head;

        while(fast!=NULL && fast->next!=NULL){
            slow=slow->next;
            fast=fast->next->next;
        }

        ListNode* prev = NULL;
        ListNode* curr = slow;
        ListNode* nxt = slow;
        

        while(curr!=NULL){
          nxt = curr->next;
          curr->next = prev;
          prev = curr;
          curr = nxt; 
        }
        while(head!=prev && prev!=NULL){
            if(head->val!=prev->val){
                return false;
            }
            head = head->next;
            prev = prev->next;
            
        }
        return true;
    }
};

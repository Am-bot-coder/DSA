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
    void reorderList(ListNode* head) {
    ListNode* slow= head;
    ListNode* fast= head;
    while(fast!=NULL && fast->next!=NULL){
        slow = slow->next;
        fast = fast->next->next;
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

    while(head!=prev && prev->next!=NULL){
        ListNode* temp;
        temp = head;
        head = head->next;
        temp->next = prev;
        temp = prev;
        prev = prev->next;
        temp->next = head;

    }

    }
};
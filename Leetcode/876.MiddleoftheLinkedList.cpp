#include<iostream>
using namespace std;
//876.MiddleoftheLinkedList.cpp
struct ListNode {
      int val;
      ListNode *next;
      ListNode(int x) : val(x), next(NULL) {}
 };

class Solution {
public:
    ListNode* middleNode(ListNode* head) {
        
        int ctr=0;
        ListNode* curr = head;
        while(curr!=NULL){
            ctr++;
            curr = curr->next;
        }
        for(int i = 0;i<=(ctr/2);i++){
            if(i==0){
                continue;
            }
            head = head->next;
        }
        return head;
    }
};


class Solution2 {
public:
    ListNode* middleNode(ListNode* head) {
        ListNode* slow = head;
        ListNode* fast = head;

        while(fast!=NULL && fast->next!=NULL){
            slow = slow->next;
            fast = fast->next->next;
        }
        return slow;
    }
};
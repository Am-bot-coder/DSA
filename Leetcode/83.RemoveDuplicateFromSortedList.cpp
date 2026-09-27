#include<iostream>
#include<list>
using namespace std;

 
struct ListNode {
      int val;
      ListNode *next;
      ListNode() : val(0), next(nullptr) {}
      ListNode(int x) : val(x), next(nullptr) {}
      ListNode(int x, ListNode *next) : val(x), next(next) {}
 };

ListNode* deleteDuplicates(ListNode* head) {

        if(head ==NULL){
            return NULL;
        }
        if(head->next==NULL){
            return head;
        }
        
        ListNode* prev = head;
        ListNode* curr = prev->next;

        while(curr!=NULL){
            if(prev->val == curr->val){
                ListNode* temp = curr;
                curr = curr->next;
                temp->next = NULL;
                delete temp;
                prev->next = curr;
                        
                
            }
            else{
                curr = curr->next;
                prev = prev->next;
            }
        }
        return head;

        
    }
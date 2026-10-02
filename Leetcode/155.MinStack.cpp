#include<iostream>
#include<vector>
using namespace std;

class MinStack {
public:
    int d;
    int minValue = INT_MAX;
    vector<long>stack;
    MinStack() {
        d = -1;
    }
    
    void push(int value) {
        if(d==-1){
            minValue = INT_MAX;
        }
        d++;
        
        minValue = min(minValue,value);
        stack.push_back(value);
        
    }
    
    void pop() {
        if(d!=-1){
            stack.erase(stack.begin()+d);
            d--;
            if(d!=-1){
            minValue = stack[0];
            for(vector<long>:: iterator it = stack.begin();it<stack.end();it++){
                if((*it)<minValue){
                    minValue = (*it);
                }
            }
            
        }
        }
    }
    
    int top() {
       return stack[d]; 
    }
    
    int getMin() {
        
        return minValue;
    }
};


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack* obj = new MinStack();
 * obj->push(value);
 * obj->pop();
 * int param_3 = obj->top();
 * int param_4 = obj->getMin();
 */
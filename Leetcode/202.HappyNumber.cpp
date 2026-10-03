#include<iostream>
//202.HappyNumber.cpp
using namespace std;
int squaresum(int a){
            int sum = 0;
            while(a>0){
                int temp = a%10;
                sum+=(temp*temp);
                a = a/10;
            }
            return sum;
        }
bool isHappy(int n) {
        
        int slow = n;
        int fast = squaresum(n);

        while(fast!=slow && fast!=1){
            cout<<squaresum(fast)<<endl;
            slow = squaresum(slow);
            fast = squaresum(fast);
            fast = squaresum(fast);
        }

        return fast==1;
        
    }
int main()
{   int num;
    cout<<"Enter the number ->";
    cin>>num;
    cout<<"ishappy: "<<isHappy(num);
    return 0;
}

#include<iostream>
#include<cmath>
using namespace std;

bool isPalindrome(int x) {
        int temp = 0;
        int y = x;
        if(x<0){
            return false;
        }
        if(x%10 == x){
            return true;
        }
        int count = floor(log10(x));
        cout<<count<<endl;
        while(x>=0 && count>=0){
            temp += (x%10)*pow(10,count);
            cout<<"temp = "<<temp<<endl;
            count--;
            x = floor(x/10);
        }
        if(temp == y){
            return true;
        }else{return false;}
    }

int main()
{
    isPalindrome(121);
    return 0;
}

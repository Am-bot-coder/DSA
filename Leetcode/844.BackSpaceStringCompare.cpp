#include<iostream>
using namespace std;
//844.BackSpaceStringCompare.cpp
bool backspaceCompare(string s, string t) {
        
        int sizeS = s.size();
        int sizeT = t.size();

        int left = 0;
        int right = sizeS-1;
        while(left<right){
            while(s[0]=='#'){
                s.erase(left,1);
            }
            if(s[right]=='#' && s[left]=='#'){
                s.erase(left,1);
            }
            else if(s[right]=='#'){
                while(left<right && s[left]!='#'){
                    left++;
                }
                left--;
                s.erase(left,1);
                s.erase(left,1);
                if(left>0){
                    left--;
                }
            }
            else{
               right--; 
            }
        }
        left = 0;
        right = sizeT-1;
        while(left<right){
            while(t[0]=='#'){
                t.erase(left,1);
            }
            if(t[right]=='#' && t[left]=='#'){
                t.erase(left,1);
            }
            else if(t[right]=='#'){
                while(left<right && t[left]!='#'){
                    left++;
                }
                left--;
                t.erase(left,1);
                t.erase(left,1);
                if(left>0){
                    left--;
                }
            }
            else{
               right--; 
            }
        }

        if(s == t){
            return true;
        }
        else{
            return false;
        }
        

        
    }

    int main()
    {
        string s = "a#c";//"c#d#";
        string t = "b";
        backspaceCompare(s,t);

        cout<<"String S-> "<<s<<endl;
        cout<<"String T-> "<<t<<endl;


        return 0;
    }
    
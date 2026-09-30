#include<iostream>
#include<map>
using namespace std;

string expand(int l,int r, string &s){
        while((l>=0)&&(r<s.length())&&(s[l]==s[r])){
            l--;
            r++;
        }
        return s.substr(l+1,r-l-1);
    }
    
string longestPalindrome(string s) {
    
    string res = "";
    for(int i=0;i<s.length();i++){
        string odd = expand(i,i,s);
        string even = expand(i,i+1,s);

        if(odd.length()>res.length()){
            res = odd;
        }
        if(even.length()>res.length()){
            res = even;
        }

    }
    return res;
    }
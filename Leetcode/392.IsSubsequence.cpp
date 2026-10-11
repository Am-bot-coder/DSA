#include<iostream>
using namespace std;

class Solution {
public:
    bool isSubsequence(string s, string t) {
        int i=0;
        int j=0;
        if(s.length()==0){
            return true;
        }
        while((s.length()<t.length())&& s.length()!=0 && j<t.length()){
            if(s[i]!=t[j]){
                j++;
            }
            else if(s[i]==t[j]){
                s.erase(0,1);
                j++;
            }

            if(s.size()==0){
                return true;
            }

        }
        return false;
    }
};
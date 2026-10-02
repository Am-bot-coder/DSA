#include<iostream>
using namespace std;
#include<vector>

class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        string str = strs[0];
        for(int i =1;i<strs.size();i++){
            int s=0;
            string str2 = strs[i];
            while(s<str.size() && s<=str2.size()){
                if(str[s]!=str2[s]){
                    str.erase(s);
                }
                else{
                    s++;
                }
            }

            
        }
        return str;
    }
};
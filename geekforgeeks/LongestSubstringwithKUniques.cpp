#include<iostream>
#include<vector>
#include<map>
using namespace std;

int longestKSubstr(string &s, int k) {
        vector<char>temp1;
        map<char,int>maps;
        
        int left = 0;
        int right = 0;
        int ctr = 0;
        int flag = 0;
        
        
        
        while(right<s.length() && left<=right){
            if(maps.count(s[right]) == 0){
                temp1.push_back(s[right]);
            }
            maps[s[right]] = right;
            right++;
            
            if(maps.size()>k){
                ctr = max(ctr,right-left);
                flag=1;
                left = maps[temp1[0]];
                maps.erase(temp1[0]);
                temp1.erase(temp1.begin()+1);
                left++;
            }
            
        }
        
        if(temp1.size()<k){
            return -1;
        }
        
            
            
        
        
        
        return flag==1?ctr:k;
    }
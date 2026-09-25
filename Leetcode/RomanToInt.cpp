#include<iostream>
#include<map>
using namespace std;

class Solution {
public:
    int romanToInt(string s) {
        map<char,int>maps ={
            {'I',1},
            {'V',5},
            {'X',10},
            {'L',50},
            {'C',100},
            {'D',500},
            {'M',1000}
        };
        
        int sum = 0;
        for(int i = 0;i<s.length();i++){
            if((i+1<s.length())&&(maps[s[i]]<maps[s[i+1]])){
                sum-=maps[s[i]];
            }
            else{
                sum+=maps[s[i]];
            }
        }
        
        return sum;
    }
};


class Solution {
public:
    int romanToInt(string s) {
        map<char,int>maps ={
            {'I',1},
            {'V',5},
            {'X',10},
            {'L',50},
            {'C',100},
            {'D',500},
            {'M',1000}
        };
        int left = s.length()-1;
        int right = left;
        int sum = 0;
        while(left>=0){
            if(right==left){
                sum+=maps[s[left]];
                --left ;}
                
            
            else if(maps[s[left]]<maps[s[right]]){
                sum -= maps[s[left]];
                left--;
                right--;
            }
            else{
                sum += maps[s[left]];
                left--;
                right--;
            }
        }
        return sum;
    }
};
#include<iostream>
#include<map>
using namespace std;

int lengthOfLongestSubstring(string s) {
        map<char,int>maps;
        int left = 0;
        int right = 0;
        int sum = 0;
        maps[s[right]] = right;
        for(right=1;right<s.length();right++){
            if(maps.find(s[right])!= maps.end()){
                int temp = right-left;
                if(temp>sum){
                    sum = temp;
                }
                left = max(left,maps[s[right]]+1);
            }
            
                maps[s[right]] = right;
            
        }
        int temp2 = right-left;
        if(temp2>sum){sum = temp2;}
        return sum;
    }
int main()
{
    cout<<lengthOfLongestSubstring("ccbbcc")<<endl;
    return 0;
}



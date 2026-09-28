#include<iostream>
#include<vector>
using namespace std;


string convert(string s, int numRows) {
        string str = "";
        int i =1;
        int flag = 0;
        
        if(numRows==1){
            return s;
        }
        vector<vector<char> >p1(numRows);

        for(int idx=0;idx<s.length();idx++){
            if(i>numRows){
                flag = 1;
                i--;
                i--;
            }
            if(i<1){
                flag = 0;
                i++;
                i++;
            }
            if(flag == 0){
                p1[i-1].push_back(s[idx]);
                i++;
            }
            if(flag == 1){
                p1[i-1].push_back(s[idx]);
                i--;
            }
        }
        for(int x = 0;x<p1.size();x++){
            for(int y = 0; y<p1[x].size();y++){
                str += p1[x][y];
            }
        }
        return str;
    }
int main()
{
    cout<<convert("ABCDEFGH",2);
    return 0;
}

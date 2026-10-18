#include<iostream>
#include<vector>
using namespace std;
//sumofSubsetKusingDp.cpp
class Solution {
  public:
    static bool isSubsetSum(vector<int>& arr, int sum) {
        
        if(sum==0){
            return true;
        }
        int n = arr.size();
        vector<vector<int> > dp(n + 1, vector<int>(sum + 1, 0));
        
        for(int i=0;i<=n;i++){
            dp[i][0] = 1;
        }
        for(int j=1;j<=sum;j++){
            dp[0][j] = 0;
        }

        for(int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                cout<<dp[i][j]<<"  ";
            }
            cout<<endl;
        }
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){

                cout<<"-------------------------------->"<<endl;
                cout<<i<<endl;
                cout<<j<<endl;                
                cout<<"arr[i-1] = "<<arr[i-1]<<endl;
                cout<<"-------------------------------->"<<endl;
                
                if(arr[i-1]>j){
                    dp[i][j] = dp[i-1][j];
                    cout<<"dp[i][j] = dp[i-1][j]; --> "<<dp[i][j]<<endl;
                    
                }
                else{
                    bool pick = dp[i-1][j-arr[i-1]];
                    bool unpick = dp[i-1][j];
                    cout<<"PICK --> "<<pick<<endl;
                    cout<<"UNPICK --> "<<unpick<<endl;
                    dp[i][j] = pick||unpick;
                    cout<<"dp[i][j] = pick||unpick --> "<<dp[i][j]<<endl;
                }
            }
        }


        for(int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                cout<<dp[i][j]<<"  ";
            }
            cout<<endl;
        }
        
        
        return dp[n][sum];
        
        
        
    }
};



int main()
{
    vector<int>a;
    a.push_back(2);
    a.push_back(3);
    a.push_back(1);
    a.push_back(1);
    int target = 4;

    Solution::isSubsetSum(a,target);
    return 0;
}

#include<iostream>
#include<cmath>
#include<vector>
using namespace std;


class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        vector<int> numsx;
        numsx.insert(numsx.end(),nums1.begin(),nums1.end());
        numsx.insert(numsx.end(),nums2.begin(),nums2.end());
        // sort(numsx.begin(),numsx.end());
        if(numsx.size()==1){
            double temp = numsx[0];
            return temp;
        }
        if(numsx.size()%2 == 0){
            double temp = numsx[floor(numsx.size()/2)] + numsx[floor((numsx.size()/2) - 1)];
            return temp/2;
        }
        else{
            double temp = numsx[floor(numsx.size()/2)];
            return temp;
        }
    }
};


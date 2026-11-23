class Solution {

    public int l(int[]nums,int target,int left,int right){
        int mid = (left+right)/2;
        int idx = Integer.MAX_VALUE;
        if(left>right){
            return Integer.MAX_VALUE;
        }
        while(left <= right){
            mid = (left+right)/2;
            if(nums[mid]==target){
                idx = mid;
                int temp = l(nums,target,left,mid-1);
                if(temp<idx){
                    idx = temp;
                }
                        break;}
                
            else if(nums[mid]>target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }

        }
        
        return idx;
    }

    public int r(int[]nums,int target,int left,int right){
        int mid = (left+right)/2;
        int idx = Integer.MIN_VALUE;
        if(left>right){
            return Integer.MIN_VALUE;
        }
        while(left <= right){
            mid = (left+right)/2;
            if(nums[mid]==target){
                idx = mid;
                int temp = r(nums,target,mid+1,right);
            if(temp>idx){
                idx = temp;
            }                
                        break;}

            else if(nums[mid]>target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }

        }
        
        return idx;
    }

    public int[] searchRange(int[] nums, int target) {
        int res[] = new int[]{-1,-1};
        int left = 0;
        int right = nums.length-1;        

        while(left <= right){
            int mid = (left+right)/2;
            if(nums[mid]==target){
                int templ = l(nums,target,left,mid);
                if(templ!=Integer.MAX_VALUE){
                    res[0] = templ;
                }
                int tempr = r(nums,target,mid,right);
                if(tempr!=Integer.MIN_VALUE){
                    res[1] = tempr;
                }
                break;
            }
            else if(nums[mid]>target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }

        

        return res;
    }
}
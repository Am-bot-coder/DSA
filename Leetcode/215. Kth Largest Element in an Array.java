class Solution {
    
	int SIZE = 0;
    public int findKthLargest(int[] nums, int k) {
        
        int n = nums.length;
        int arr[] = new int[n+1];
        for(int i =0;i<n;i++){
            addElement(nums[i],arr);
        }
        int res=0;
        for(int i =0;i<k;i++){
            res = delete(arr);
        }
        return res;      

    }
    public void addElement(int val,int[] arr) {
		SIZE++;
		arr[SIZE]=val;
		
		int ci = SIZE;
		int pi = ci/2;
		
		while(pi>0) {
			if(arr[pi]>arr[ci]) {
				break;
			}
			int temp = arr[pi];
			arr[pi] = arr[ci];
			arr[ci] = temp;
			
			ci = pi;
			pi = ci/2;
		}
	}
    public int delete(int[] arr) {
		int ret = arr[1];
		arr[1] = arr[SIZE];
		SIZE--;
		int pi = 1;
		int ci = pi*2;
		
		while(ci<=SIZE) {
			if(ci+1<=SIZE  && arr[ci+1]>arr[ci]) {
				ci = ci+1;
			}
			
			if(arr[pi]>arr[ci]) {
				break;
			}
			int temp = arr[pi];
			arr[pi] = arr[ci];
			arr[ci] = temp;
			
			pi = ci;
			ci = pi*2;
			
			
		}
		return ret;
	}
}
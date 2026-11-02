class Solution {
    public int longestMountain(int[] arr) {
        int res = 0;
        if(arr.length<3){
            return res;
        }
        
        int st = 0;
        int i = st+1;

        while(i<arr.length){
            if(arr[i]<=arr[i-1]){
                st = i;
                i++;
                continue;
            }

            while(i<arr.length && arr[i]>arr[i-1]){
                i++;
            }
            if(i==arr.length || arr[i]==arr[i-1]){
                continue;
            }
            while(i<arr.length && arr[i] < arr[i-1]){
                i++;
            }
            res = Math.max(res,i-st);
            st = i-1;
        }
        return res;
    }
}
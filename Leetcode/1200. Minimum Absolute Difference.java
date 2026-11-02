class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        List<List<Integer>>res= new ArrayList<>();
        int left = 0;
        int right = 0;
        while(right<arr.length-1){
            right++;
            int temp = Math.abs(arr[right]-arr[left]);
            if(temp==min){
                List<Integer>lt = new ArrayList<>();
                lt.add(Math.min(arr[left],arr[right]));
                lt.add(Math.max(arr[left],arr[right]));
                res.add(lt);
            }
            else if(temp<min){
                min = temp;
                res.clear();
                List<Integer>lt = new ArrayList<>();
                lt.add(Math.min(arr[left],arr[right]));
                lt.add(Math.max(arr[left],arr[right]));
                res.add(lt);
            }
            left++;
        }
        
        return res;
    }
}
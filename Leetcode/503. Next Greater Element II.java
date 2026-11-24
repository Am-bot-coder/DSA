class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = -1;

            for (int j = 1; j < n; j++) {
                int idx = (i + j) % n;

                if (nums[idx] > nums[i]) {
                    ans[i] = nums[idx];
                    break;
                }
            }
        }

        return ans;
    }
}


class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans,-1);

        ArrayDeque<Integer>stack = new ArrayDeque<>();

        for(int i =0;i<=n*2;i++){
            while(!stack.isEmpty() && nums[i%n]>nums[stack.peek()]){
                int idx = stack.pop();
                ans[idx] = nums[i%n];
            }
            stack.push(i%n);
        }

        return ans;
    }
}
class Solution {
    public int[] finalPrices(int[] prices) {
    ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
    int n = prices.length;

    for(int i = 0;i<n;i++){
        while(!stack.isEmpty() && prices[i]<=prices[stack.peek()]){
            int x = stack.pop();
            prices[x] = prices[x]-prices[i];
        }
        stack.push(i);
    }
    return prices;

    }
}
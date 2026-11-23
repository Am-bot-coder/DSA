class ProductOfNumbers {
    ArrayList<Integer>stack;
    public ProductOfNumbers() {
        stack = new ArrayList<Integer>();
    }
    
    public void add(int num) {
        stack.add(num);
    }
    
    public int getProduct(int k) {
        int sum = 1;
        Iterator<Integer>itr = stack.listIterator(stack.size()-k);
        while(itr.hasNext()){
            sum = sum*itr.next();
        }
        return sum;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
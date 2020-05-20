class StockSpanner {
    Stack<Integer> s1;
    Stack<Integer> s2;
    public StockSpanner() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    public int next(int price) {
        int count = 1;
        while(s1.size() > 0 && s1.peek() <= price) {
            s1.pop();
            count += s2.pop();
        }
        s1.push(price);
        s2.push(count);
        return count;
    }
}

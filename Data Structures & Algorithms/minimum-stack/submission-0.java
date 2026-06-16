class MinStack {
    Deque<Integer> stack1;
    Deque<Integer> stack2;


    public MinStack() {
        stack1 = new ArrayDeque<>();
        stack2 = new ArrayDeque<>();
    }
    
    public void push(int val) {
        stack1.push(val);
        if (stack2.isEmpty() || val <= stack2.peek()) {
            stack2.push(val);
        }

    }
    
    public void pop() {
        if (stack1.isEmpty()) {return;}
        int top = stack1.pop();
        if (top == stack2.peek()) {
            stack2.pop();
        }
    }
    
    public int top() {
        return stack1.peek();
    }
    
    public int getMin() {
        return stack2.peek();
    }
}

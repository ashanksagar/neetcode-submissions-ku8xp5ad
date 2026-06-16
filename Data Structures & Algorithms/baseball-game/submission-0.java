class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String operation : operations) {
            switch(operation) {
                case "+":
                    int first = stack.pop();
                    int second = stack.peek();
                    stack.push(first);
                    stack.push(first + second);
                    break;
                case "D":
                    stack.push(2*stack.peek());
                    break;
                case "C":
                    stack.pop();
                    break;
                default:
                    stack.push(Integer.parseInt(operation));
                    break;
            }
        }
        int sum = 0;
        for (Integer n : stack) {
            sum += n;
        }
        return sum;
       
    }
}
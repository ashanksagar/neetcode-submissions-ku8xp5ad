class Solution {
    public boolean isValid(String s) {
        char[] charArr = s.toCharArray();

        Deque<Character> stack = new ArrayDeque<>();

        for (char c : charArr) {
            switch(c) {
                case '(':
                    stack.push(')');
                    break;
                case '{':
                    stack.push('}');
                    break;
                case '[':
                    stack.push(']');
                    break;
                default:
                    if (stack.isEmpty() || stack.pop() != c) {
                        return false;
                    }
                   
            }
        }

        return stack.isEmpty();
    }
}

class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
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
                    if (!stack.isEmpty() && stack.pop().equals(s.charAt(i))) {
                        continue;
                    } else {
                        return false;
                    }
            } 
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;

        
    }
}

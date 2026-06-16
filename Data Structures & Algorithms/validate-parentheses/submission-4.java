class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(' || arr[i] == '{' || arr[i] == '[') {
                int target = arr[i];
                switch (target) {
                    case '(':
                        stack.push(')');
                        break;
                    case '{':
                        stack.push('}');
                        break;
                    case '[':
                        stack.push(']');
                        break;
                }
            } else {
                if (stack.isEmpty()) {
                    return false;
                } if (stack.peek() == arr[i]) {
                    stack.pop();
                }
                else {
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

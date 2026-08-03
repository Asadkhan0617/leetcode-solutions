class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<tokens.length;i++){
            if(tokens[i] != null && tokens[i].matches("-?\\d+(\\.\\d+)?")){
                int token=Integer.parseInt(tokens[i]);
                stack.push(token);
            }else {
                int a=stack.pop();
                int b=stack.pop();

                int ans=0;

                if (tokens[i].equals("+")) {
                    ans = b + a;
                } else if (tokens[i].equals("-")) {
                    ans = b - a;
                } else if (tokens[i].equals("*")) {
                    ans = a * b;
                    } else if (tokens[i].equals("/")) {
                    ans = b / a;
                }

              stack.push(ans);
            }
        }
        return stack.peek();
    }
}
package com.DSA.Stack.StackQuestions.LeetCodeQuestion;

import java.util.Stack;

class minAddToMakeValid {
    // Approach 1
  /*
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            } else {
                stack.push(ch);
            }
        }
        return stack.size();

    }
    */
    // Approach 2 Optimize

    public int minAddToMakeValid(String s) {
        Stack<Character> stack =new Stack<>();
        int open =0;
         int close =0;
        for(int i=0;i<s.length(); i++){
            char ch= s.charAt(i);
            if(ch =='('){
                open++;
            }else{
               if(open<=0){
                    close++;
                }else{
                    open--;
                }
            }
        }
        return (open+close);

}
}
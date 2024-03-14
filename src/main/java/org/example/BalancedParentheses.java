package org.example;

import java.util.Stack;

public class BalancedParentheses {
    Stack<Character> stack = new Stack<>();

    public void balancedParentheses(String expression) {
        for (char bracket : expression.toCharArray()) {
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                stack.push(bracket);
            } else if (bracket == ')' || bracket == ']' || bracket == '}') {
                if (stack.isEmpty()) {
                    System.out.println("Not Balanced");
                    return;
                }
                char top = stack.pop();
                if ((bracket == ')' && top != '(') || (bracket == ']' && top != '[') || (bracket == '}' && top != '{')) {
                    System.out.println("Not Balanced");
                    return;
                }
            }
        }
        if (stack.isEmpty()) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}

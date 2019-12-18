package com.xinwu.huntjob.queuebystack;

import java.util.Stack;

/**
 * 问题描述：用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 *
 * 思考：栈的特点：先进后出  队列的特点：先进先出
 */
public class Solution {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            throw new RuntimeException("queue is empty!");
        }
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        int result = stack2.pop();
        //类似两个容器倒来倒去
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.push(1);
        solution.push(2);
        solution.push(3);
        System.out.println(solution.pop());
    }
}

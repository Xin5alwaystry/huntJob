package com.xinwu.huntjob.reverseList;


import java.util.ArrayList;

/**
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 *
 * 思路：采用递归（基准情形为listNode.next = null）
 */
public class Solution {
    ArrayList<Integer> resultList = new ArrayList<>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode != null) {
            this.printListFromTailToHead(listNode.next);
            resultList.add(listNode.val);
        }
        return resultList;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

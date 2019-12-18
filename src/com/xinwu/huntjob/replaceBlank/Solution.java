package com.xinwu.huntjob.replaceBlank;

/**
 * 问题描述：请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * <p>
 * 思路:首先，遍历字符串中的所有字符得到空格的个数；然后可以计算出每个空格替换为%20后的字符串长度；最后，从后往前遍历
 */
public class Solution {
    public String replaceSpace(StringBuffer str) {
        int blankCount = 0;  //计算全部空格数
        int oldLength = str.length();
        int oldIndex = oldLength - 1;
        for (int i = 0; i < oldLength; i++) {
            if (str.charAt(i) == ' ') {
                blankCount++;
            }
        }
        int newLength = oldLength + blankCount * 2;
        str.setLength(newLength);
        for (;oldIndex >= 0; oldIndex--) {
            if (str.charAt(oldIndex) == ' ') {
                str.setCharAt(--newLength, '0');
                str.setCharAt(--newLength, '2');
                str.setCharAt(--newLength, '%');
            } else {
                str.setCharAt(--newLength, str.charAt(oldIndex));
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.replaceSpace(new StringBuffer("hello java.")));
    }
}

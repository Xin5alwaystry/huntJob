package com.xinwu.huntjob.findIntFromMatrix;

/**
 * 问题描述：在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * <p>
 * 思路1：最简单且暴力的方式，遍历比较。
 * <p>
 * 思路2：考虑到该二维数组有序，左上角最小，右下角最大，左下角和右上角位于中间；可从左下角的元素开始比较，
 * 如果目标小于它，则将被比较数上移一位，否则右移一位，以此类推，直到被比较数的某个index越界。
 */
public class Solution {
    public boolean solution1(int target, int[][] array) {
        for (int[] anArray : array) {
            for (int anAnArray : anArray) {
                if (anAnArray == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean solution2(int target, int[][] array) {
        int column = 0;
        int row = array.length - 1;
        while (column < array[0].length && row >= 0) {
            if (array[row][column] > target) {
                row --;
            } else if (array[row][column] < target) {
                column ++;
            } else {
                return true;
            }
        }
        return false;
    }
}

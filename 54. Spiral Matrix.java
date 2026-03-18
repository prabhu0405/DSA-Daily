/*Given an m x n matrix, return all elements of the matrix in spiral order. */

import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0, left = 0;
        int bottom = m - 1;
        int right = n - 1;

        List<Integer> nums = new ArrayList<>();

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                nums.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                nums.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    nums.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    nums.add(matrix[i][left]);
                }
                left++;
            }
        }

        return nums;
    }
}
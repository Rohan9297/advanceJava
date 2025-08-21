package Leetcode.HashMap;

import java.util.*;

public class Leetcode73 {

    static Set<Integer> zeroRow = new HashSet<>();
    static Set<Integer> zeroCol = new HashSet<>();
    int[][] matrix;

    public static void main(String[] args) {
        int[][] nums = {
                {
                        1, 1, 1
                },
                {
                        4, 0, 6
                },
                {
                        7, 0, 9
                }
        };

        solve(nums);

    }

    public static void solve(int[][] matrix) {
        Leetcode1239.matrix = matrix;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    zeroRow.add(i);
                    zeroCol.add(j);
                }
            }
        }

        for (int num : zeroRow) {

            for (int i = 0; i < matrix.length; i++) {
                matrix[num][i] = 0;
            }
        }

        for (int num : zeroCol) {
            for (int j = 0; j < matrix[0].length; j++) {

                matrix[j][num] = 0;

            }
        }
        System.out.println("after array ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }

}

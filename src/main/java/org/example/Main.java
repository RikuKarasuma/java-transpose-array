package org.example;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        final var data = new int[][]{{1,2,3}, {4,5,6}, {7,8,9}};
        final var data1 = new int[][]{{1,2,3}, {4,5,6}};
        final var data2 = new int[][]{{7, 2}};
        final var data3 = new int[][]{{5}, {8}};


        Arrays.stream(transposeArray(data3)).forEach(arr -> {
            Arrays.stream(arr).forEach(out -> System.out.print(out + ", "));
            System.out.println();
        });

    }

    /**
     * Given a 2D integer array matrix, return the transpose of matrix.
     *
     * The transpose of a matrix is the matrix flipped over its main diagonal,
     * switching the matrix's row and column indices.
     *
     * @param matrix
     * @return
     */
    public static int[][] transposeArray(int[][] matrix) {

        final var width = matrix.length;

        if (width < 1)
            return matrix;

        final var height = matrix[0].length;
        final var newArr = new int[height][width];

        for ( int i = 0; i < height; i ++)
            for ( int x = 0; x < width; x ++)
                newArr[i][x] = matrix[x][i];

        return newArr;
    }
}
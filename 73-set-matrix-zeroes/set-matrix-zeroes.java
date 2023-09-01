class Solution {
    public void setZeroes(int[][] matrix) {
        int ROW = matrix.length, COL = matrix[0].length;
        boolean firstRowZero = false;
        for (int r = 0; r < ROW; r++) {
            for (int c = 0; c < COL; c++) {
                if (matrix[r][c] == 0) {
                    matrix[0][c] = 0;
                    if (r > 0) {
                        matrix[r][0] = 0;
                    } else {
                        firstRowZero = true;
                    }
                }
            }
        }
        for (int r = 1; r < ROW; r++) {
            for (int c = 1; c < COL; c++) {
                if (matrix[0][c] == 0 || matrix[r][0] == 0) {
                    matrix[r][c] = 0;
                }
            }
        }
        if (matrix[0][0] == 0) {
            for (int i = 0; i < ROW; i++) {
                matrix[i][0] = 0;
            }
        }
        if (firstRowZero) {
            for (int j = 0; j < COL; j++) {
                matrix[0][j] = 0;
            }
        }
    }
}
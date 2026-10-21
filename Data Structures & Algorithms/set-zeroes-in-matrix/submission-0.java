class Solution {
    public void setZeroes(int[][] matrix) {

        boolean[] zeroRows = new boolean[matrix.length];
        boolean[] zeroCols = new boolean[matrix[0].length];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col] == 0) {
                    zeroRows[row] = true;
                    zeroCols[col] = true;
                }
            }
        }


        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) { 
                if (zeroRows[row] || zeroCols[col])
                    matrix[row][col] = 0;
            } 
        }

    }
}

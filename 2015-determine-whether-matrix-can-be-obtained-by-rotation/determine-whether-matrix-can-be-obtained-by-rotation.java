class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for (int rotation = 0; rotation < 4; rotation++) {
            
            if (isSame(mat, target)) {
                return true;
            }
            
            mat = rotate(mat);
        }
        
        return false;
    }

    public int[][] rotate(int[][] mat) {
        int n = mat.length;
        int[][] rotated = new int[n][n];

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                rotated[col][n - 1 - row] = mat[row][col];
            }
        }

        return rotated;
    }

    public boolean isSame(int[][] mat, int[][] target) {
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat.length; col++) {
                if (mat[row][col] != target[row][col]) {
                    return false;
                }
            }
        }

        return true;
    }
}
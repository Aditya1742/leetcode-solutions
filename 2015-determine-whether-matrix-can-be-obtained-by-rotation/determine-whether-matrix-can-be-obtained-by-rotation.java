class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int c=0; c<4; c++) {
            if(isSame(mat,target)) {
                return true;
            }
            rotate(mat);
        }
        return false;
    }
    public boolean isSame(int[][] mat, int[][] target) {
        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[i].length; j++) {
                if(mat[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
    public void rotate(int[][] mat) {
        //tranpose 
        for(int i=0; i < mat.length; i++) {
            for(int j=i; j < mat.length; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        //reverse
        for(int row = 0; row < mat.length; row++) {
            int i = 0;
            int j = mat.length - 1;
            while(i < j) {
                int temp = mat[row][i];
                mat[row][i] = mat[row][j];
                mat[row][j] = temp;
                i++;
                j--; 
            }
        }
    }
}
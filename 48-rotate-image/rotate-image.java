class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
       //first do tranpose of a matrix
       for(int i = 0; i < n-1; i++) {
        for(int j = i+1; j < n; j++) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
       }
       reverse(matrix);
    }
    void reverse(int[][] matrix) {
        int n = matrix.length;
    for(int index = 0; index < n; index++) {
        int i = 0;
        int j = n-1;
        while(i<j) {
            int temp = matrix[index][i];
            matrix[index][i] = matrix[index][j];
            matrix[index][j] = temp;
            i++;
            j--;
        }
    }

    }
}
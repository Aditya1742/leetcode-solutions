class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> answer = new ArrayList<>();
        //find the minimum in a row
        int[] minRow = new int[matrix.length];
        for(int row = 0; row< matrix.length; row++) {
            int elMin = Integer.MAX_VALUE;
            for(int col = 0; col < matrix[row].length; col++) {
                elMin = Math.min(matrix[row][col], elMin);
            }
            minRow[row] = elMin;
        }
        int[] maxCol = new int[matrix[0].length];
        for(int col = 0; col< matrix[0].length; col++) {
            int elMax = Integer.MIN_VALUE;
            for(int row = 0; row < matrix.length; row++) {
                elMax = Math.max(matrix[row][col], elMax);
            }
            maxCol[col] = elMax;
        }
        for(int row = 0; row < matrix.length; row++) {
            for(int col = 0; col < matrix[row].length; col++) {
                if(matrix[row][col] == minRow[row] && matrix[row][col] == maxCol[col]) {
                    answer.add(matrix[row][col]);
                }
            }
        }
        return answer;
    }
}
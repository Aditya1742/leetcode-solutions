class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> answer = new ArrayList<>();

        for (int row = 0; row < matrix.length; row++) {

            int minCol = 0;

            // Find minimum element in the row
            for (int col = 1; col < matrix[row].length; col++) {
                if (matrix[row][col] < matrix[row][minCol]) {
                    minCol = col;
                }
            }

            int minValue = matrix[row][minCol];

            // Check if it is maximum in its column
            boolean isLucky = true;

            for (int r = 0; r < matrix.length; r++) {
                if (matrix[r][minCol] > minValue) {
                    isLucky = false;
                    break;
                }
            }

            if (isLucky) {
                answer.add(minValue);
            }
        }

        return answer;
    }
}
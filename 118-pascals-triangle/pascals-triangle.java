class Solution {
    List<Integer> generateRow(int row) {
        int ans = 1;
        List<Integer> rowAns = new ArrayList<>();
        rowAns.add(1);
        for(int col = 1; col < row; col++) {
            ans = ans * (row - col);
            ans = ans / col; 
            rowAns.add(ans);
        }
        return rowAns;
    }
    public List<List<Integer>> generate(int numRows) {
        int n = numRows;
        List<List<Integer>> ans = new ArrayList<>();
        for(int row = 1; row <= n; row++) {
            ans.add(generateRow(row));
        }
        return ans;
    }
}
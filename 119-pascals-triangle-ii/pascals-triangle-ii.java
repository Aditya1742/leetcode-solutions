class Solution {
    public List<Integer> getRow(int rowIndex) {
        long ans = 1;
        int n = rowIndex+1;
        List<Integer> ansCol = new ArrayList<>();
        ansCol.add(1);
        for(int col = 1; col < n; col++) {
            ans = ans * (n-col);
            ans = ans / col;
            ansCol.add((int) ans);
        }
        return ansCol;
    }
}
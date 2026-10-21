class Solution {
    public void moveZeroes(int[] nums) {
        int j = -1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                j = i;
                break;
            }
        }
        if(j == -1) {
            return;
        }
        for(int i = j+1; i < nums.length; i++) {
            if(nums[i] != 0) {
                swap(nums, j, i);
                j++;
            }
        }
    }
    void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
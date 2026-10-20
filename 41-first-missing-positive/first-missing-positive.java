class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        int n = nums.length;
        while(i < n) {
            int content = nums[i] - 1;
            if(nums[i] > 0 && nums[i] <= n && nums[i] != nums[content]) {
                swap(nums, i, content);
            }else {
                i++;
            }
        }
        for(int index = 0; index < n; index++) {
            if (nums[index] != index+1) {
                return index+1;
            }
        }
        return n + 1;
    }
    void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
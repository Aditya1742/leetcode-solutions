class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int contain = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[contain]) {
                swap(nums, i, contain);

            }else {
                i++;
            }
        }
        for(int index = 0; index < nums.length; index++) {
            if(nums[index] != index) {
                return index;
            }
        }
        return nums.length;

    }
    void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
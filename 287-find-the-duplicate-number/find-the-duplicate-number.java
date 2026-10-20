class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;
        int n = nums.length;
        while(i < n) {
            int content = nums[i] - 1;
            if(nums[i] != i+1) {
                if(nums[i] != nums[content]) {
                    swap(nums, i, content);
                }else{
                    return nums[i];
                }
            }else {
                i++;
            }
        }
        return -1;
    }
    void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
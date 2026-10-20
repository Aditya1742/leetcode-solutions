class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        int n = nums.length;
        while(i < n) {
            int content = nums[i] - 1;
            if(nums[i] != nums[content]) {
                swap(nums, i, content);
            }else {
                i++;
            }
        }
        for(int index = 0; index < n; index++) {
            if(nums[index] != index+1) {
                ans.add(nums[index]);
            }
        }
        return ans;
    }
    void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
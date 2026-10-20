class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int i = 0;
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
                ans.add(index+1);
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
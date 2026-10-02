class Solution {
    public int splitArray(int[] nums, int k) {
        if(k > nums.length) {
            return -1;
        }
        int start = 0;
        int end = 0;
        for(int num : nums) {
            start = Math.max(start, num);
            end += num;
        }
        int ans = -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(isValid(nums, k, mid)) {
                ans = mid;
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return ans;
    }
    public boolean isValid(int[] nums, int k, int mid) {
        int subArray = 1; 
        int sum = 0;
        for(int num : nums) {
            if((num + sum) <= mid) {
                sum += num;
            }else {
                subArray++;
                sum = num;
            }
        }
       return subArray <= k;
    }
}
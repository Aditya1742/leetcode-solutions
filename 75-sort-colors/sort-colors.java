class Solution {
    public void sortColors(int[] nums) {
        // using deutch national flag algorithm
        int low = 0;
        int mid = 0; 
        int high = nums.length-1;
    
        while(mid <= high) {
            if(nums[mid] == 0) {
                swap(nums, mid, low);
                mid++;
                low++;
            }else if(nums[mid] == 1) {
                mid++;
            }else {
                swap(nums, mid, high);
                high--;
            }
        }
    }
    void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
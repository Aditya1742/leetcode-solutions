class Solution {
    public List<Integer> majorityElement(int[] nums) {
        //using boyer moore voting algorithm
        int cnt1 = 0, cnt2 = 0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            if(cnt1 == 0 && el2 != nums[i]) {
                cnt1 = 1;
                el1 = nums[i];
            }else if(cnt2 == 0 && el1 != nums[i]) {
                cnt2 = 1;
                el2 = nums[i];
            }else if(el1 == nums[i]) {
                cnt1++;
            }else if(el2 == nums[i]) {
                cnt2++;
            }else {
                cnt1--;
                cnt2--;
            }
        }
        List<Integer> ans = new ArrayList<>();
        cnt1 = 0;
        cnt2 = 0;
        for(int i = 0; i < nums.length; i++) {
            if(el1 == nums[i]) cnt1++;
            if(el2 == nums[i]) cnt2++;
        }
        int mini = nums.length / 3 + 1;
        if(cnt1 >= mini) ans.add(el1);
        if(cnt2 >= mini) ans.add(el2);
        return ans;
    }
}
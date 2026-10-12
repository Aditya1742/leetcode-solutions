class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map  = new HashMap<>();
        int count = 0;
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if(sum == k) {
                count++;
            }
            int val = sum - k;
            if(map.containsKey(val)) {
                count += map.get(val);
            }
            if(!map.containsKey(sum)) {
                map.put(sum,0);
            }
            map.put(sum, map.get(sum) + 1);
        }
        return count;
    }
}
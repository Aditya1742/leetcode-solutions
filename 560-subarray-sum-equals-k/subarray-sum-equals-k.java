class Solution {
    public int subarraySum(int[] nums, int k) {
        int[] prefixSum = new int[nums.length];
        int count = 0;
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i]; 
            prefixSum[i] = sum; 
            
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int j = 0; j < prefixSum.length; j++) {
            if(prefixSum[j] == k) {
                count++;
            }
            int val = prefixSum[j] - k;
            if(map.containsKey(val)) {
                count += map.get(val);
            }
            if(!map.containsKey(prefixSum[j])) {
                map.put(prefixSum[j],0);
            }
            map.put(prefixSum[j], map.get(prefixSum[j]) + 1);
        }
        return count;
    }
}
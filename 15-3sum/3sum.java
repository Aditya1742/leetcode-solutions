class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Using Better Approach- Hashset
        Set<List<Integer>> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            Set<Integer> hashset = new HashSet<>();
            for(int j = i+1; j < nums.length; j++) {
                int k = -(nums[i] + nums[j]);
                if(hashset.contains(k)) {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], k);
                    Collections.sort(temp);
                    set.add(temp);
                }
                hashset.add(nums[j]);
            } 
        }
        return new ArrayList<>(set);
    }
}